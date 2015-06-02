package tubular;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

/**
 * @author geovanni.perez
 *
 */
public class TubularHelper {
	/**
	 * Call this method to generate a new Tubular Response
	 * @param request
	 * @param em
	 * @param setClass
	 * @return The Tubular Response
	 */
	public static GridDataResponse GetResponse(GridDataRequest request,
			Session session, Class<?> setClass) {
		GridDataResponse response = new GridDataResponse();
		response.TotalRecordCount = (long) session.createCriteria(setClass)
				.setProjection(Projections.rowCount()).uniqueResult();

		response.FilteredRecordCount = response.TotalRecordCount;

		Criteria query = session.createCriteria(setClass);

		// TODO: Check Filter, if there is create Restrictions.or

		for (GridColumn column : request.Columns) {
			// TODO: Fix order
			if (column.Sortable && column.SortOrder > 0) {
				query.addOrder(column.SortDirection == SortDirection.Descending ? Order
						.desc(column.Name) : Order.asc(column.Name));
			}

			if (column.Filter != null && column.Filter.Text != null
					&& column.Filter.Text.trim().length() > 0) {
				// TODO: Check Operator and data type
				query.add(Restrictions.like(column.Name, "%"
						+ column.Filter.Text.trim() + "%"));
			}
		}

		// TODO: Filter

		List<?> data = query.setFirstResult(request.Skip)
				.setMaxResults(request.Take).list();

		List<List<Object>> list = new ArrayList<List<Object>>();

		for (Object item : data) {
			List<Object> innerList = new ArrayList<Object>();

			for (GridColumn column : request.Columns) {
				try {
					innerList.add(item.getClass().getField(column.Name)
							.get(item));
				} catch (IllegalArgumentException | IllegalAccessException
						| NoSuchFieldException | SecurityException e) {
					e.printStackTrace();
				}
			}

			list.add(innerList);
		}

		response.CurrentPage = 1;

		if (request.Take == -1) {
			response.TotalPages = 1;
		} else {
			response.TotalPages = (int) ((response.FilteredRecordCount
					+ request.Take - 1) / request.Take);

			if (response.TotalPages > 0) {
				response.CurrentPage = 1 + (int) ((request.Skip / (float) response.FilteredRecordCount) * response.TotalPages);
			}
		}

		response.Payload = list;

		return response;
	}
	
	/**
	 * Call this method to generate a new Tubular Response
	 * @param request
	 * @param em
	 * @param setClass
	 * @return The Tubular Response
	 */
	public static GridDataResponse GetResponse(GridDataRequest request,
			EntityManager em, Class<?> setClass) {
		Session session = (Session) em.getDelegate();
		return GetResponse(request, session, setClass);
	}
}
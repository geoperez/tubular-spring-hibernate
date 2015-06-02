package hello;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import tubular.GridDataRequest;
import tubular.GridDataResponse;
import tubular.TubularHelper;

@Service
@Transactional
public class DataServiceImpl implements DataService {

    @PersistenceContext
    EntityManager em;
    
    @Override
    public GridDataResponse getResponse(GridDataRequest request, Class<?> setClass) {
    	return TubularHelper.GetResponse(request, em, setClass);
    }
}
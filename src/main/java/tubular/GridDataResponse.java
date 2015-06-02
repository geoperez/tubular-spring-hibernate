package tubular;
import java.util.List;

public class GridDataResponse {
	/// <summary>
    /// Response's counter
    /// </summary>
    public int Counter;
    /// <summary>
    /// A list of object's list with all the rows
    /// </summary>
    public List<List<Object>> Payload;
    /// <summary>
    /// Set how many records are in the entire set
    /// </summary>
    public long TotalRecordCount;
    /// <summary>
    /// Set how many records are in the filtered set
    /// </summary>
    public long FilteredRecordCount;
    /// <summary>
    /// Set how many pages are available
    /// </summary>
    public int TotalPages;
    /// <summary>
    /// Set which page is sent
    /// </summary>
    public int CurrentPage;
}

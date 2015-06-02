package tubular;

public class GridDataRequest {
	/// <summary>
    /// Request's counter
    /// </summary>
    public int Counter;
    /// <summary>
    /// The free-text search
    /// </summary>
    public Filter Search;
    /// <summary>
    /// Set how many records skip, for pagination
    /// </summary>
    public int Skip;
    /// <summary>
    /// Set how many records take, for pagination
    /// </summary>
    public int Take;
    /// <summary>
    /// Defines the columns
    /// </summary>
    public GridColumn[] Columns;
    /// <summary>
    /// Sent the minutes difference between UTC and local time
    /// </summary>
    public int TimezoneOffset;
}

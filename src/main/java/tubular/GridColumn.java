package tubular;

public class GridColumn {
	/// <summary>
    /// Column's Name
    /// </summary>
    public String Name;
    /// <summary>
    /// Column's Label
    /// </summary>
    public String Label;
    /// <summary>
    /// Set if column is sortable
    /// </summary>
    public Boolean Sortable;
    /// <summary>
    /// Set the sort order, zero or less are ignored
    /// </summary>
    public int SortOrder;
    /// <summary>
    /// Set the sort direction
    /// </summary>
    public SortDirection SortDirection;
    /// <summary>
    /// Represents the Columns filter
    /// </summary>
    public Filter Filter;
    /// <summary>
    /// Set if the column is searchable in free-text search
    /// </summary>
    public Boolean Searchable;
    /// <summary>
    /// Column's data type
    /// </summary>
    public String DataType;
}

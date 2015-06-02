package tubular;

public enum CompareOperators {
	/// <summary>
    /// None operator
    /// </summary>
    None,
    /// <summary>
    /// Autofiltering
    /// </summary>
    Auto,
    /// <summary>
    /// Equals operator
    /// </summary>
    Equals,
    /// <summary>
    /// Contains filter
    /// </summary>
    Contains,
    /// <summary>
    /// StartsWith filter
    /// </summary>
    StartsWith,
    /// <summary>
    /// EndsWith filter
    /// </summary>
    EndsWith,
    /// <summary>
    /// Greather than or equal filter
    /// </summary>
    Gte,
    /// <summary>
    /// Greather than filter
    /// </summary>
    Gt,
    /// <summary>
    /// Less than or equal filter
    /// </summary>
    Lte,
    /// <summary>
    /// Less than filter
    /// </summary>
    Lt,
    /// <summary>
    /// Multiple options filter
    /// </summary>
    Multiple,
    /// <summary>
    /// Between values filter
    /// </summary>
    Between
}

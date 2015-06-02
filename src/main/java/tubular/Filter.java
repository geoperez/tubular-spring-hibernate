package tubular;

public class Filter {
	/// <summary>
    /// Initialize a Filter with default params
    /// </summary>
    public Filter()
    {
        Operator = CompareOperators.None;
        OptionsUrl = "";
        Name = "";
        Text = "";
    }

    /// <summary>
    /// Filter name
    /// </summary>
    public String Name;

    /// <summary>
    /// Filter search text
    /// </summary>
    public String Text;

    /// <summary>
    /// Filter search params
    /// </summary>
    public String[] Argument;

    /// <summary>
    /// Filter's operator
    /// </summary>
    public CompareOperators Operator;

    /// <summary>
    /// Gets or sets the options URL.
    /// The url returns a list of Filter objects
    /// </summary>
    /// <value>
    /// The options URL.
    /// </value>
    public String OptionsUrl;
}

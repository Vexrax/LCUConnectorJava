package LCUConnector;

public class RequestTypeNotFoundException extends Exception
{
    HttpMethod  Method;
    public RequestTypeNotFoundException(HttpMethod method)
    {
        this.Method = method;
    }

    public String toString()
    {
        String output = String.format("' %s '  could not be found", Method);
        return output;
    }
}

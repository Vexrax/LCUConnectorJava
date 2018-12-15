package LCUConnector;

import org.apache.http.HttpResponse;

import java.util.concurrent.CompletableFuture;

public interface ILeagueClient
{
    void Disconnect();
    void Connect();
    HttpResponse MakeApiRequest(HttpMethod methodType, String endpoint, Object Data) throws RequestTypeNotFoundException;

}

# LCUConnectorJava
Making connecting to the League Of Legends Client easy.

This connector automatically gets the credietials for the API that is launched when the League of Legends client is active. 

# How To Install
- [GitHub](https://github.com/Vexrax/LCUConnectorJava) `git clone https://github.com/Vexrax/LCUConnectorJava.git`
- [Maven] Soon(TM)



# Dependencies 
The connector uses the Apache [HTTPComponent](https://hc.apache.org/httpcomponents-client-4.3.x/quickstart.html) library as a means to execute HTTP requests

## Usage example

```
LeagueClient leagueClient = new LeagueClient("C:\\Riot Games\\League of Legends\\lockfile") ;
leagueClient.Connect();
JSONObject data = new JSONObject();
data.put("firstPreference", "MIDDLE");
data.put("secondPreference", "TOP");

HttpResponse response = leagueClient.MakeApiRequest(HttpMethod.Put, "/lol-lobby/v1/lobby/members/localMember/position-preferences", data.toJSONString());
```

# Java Certificate Issues

Many IDES have problems connecting to the LCU server due to the certificate. A workaround does exist and can be found here:
https://intellij-support.jetbrains.com/hc/en-us/community/posts/115000094584-IDEA-Ultimate-2016-3-4-throwing-unable-to-find-valid-certification-path-to-requested-target-when-trying-to-refresh-gradle



## [License](LICENSE.txt)
LCUConnectorJava isn't endorsed by any of it's content sources or Riot Games and doesn't reflect the views or opinions of them or anyone officially involved in producing or managing League of Legends. League of Legends and Riot Games are trademarks or registered trademarks of Riot Games, Inc. League of Legends ? Riot Games, Inc.
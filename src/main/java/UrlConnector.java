import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Rafal on 2016-09-07.
 */
public class UrlConnector extends Connector {
    Connection connection;
    String connectionAdress;


    public UrlConnector(String connectionAdress) {
        this.connectionAdress = connectionAdress;
    }

    Connection createConnection(String connectionType) throws IOException{
        
        // '==' should be used to compare primitives or REFERENCES, NEVER use it to compare OBJECTS!
        // read how to do it properly... (google: java string comparison)
        if(connectionType == "URL"){
            URL url = null;
            url = new URL(connectionAdress);
            connection = (Connection) url.openConnection();
            return connection;
        }



    }
}

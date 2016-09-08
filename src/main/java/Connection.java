import java.io.IOException;
import java.net.HttpURLConnection;

/**
 * Created by Rafal on 2016-09-07.
 */
public class Connection extends HttpURLConnection{
    
    // Why do you extend HttpURLConnection?
    // Do you add some specific stuff? Do you want to handle something extra?
    // If not, leave the idea about extending any class... :)
    
    // In general... 'PREFER COMPOSITION OVER INHERITENCE' !!!
    
    public void disconnect() {

    }

    public boolean usingProxy() {
        return false;
    }

    public void connect() throws IOException {

    }
}

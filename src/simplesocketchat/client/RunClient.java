package simplesocketchat.client;

import java.io.IOException;

public class RunClient {

    public static void main(String[] args) throws IOException {
        EchoClient ec = new EchoClient();
        ec.start();
    }
}

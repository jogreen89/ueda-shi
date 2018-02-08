// import java.io.IOException;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class Program {
    public static void main(String[] args) throws Exception {
	HttpServer server = HttpServer.create(8000);
	server.start();
        System.out.println("Hello, World");
    }
}

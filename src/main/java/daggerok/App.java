package daggerok;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Mono;
import reactor.ipc.netty.http.server.HttpServer;

@SpringBootApplication
//tag::content[]
public class App {

  public static void main(String[] args) {
    HttpServer.create(8080).startRouterAndAwait(
        routes -> routes.get("/", (req, resp) -> resp.sendString(Mono.just("hello!"))));
  }
}
//end::content[]

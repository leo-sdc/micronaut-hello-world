package hello.world.server;

import javax.inject.Inject;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/greet")
public class GreetController {
    
    @Inject
    private GreetService greetService;

    @Get("/{name}")
    public String greet(String name) {
        return greetService.getGreeting() + name;
    }

}

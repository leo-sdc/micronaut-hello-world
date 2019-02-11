package hello.world.server;

import javax.inject.Singleton;

@Singleton
public class GreetService {

    public String getGreeting() {
        return "Hello ";
    }

}

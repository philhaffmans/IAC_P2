package app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloWorld {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessage() {
        return "Test";
    }

    @GET
    @Path("/bijlmer/value")
    public int getMsg() {
        int value = 2014;
        Inwoners.initInwoners();
        int result = Inwoners.searchInwoners("Bijlmer", value);
        return result;

    }
}

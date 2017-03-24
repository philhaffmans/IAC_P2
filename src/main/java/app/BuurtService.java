package app;

import org.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/aantalinwoners")
public class BuurtService {

    @GET
    @Path("/{name}/{year}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getInwoners(@PathParam("year") int year, @PathParam("name") String name) {
        Inwoners.initInwoners();

        int result = Inwoners.searchInwoners(name, year);

        boolean containsname = Inwoners.getNames(name);
        boolean containsyear = Inwoners.getYear(year);

        String text;
        if (!containsname){
            text = "Naam wordt niet herkend!";
        }else if(!containsyear){
            text = "Jaar wordt niet herkend!";
        }else{
            JSONObject obj = new JSONObject();
            obj.put("Aantal inwoners", result);
            obj.put("Naam", name);
            text = obj.toString();
        }
        return text;
    }


}



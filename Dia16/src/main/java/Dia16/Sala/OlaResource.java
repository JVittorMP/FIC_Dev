package Dia16.Sala;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ola")
public class OlaResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String ola() {
        return " {\"Message\": \"Olá, seja bem vindo!\"}";
    }
}

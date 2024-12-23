package core.ms.management.api.gateway.rest;

import io.vertx.core.json.JsonObject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/api")
public class ApiGatewayRest {
    @POST
    @Path("/init/router")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject initRouter(JsonObject dataRouter) {
        return new JsonObject();
    }

    @POST
    @Path("/create/service")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject createService(JsonObject dataService) {
        return new JsonObject();
    }

    @POST
    @Path("/create/resource/service")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject createResourceService(JsonObject dataResourceService) {
        return new JsonObject();
    }

    @POST
    @Path("/create/microservice")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject createMicroservice(JsonObject dataMicroservice) {
        return new JsonObject();
    }

    @POST
    @Path("/create/resource/microservice")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject createResourceMicroservice(JsonObject dataService) {
        return new JsonObject();
    }
}

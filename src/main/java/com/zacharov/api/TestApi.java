package com.zacharov.api;


import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/")
public class TestApi {

    @GET
    public Response getUserInJSON() {
        User user = new User();
        user.setAge(22);
        user.setName("Den");
        String result = "User saved : " + user;
        return Response.status(200).entity(result).build();

    }


}

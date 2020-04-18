package com.zacharov.api;


import com.google.gson.Gson;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/")
public class TestApi {

    @GET
    public Response getUserInJSON() {
        User user = new User();
        Gson gson = new Gson();
        user.setAge(22);
        user.setName("Den");
        String result = gson.toJson(user);
        return Response.status(200).entity(result).build();

    }


}

package com.sebastian_daschner.cloud_processor;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("forecast")
public class CloudResource {

    @Inject
    Forecast forecast;

    @GET
    @Path("simple")
    public String simpleForecast() {
        return forecast.getSimple();
    }

    @GET
    @Path("extensive")
    public String extensiveForecast() {
        return forecast.getExtensive();
    }

}

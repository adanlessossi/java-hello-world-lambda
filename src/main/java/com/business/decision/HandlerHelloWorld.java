package com.business.decision;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class HandlerHelloWorld implements RequestHandler<String, String> {

    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    //TODO Create Handler Method to return "Hello " + input
    @Override
    public String handleRequest(String event, Context context) {
        LambdaLogger logger = context.getLogger();

        logger.log("EVENT: " + gson.toJson(event));
        logger.log("EVENT TYPE: " + event.getClass().toString());
        //TODO: Retrieve username from the event
        return null;
    }

}

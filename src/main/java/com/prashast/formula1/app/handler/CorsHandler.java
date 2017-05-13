package com.prashast.formula1.app.handler;

import ratpack.handling.Context;
import ratpack.handling.Handler;

import java.util.Optional;

public class CorsHandler implements Handler {
    public CorsHandler() {
    }

    public void handle(Context ctx) throws Exception {
        String origin = (String) Optional.ofNullable(ctx.getRequest().getHeaders().get("Origin")).orElse("*");
        ctx.header("Access-Control-Allow-Credentials", new Object[]{"true"});
        ctx.header("Access-Control-Allow-Origin", new Object[]{origin});
        ctx.header("Access-Control-Allow-Methods", new Object[]{"GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS"});
        ctx.header("Access-Control-Allow-Headers", new Object[]{"Content-Type"});
        ctx.header("Access-Control-Max-Age", new Object[]{"1728000"});
        ctx.next();
    }
}

package com.prashast.formula1.app.config;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;
import com.prashast.formula1.app.handler.LoggingHandler;
import com.prashast.formula1.app.handler.RaceHandler;
import com.prashast.formula1.app.handler.RaceYearHandler;
import com.prashast.formula1.app.handler.RouterChain;
import com.prashast.formula1.app.service.RaceService;
import com.prashast.formula1.app.service.RaceServiceImpl;
import ratpack.handling.HandlerDecorator;

public class RaceModule extends AbstractModule {

    protected void configure() {
        bind(RaceService.class).to(RaceServiceImpl.class);
        bind(RaceHandler.class);
        bind(RaceYearHandler.class);
        bind(RouterChain.class);
        Multibinder.newSetBinder(binder(), HandlerDecorator.class).addBinding().toInstance(HandlerDecorator.prepend(new LoggingHandler()));
    }

}

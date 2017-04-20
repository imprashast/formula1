package com.prashast.formula1;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;
import ratpack.handling.HandlerDecorator;

public class RaceModule extends AbstractModule {

    protected void configure() {
        bind(RaceService.class).to(RaceServiceImpl.class);
        bind(RaceHandler.class);
        Multibinder.newSetBinder(binder(), HandlerDecorator.class).addBinding().toInstance(HandlerDecorator.prepend(new LoggingHandler()));
    }

}

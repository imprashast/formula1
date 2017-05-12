package com.prashast.formula1;

import com.prashast.formula1.app.config.RaceModule;
import com.prashast.formula1.app.handler.RaceHandler;

import com.prashast.formula1.app.handler.RaceYearHandler;
import com.prashast.formula1.domain.db.DbModule;
import com.zaxxer.hikari.HikariConfig;
import ratpack.guice.Guice;
import ratpack.handling.Chain;
import ratpack.hikari.HikariModule;
import ratpack.server.BaseDir;
import ratpack.server.RatpackServer;

public class MainApp {

    public static void main(String[] args) throws Exception {
        RatpackServer.start(s -> s
                .serverConfig(serverConfigBuilder -> serverConfigBuilder
                        .baseDir(BaseDir.find())
                        .yaml("config/defaults.yaml")
                        .require("/db", HikariConfig.class)
                )
                .registry(Guice.registry(b -> b
                        .module(RaceModule.class)
                        .module(DbModule.class)
                        .module(HikariModule.class)
                ))
                .handlers(chain -> chain
                        .prefix("formula1", path -> path
                                .get("year.json", RaceYearHandler.class)
                                .get("race.json/:year", RaceHandler.class)) // Map to a dependency injected handler
                        .prefix("static", nested -> nested.fileSystem("assets", Chain::files)) // Bind the /static app path to the src/ratpack/assets/images dir
                        .all(ctx -> ctx.render("root handler!"))
                )
        );
    }
}

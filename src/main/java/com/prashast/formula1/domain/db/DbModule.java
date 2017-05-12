package com.prashast.formula1.domain.db;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import org.skife.jdbi.v2.DBI;

import javax.sql.DataSource;

public class DbModule extends AbstractModule{

    @Override
    protected void configure() {
        bind(RaceDao.class).in(Singleton.class);
    }

    @Provides
    @Singleton
    public DBI dbi(final DataSource ds) {
        return new DBI(ds);
    }

}
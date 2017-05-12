package com.prashast.formula1.domain.db;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;
import org.skife.jdbi.v2.Handle;

import java.util.List;
import java.util.Map;

public class RaceDao {
    private final ObjectMapper mapper;

    @Inject
    public RaceDao(final ObjectMapper mapper) {
        this.mapper = mapper;
    }

    public List<Map<String, Object>> fetchRaces(final Handle transaction){
        String query = "select * from races where year=2017";

        return transaction.select(query);
    }

    public List<Map<String, Object>> fetchRace(final Handle transaction,int year){
        String query = "select * from races where year= :year";

        return transaction.createQuery(query).bind("year",year).list();
    }

    public List<Map<String, Object>> fetchRaceYear(final Handle transaction){
        String query = "select distinct year from races order by year desc";
        return transaction.select(query);
    }
}

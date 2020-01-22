package com.fh.service;

import com.fh.model.FlightQuery;
import com.fh.util.ServerResponse;

public interface FlightService {
    ServerResponse pageselect(FlightQuery flightQuery);

    ServerResponse selectType();

    ServerResponse selectCity();
}

package ua.kpi.bogdan.airline.entity.status;

import ua.kpi.bogdan.airline.entity.Flight;

public enum FlightStatus {
    OPENED, DONE, CANCELED;

    public static FlightStatus getStatus(Flight flight) {
        return values()[flight.getStatusId()];
    }

    public String getName() {
        return name();
    }

}


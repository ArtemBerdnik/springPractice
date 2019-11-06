package entities;

import enums.Ratings;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class Event {

    private String name;
    private double eventPrice;
    private Ratings rating;
    private List<Date> datesEventInAir;
}

//EventService - Manages events (movie shows).
// Event contains only basic information, like name, base price for tickets, rating (high, mid, low).
// Event can be presented on several dates and several times within each day. For each dateTime an Event will be presented only in single Auditorium.

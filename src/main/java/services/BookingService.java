package services;

import entities.Event;
import entities.User;

import java.util.Date;

public interface BookingService {

    double getTicketsPrice(Event event, Date dateTime, User user, int seats);
}

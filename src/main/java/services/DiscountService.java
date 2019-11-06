package services;

import entities.Event;
import entities.User;

import java.util.Date;

public interface DiscountService {

    int getDiscount(User user, Event event, Date dateTime);
}

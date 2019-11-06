package servicesImpl;

import entities.Event;
import entities.User;
import services.BookingService;

import java.util.Date;

public class BookingServiceImpl extends DiscountServiceImpl implements BookingService  {

    @Override
    public double getTicketsPrice(Event event, Date dateTime, User user, int seats) {
        return user.getEmailAddress().isEmpty() ? event.getEventPrice() * seats : getDiscount(user, event, dateTime);
    }
}

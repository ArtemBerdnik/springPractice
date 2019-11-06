package servicesImpl;

import entities.Event;
import entities.User;
import enums.Ratings;
import org.springframework.cglib.core.Local;
import services.DiscountService;

import java.time.LocalDate;
import java.util.Date;

public class DiscountServiceImpl implements DiscountService {

    @Override
    public int getDiscount(User user, Event event, Date dateTime) {
        int disc1 = user.getBirthdayDate().before(new Date()) ? 10 : 0;
        int disc2 = event.getRating().equals(Ratings.HIGH) ? 15 : 0;
        return disc1 + disc2;
    }
}

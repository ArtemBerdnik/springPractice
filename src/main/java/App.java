import entities.Event;
import entities.User;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import servicesImpl.AuditoriumServiceImpl;
import servicesImpl.EventServiceImpl;
import servicesImpl.UserServiceImpl;

@AllArgsConstructor
public class App {

    private User user1;
    private UserServiceImpl userService;
    private EventServiceImpl eventService;
    private AuditoriumServiceImpl auditoriumService;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        App app = (App) context.getBean("app");
        System.out.println("before");

        System.out.println(app.userService.getAll());

        System.out.println("after");

        app.userService.save((User)context.getBean("user"));

        System.out.println(app.userService.getAll());

        System.out.println("Events/////////////////");
        System.out.println(app.eventService.getByName("black book"));
        app.eventService.save((Event)context.getBean("event"));
        System.out.println(app.eventService.getAll());

        System.out.println("AUDIT");
        System.out.println(app.auditoriumService.getAll());
    }
}

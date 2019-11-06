package servicesImpl;

import entities.Event;
import services.EventService;

import java.util.Collection;
import java.util.List;

public class EventServiceImpl implements EventService {

    private List<Event> events;

    public EventServiceImpl(List<Event> events) {
        this.events = events;
    }

    @Override
    public Event getByName(String name) {
        return events.stream()
                .filter(event -> event.getName().equals(name))
                .findFirst()
                .get();
    }

    @Override
    public void save(Object object) {
        events.add((Event) object);
    }

    @Override
    public void remove(Object object) {
        if (object instanceof Event) {
            events.remove(object);
        }
    }

    @Override
    public Object getById() {
        return null;
    }

    @Override
    public Collection getAll() {
        return events;
    }
}

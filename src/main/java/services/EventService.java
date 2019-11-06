package services;

import entities.Event;

public interface EventService extends AbstractService{

    Event getByName(String name);

}

package services;

import entities.Auditorium;

import java.util.List;

public interface AuditoriumService  {
    List<Auditorium> getAll();
    Auditorium getById(int id);
}

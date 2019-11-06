package servicesImpl;

import entities.Auditorium;
import services.AuditoriumService;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class AuditoriumServiceImpl implements AuditoriumService {

    private List<Auditorium> auditoriums;

    public AuditoriumServiceImpl(List<Auditorium> auditoriums) {
        this.auditoriums = auditoriums;
    }

    @Override
    public List<Auditorium> getAll() {
        return auditoriums;
    }

    @Override
    public Auditorium getById(int id) {
        Optional<Auditorium> a = Optional.of(auditoriums.stream()
                .filter(auditorium -> auditorium.getId() == id)
                .findFirst()
                .get());

       return a.orElseThrow(NoSuchElementException::new);
    }

}

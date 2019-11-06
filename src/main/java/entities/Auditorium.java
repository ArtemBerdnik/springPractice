package entities;

import lombok.Data;

import java.util.Random;

@Data
public class Auditorium {

    private String name;

    private int numberOfSeats;

    private int numberOfVIPSeats;

    private int id;

    public Auditorium(String name, int numberOfSeats, int numberOfVIPSeats) {
        this.name = name;
        this.numberOfSeats = numberOfSeats;
        this.numberOfVIPSeats = numberOfVIPSeats;
        this.id = generateId();
    }

    private int generateId() {
        Random random = new Random();
        return id = random.nextInt();
    }

}

package car_racing;

import java.util.ArrayList;
import java.util.List;

public class Track {
    private List<Car> cars;
    private Integer movingCount;

    public Track(Integer carCount, Integer movingCount) {
        this.movingCount = movingCount;
        cars = new ArrayList<>();
        for (int i = 0; i < carCount; i++) {
            cars.add(new Car(1, movingCount));
        }
    }

    public void run() {
        cars.forEach(Car::move);
    }

    public List<Car> getCars() {
        return cars;
    }
}

package racing2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RacingCars {
    private ArrayList<RacingCar> cars = new ArrayList<>();

    public void addRacingCars(String names) {
        String[] arr = names.split(",");
        for (int i = 0; i<arr.length; i++) {
            RacingCar car = new RacingCar(0, arr[i]);
            cars.add(car);
        }
    }

    public void selectMoveCount(int count) {
        for(int i = 0; i<count; i++) {
            AllcarMove();
        }
    }

    public void AllcarMove() {
        RandomGenerator randomGenerator = new RandomGenerator();
        for(RacingCar car : cars) {
            car.move(randomGenerator.get());
        }
    }

    public ArrayList<RacingCar> getWinnerCars() {
        Collections.sort(cars);
        return (ArrayList) cars.stream().filter(e-> e.getCount() == cars.get(0).getCount()).collect(Collectors.toList());
    }

    public ArrayList getCars() {
        return cars;
    }
}

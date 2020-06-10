package racing;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RacingCars {
    private ArrayList<RacingCar> cars  = new ArrayList<>();

    public void addRacingCars(String names) {
        String[] arr = names.split(",");
        for(int i =0; i<arr.length; i++) {
            RacingCar car = new RacingCar(0, arr[i]);
            cars.add(car);
        }
    }

    public void selectMoveCount() {
        RandomGenerator randomGenerator = new RandomGenerator();
        for(RacingCar car : cars) {
            car.move(randomGenerator.get());
        }
    }

    public ArrayList getWinnerCar() {
        Collections.sort(cars);
        return (ArrayList) cars.stream().filter(e-> e.getCount() == cars.get(0).getCount()).collect(Collectors.toList());
    }

    public ArrayList<RacingCar> getCars() {return cars;}
}

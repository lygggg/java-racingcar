package racing;

import java.util.ArrayList;
import java.util.Scanner;

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

    public ArrayList<RacingCar> getCars() {return cars;}
}

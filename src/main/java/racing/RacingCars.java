package racing;

import java.util.ArrayList;

public class RacingCars {
    private ArrayList<RacingCar> cars  = new ArrayList<>();

    public void addRacingCar(int count) {
        for(int i =0; i<count; i++) {
            RacingCar racingCar = new RacingCar(0);
            cars.add(racingCar);
        }
        System.out.println(cars);
    }

    public void selectMoveCount() {
        RandomGenerator randomGenerator = new RandomGenerator();
        for(RacingCar car : cars) {
            car.move(randomGenerator.get());
        }
    }

    public ArrayList<RacingCar> getCars() {return cars;}
}

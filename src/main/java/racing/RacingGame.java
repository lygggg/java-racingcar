package racing;

import java.util.Scanner;

public class RacingGame {
    final static private RacingCars cars = new RacingCars();

    public static void main(String[] args) {

            InputView inputView = new InputView();


            cars.addRacingCar(inputView.askCarCount());

            int count = inputView.askMoveCount();

            for(int i =1; i<=count; i++) {
                cars.selectMoveCount();
                ResultView.viewMovingCar(cars.getCars(),i);
            }
    }
}

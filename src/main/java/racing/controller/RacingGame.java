package racing.controller;

import racing.view.InputView;
import racing.domain.RacingCars;
import racing.view.ResultView;

public class RacingGame {
    final static private RacingCars cars = new RacingCars();

    public static void main(String[] args) {

            InputView inputView = new InputView();

            cars.addRacingCars(inputView.askCarCount());

            int count = inputView.askMoveCount();

            for(int i =1; i<=count; i++) {
                cars.selectMoveCount();
                ResultView.viewMovingCar(cars.getCars(),i);
            }
            ResultView.viewWinnerCar(cars.getWinnerCar());
    }
}

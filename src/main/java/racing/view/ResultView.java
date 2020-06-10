package racing.view;

import racing.domain.RacingCar;

import java.util.ArrayList;

public class ResultView {
    public static void viewMovingCar(ArrayList<RacingCar> cars, int count) {
        for(RacingCar car : cars) {
            System.out.print(car.getName()+" : ");
            for(int i =0; i<car.getCount(); i++) {
                System.out.print("-");
            }
            System.out.println("");
        }
        System.out.println(count+"회차");
    }

    public static void viewWinnerCar(ArrayList<RacingCar> cars) {
        for(RacingCar car : cars) {
            System.out.print(car.getName());
        }
    }
}
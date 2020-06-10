package racing2;

public class RacingGame {
    final static private RacingCars cars = new RacingCars();

    public static void main(String[] args) {
        Inputview2 inputview2 = new Inputview2();
        cars.addRacingCars(inputview2.askCarNames());

        cars.selectMoveCount(inputview2.askMoveCount());

    }






}

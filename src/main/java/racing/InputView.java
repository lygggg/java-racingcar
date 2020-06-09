package racing;

import java.util.Scanner;

public class InputView {

    Scanner scanner = new Scanner(System.in);

    public int askCarCount() {
        System.out.printf("자동차 대수는 몇 대 인가요?");
        int carCount = scanner.nextInt();
        return carCount;
    }

    public int askMoveCount() {
        System.out.printf("시도할 회수는 몇 회 인가요?");
        int moveCount = scanner.nextInt();
        return moveCount;
    }
}

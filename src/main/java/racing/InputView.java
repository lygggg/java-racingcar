package racing;

import java.util.Scanner;

public class InputView {

    Scanner scanner = new Scanner(System.in);

    public String askCarCount() {
        System.out.printf("경주할 자동차 이름을 입력하세요(이름은 쉼표,를 기준으로 구분)");
        String carNames = scanner.nextLine();
        return carNames;
    }

    public int askMoveCount() {
        System.out.printf("시도할 회수는 몇 회 인가요?");
        int moveCount = scanner.nextInt();
        return moveCount;
    }
}

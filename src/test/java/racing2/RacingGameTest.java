package racing2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import racing.domain.RacingCar;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RacingGameTest {
    private RacingCars racingCars;
    private RacingCar car;


    @BeforeEach
    void setUp() {
        racingCars = new RacingCars();
    }

    @DisplayName("이름을 가진 배열이 잘 추가되는지 확인하는 테스트")
    @ParameterizedTest
    @CsvSource(value = {"gibong,woomin", "gibong,woomin,gibong,woomin","gibong"})
    public void testAddCarTest(String names) {
        ArrayList<RacingCar> result = racingCars.getCars();
        assertEquals(names.split(",").length, result.size());
    }

    @DisplayName("차가 움직였는지 확인하는 테스트")
    @Test
    public void testCarMoveTest() {
        car = new RacingCar(0, "기봉");

        car.move(9);
        assertEquals(1,car.getCount());
        car.move(7);
        assertEquals(2,car.getCount());
        car.move(3);
        assertEquals(2,car.getCount());
    }

//    @DisplayName("레이싱카 게임 우승자 테스트")
//    @Test
//    public void testGetWinnerCarsTest() {
//        assertEquals();
//    }


}

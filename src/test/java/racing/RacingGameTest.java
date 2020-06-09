package racing;

import org.assertj.core.internal.bytebuddy.build.ToStringPlugin;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class RacingGameTest {
    private RacingCars racingCars;
    private RacingCar car;

    @BeforeEach
    void setUp() {
        racingCars = new RacingCars();
        car = new RacingCar(0);
    }

    @DisplayName("레이싱카 개수를 확인하는 테스트")
    @ParameterizedTest
    @ValueSource(ints = {5, 6, 7, 9, 10})
    public void testCountCarTest(int number) {
        racingCars.addRacingCar(number);
        ArrayList<RacingCar> result = racingCars.getCars();
        assertEquals(number, result.size());
    }

    @DisplayName("레이싱카가 제대로 움직이는지 확인하는 테스트")
    @Test
    public void testMoveTest() {
        car.move(6);
        assertEquals(1,car.getCount());
        car.move(7);
        assertEquals(2,car.getCount());
        car.move(3);
        assertEquals(2,car.getCount());
    }


}

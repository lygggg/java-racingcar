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
        car = new RacingCar(0,"미정");
    }

    @DisplayName("레이싱카 개수를 확인하는 테스트")
    @Test
    public void testCountCarTest() {
        String name = "gibong,woomin";
        racingCars.addRacingCars(name);
        ArrayList<RacingCar> result = racingCars.getCars();
        assertEquals(name.split(",").length, result.size());
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


    @DisplayName("자동차에 이름이 제대로 부여되는지 확인하는 테스트")
    @ParameterizedTest
    @CsvSource(value= {"gibong,woomin", "gibong,woomin,gibong,woomin","gibong"})
    public void testAddCarNameTest(String names) {
        racingCars.addRacingCars(names);
        ArrayList<RacingCar> result = racingCars.getCars();
        assertEquals(names.split(",").length,result.size());
    }

//    @DisplayName("승자가 누구인지 알아내는 테스트") // 도저히...
//    @ParameterizedTest
//    @CsvSource(value = {"5"})
//    public void testWinnerCarTest() {
//        racingCars.addRacingCars("기봉,영규,우민");
//        ArrayList names = racingCars.getWinnerCar();
//        assertEquals(names, new );
//    }

}

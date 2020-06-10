package racing;

import java.util.Random;

public class RacingCar implements Comparable {
    private int count;
    private String  name;

    public RacingCar(int count, String name) {
        this.count = count;
        this.name = name;
    }

    public void move(int count) {
            if (count >= 4) {
                this.count +=1;
            }
    }

    public int getCount() {
        return this.count;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(Object cars) {
        RacingCar car = (RacingCar) cars;
        if (this.count < car.getCount()) {
            return 1;
        } else {
            return -1;
        }
    }
}

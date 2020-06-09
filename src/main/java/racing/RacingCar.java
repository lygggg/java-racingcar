package racing;

import java.util.Random;

public class RacingCar {
    private int count;

    public RacingCar(int count) {
        this.count = count;
    }

    public void move(int count) {
            if (count >= 4) {
                this.count +=1;
            }
    }
    public int getCount() {
        return this.count;
    }
}

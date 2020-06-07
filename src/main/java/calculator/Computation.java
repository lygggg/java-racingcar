package calculator;

public class Computation {

    public int addNumber(String s, String b) {
        return Integer.parseInt(s) + Integer.parseInt(b);
    }

    public int subTractionNumber(String s, String b) {
        return Integer.parseInt(s) - Integer.parseInt(b);
    }

    public int divideNumber(String s, String b) {
        return Integer.parseInt(s) / Integer.parseInt(b);
    }

    public int multiplicationNumber(String s, String b) {
        return Integer.parseInt(s) * Integer.parseInt(b);
    }
}

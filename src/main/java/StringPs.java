public class StringPs {

    public String[] stringSplit(String s) {
        String[] arr = s.split(",");
        return arr;
    }

    public String stringSub(String s) {
        return s.substring(1,4);
    }

    public String stringCharAt(int i, String abc) {
        return Character.toString(abc.charAt(i));
    }
}

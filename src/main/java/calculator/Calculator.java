package calculator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class Calculator {

    public int getNumber(String s) {
        String[] arr = s.split(" ");
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(arr));
        if(arrayList.size() == 1) {
            return  Integer.parseInt(arrayList.get(0));
        }
        while (arrayList.size() > 0) {

            if(arrayList.get(1).equals("+")) {
               int number = addNumber(arrayList.get(0), arrayList.get(2));

               for(int i =0; i<3; i++ ) {
                   arrayList.remove(0);
               }
                arrayList.add(0,Integer.toString(number));
            }

            if(arrayList.size()==1){
                return Integer.parseInt(arrayList.get(0));
            }

            if(arrayList.get(1).equals("-")) {
                int number = subTractionNumber(arrayList.get(0), arrayList.get(2));

                for(int i =0; i<3; i++ ) {
                    arrayList.remove(0);
                }
                arrayList.add(0,Integer.toString(number));
            }

            if(arrayList.size()==1){
                return Integer.parseInt(arrayList.get(0));
            }

            if(arrayList.get(1).equals("*")) {
                int number = multiplicationNumber(arrayList.get(0), arrayList.get(2));

                for(int i =0; i<3; i++ ) {
                    arrayList.remove(0);
                }
                arrayList.add(0,Integer.toString(number));
            }

            if(arrayList.size()==1){
                return Integer.parseInt(arrayList.get(0));
            }

            if(arrayList.get(1).equals("/")) {
                int number = divideNumber(arrayList.get(0), arrayList.get(2));

                for(int i =0; i<3; i++ ) {
                    arrayList.remove(0);
                }
                arrayList.add(0,Integer.toString(number));
            }

            if(arrayList.size()==1){
                return Integer.parseInt(arrayList.get(0));
            }
        }
        return Integer.parseInt(arrayList.get(0));
    }

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
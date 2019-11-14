import java.util.ArrayList;
import java.util.List;

public class Main {

    // для женской обуви

    static double[] allRU = new double[] {
            34, 34.5, 35, 36, 36.5, 37, 37.5, 38, 39, 39.5,
            40, 41, 41.5, 42, 42.5
    };
    static double[] allEU = new double[] {
            35, 35.5, 36, 36.5, 37, 37.5, 38, 38.5, 39, 39.5,
            40, 41, 41, 42, 43
    };
    static double[] allUK = new double[] {
            3, 3.5, 4, 4.5, 5, 5.5, 6, 6.5, 7, 7.5, 8, 8.5,
            9, 9.5, 10
    };
    static double[] allUS = new double[] {
            5, 5.5, 6, 6.5, 7, 7.5, 8, 8.5, 9, 9.5, 10, 10.5, 11,
            11,5, 12
    };

    enum Sizes {
        RU, EU, UK
    }

    static String RUtoUS (String size) {
        for(int i = 0; i < allRU.length; ++i) {
            if(Double.parseDouble(size) == allRU[i]) {
                return String.valueOf(allUS[i]);
            }
        }
        return "error size";
    }
    static String EUtoUS (String size) {
        for(int i = 0; i < allEU.length; ++i) {
            if(Double.parseDouble(size) == allEU[i]) {
                return String.valueOf(allUS[i]);
            }
        }
        return "error size";
    }
    static String UKtoUS (String size) {
        for(int i = 0; i < allUK.length; ++i) {
            if(Double.parseDouble(size) == allUK[i]) {
                return String.valueOf(allUS[i]);
            }
        }
        return "error size";
    }

    static List<String> convertToUS(List<String> list, Sizes type) {
        List<String> answer = new ArrayList<String>();
        for(String size: list) {
            if(type == Sizes.RU) {
                answer.add(RUtoUS(size));
            }else if (type == Sizes.EU) {
                answer.add(EUtoUS(size));
            } else if(type == Sizes.UK) {
                answer.add(UKtoUS(size));
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        List<String> sizes = new ArrayList<String>();
        sizes.add("35");
        sizes.add("36");
        sizes.add("36.5");

        List<String> answer = convertToUS(sizes, Sizes.RU);
        for(String i: answer) {
            System.out.println(i);
        }
    }

}

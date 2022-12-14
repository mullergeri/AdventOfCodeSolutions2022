import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class RuckSack {
    public static void main(String[] args) throws FileNotFoundException {
        solution1();
        solution2();
    }

    private static void solution2() throws FileNotFoundException {
        String filepath = "filepath";

        Map<Character, Integer> valuesLowerCase = new HashMap<>();
        Map<Character, Integer> valuesUpperCase = new HashMap<>();

        int j = 1;
        for (char i = 'a'; i <= 'z'; i++) {
            valuesLowerCase.put(i, j);
            j++;
        }
        for (char i = 'A'; i <= 'Z'; i++) {
            valuesUpperCase.put(i, j);
            j++;
        }


        Scanner sc = new Scanner(new File(filepath));
        List<Character> charList = new ArrayList<>();
        List<String> ruckSacks = new ArrayList<>();
        int sumValues = 0;
        String line = "";

        int counter = 0;
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            ruckSacks.add(line);
            counter++;
            if (counter % 3 == 0) {
                for (int i = 0; i < ruckSacks.get(0).length(); i++) {
                    if (counter == 0) {
                        break;
                    }
                    for (int k = 0; k < ruckSacks.get(1).length(); k++) {
                        if (counter == 0) {
                            break;
                        }
                        if (ruckSacks.get(0).charAt(i) == ruckSacks.get(1).charAt(k)) {
                            char c = ruckSacks.get(0).charAt(i);
                            for (int l = 0; l < ruckSacks.get(2).length(); l++) {
                                if (c == ruckSacks.get(2).charAt(l)) {
                                    charList.add(c);
                                    counter = 0;
                                    break;
                                }
                            }
                        }
                    }
                }
                ruckSacks.clear();
            }
        }
        //System.out.println(charList);
        for (Character k : charList) {
            if (k == Character.toLowerCase(k)) {
                sumValues += valuesLowerCase.get(k);

            } else if (k == Character.toUpperCase(k)) {
                sumValues += valuesUpperCase.get(k);
            }
        }
        System.out.println(sumValues);
    }

    public static void solution1() throws FileNotFoundException {

        String filepath = "filepath";

        Map<Character, Integer> valuesLowerCase = new HashMap<>();
        Map<Character, Integer> valuesUpperCase = new HashMap<>();

        int j = 1;
        for (char i = 'a'; i <= 'z'; i++) {
            valuesLowerCase.put(i, j);
            j++;
        }
        for (char i = 'A'; i <= 'Z'; i++) {
            valuesUpperCase.put(i, j);
            j++;
        }


        Scanner sc = new Scanner(new File(filepath));
        int sumValues = 0;
        String line = "";
        char c = ' ';
        while (sc.hasNextLine()) {
            line = sc.nextLine();

            for (int i = 0; i < line.length() / 2; i++) {
                for (int x = line.length() - 1; x > line.length() / 2 - 1; x--) {
                    if (line.charAt(i) == line.charAt(x)) {
                        c = line.charAt(i);
                        break;
                    }
                }
            }
            if (c == Character.toLowerCase(c)) {
                sumValues += valuesLowerCase.get(c);

            } else if (c == Character.toUpperCase(c)) {
                sumValues += valuesUpperCase.get(c);
            }
        }
        System.out.println(sumValues);

    }


}

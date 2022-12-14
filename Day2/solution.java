import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) throws FileNotFoundException {

        solution1();
        solution2();
    }

    private static void solution2() throws FileNotFoundException {
        String filepath = "filepath";
        Scanner sc = new Scanner(new File(filepath));
        String line = "";
        int sumPoints = 0;

        while (sc.hasNextLine()) {

            line = sc.nextLine();
            line = line.replace(" ", "");

            switch (line.charAt(0)) {
                case 'A' -> {
                    if (line.charAt(1) == 'X') {
                        sumPoints += 3;
                    }
                    else if (line.charAt(1) == 'Y') {
                        sumPoints += 4;
                    } else {
                        sumPoints += 8;
                    }
                }
                case 'B' -> {
                    if (line.charAt(1) == 'X') {
                        sumPoints += 1;
                    }
                    else if (line.charAt(1) == 'Y') {
                        sumPoints += 5;
                    } else {
                        sumPoints += 9;
                    }
                }
                case 'C' -> {
                    if (line.charAt(1) == 'X') {
                        sumPoints += 2;
                    }
                    else if (line.charAt(1) == 'Y') {
                        sumPoints += 6;
                    } else {
                        sumPoints += 7;
                    }
                }
            }
        }

        System.out.println(sumPoints);


    }



    public static void solution1() throws FileNotFoundException {
        String filepath = "filepath";
        Scanner sc = new Scanner(new File(filepath));
        String line = "";
        int sumPoints = 0;

        while (sc.hasNextLine()) {

            line = sc.nextLine();
            line = line.replace(" ", "");

            switch (line.charAt(1)) {
                case 'X' -> {
                    sumPoints += 1;
                    if (line.charAt(0) == 'A') {
                        sumPoints += 3;
                    } else if (line.charAt(0) == 'C') {
                        sumPoints += 6;
                    }
                }
                case 'Y' -> {
                    sumPoints += 2;
                    if (line.charAt(0) == 'A') {
                        sumPoints += 6;
                    } else if (line.charAt(0) == 'B') {
                        sumPoints += 3;
                    }
                }
                case 'Z' -> {
                    sumPoints += 3;
                    if (line.charAt(0) == 'B') {
                        sumPoints += 6;
                    } else if (line.charAt(0) == 'C') {
                        sumPoints += 3;
                    }
                }
            }
        }

        System.out.println(sumPoints);


    }


}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class MostCalories {

    public static void main(String[] args) throws FileNotFoundException {
        solveDay01();
    }


    public static void solveDay01() throws FileNotFoundException {
        String filepath = "filepath";

        List<Integer> caloriesCarried = new ArrayList<>();
        List<Integer> sumCalories = new ArrayList<>();

        Scanner sc = new Scanner(new File(filepath));
        String s = "";

        while (sc.hasNextLine()) {
            s = sc.nextLine();
            if (!s.isEmpty()) {
                caloriesCarried.add(Integer.parseInt(s));
                continue;
            }
            int sum = 0;
            for (Integer integer : caloriesCarried) {
                sum += integer;
            }
            sumCalories.add(sum);
            caloriesCarried.clear();
        }

        System.out.println(sumCalories);

        Collections.sort(sumCalories);
        int max = sumCalories.get(sumCalories.size()-1);
        int sum = sumCalories.get(sumCalories.size()-1) + sumCalories.get(sumCalories.size()-2) + sumCalories.get(sumCalories.size()-3);

        System.out.println(max);
        System.out.println(sum);



    }


}

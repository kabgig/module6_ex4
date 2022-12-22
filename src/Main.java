import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("inter a big number:  ");

        String number = s.next();
        List<Character> list = new ArrayList<>();

        for (int i = number.length()-1; i >=0 ; i--) {
            list.add(number.charAt(i));
        }

        for (int i = 3; i < list.size(); i+=4) {
            list.add(i, ',');
        }

        for (int i = list.size()-1; i >=0; i--) {
            System.out.print(list.get(i));
        }

      //  System.out.println(list);

    }
}
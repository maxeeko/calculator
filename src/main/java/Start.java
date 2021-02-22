import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Start {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите через пробел: число действие число. (Римские и арабские цифры от 1 до 10)");

        List<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        try {
            for (String retval : input.split(" ", 50)) {
                list.add(retval);
            }
            Logic.logic(list.get(0), list.get(1), list.get(2));
        } catch (Exception e) {
            System.out.println("Ошибка, прочитайте условия");
        }System.exit(0);
    }

}


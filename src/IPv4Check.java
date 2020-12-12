import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPv4Check {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        String pattern = "((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]|[0-9])\\.){3}(2[0-5][0-5]|1[0-9]{2}|[1-9][0-9]|[0-9])";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(str);

        if (m.matches()) {
            System.out.println("Является IP-aдресом: " + str);
        } else {
            System.out.println("Не является IP-aдресом: " + str);
        }
    }
}

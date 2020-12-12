import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BracketExpressionCheck {
    static boolean matching(String string, Matcher matcher, Pattern pattern) {
        if (matcher.find()) {
            string = string.replaceFirst("\\([^\\(\\)]*\\)", "");
            matcher = pattern.matcher(string);
            return matching(string, matcher, pattern);
        } else {
            pattern = Pattern.compile("[^\\(\\)]*");
            matcher = pattern.matcher(string);
            return matcher.matches();
        }
    }

    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        String pattern = "\\([^\\(\\)]*\\)";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);

        System.out.println(matching(str, m, p));
    }
}

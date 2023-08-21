import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static final Pattern PATTERN = Pattern.compile("\\((\\d+),(\\d+)\\)-\\((\\d+),(\\d+)\\)");

    public static boolean check(String input) {
        Matcher matcher = PATTERN.matcher(input);
        return matcher.find();
    }

    public static List<Position> list(String input) {
        Matcher matcher = PATTERN.matcher(input);
        List<Position> list = new ArrayList<>();
        if (matcher.find()) {
            for (int i = 1; i < 5; i += 2) {
                list.add(new Position(Integer.parseInt(matcher.group(i)), Integer.parseInt(matcher.group(i+1))));
            }
        }
        return list;
    }
}

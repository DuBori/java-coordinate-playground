import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static final Pattern PATTERN_LINE = Pattern.compile("\\((\\d+),(\\d+)\\)-\\((\\d+),(\\d+)\\)");
    public static final Pattern PATTERN_SQUARE = Pattern.compile("\\\\(\\\\d+,\\\\d+\\\\)-\\\\(\\\\d+,\\\\d+\\\\)-\\\\(\\\\d+,\\\\d+\\\\)-\\\\(\\\\d+,\\\\d+\\\\)");
    public static final Pattern PATTERN_삼각형 = Pattern.compile("\\\\(\\\\d+,\\\\d+\\\\)-\\\\(\\\\d+,\\\\d+\\\\)-\\\\(\\\\d+,\\\\d+\\\\)");

    public static CalType check(String input) {
        if(PATTERN_LINE.matcher(input).matches()){
            return CalType.LINE;
        }
        if(PATTERN_SQUARE.matcher(input).matches()){
            return CalType.사각형;
        }
        if (PATTERN_삼각형.matcher(input).matches()) {
            return CalType.삼각형;
        }
        throw new IllegalArgumentException("입력값 패턴이 잘못되었습니다.");
    }

    public static List<Position> list(String input, CalType type) {
        Matcher matcher = getMatcher(input, type);

        List<Position> list = new ArrayList<>();
        if (matcher.matches()) {
            for (int i = 1; i < type.getCount(); i += 2) {
                list.add(new Position(Integer.parseInt(matcher.group(i)), Integer.parseInt(matcher.group(i+1))));
            }
        }
        return list;
    }

    private static Matcher getMatcher(String input, CalType type) {
        Matcher matcher = null;
        if (type == CalType.LINE){
            matcher =  PATTERN_LINE.matcher(input);
        }
        if (type == CalType.사각형){
            matcher =  PATTERN_SQUARE.matcher(input);
        }
        if (type == CalType.삼각형){
            matcher =  PATTERN_삼각형.matcher(input);
        }
        return matcher;
    }
}

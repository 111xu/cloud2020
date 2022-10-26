import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

/**
 * @author shkstart
 * @project cloud2020
 * @create 2022 10 18 14:23
 */
public class Time {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
    }
}

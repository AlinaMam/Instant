package instant;

import java.time.Instant;
import java.time.temporal.ChronoField;

public class Main2 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        long second = now.getEpochSecond();
        int nanos1 = now.getNano();
        int millis = now.get(ChronoField.MILLI_OF_SECOND);
        long nanos2 = now.getLong(ChronoField.NANO_OF_SECOND);

        System.out.println("second: " + second);
        System.out.println("nanos1: " + nanos1);
        System.out.println("millis: " + millis);
        System.out.println("nanos2: " + nanos2);

    }
}

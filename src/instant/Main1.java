package instant;

import java.time.Instant;

public class Main1 {
    public static void main(String[] args) {
        //по Гринвичу
        Instant now = Instant.now();
        System.out.println(now);

        //установить 5 миллисекунд относительно 1970
        Instant fiveSecondAfterEpoch = Instant.ofEpochSecond(5);
        Instant sixSecTwoNanBeforeEpoch = Instant.ofEpochSecond(-6, -2);
        Instant fiftyMilliSecondsAfterEpoch = Instant.ofEpochMilli(50);

        System.out.println("fiveSecondAfterEpoc " + fiveSecondAfterEpoch);
        System.out.println("sixSecTwoNanBeforeEpoch " + sixSecTwoNanBeforeEpoch);
        System.out.println("fiftyMilliSecondsAfterEpochc " + fiftyMilliSecondsAfterEpoch);

    }
}

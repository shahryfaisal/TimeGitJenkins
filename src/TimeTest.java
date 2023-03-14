
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;


class TimeTest {


    @Test
    void getTotalSeconds() {
    }

    @Test
    void getSeconds() {
    }

    @Test
    void getTotalMinutes() {
    }

    @Test
    void getTotalHours() {
    }
    @Test
    void getMilliseconds() {
        int count = Time.getMilliseconds("12:05:05:005");
        assertTrue(count==5, "Incorrect result");
    }

    void getTotalMilliSeconds(){
        int milliseconds =  Time.getTotalMilliSeconds("12:05:05:005");
        assertTrue(milliseconds==18305005, "Incorrect result");
    }

}
package seminars.third;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import seminars.third.hw.MainHW;
import static org.assertj.core.api.Assertions.*;


public class TestMainHW {
    MainHW method = new MainHW();

    @ParameterizedTest
    @ValueSource(ints = {Integer.MIN_VALUE, -2, 0, 2})
    void testPositiveOddNumber(int n){
        assertThat(method.evenOddNumber(n)).isTrue();
    }
    @ParameterizedTest
    @ValueSource(ints = {-3, 1, 3, Integer.MAX_VALUE})
    void testNegativeOddNumber(int n){
        assertThat(method.evenOddNumber(n)).isFalse();
    }
    @ParameterizedTest
    @ValueSource(ints = {26, 50, 99})
    void testPositiveNumberInInterval(int n){
        assertThat(method.numberInInterval(n)).isTrue();
    }
    @ParameterizedTest
    @ValueSource(ints = {0, 24, 25, 100, 101, Integer.MAX_VALUE, Integer.MIN_VALUE})
    void testNegativeNumberInInterval(int n){
        assertThat(method.numberInInterval(n)).isFalse();
    }

}

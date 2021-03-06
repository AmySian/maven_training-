package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {
    @Test
    void add_behaves_as_expected(){
        int a = 4;
        int b = 3;
        int result = new Sample().op(Sample.Operation.MULT,a,b);
        Assertions.assertThat(result).as("multiple of 4*3").isEqualTo(12);
    }
    @Test
    void addition_ok(){
        int a = 10;
        int b = 3;
        int result = new Sample().op(Sample.Operation.ADD,a,b);
        Assertions.assertThat(result).as("addition of 10 + 3").isEqualTo(13);

    }
}

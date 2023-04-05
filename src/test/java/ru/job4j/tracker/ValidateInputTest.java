package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    public void whenValidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    public void whenMultipleValidInputs() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"1", "2", "3"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = 0;
        selected = input.askInt("Enter menu:");
        selected = input.askInt("Enter menu:");
        selected = input.askInt("Enter menu:");

        assertThat(selected).isEqualTo(3);
    }

    @Test
    public void whenInputIsNegative() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"-6"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(-6);
    }

}
package calculator;

import checkout.Checkout;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private Integer result;
    private List<Integer> stack;


    public Calculator() {
        result = 0;
        stack = new ArrayList<Integer>();
    }

    public Integer result() {
        return this.result;
    }

    public void enter(Integer number) {
        this.stack.add(number);
    }

    public void operation(String string) {
        result = stack.get(stack.size()-1) + stack.get(stack.size()-2);
    }
}

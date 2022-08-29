package com.company;

import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        double a = calc.plus.apply(1, 2);
        double b = calc.minus.apply(1, 1);
      //  int c = calc.devide.apply(a, b);       Код не работал, т.к. в функции devide происходило деление на 0.
      //                                         Заменила деление на 0 делением на 0.00000000000001.
        double d = calc.newDevide.apply(a, b);

      //   calc.println.accept(c);
        calc.println.accept(d);

}

}

package com.awbp.task3;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinPoolExample {
    public static void main(String[] args) {
        int n = 10; // Вычисление факториала для числа 10

        ForkJoinPool forkJoinPool = new ForkJoinPool();
        // 5. В основном методе создайте экземпляр FactorialTask с числом, для которого нужно вычислить факториал, и запустите его в ForkJoinPool.
        FactorialTask factorialTask = new FactorialTask(n);

        long result = forkJoinPool.invoke(factorialTask);

        // 6. Выведите результат вычисления факториала.
        System.out.println("Факториал " + n + "! = " + result);
    }
}

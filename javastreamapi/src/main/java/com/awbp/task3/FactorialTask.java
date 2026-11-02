package com.awbp.task3;

import java.util.concurrent.RecursiveTask;

// 1. Реализуйте класс FactorialTask, который расширяет RecursiveTask. Этот класс будет выполнять рекурсивное вычисление факториала числа.
public final class FactorialTask extends RecursiveTask<Long> {

    private final int n;

    // 2. В конструкторе FactorialTask передайте число n, факториал которого нужно вычислить.
    public FactorialTask(int n) {
        this.n = n;
    }

    @Override
    protected Long compute() {
        if (n <= 1) {
            return 1l;
        }
        // 3. В методе compute() разбейте задачу на подзадачи и используйте fork() для их асинхронного выполнения.
        FactorialTask subTask = new FactorialTask(n - 1);
        subTask.fork();
        // 4. Используйте join() для получения результатов подзадач и комбинирования их для получения общего результата.
        return n * subTask.join();
    }

}

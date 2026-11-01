package com.awbp;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamCollectorsExample {

    public static void main(String[] args) {

        // 1. Создайте список заказов с разными продуктами и их стоимостями.
        var res = generateList().stream()
                // 2. Группируйте заказы по продуктам
                .collect(
                        Collectors.groupingBy(
                                Order::getProduct,
                                // 3. Для каждого продукта найдите общую стоимость всех заказов.
                                Collectors.summingDouble(Order::getCost)
                        )
                ).entrySet().stream()
                // 4. Отсортируйте продукты по убыванию общей стоимости.
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                // 5. Выберите три самых дорогих продукта.
                .limit(3)
                .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (a, b) -> a,
                LinkedHashMap::new
        ));

        // 6. Выведите результат: список трех самых дорогих продуктов и их общая стоимость.
        res.forEach((product, cost) ->
                System.out.println(product + ": " + cost)
        );


    }

    private static List<Order> generateList() {
        return List.of(
                new Order("Laptop", 1200.0),
                new Order("Smartphone", 800.0),
                new Order("Laptop", 1500.0),
                new Order("Tablet", 500.0),
                new Order("Smartphone", 900.0),
                new Order("Monitor", 450.0),
                new Order("Keyboard", 120.0),
                new Order("Mouse", 60.0),
                new Order("Laptop", 1800.0),
                new Order("Monitor", 550.0),
                new Order("Smartphone", 1100.0),
                new Order("Tablet", 700.0),
                new Order("Keyboard", 150.0),
                new Order("Mouse", 80.0),
                new Order("Headphones", 200.0),
                new Order("Headphones", 250.0),
                new Order("Monitor", 600.0),
                new Order("Tablet", 900.0),
                new Order("Smartwatch", 350.0),
                new Order("Smartwatch", 450.0),
                new Order("Laptop", 2200.0),
                new Order("Smartphone", 750.0),
                new Order("Keyboard", 180.0),
                new Order("Mouse", 90.0),
                new Order("Headphones", 300.0),
                new Order("Smartwatch", 550.0),
                new Order("Monitor", 700.0),
                new Order("Tablet", 650.0),
                new Order("Laptop", 1300.0),
                new Order("Smartphone", 950.0)
        );
    }

}
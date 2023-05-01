package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRandoms {
    @Test
    public void testRandoms() {
        for (int r : new Randoms(90, 100)) {
            System.out.println("Случайное число: " + r);
            Assertions.assertTrue(r >= 90 | r <= 100);
            if (r == 100) {
                System.out.println("Выпало число 100, давайте на этом закончим");
                break;
            }
        }
    }
}

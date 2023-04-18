/*
Напишіть програму, у якій користувач вводить будь-яке позитивне число. Програма підсумовує всі числа від 1 до введеного числа і виводить суму на екран.
 */
// Імпортування класу Scanner
import java.util.Scanner;

// Клас Solution
public class Solution {
    public static void main(String[] args) {
        // Створення об'єкту класу Scanner для отримання вводу користувача
        Scanner scanner = new Scanner(System.in);
        // Запит позитивного числа від користувача
        System.out.print("Введіть будь-яке позитивне число: ");
        // Зчитування введеного числа
        int n = scanner.nextInt();
        // Обчислення суми чисел від 1 до введеного числа
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        // Виведення результату обчислення
        System.out.println("Сума чисел від 1 до " + n + " дорівнює " + sum);
    }
}

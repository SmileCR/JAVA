/*
3.	Вивести на екран таблицю множення.
*/
// Клас Solution
public class Solution {
    public static void main(String[] args) {
        // Два вкладені цикли для виведення таблиці множення
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                // Виведення добутку поточних значень з табуляцією
                System.out.print(i*j + "\t");
            }
            // Перехід на новий рядок
            System.out.println();
        }
    }
}

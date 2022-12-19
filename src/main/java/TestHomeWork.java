import java.util.Scanner;

public class TestHomeWork {
    public static void main(String[] args) {
        // Переменные для хранения количества правильных и неправильных ответов
        int correctCount = 0, wrongCount = 0;

        // Ниже вместо null надо написать реализацию,
        // написано так, чтобы просто компилировалось

        // TODO: Массив вопросов (вместо null надо написать определение массива)
        String[] questions = new String[]{
                "В файл с каким расширением компилируется java-файл?",
                "С помощью какой команды git можно получить полную копию удаленного репозитория?",
                "Какой применяется цикл, когда не известно количество итераций?"
        };

        // TODO: Массив вариантов ответов
        String[][] answerOptions = {
                {"1. cs ", "2. java ", "3. class ", "4. exe "},
                {"1. commit ", "2. clone ", "3. push ", "4. copy "},
                {"1. while ", "2. for ", "3. loop "}
        };

        // TODO: Массив правильных ответов
        int[] correctAnswers = new int[]{3, 2, 1};

        // Примечание - можете придумать как хранить всю информацию в одном массиве

        Scanner scanner = new Scanner(System.in);
        // TODO: Цикл по всем вопросам - исправить, написать правильно
        for (int i = 0; i < questions.length; i++) {
            // TODO: Вывод вопроса на экран
            System.out.println(questions[i]);
            // TODO: Вывод вариантов ответов на экран
            for (int j = 0; j < answerOptions[i].length; j++) {
                System.out.println(answerOptions[i][j]);
            }
            //TODO: Считываем с консоли ответ пользователя
            System.out.println("Какой вариант верный?");
            int number = scanner.nextInt();
            //TODO: Проверяем ответ и выводим результат
            // а также увеличиваем счетчики правильных и неправильных ответов
            if (number == correctAnswers[i]) {
                System.out.println("правильно");
            } else System.out.println("неправильно");

            if (number == correctAnswers[i]) {
                correctCount += 1;
            } else wrongCount += 1;

        }
        //Выводим общий результат
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}

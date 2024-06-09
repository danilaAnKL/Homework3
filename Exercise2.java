package Homework3;

public class Exercise2 {
    public static void main(String[] args) {

        // Создаю массив для хранения 3 дробных чисел

        double[] mathConstans = new double[3];

        // Заполняю массив значениями Pi, e и единицы с точностью до 5 знаков после запятой

        mathConstans[0] = Math.PI;
        mathConstans[1] = Math.E;
        mathConstans[2] = 1;

        // Выводим значения массива с ограничением до 5 знаков после запятой

        System.out.println(String.format("%.5f", mathConstans[0]));
        System.out.println(String.format("%.5f", mathConstans[1]));
        System.out.println(String.format("%.5f", mathConstans[2]));


    }
}

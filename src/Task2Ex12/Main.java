package Task2Ex12;
/*
Напишите программу,
которая выводит на экран значения функции
у =  в диапазоне от -4 до 4.
Шаг изменения аргумента 0,5. (^ - в степени)
 */
public class Main {

    static double square (double x){
        double result = x * x ;
        return result;
    }
    public static void main(String[] args) {

        for (double x = -4 ; x <= 4 ; x = x + 0.5) {

            double x2 = square(x);
            double y = 2*x2-5*x-8;
            System.out.println(" y равен : " + y);

        }
    }
}

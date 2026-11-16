import java.util.Scanner;
import static model.Calculator.calc;
public class Main {
    public static void main(String[] args) {
// Лабораторная работа 1
// Студент гр.257 Фамилия Ибрагимов
        Scanner in=new Scanner(System.in);
        System.out.print("Введите x=");
        double x=in.nextDouble();
        System.out.println(calc(x));

    }
}
//Результаты выполнения программы
//Введите x=2,5
//y=24,412 F=2,253
//Введите x=0,5
//y=0,259 F=0,334
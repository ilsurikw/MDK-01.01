import java.util.Scanner;
import static java.lang.Math.*;
public class Main {
    //  Практическая работа 3
    //  Студент гр.257 Фамилия Ибрагимов
    public static void main(String[] args) {
        Pgf f = new Pgf();// создание экземпляра класса
        f.Vibor();//вызов метода ввода параметров круга
        f.Vvod();//вызов метода ввода параметров круга
        f.Vivod();//вывод параметров круга на экран
        f.Perem();//вызов метода перемещения
        f.Vivod();//вывод параметров круга на экран
        f.IzmRaz();//вызов метода масштабирования (изменения размера)
        f.Vivod();//вывод параметров круга на экран
        f.Vrash();//вызов метода поворота
        f.Vivod();//вывод параметров круга на экран
    }
}
//описание класса
class Pgf {
    //описание полей
    double cx, cy, r, dx, dy, k, a, ax, ay;
    int nf;
    void Vibor() {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите фигуру: круг-1, квадрат-2, прямоугольник-3");
        nf = in.nextInt();
    }
    //метод ввода параметров
    void Vvod() {
        Scanner in = new Scanner(System.in);
        if (nf == 1) {
            System.out.println("Введите параметры круга");
            System.out.print("cx=");
            cx = in.nextDouble();
            System.out.print("cy=");
            cy = in.nextDouble();
            System.out.print("r=");
            r = in.nextDouble();
        } else if (nf == 2) {
            System.out.println("Введите параметры квадрата\nКоординаты центра:");
            System.out.print("cx=");
            cx = in.nextDouble();
            System.out.print("cy=");
            cy = in.nextDouble();
            System.out.println("Вектор от центра до вершины:");
            System.out.print("ax=");
            ax = in.nextDouble();
            System.out.print("ay=");
            ay = in.nextDouble();
        }
        else {
            System.out.println("Введите параметры прямоугольника\nКоординаты центра:");
            System.out.print("cx=");
            cx = in.nextDouble();
            System.out.print("cy=");
            cy = in.nextDouble();
            System.out.println("Вектор от центра до вершины:");
            System.out.print("ax=");
            ax = in.nextDouble();
            System.out.print("ay=");
            ay = in.nextDouble();
        }
    }

    //метод вывода параметров
    void Vivod() {
        System.out.print("Параметры фигуры: ");
        if (nf == 1) {
            System.out.printf("cx=%.0f, cy=%.0f, r=%.0f\n", cx, cy, r);
        } else {
            System.out.printf("cx=%.0f, cy=%.0f, ax=%.0f, ay=%.0f\n", cx, cy, ax, ay);
        }
    }

    //метод перемещения
    void Perem() {
        System.out.println("Введите координаты смещения фигуры");
        Scanner in = new Scanner(System.in);
        System.out.print("Смещение по Х=");
        dx = in.nextDouble();
        System.out.print("Смещение по Y=");
        dy = in.nextDouble();
        if (nf == 1) {
            cx = cx + dx;
            cy = cy + dy;
        } else {
            cx = cx + dx;
            cy = cy + dy;
            ax = ax + dx;
            ay = ay + dy;
        }
    }

    //метод вращения
    void Vrash() {
        Scanner in = new Scanner(System.in);
        System.out.print("Угол поворота фигуры ");
        a = in.nextDouble();
        if (nf != 1) {
            a = a * PI / 180;
            double t = ax;
            ax = cx + (ax - cx) * cos(a) - (ay - cy) * sin(a);
            ay = cy + (ay - cy) * cos(a) + (t - cx) * sin(a);
        }
    }
    void IzmRaz() {
        Scanner in = new Scanner(System.in);
        if (nf == 1) {
            System.out.print("Коэффициент изменения радиуса круга=");
            k = in.nextDouble();
            r = r * k;
        } else {
            if (nf == 2) {
                System.out.print("Коэффициент изменения расстояния до вершины квадрата=");
            } else {
                System.out.print("Коэффициент изменения расстояния до вершины прямоугольника=");
            }
            k = in.nextDouble();
            ax = (ax - cx) * k + cx;
            ay = (ay - cy) * k + cy;
        }
    }
}
//Выберите фигуру: круг-1, квадрат-2, прямоугольник-3
//1
//Введите параметры круга
//cx=0
//cy=0
//r=3
//Параметры фигуры: cx=0, cy=0, r=3
//Введите координаты смещения фигуры
//Смещение по Х=2
//Смещение по Y=3
//Параметры фигуры: cx=2, cy=3, r=3
//Коэффициент изменения радиуса круга=2
//Параметры фигуры: cx=2, cy=3, r=6
//Угол поворота фигуры 6
//Параметры фигуры: cx=2, cy=3, r=6

//Выберите фигуру: круг-1, квадрат-2, прямоугольник-3
//2
//Введите параметры квадрата
//Координаты центра:
//cx=2
//cy=3
//Вектор от центра до вершины:
//ax=4
//ay=5
//Параметры фигуры: cx=2, cy=3, ax=4, ay=5
//Введите координаты смещения фигуры
//Смещение по Х=1
//Смещение по Y=2
//Параметры фигуры: cx=3, cy=5, ax=5, ay=7
//Коэффициент изменения расстояния до вершины квадрата=0,5
//Параметры фигуры: cx=3, cy=5, ax=4, ay=6
//Угол поворота фигуры 90
//Параметры фигуры: cx=3, cy=5, ax=2, ay=6

//Выберите фигуру: круг-1, квадрат-2, прямоугольник-3
//3
//Введите параметры прямоугольника
//Координаты центра:
//cх=4
//cy=1
//Вектор от центра до вершины:
//aх=3
//ay=6
//Параметры фигуры: cx=4, cy=1, ax=3, ay=6
//Введите координаты смещения фигуры
//Смещение по Х=0
//Смещение по Y=-4
//Параметры фигуры: cx=4, cy=-3, ax=3, ay=2
//Коэффициент изменения расстояния до вершины прямоугольника=1
//Параметры фигуры: cx=4, cy=-3, ax=3, ay=2
//Угол поворота фигуры 180
//Параметры фигуры: cx=4, cy=-3, ax=5, ay=-8
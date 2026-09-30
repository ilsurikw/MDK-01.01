import java.util.Scanner;
public class Main {
    public static void main(String[] args){
//Практическая работа 2
//Студент гр. 257 Фамилия Ибрагимов

     System.out.println("Начало работы");
     Pgf f = new Pgf();
     f.Vvod();
     f.Vivod();

     f.Perem();
     f.Vivod();

     f.IzmRaz();
     f.Vivod();

     f.Vrash();
     f.Vivod();

     System.out.println("Конец работы");
    }
}

class Pgf {
    private double cx, cy;
    private double r;
    private double ax,ay;
    private double a;
    private double k;
    private double dx,dy;
    public Pgf(){
        this.cx = 0;
        this.cy = 0;
        this.r = 3;
        this.ax = 0;
        this.ay = 0;
        this.a = 0;
        this.k = 1;
        this.dx = 0;
        this.dy = 0;
    }
    public Pgf(double cx,double cy,double r) {
        this.cx = cx;
        this.cy = cy;
        this.r = r;
        this.ax = 0;
        this.ay = 0;
        this.a = 0;
        this.k = 1;
        this.dx = 0;
        this.dy = 0;
    }
        public void Vvod() {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите параметры круга");
            System.out.print("cx=");
            cx = in.nextDouble();
            System.out.print("cy=");
            cy = in.nextDouble();
            System.out.print("r=");
            r = in.nextDouble();
        }
            public void Vivod () {
                System.out.println("Параметры фигуры");
                System.out.println("cx=" + cx + "cy=" + cy + "r=" + r);
            }
            public void Perem () {
                Scanner in = new Scanner(System.in);
                System.out.println("Введите координаты смещения фигуры");
                dx = in.nextDouble();
                System.out.print("Смещение по Y=");
                dy = in.nextDouble();
                cx = cx + dx;
                cy = cy + dy;
            }
            public void IzmRaz () {
                Scanner in = new Scanner(System.in);
                System.out.print("Коэффициент изменения радиуса круга=");
                k = in.nextDouble();
                r = r * k;
            }
            public void Vrash () {
                Scanner in = new Scanner(System.in);
                System.out.print("Угол поворота фигуры ");
                a = in.nextDouble();
            }

            }

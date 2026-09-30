public class Main {
    public static void main(String[] args) {
//  Практическая работа 1
//  Студент гр.257 Фамилия Ибрагимов
        Krug krug = new Krug();
        Krug krug2 = new Krug(1, 1, 8);
        Krug krug3 = new Krug(255);
        krug.print();
        krug2.print();
        krug3.print();
    }
}
class Krug{
    private double x, y;
    private double r;
    public Krug(){
        this.x = 0;
        this.y = 0;
        this.r = 5;
    }
    public Krug(double x, double y, double r){
        this.x = x;
        this.y = y;
        this.r = r;
    }
    public Krug(double r){
        this(4, 5, r);
    }
    void print(){
        System.out.println("x=" + x + " y=" + y + " r=" + r);
    }
}
// Результаты выполнения программы:
// x=0.0 y=0.0 r=5.0
// x=1.0 y=1.0 r=8.0
// x=4.0 y=5.0 r=255.0

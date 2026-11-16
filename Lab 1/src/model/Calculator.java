package model;

import static java.lang.Math.*;
public class Calculator {
        public static String calc(double x){
            final double a = 0.5;
            final double b = 2.5;
            double y=pow(x+a,3)*(atan(a*x)-sqrt(pow(x-a,2))+pow(log(a*pow(x,2)+1),2));
            double F=sin(a*x)-exp(-x)+log(abs(x-a)+2);
            return String.format("y=%.3f F=%.3f%n", y, F);
        }
}

package example;

import point.Point;

import java.util.Scanner;

public class Pointmain{

    public static void main(String []args)throws CloneNotSupportedException
    {
        Scanner bn=new Scanner(System.in);
        System.out.println("enter the 1st co-ordinate:");
        System.out.println("enter the x-coordinate:");
        String x=bn.next();
        System.out.println("enter the y-coordinate:");
        String y=bn.next();
        Point point1=new Point(x,y);
        Point point2=(Point) point1.clone();
        System.out.println("enter the second co-ordinate:");
        System.out.println("enter the x1-coordinate:");
        point2.x= bn.next();
        System.out.println("enter the y-coordinate:");
        point2.y=bn.next();
        String x3=point2.check(x,y)?"both point are same":"both point are not same";
        System.out.println("hence "+x3);
        System.out.println("orginal copy of X and y:"+point1.x+" "+point1.y);
        System.out.println("cloned  copy of X and y:"+point2.x+" "+point2.y);
    }
}

package calculation;
import point.Point;
import java.util.Scanner;
import java.util.logging.Logger;

public class Calculation {
    public Calculation() throws CloneNotSupportedException {
        Logger l = Logger.getLogger("com.api.jar");
        Scanner bn = new Scanner(System.in);
        l.info("enter the 1st co-ordinate:");
        l.info("enter the x-coordinate:");
        String x = bn.next();
        l.info("enter the y-coordinate:");
        String y = bn.next();
        Point point1 = new Point(x, y);
        Point point2 = (Point) point1.clone();
        l.info("enter the second co-ordinate:");
        l.info("enter the x1-coordinate:");
        point2.x = bn.next();
        l.info("enter the y-coordinate:");
        point2.y = bn.next();
        String x3 = point2.check(x, y) ? "both point are same" : "both point are not same";
        l.info("hence " + x3);
        l.info("orginal copy of X and y:" + point1.x + " " + point1.y);
        l.info("cloned  copy of X and y:" + point2.x + " " + point2.y);
    }
}
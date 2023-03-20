package example;
import point.Pointlogic;
import java.util.Scanner;
import java.util.logging.Logger;

public class Pointmain{
    public static void main(String []args) {

        Logger log =  Logger.getLogger("points");
        Scanner sc = new Scanner(System.in);
        log.info("Enter Value for x:");
        Float x = sc.nextFloat();
        log.info("Enter Value for y:");
        Float y = sc.nextFloat();
        sc.close();

        Pointlogic obj= new Pointlogic(x,y);
        Pointlogic obj2 =obj.point();

        if(obj2.testEqual()) {
            log.info("Values are same");
        }
        else {
            log.info("Values are not same");
        }
    }
}

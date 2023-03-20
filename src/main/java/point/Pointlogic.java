package point;
import java.util.logging.Logger;

public class Pointlogic implements Cloneable{

    Float x;
    Float y;
    Logger log =  Logger.getLogger("Point");
    public Pointlogic(Float x, Float y){
        this.x=x;
        this.y=y;
    }
    public boolean testEqual() {
        return x.equals(y);
    }
    public Object clone() throws CloneNotSupportedException
    {
        return  super.clone();
    }


//    public Pointlogic point() {
//        try {
//            return (Pointlogic) super.clone();
//
//        }catch(CloneNotSupportedException e) {
//            log.info("error"+e);
//            return this;
//
//        }

    }



package point;
import java.util.logging.Logger;

public class Pointlogic implements Cloneable{

    Float x;
    Float y;

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
    }



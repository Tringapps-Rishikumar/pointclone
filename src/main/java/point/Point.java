package point;
public class Point implements Cloneable{
    public String x;
    public String y;
    public Point(String x, String y)
    {
        this.x=x;
        this.y=y;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return  super.clone();
    }
    public boolean check(String x1,String y1) {
        return x.equals(x1) &&y.equals(y1);
    }
}

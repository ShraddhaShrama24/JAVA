class Rectangle{
    double length,width;
    void setdim(double l,double w)
    {
        length=l;
        width=w;
    }
    double calarea()
    {
        double area=length*width;
        return area;
    }
    double calperimeter()
    {
        double perimeter=2*(length+width);
        return perimeter;
    }
}
public class rectangle {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        r1.setdim(20.0, 10.0);
        double a=r1.calarea();
        System.out.println("Area of rectangle is= "+a);
        double b=r1.calperimeter();
        System.out.println("Perimeter of rectangle is= "+b);
    }
}

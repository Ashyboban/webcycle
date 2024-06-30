package arithmatic;
public class operation implements addition, substraction, multiplication, division
{
    public double add(double x,double y)
    {
        return x+y;
    }

    public double sub(double x,double y)
    {
        return x-y;
    }

    public double multi(double x,double y)
    {
        return x*y;
    }

    public double div(double x,double y)
    {
        return x/y;
    }
}

package graphics_pack;

 interface graphics_inter {
    public float recarea(int l,int b);
    public float cirarea(int r);
    public float squarea(int a);


}
public class graphics_pack implements graphics_inter
{
    public float recarea(int l,int b)
    {
        return l*b;
    }
    public float cirarea(int r)
    {
        return r*r*(float)3.14;
    }
    public float squarea(int a)
    {
        return a*a;
    }


}

abstract class figure
{
int d1,d2;
figure(int d1,int d2)
{
this.d1=d1;
this.d2=d2;
}
public abstract int area();
}

class circle extends figure
{
circle(int d1,int d2)
{
super(d1,d2);
}
public int area()
{
return(3*d1*d1);
}
public void display()
{
System.out.println("Inside circle display");
}

}

class rectangle extends figure
{
rectangle(int d1,int d2)
{
super(d1,d2);
}
public int area()
{
return(d1*d2);

}
}




class abst
{
public static void main(String args[])
{
figure f1=new figure();
figure fig;

fig=new circle(2,0);
System.out.println("Area of circle is "+fig.area());
fig.display();
fig=new rectangle(2,3);
System.out.println("Area of rectangle is "+fig.area());

}
}
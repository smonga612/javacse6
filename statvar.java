class A
{
int a;
static int b;
void setA(int i)
{
a=i;
}
void setB(int j)
{
b=j;
}

int getA()
{
return(a);
}

int getB()
{
return(b);
}

void incr()
{
a++;
b++;
}


}


class statvar
{

public static void main(String args[])
{

A a1=new A();
A a2=new A();

a1.setA(1);
a1.setB(2);

a1.incr();
System.out.println("A1 object a= "+a1.getA());
System.out.println("A1 object b= "+a1.getB());

System.out.println("A2 object a= "+a2.getA());
System.out.println("A2 object b= "+a2.getB());

a2.setA(3);
a2.setB(4);

a2.incr();

System.out.println("A2 object a= "+a2.getA());
System.out.println("A2 object b= "+a2.getB());

System.out.println("A1 object a= "+a1.getA());
System.out.println("A1 object b= "+a1.getB());


}
}
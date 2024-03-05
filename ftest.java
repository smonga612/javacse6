class A
{
final int x=12;
 public void print()
{
System.out.println("Inside A print");

}
}


class B extends A
{
public void print()
{
x=13;
System.out.println("Inside B print");

}
}

class ftest
{
public static void main(String args[])
{
B b1=new B();
b1.print();

}
}
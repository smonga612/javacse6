interface dip
{
public void display();
}

interface output
{
public void result();

}

class A implements dip,output
{
void print()
{
System.out.println("Inside A print");
}
public void display()
{
System.out.println("Inside A display");
}
public void result()
{
System.out.println("Inside A result");
}

}

class inter
{
public static void main(String args[])
{
A a1=new A();
a1.print();
a1.display();
a1.result();

}
}
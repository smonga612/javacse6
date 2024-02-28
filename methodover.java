class A
{
int a;
void setA(int a)
{
this.a=a;
System.out.println(a);
}
int getA()
{
return(a);
}

void display()
{
for(int i=0;i<a;i++)
System.out.println("Value of i is "+i);
}
}

class B extends A
{
int a;
void setB(int a)
{
this.a=a;
}
int getB()
{
return(a);
}
void display()
{
//super.display();
System.out.println("Inside B display");
for(int j=0;j<a;j++)
System.out.println("Value of j is "+j);
}


}

class methover
{
public static void main(String args[])
{
//A a1=new B();
B b1=new B();
//b1.display();
b1.setA(3);
b1.setB(5);
b1.display();



}
}



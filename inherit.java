class A
{
int a;
A()
{
System.out.println("Inside a's constructor");
}

A(int a)
{
this.a=a;
System.out.println("Inside a's parameterized constructor");
}




void seta(int a)
{
this.a=a;
}
int geta()
{
return(a);
}

}


class B extends A
{
int b;
B()
{
System.out.println("Inside b's constructor");
}

B(int b)
{
super(b*2);
this.b=b;
System.out.println("Inside b's paramterized constructor");
}

void setb(int b)
{
this.b=b;
}
int getb()
{
return(b);
}

}


class inhtest
{
public static void main(String args[])
{
B b1=new B(12);
//b1.seta(5);
System.out.println("Value of a is "+b1.geta());

//b1.setb(15);
System.out.println("Value of b is "+b1.getb());



}
}

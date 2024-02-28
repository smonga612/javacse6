class A
{
{
System.out.println("non-Static Block");
}

static {
System.out.println("First Static Block");
}



}

class test
{
public static void main(String args[])
{
A a1=new A();
A a2=new A();

}

static {
System.out.println("Inside main static block");
}
}
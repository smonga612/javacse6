class A
{

public String toString()
{
return("This is an object of Class A");
}


}
class test
{
public static void main(String args[])
{
A a1=new A();
Object obj=new String("Hello");
System.out.println(obj.toString());

System.out.println(a1.getClass());

}


}
class teststr
{
public static void main(String args[])
{
String s1=new String("ABC");
String s2=new String("ABC");

String s3="Hello";
String s4="Hello";

System.out.println(s1.hashCode());
System.out.println(s2.hashCode());

System.out.println(System.identityHashCode(s1));
System.out.println(System.identityHashCode(s2));

System.out.println(s3.hashCode());
System.out.println(s4.hashCode());

System.out.println(System.identityHashCode(s3));
System.out.println(System.identityHashCode(s4));



//s[0]*31^(n-1)+s[1]*31^(n-2).......s[n-1]

//65*31^2+66*31^1+67*31^0
//65*31*31+66*31+67
}



}
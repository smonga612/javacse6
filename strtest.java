class strtest
{
public static void main(String args[])
{
String s1=new String("AB");
String s2=new String("AB");
String s3="Test";
String s4="Test";

System.out.println(s1.hashCode());
System.out.println(s2.hashCode());

System.out.println(System.identityHashCode(s1));
System.out.println(System.identityHashCode(s2));

System.out.println(s3.hashCode());
System.out.println(s4.hashCode());

System.out.println(System.identityHashCode(s3));
System.out.println(System.identityHashCode(s4));


}
}
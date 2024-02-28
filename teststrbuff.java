class testbuff
{
public static void main(String args[])
{
String s=new String("Good");
System.out.println("Identity of String "+System.identityHashCode(s));
s=s+" Bye";
System.out.println(s);
System.out.println("Identity of String "+System.identityHashCode(s));

StringBuffer sb=new StringBuffer("Hello");
System.out.println(sb);

System.out.println("Identity of String Buffer "+System.identityHashCode(sb));

sb.append(" How are you");

System.out.println(sb);

System.out.println("Identity of String Buffer after append "+System.identityHashCode(sb));
sb.insert(5,",");
System.out.println(sb);

sb.delete(6,9);
System.out.println(sb);


}
}
class strbuf
{
public static void main(String args[])
{
StringBuffer sb=new StringBuffer("Hello");
String s="Hello";
System.out.println(System.identityHashCode(s));
System.out.println(System.identityHashCode(sb));

s=s+"Good Bye";
sb=sb.append("Good");
System.out.println(System.identityHashCode(s));
System.out.println(System.identityHashCode(sb));

System.out.println(s);
System.out.println(sb);

sb.insert(3,"Test");
System.out.println(sb);

sb.delete(2,4);
System.out.println(sb);
System.out.println(System.identityHashCode(sb));

StringBuilder sb1=new StringBuilder();
long stime=System.currentTimeMillis();
System.out.println(stime);

for(long i=0;i<1000000;i++)
sb.append("T1");
long etime=System.currentTimeMillis();

System.out.println(etime-stime);


}
}
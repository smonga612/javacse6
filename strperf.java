class A
{
public static void main(String args[])
{
StringBuffer sb=new StringBuffer();
long stime = System.currentTimeMillis();
for(long i=0;i<1000000;i++)
sb.append("SB");
long etime =System.currentTimeMillis();
System.out.println(etime-stime);

StringBuilder sb1=new StringBuilder();
long stime1 = System.currentTimeMillis();
for(long i=0;i<1000000;i++)
sb1.append("SB1");
long etime1 =System.currentTimeMillis();
System.out.println(etime1-stime1);




}
}
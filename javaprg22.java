class student
{
int rollno;
student()
{
this(456);
System.out.println("Inside Default Constructor");
}
student(int rollno)
{
this.rollno=rollno;
System.out.println("Inside parametrized Constructor");
}

void setRoll(int rollno)
{
this.rollno=rollno;
}
int getRoll()
{
return(rollno);
}


}

class test
{
public static void main(String args[])
{
student s1=new student();
//s1.setRoll(123);
System.out.println(s1.getRoll());

}
}

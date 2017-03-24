package dylan.junitTest;


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
   private int age;
   private String name;
   private String surname;
   private float height;
   private int day;
   private int month;
   private int year;
   private Boolean pet;
   private String petName;
   private int oldAge;
   private String[] rs;


    public static void main( String[] args )
    {
        App a = new App();


        Scanner input = new Scanner(System.in);
        String dob;

        System.out.println("Enter Date of Birth (DD-MM-YYYY): ");
        a.setDayMonthYear(input.next());

        System.out.println("Enter Your Name: ");
        a.setName(input.next());

        System.out.println("Enter Your Surname: ");
        a.setSurname(input.next());

        System.out.println("Enter Your Height(in feet): ");
        a.setHeight(input.nextFloat());

        System.out.println("Do You Own A Pet?(Y/N): ");
        a.setPet(input.next());

        if(a.getPet())
        {
            System.out.println("Enter Your Pets Name: ");
            a.setPetName(input.next());
            System.out.println( "Hello World!" );
            System.out.println( "My name is " + a.getName());
            System.out.println( "My surname is " + a.getSurname());
            System.out.println( "I am " + a.getHeight() + "feat tall");
            System.out.println( "I am " + a.getAge() + " years old");
            System.out.println( "In 30 years i will be "  + a.getOldAge() + " years old");
            System.out.println( "My pets name is " + a.getPetName());
            System.out.println( a.getPetName() + " ate my homework :( .........." );
        }
        else {
            System.out.println("Hello World!");
            System.out.println("My name is " + a.getName());
            System.out.println("My surname is " + a.getSurname());
            System.out.println("I am " + a.getAge() + " years old");
            System.out.println("");
            System.out.println("A long time Later....");
            System.out.println("I have locked myself in my car for 30 years...");
            System.out.println("I am " + a.getOldAge() + " years old now");
            System.out.println("");
            System.out.println("I am dead now.............");
        }

    }

    public App()
    {

    }
    public App(int age)
    {
        this.age = age;
    }
    public App(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;

    }



    public void agePlus()
    {
        oldAge = age + 30;
    }

    public void setDayMonthYear(String dob)
    {
        rs = dob.split("-");
        day = Integer.parseInt(rs[0]);
        month = Integer.parseInt(rs[1]);
        year = Integer.parseInt(rs[2]);
System.out.println(rs[0] + rs[1] + rs[2]);
System.out.println(getRs()[0] + getRs()[1] + getRs()[2]);
        //System.out.println("date :" + day + "-" + month + "-" +year);
    }

    public void calcAge()
    {



        Calendar dob = new GregorianCalendar(year, month, day);
        Calendar sysdate = new GregorianCalendar();
        age = sysdate.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
        if ((dob.get(Calendar.MONTH) > sysdate.get(Calendar.MONTH))
                || (dob.get(Calendar.MONTH) == sysdate.get(Calendar.MONTH) && dob.get(Calendar.DAY_OF_MONTH) > sysdate
                .get(Calendar.DAY_OF_MONTH))) {
            age--;
        }
        //System.out.println("" + age);
    }




    public void setName(String nm)
    {
        name = nm;
    }

    public void setSurname(String snm)
    {
        surname = snm;
    }

    public void setPet(String petYN)
    {

        if(petYN.toUpperCase().equals("Y"))
        {

            pet = true;
        }
        else if(petYN.toUpperCase().equals("N"))
        {
            pet = false;
        }

    }

    public void setHeight(float h){
        height = h;
    }

    public void setPetName(String pName)
    {
        petName = pName;
    }

    public int getOldAge()
    {
        agePlus();
        return oldAge;
    }

    public int getAge()
    {
        calcAge();
        return age;
    }

    public float getHeight()
    {
        return height;
    }
    public String[] getRs(){
        return rs;
    }

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public String getPetName()
    {
        return petName;
    }

    public Boolean getPet()
    {
        return pet;
    }

    public int getDay(){
        return day;
    }

    public int getMonth(){
        return month;

    }

    public int getYear(){
        return year;
    }
}

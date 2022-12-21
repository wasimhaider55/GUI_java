import java.util.*;
class teacher
{
    String n[] = new String []{"Irshad saab","Naveed abbas","salahudin sir","imran sir","Adil sir"};
    void DisplayName()
    {
       System.out.println("Teacher Name");
       System.out.println("------------");
        for(int i=0;i<n.length;i++)   
        {
            System.out.print(n[i]+"\t ");
        }
    }
}
class subject
{
    String n[] = new String[]{"java program","data structure","DLD","communication skill","physics"};
   void displaysubject()
   {
        System.out.println("\n\nTeacher subjects");
       System.out.println("-----------------");
       for(int i=0;i<n.length;i++)
       {
     System.out.print(n[i]+"\t");
   }
   }
}
class student 
{
    String n[] = new String []{"wasim Hider","191037"};
    void studentname()
    {
         System.out.println("\n\nStudent Details");
       System.out.println("------------");
        for (int i=0;i<n.length;i++)
        {
            System.out.println(n[i]+" ");
        }
    }
    
}

public class test {

    
    public static void main(String[] args)
    {
        teacher ss = new teacher();
        ss.DisplayName();
        subject sss = new  subject();
        sss.displaysubject();
        student ssss= new student();
        ssss.studentname();


    }

}

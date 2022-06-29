/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pac;

class student2
{
    int id;
    String ph;
    
    student2()
    {
        id=-1;
        ph="not specified";
        
    }
    
    void student2(int id)
    {
        this.id=id;
        
    }
    void student2(String phonenum)
    {
        this.ph=phonenum;
        
    }
    
    void display()
    {
        System.out.println("id is"+id);
        System.out.println("ph is"+ph);
    }
}
public class pac1 
{
    public static void main(String args[])
    {
        student2 stu2= new student2();
        stu2.student2(20);
        stu2.student2("sachit");
        stu2.display();
    }
}

import java.util.*;
 class rectangle
 {
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the Left up Corner vertices");
 int x1=sc.nextInt();
 int y1=sc.nextInt();
 System.out.println("Enter the Right down  Corner vertices");
 int x2=sc.nextInt();
 int y2=sc.nextInt();
 System.out.println("Enter the Left up Corner vertices");
 int x3=sc.nextInt();
 int y3=sc.nextInt();
 System.out.println("Enter the Right down Corner vertices");
 int x4=sc.nextInt();
 int y4=sc.nextInt();
 if((x3>=x1&&x3<=x2)||(y4<=y1)&&(y4>=y2))
  System.out.println("The Rectangles Overlap");
  else
   System.out.println("The Rectangle not Overlap");

 }
 
 
 
 }

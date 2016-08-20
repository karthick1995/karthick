import java.util.*;
class leastdig
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the input1: ");
  int n=sc.nextInt();String s=n+"";
  System.out.println("Enter the K digit value: ");
  int k=sc.nextInt();
  if(s.length()>k)
  {
    int m=0;
  TreeSet ts=new TreeSet();
  while(n!=0)
  {
   int j=n%10;
    ts.add(j);
    n=n/10;m=m+1;
  }
  Iterator<Integer> i=ts.iterator();int check=0;
  k=m-k;
   while(i.hasNext())
    {
     if(check<k)
     {
        check+=1;
       System.out.print(i.next());
      }
      else
      break;
    }
  }
  else
  System.out.println("Wrong K digit");
  }

}

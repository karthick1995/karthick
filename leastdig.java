import java.util.*;
class leastdig
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the input1: ");
  int n=sc.nextInt();
  System.out.println("Enter the K digit value: ");
  int k=sc.nextInt();
  TreeSet ts=new TreeSet();
  while(n!=0)
  {
   int j=n%10;
    ts.add(j);
    n=n/10;
  }
  Iterator<Integer> i=ts.iterator();int check=0;
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

}

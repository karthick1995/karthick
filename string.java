import java.util.*;

class string
{
  public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String arr[]=s.split
    if(arr.length>=2)
    {
    Arrays.sort(arr);int count=0,cm=1;String str="";
    for(int i=0;i<arr.length;i++)
    {
    for(k=i;k<arr.length;k++)
    {
    count=0;
      for(int j=0;j<arr[i].length()-1;j++)
      {
        if(j>=arr[i+1].length())break;
        if(arr[i].charAt(j)==arr[i+1].charAt(j))
        {
        count=count+1;
        }
        else
        break;
      }
    }
    if(count>=cm)
    {
    cm=count;
    str=arr[i];
    }
    System.oput.println(str);
    }
    }
}

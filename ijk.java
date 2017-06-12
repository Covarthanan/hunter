import java.io.*;
import java.util.*
public class ijk
{
  public static void main(String arg[])
  {
    int i,j,k,x=0,y=0,z=0;
    Scanner s=new Scanner(System.in);
    int a[]=new int[];
    int n=s.nextInt();
    for(i=0;i<n;i++)
    {
     a[i]=s.nextInt();
     }
     for(i=0;i<n;i++)
     {
       for(j=0;j<n;j++)
       {
         for(k=0;k<n;k++)
         {
           if((a[i]+a[j])==a[k])
           {
             x=i;
             y=j;
             z=k;
             break;
           }
         }
        }
      }
      System.out.print("i="+x+" j="+y+" k="+z);
  }
}  

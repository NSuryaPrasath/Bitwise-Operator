import java.util.Scanner;
import java.util.ArrayList;
class Simple
{	
  public static void oddeven(Scanner sc)     //Odd Or Even
  {
    System.out.print("'1' for Bitwise AND Operator\n'2' for Bitwise OR Operator\n'3' for Bitwise XOR Operator\nEnter Value :");
    int n=sc.nextInt();
    System.out.print("Enter a Number : ");
    int n1=sc.nextInt();
    switch(n)
    {
      case 1:System.out.println("Bitwise AND Operator of "+n+" is "+((n&1)==0?"Even":"Odd"));break;
      case 2:System.out.println("Bitwise OR Operator of "+n+" is "+((n|1)>n?"Even":"Odd"));break;
      case 3:System.out.println("Bitwise XOR Operator of "+n+" is "+((n^1)!=n-1?"Even":"Odd"));break;
      default:System.out.println("Enter Correct Value");break;
    }
  }
  public static void swapnum(Scanner sc)    //Swap Two Numbers
  {
      System.out.print("Enter Any Two Number : ");
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      System.out.println("Before Swap : a="+n1+" b="+n2);
      n1=n1^n2;
      n2=n1^n2;
      n1=n1^n2;
      System.out.println("After Swap : a="+n1+" b="+n2);        
  }
  public static void dupli()           //Remove Duplicate
  {
     int arr[]={1,2,3,2,0,5,6,7,0,5,1},temp=0;
     ArrayList<Integer> arr1=new ArrayList<>();
     System.out.print("Array = ");
     for(int i=0;i<arr.length;i++)
     {
         System.out.print(arr[i]);
     }
     for(int i=0;i<arr.length;i++)
     {
       for(int j=i+1;j<arr.length;j++)
       {
          if(arr[i]>arr[j])
          {
             temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
          }
       }
     }
     for(int i=0;i<arr.length;i++)
     {
        if(i==(arr.length)-1)
        {
       	    if((arr[i]^arr[i-1])!=0)
	    {
               arr1.add(arr[i]);
            }
        }
        else if((arr[i]^arr[i+1])!=0)
        {
             arr1.add(arr[i]);
        }
     }
     System.out.println("\nWithout Duplicate Value "+arr1); 
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("'1' to find Odd or Even\n'2' for Swap Two Numbers\n'3' for Duplicates\tEnter Value : ");
    int n=sc.nextInt();
    switch(n)
    {
      case 1:oddeven(sc);break;
      case 2:swapnum(sc);break;
      case 3:dupli();break;
      default:System.out.println("Wrong Value");
    } 
  }
}

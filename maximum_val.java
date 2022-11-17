package Exercise12;

import java.util.Scanner;

/*2. Write a java program to find the minimum value from the giventype of elements using a generic function.*/
public class maximum_val
{
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) 
    {      
        int choice,size;
        do
        {
            System.out.println("\n\nTo Find The Maximum Element");
            System.out.println("To Select The Data Type\n1.Integer\n2.String\n3.Character\n4.Double\n5.Exit");
            System.out.print("Enter Your Choice: ");
            choice=(new Scanner(System.in)).nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter the Array Size: ");
                    size=(new Scanner(System.in)).nextInt();
                    Integer num[]=new Integer[size];
                    
                    System.out.println("Enter the Element: ");
                    for(int i=0;i<size;i++)
                    {
                        num[i]=(new Scanner(System.in)).nextInt();
                    }
                    maximum maxi=new maximum();
                    maxi.max(num);
                    break;
                case 2:
                    System.out.print("Enter the Array Size: ");
                    size=(new Scanner(System.in)).nextInt();
                    
                    String num1[]=new String[size];
                    System.out.println("Enter the Element: ");
                    for(int i=0;i<size;i++)
                    {
                        num1[i]=(new Scanner(System.in)).next();
                    }
                    maximum maxi1=new maximum();
                    maxi1.max(num1);
                    break;
                case 3:
                    System.out.print("Enter the Array Size: ");
                    size=(new Scanner(System.in)).nextInt();
                    
                    Character num2[]=new Character[size];
                    System.out.println("Enter the Element: ");
                    for(int i=0;i<size;i++)
                    {
                        num2[i]=(new Scanner(System.in)).next().charAt(0);
                    }
                    maximum maxi2=new maximum();
                    maxi2.max(num2);
                    break;
                case 4:
                    System.out.print("Enter the Array Size: ");
                    size=(new Scanner(System.in)).nextInt();
                    
                    Double num3[]=new Double[size];
                    System.out.println("Enter the Element: ");
                    for(int i=0;i<size;i++)
                    {
                        num3[i]=(new Scanner(System.in)).nextDouble();
                    }
                    maximum maxi3=new maximum();
                    maxi3.max(num3);
                    break;
                default:
                    break;
            }
        }while(choice<5);         
    }
}
class maximum
{
    < T extends Comparable<T>> void max(T[]y)
    {
        T max;
        max=y[0];
        for(int i=1;i<y.length;i++ )
        {
            if(max.compareTo(y[i])<0)
            {
                max=y[i];
            }
        }
        System.out.println("Maximum Element in the given List: "+max);
    }
}

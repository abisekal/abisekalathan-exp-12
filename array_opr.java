/*1. Write a program to perform the following operations on an array using generic classes
 Add an element in the beginning/middle/end
 Delete an element from a given position*/
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;
public class array_opr 
{
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int ch,ele,ind;
        System.out.println("Enter choice:\n1.Insert element at bigining"
                    + "\n2.Insert element at middle\n3.Insert element at end"
                    + "\n4.Delete element form given position"
                    + "\n5.Display the array\n6.Exit");
        while (true) 
        {
            System.out.println("Enter Choice:");
            ch = sc.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.println("Enter element:");
                    ele = sc.nextInt();
                    list.add(0, ele);
                    break;
                case 2:
                    System.out.println("Enter element:");
                    ele = sc.nextInt();
                    int s = list.size() / 2;
                    list.add(s, ele);
                    break;
                case 3:
                    System.out.println("Enter element:");
                    ele = sc.nextInt();
                    list.add(ele);
                    break;
                case 4:
                    System.out.println("Enter index of element:");
                    ind = sc.nextInt();
                    list.remove(ind);
                    break;
                case 5:
                    System.out.println(list);
                    break;
                case 6:
                    exit(0);
            }
        }
    }
}

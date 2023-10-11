import java.util.Scanner;
class MergeTwoStringAlt
{
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
       String name1;
       String name2;
       name1=sc.next();
       name2=sc.next();
       StringBuilder merge=new StringBuilder();
       int Length=Math.min(name1.length(),name2.length());
       int i=0;
       while(i<Length)
       {
       merge.append(name1.charAt(i));
       merge.append(name2.charAt(i));
       i++;
       }
       //merge.append(name1.substring(Length)); adding remaining characters which were not included
       //merge.append(name2.substring(Length));

       while(i<name1.length())
       {
       merge.append(name1.charAt(i));
       i++;
       }
       while(i<name2.length())
       {
       merge.append(name2.charAt(i));
       i++;
       }
       merge.toString();
       System.out.print(merge);

    }
}
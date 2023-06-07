// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String> l=new ArrayList<>();
        Set<String> set=new HashSet<String>();
        List<List<String>> l2=new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            l.add(sc.nextLine());
        }
        for(int i=0;i<l.size();i++)
        {
            String s=l.get(i);
            l.remove(s);
            char[] c1=s.toCharArray();
            int c=0;
           while(c<l.size())
           {
                String s1=l.get(c);
                c++;
                if(s.length()!=s1.length())
                 continue;
                else
                {
                   char[] c2= s1.toCharArray();
                   Arrays.sort(c1);
                   Arrays.sort(c2);
                   if(Arrays.equals(c1,c2))
                   {
                       set.add(s);
                       set.add(s1);
                       l.remove(s1);
                       c--;
                   } 
                }  
            }
            l2.add(new ArrayList<String>(set));
            set.clear();
        }
       System.out.println(l2);
    }
}
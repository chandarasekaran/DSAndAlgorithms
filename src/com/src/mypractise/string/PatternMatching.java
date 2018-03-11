package com.src.mypractise.string;

public class PatternMatching {




    public static void main(String args[])
    {
        String text="welcometoindia";
        String pattern="cometo";
       System.out.println("patternMatchingByBruteforceApproach");
       int position=patternMatchingByBruteforceApproach(text,pattern);
       if(position!=0)
       {
           System.out.println("pattern found in "+position);
       }else
       {
           System.out.println("pattern not found");
       }

    }


    /**
     * Time complexity O(n*p)
     * @param text
     * @param pattern
     * @return position
     */

    public static int patternMatchingByBruteforceApproach(String text,String pattern)
    {

        int n=text.length();
        int p=pattern.length();
        int k=0;int j;
        for(int i=0;i<n;i++)
        {
            k=i;
            for(j=0;j<p;j++)
            {
                if(text.charAt(k)==pattern.charAt(j))
                {
                    k++;
                }else
                {
                    break;
                }
            }
            if(j==p)
            {
                return i;
            }
        }
      return 0;
    }


}

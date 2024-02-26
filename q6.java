package techhaus;
import java.util.*;
public class q6
{
    public static void main(String[] args) 
    {
        String[] words = {"hi","hello","shruti","apple","aaaaa"};
        System.out.println("the word that has the max number of vowels is: "+ MaxVowel(words));
    }
    public static String MaxVowel(String[] s)
    {
        
        int l = s.length;
        int vow = 0;
        String vowel ="";
        for(int i =0;i<=l-1;i++)
        {
            String a = s[i];
            int count = 0;
            for (int j = 0; j < a.length(); j++) 
            {
            // check if char[i] is vowel
            if (a.charAt(i) == 'a' || a.charAt(i) == 'e'
                || a.charAt(i) == 'i'
                || a.charAt(i) == 'o'
                || a.charAt(i) == 'u')
            {
                count++;
            }
            if(count>vow)
            {
                vowel = s[i];
            }
        }
        
        }       return vowel;
}
}

package removeDirtyChar;
import java.util.*;
public class removeDirtyChar{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(DirtyChar(str1,str2));
    }
    static final int NO_OF_CHAR = 256 ;
    
    static int[] getCountArray(String str)
    {
        int count[] = new int[NO_OF_CHAR];
        for(int i=0;i<str.length();i++)
        {
            count[str.charAt(i)]++;
        }
        return count ;
    }
    
    static String DirtyChar(String str1,String str2)
    {
        int count[] = getCountArray(str2);
        int ip_ind = 0 , res_ind = 0 ;
        char arr[] = str1.toCharArray();
        for(int i = 0 ; i<arr.length;i++)
        {
            char temp = arr[ip_ind];
            if(count[temp] == 0)
            {
                arr[res_ind] = arr[ip_ind];
                res_ind++;
            }
            ip_ind++;
        }
        str1 = new String(arr);
        return str1.substring(0,res_ind);
    }
}

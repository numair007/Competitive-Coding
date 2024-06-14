
import java.io.*;
import java.util.*;

import java.lang.*;



class TreeNode{
    int value;

    TreeNode parent;

    List<TreeNode> children;

    int index = 0;

    TreeNode(int v){
        parent = null;
        value = v;

    }


}
class Solution {
    
    public  String minWindow(String s, String t) {
        // Write your code here

        int i,j;
        i = 0;
        j = 0;
        int k = 0;
        int n = s.length();
        int min = n+1;
        int m = t.length();
        int st = -1;
        int end = n+1;
         
        while(i<n && j<n){
                System.out.println(i+" "+j);
            while(i<n && s.charAt(i) != t.charAt(0)){
                System.out.println("hoho");
                i++;
            }
            
            if(i>=n) break;
            if(i >= j){
                j = i+1;
                k++;
                continue;
            }
            if(k == m){
                if((j-i+1) < min){
                    st = i;
                    end = j;
                    min = j-i+1;
                }
                i++;
                j = i;
                k = 0;
            }
            else{
                if(s.charAt(j) == t.charAt(k)){
                    j++;
                    k++;
                }
                else{
                    j++;
                }
            }
        }
         System.out.println("hoho");
        if(st<0 || end>n) return "";
         return s.substring(st,end+1);
        
    }
}

class Main{




    public static void main(String[] args) throws Exception{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

       // MarketsFno mfno = new MarketsFno();
        


        

       String[] input = bf.readLine().split(" ");
       int n = Integer.parseInt(input[0]);
       int m = Integer.parseInt(input[1]);

       while(true){
        
       }


       






    }
}
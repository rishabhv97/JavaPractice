package Revision;

import java.util.Stack;
import java.util.*;

public class Practice {
    public boolean isUgly(int n) {

        if (n<=0) {
            return false;
        }
        while (n>0) {
            if (n%2==0) {
                n=n/2;
            }else if (n%3==0) {
                n=n/3;
            }else if (n%5==0) {
                n=n/5;
            }else{
                break;
            }
        }

        if (n==1) {
            return true;
        }else{
            return false;
        }
    }

    public boolean isPowerOfTwo(int n) {
        if (n==1) {
            return true;
        }
        
        if(n%2!=0 || n<=0){
            return false;
        }
        return isPowerOfTwo(n/2);
    }
        

    
    
    public static void main(String[] args) {
        System.out.println(simplifyPath("/home/user/Documents/../Pictures"));

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] arr={2,5,7,8,2,1,5,2};
        
        for (int num: arr) {
            // if(hashMap.containsKey(num)){
            //   hashMap.put(num, hash) 
            // }
            
            hashMap.put(num, hashMap.getOrDefault(num,0)+1);
            
            
        }
        
        for(int key: hashMap.keySet()){
            System.out.println(key+":"+hashMap.get(key));
        }
         
    }
}

package com.bridgelabz.internal.review;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class CheckWordInArray {
	
    public int CountConsistentStrings(String allowed, String words[]) {
        ArrayList list = new ArrayList();
        for(int i=0;i<allowed.length();i++){
            list.add(allowed.toString());
        }
        
        int count = 0;
        for(int i=0;i<words.length;i++){
            boolean found = true;
            for(int j=0;j<words.length;j++){
                if(!list.Contains(words[i][j])) {
                    found = false;
                    break;
                }
            }
            if(found){
                count++;
            }
        }
        
        return count;
    }
    
	public static void main(String[] args) {
		   CheckWordInArray sol = new CheckWordInArray();
		   int val = sol.CountConsistentStrings("ab", ["ad","bd","aaab","baa","badab"]);
		   System.out.println("hello",val)
		    }
		}
	}

}

package com.bridgelabz.Day15;

import java.util.Hashtable;
import java.util.Scanner;

public class ReplaceString {
	
	public static void main(String[] args)  {
		
		Scanner input = new Scanner(System.in);
		
		String poem = "Old MacDonald had a farm, E-I-E-I-O. \"+\r\n"
				+ "		\" \\n And on his farm he had some %ANIMAL%, E-I-E-I-O.\"+\r\n"
				+ "				\"\\nWith a %SOUND%, %SOUND% here,\"+\r\n"
				+ "				\"\\nAnd a %SOUND%, %SOUND% there,\"+\r\n"
				+ "				\"\\nHere a %SOUND%, there a %SOUND%,\"+ \r\n"
				+ "				\"\\nEverywhere a %SOUND%, %SOUND%";
		
		String[] PoemL = poem.split("%");
		
		Hashtable<String,String> keypair =new Hashtable<String,String>();
		
		keypair.put("ANIMAL", "SOUND");
		keypair.put("SOUND","ANIMAL");
		
		keypair.forEach((i,j)-> 
				{
					for(int k=0;k<PoemL.length;k++) {
						if(PoemL[k].equalsIgnoreCase("ANIMAL")) {
							System.out.print(i);
						} else {
							if(PoemL[k].equalsIgnoreCase("SOUND")) {
								System.out.print(j);
							}
						}
					}
				});
	}
}
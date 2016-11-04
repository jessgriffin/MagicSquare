/****************************************************************************
 *
 * Created by: Jess and Craig
 * Created on: Nov 2016
 * This program shows all possible 'magic'squares (3x3)
 ****************************************************************************/

import java.awt.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MagicSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tempArray[] = {1,1,1,1,1,1,1,1,1};
		
		for (int first = 1; first < 10; first++) {
			for (int second = 1; second < 10; second++) {
				for (int third = 1; third < 10; third++) {
					for(int fourth = 1; fourth < 10; fourth++) {
						for(int fifth = 1; fifth < 10; fifth++) {
							for(int sixth = 1; sixth < 10; sixth++) {
								for(int seventh = 1; seventh < 10; seventh++) {
									for(int eighth = 1; eighth < 10; eighth++) {
										for(int ninth = 1; ninth < 10; ninth++) {
											tempArray[0] = first;
											tempArray[1] = second;
											tempArray[2] = third;
											tempArray[3] = fourth;
											tempArray[4] = fifth;
											tempArray[5] = sixth;
											tempArray[6] = seventh;
											tempArray[7] = eighth;
											tempArray[8] = ninth;
											
											int a = tempArray[0] + tempArray[1] + tempArray[2];
											int b = tempArray[3] + tempArray[4] + tempArray[5];
											int c = tempArray[6] + tempArray[7] + tempArray[8];
											int d = tempArray[0] + tempArray[3] + tempArray[6];
											int e = tempArray[1] + tempArray[4] + tempArray[7];
											int f = tempArray[2] + tempArray[5] + tempArray[8];
											int g = tempArray[0] + tempArray[4] + tempArray[8];
											int h = tempArray[2] + tempArray[4] + tempArray[6];
											
											if (a == b && a == c && a == d  && a == e  && a == f  && a == g  && a == h) {
												
												Set<Integer> set = new HashSet<Integer>();
												
												for (int counter = 0; counter < tempArray.length; counter++) {
													
													set.add(tempArray[counter]);
													
												}
												
												if(set.size() < tempArray.length){
												    /* There are duplicates */
												} else {
													
													System.out.println("Magic Square!");
													
													System.out.print(tempArray[0]);
													System.out.print(tempArray[1]);
													System.out.println(tempArray[2]);
													
													System.out.print(tempArray[3]);
													System.out.print(tempArray[4]);
													System.out.println(tempArray[5]);
													
													System.out.print(tempArray[6]);
													System.out.print(tempArray[7]);
													System.out.println(tempArray[8]);
													
													System.out.println();
													
												}
												
											}
											
										}
										
									}
									
								}
								
							}
							
						}
						
					}
					
				}
				
			}
				
		}
		
	}

}

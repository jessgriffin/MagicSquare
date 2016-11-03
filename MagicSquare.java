
public class MagicSquare {

	public static void main(String[] args) {
	
		int array[] = {1,2,3,4,5,6,7,8,9};
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		int h;
		
		for (int i = 0; i < 9; i++) {
			
			int j = i + 1;
			
			while (j < 9) {
				
				int tempArray[] = array;
				
				//we think the problem is here
				tempArray[i] = tempArray[j];
				tempArray[j] = array[i];
				
				a = tempArray[0] + tempArray[1] + tempArray[2];
				b = tempArray[3] + tempArray[4] + tempArray[5];
				c = tempArray[6] + tempArray[7] + tempArray[8];
				d = tempArray[0] + tempArray[3] + tempArray[6];
				e = tempArray[1] + tempArray[4] + tempArray[7];
				f = tempArray[2] + tempArray[5] + tempArray[8];
				g = tempArray[0] + tempArray[4] + tempArray[8];
				h = tempArray[2] + tempArray[4] + tempArray[6];
				
				if (a == b && a == c && a == d  && a == e  && a == f  && a == g  && a == h) {
					
					System.out.println(tempArray[0]);
					System.out.print(tempArray[1]);
					System.out.print(tempArray[2]);
					
					System.out.println(tempArray[3]);
					System.out.print(tempArray[4]);
					System.out.print(tempArray[5]);
					
					System.out.println(tempArray[6]);
					System.out.print(tempArray[7]);
					System.out.print(tempArray[8]);
					
					System.out.println("---");
				}
				
				j++; 
				
			}
			
		}
		
	}

}

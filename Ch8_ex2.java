package ch8_ex2;

import java.util.Arrays;
import java.util.Scanner;

public class Ch8_ex2 {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("enter number of tests: ");
		int test_number = number.nextInt(); //���ȼƶq
		int count = test_number; //�p��j��B�⦸��(�˦�)
		
		while(count > 0) {
			//�ϥΪ̨M�w�x�}�j�p
			System.out.println("enter the size of nxn matrix: ");
			int size = number.nextInt();
			
			//�ϥΪ̿�J�x�}
			int[][] array = new int[size][size];
			for(int i=0; i<size; i++) {
				for(int j=0; j<size; j++) {
					array[i][j] = number.nextInt();
				}
			}
			
			//�N��x�}��ܫ�s��new_array
			int[][] new_array = new int[size][size];
			for(int i=0; i<size; i++) {
				for(int j=0; j<size; j++) {
					new_array[i][j] = array[j][i];
				}
			}
			
			//�P�_�O�_����ܯx�}
			String[] ans = new String[test_number];
			if(Arrays.deepEquals(array, new_array) == true)
				ans[test_number - count] = "Yes";
			else
				ans[test_number - count] = "No";
			
			test_number -= 1; //���ȴ�@
		}
		
		
//		System.out.println(Arrays.deepToString(array));
//		System.out.println(Arrays.deepToString(new_array)); //��X�G���x�}

	}

}

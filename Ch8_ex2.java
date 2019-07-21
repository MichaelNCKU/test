package ch8_ex2;

import java.util.Arrays;
import java.util.Scanner;

public class Ch8_ex2 {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("enter number of tests: ");
		int test_number = number.nextInt(); //測值數量
		int count = test_number; //計算迴圈運算次數(倒扣)
		
		while(count > 0) {
			//使用者決定矩陣大小
			System.out.println("enter the size of nxn matrix: ");
			int size = number.nextInt();
			
			//使用者輸入矩陣
			int[][] array = new int[size][size];
			for(int i=0; i<size; i++) {
				for(int j=0; j<size; j++) {
					array[i][j] = number.nextInt();
				}
			}
			
			//將原矩陣轉至後存至new_array
			int[][] new_array = new int[size][size];
			for(int i=0; i<size; i++) {
				for(int j=0; j<size; j++) {
					new_array[i][j] = array[j][i];
				}
			}
			
			//判斷是否為轉至矩陣
			String[] ans = new String[test_number];
			if(Arrays.deepEquals(array, new_array) == true)
				ans[test_number - count] = "Yes";
			else
				ans[test_number - count] = "No";
			
			test_number -= 1; //測值減一
		}
		
		
//		System.out.println(Arrays.deepToString(array));
//		System.out.println(Arrays.deepToString(new_array)); //輸出二維矩陣

	}

}

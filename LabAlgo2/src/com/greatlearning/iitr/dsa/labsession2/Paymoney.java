package com.greatlearning.iitr.dsa.labsession2;

import java.util.*;

/*
 * Problem statement:
 * 
 * PayMoney. processes thousands of transactions daily amounting to crores of Rupees. They
 *  also have a daily target that they must achieve. Given a list of transactions done by
 *  PayMoney and a daily target, your task is to determine at which transaction PayMoney
 *  achieves the same. If the target is not achievable, then display the target is not achieved.
 */

public class Paymoney {

	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("enter the size of transaction array");
		 
		 int size = sc.nextInt();
		 
		 int[] arr = new int[size];
		 
		 System.out.println("enter the values of the array");
		 
		 for(int i = 0;i<size;i++) {
			 int x = sc.nextInt();
			 arr[i] =x;
		 }
		 
		 int targets;
		 System.out.println("enter the total no of targets that needs to be achieved");
		 targets = sc.nextInt();
		 
		 for(int i = 0;i<targets;i++) {
			 int value,j;
			 System.out.println("enter the value of the target");
			 value = sc.nextInt();
			 long currAcchievedTarget = 0;
			 for(j = 0;j<size;j++) {
				 currAcchievedTarget = j > 0 ? (currAcchievedTarget + arr[j - 1]): arr[j] ;
				 if(currAcchievedTarget >= value) {
					 break;
				 }
			 }
			 if( j == size) {
				 System.out.println("Given target is not achieved");
			 }else {
			 System.out.println("Target achieved after " + (j + 1) + " transactions");
			 }
		 }
		 
		 sc.close();
	 }
}

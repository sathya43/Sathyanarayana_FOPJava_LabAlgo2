package com.greatlearning.iitr.dsa.labsession2;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

/*
 * 
 * Problem statement:
 * 
 *   You are a traveler and traveling to a country where the currency denominations are
 *    unknown and as you travel you get to know about the denomination in random order.
 *    You want to make a payment of amount x, in such a way that the higher denomination is
 *    used to make exact payment.
 */

public class TravellerDenominations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the size of currency denominations ");
        int size = sc.nextInt();
        
        Integer[] arr = new Integer[size];
        System.out.println("enter the currency denominations value");
        
        for(int i = 0;i < size;i++) {
        	int x = sc.nextInt();
        	arr[i] = x;
        }
		
        Arrays.sort(arr,Collections.reverseOrder());
        
        System.out.println("enter the amount you want to pay");
        int amount = sc.nextInt();
        
        int countArr[] = new int[size];
        Arrays.fill(countArr, 0);
        
        for(int  i = 0;i<size;i++) {
        	if(amount <= 0) {
        		break;
        	}
            int count = (amount / arr[i]);
            amount = amount - count * arr[i];
            countArr[i] = count;
        }
        
        System.out.println("Your payment approach in order to give min no of notes will be");
        for(int i = 0;i<size;i++) {
        	if(countArr[i] > 0)
        	System.out.println(arr[i] + ":" + countArr[i]);
        }
        
        sc.close();
     
	}

}

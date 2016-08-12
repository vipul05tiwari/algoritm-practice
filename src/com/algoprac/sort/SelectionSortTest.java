/*******************************************************************************************************
 * 
 * Copyright (C) TrendSutra Platform Services Private Limited,
 * All Rights Reserved Unauthorized copying of this file, 
 * via any medium is strictly prohibited Proprietary and confidential.
 * 
 *******************************************************************************************************/

package com.algoprac.sort;

/**
* TODO : insert comment here
* 
* @author vipul
* @date 22-Jun-2016
*/

public class SelectionSortTest 
{

	public static void main(String[] args) 
	{
		Integer i = 1;
		Integer i1 = 9;
		Integer i2 = 5;
		Integer i3 = 2;
		Integer i4 = 10;
		
		Integer [] intArray = {i,i1,i2,i3,i4};
		
		for (Integer integer : intArray) 
		{
			System.out.print(integer+" ");
		}
		
		SelectionSort.sort(intArray);
		System.out.println();
		
		for (Integer integer : intArray) 
		{
			System.out.print(integer+" ");
		}
		
	}
}

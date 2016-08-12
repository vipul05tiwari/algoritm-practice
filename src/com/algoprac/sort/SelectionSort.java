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

public class SelectionSort 
{

	public static Comparable[] sort(Comparable [] a)
	{
		int N = a.length;
		int min = 0;
		
		for(int i = 0 ; i < N; i++)
		{
			min = i;
			for(int j = i+1 ;j<N; j++)
			{
				if(less(a[j],a[min]))
				{
					min = j;
				}
			}
			
			exchange(min,i,a);
		}
		
		return a;
	}

	private static void exchange(int min, int i, Comparable[] a) 
	{
		Comparable temp = a[i];
		a[i] = a[min];
		a[min] = temp;
	}

	private static boolean less(Comparable comparable, Comparable comparable2) 
	{
		return comparable.compareTo(comparable2) < 0;
	}
}

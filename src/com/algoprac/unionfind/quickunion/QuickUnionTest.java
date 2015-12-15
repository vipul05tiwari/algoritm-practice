package com.algoprac.unionfind.quickunion;

public class QuickUnionTest 
{
	public static void main(String[] args) 
	{
		QuickUnion uf = new QuickUnion(10);
		
		uf.union(0, 5);
		uf.union(5, 6);
		uf.union(6, 1);
		uf.union(6, 7);
		uf.union(1, 2);
		
		uf.union(3, 4);
		uf.union(3, 8);
		uf.union(9, 4);
		
		System.out.println("is 2 and 8 connected " + uf.isConnected(2, 8));
		System.out.println("is 0 and 7 connected " + uf.isConnected(0, 7));
		System.out.println("is 4 and 8 connected " + uf.isConnected(4, 8));
		System.out.println("is 1 and 9 connected " + uf.isConnected(1, 9));
	}
}

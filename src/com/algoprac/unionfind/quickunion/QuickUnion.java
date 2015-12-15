package com.algoprac.unionfind.quickunion;

public class QuickUnion 
{
	
	private int [] id;

	public QuickUnion(int n)
	{
		id = new int[n];
		
		for (int i = 0; i < n; i++) 
		{
			id[i] = i;
		}
	}
	
	public void union(int p, int q)
	{
		int rootp = root(p);
		int rootq = root(q);
		
		id[rootp] = rootq;
	}
	
	public boolean isConnected(int p, int q)
	{
		return root(p) == root(q);
	}
	
	public int root(int i)
	{
		while(id[i] != i)
		{
			i = id[i];
		}
		
		return i;
	}
}

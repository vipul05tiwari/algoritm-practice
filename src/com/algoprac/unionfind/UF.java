package com.algoprac.unionfind;

public class UF 
{
  int [] id;
  
  public UF(int n)
  {
	  id = new int [n];
	  
	  for (int i = 0; i < n; i++) 
	  {
		  id[i] = i;
	  }
  }
  
  public boolean isConnected(int p, int q)
  {
	  return  id[p] == id[q];
  }
  
  public void union(int p, int q)
  {
	  if( ! isConnected(p,q))
	  {
		  int pid = find(p);
		  int qid = find(q);
		  
		  for (int i = 0; i < id.length; i++) 
		  {
			  if( id[i] == pid)
			  {
				  id[i] = qid;
			  }
		  }
	  }
  }
  
  private int find(int p)
  {
	  return id[p];
  }
  
}

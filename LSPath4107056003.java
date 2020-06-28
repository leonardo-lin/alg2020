package trytry;

import java.util.Stack;
import java.util.ArrayList;
public class LSPath4107056003 extends LSPath{

	public static void main(String[] args) {
		LSPath4107056003 A=new LSPath4107056003();
		int[][] a= {{3,4},{2,3},{2,1}}; 
		int size=1000000;
		int[][] b=new int[size][2];
		int i;
		for(i=0;i<size;i++)
		{
			
			b[i][0]=(int)(Math.random()*100000);
			b[i][1]=(int)(Math.random()*100000);
		}
		float t1=System.nanoTime();
		//System.out.println(t1/100000000);
		A.Ans(b);
		//ans=3
		float t2=System.nanoTime();
		System.out.println((t2-t1)/1000000000);
		
	}

	int q[]=new int[999999];
	int fir=-1;
	int top=0;
	public int Ans(int[][] array) {
		int i;
		int len=array.length;
		int big=0;
		for(i=0;i<len;i++)
		{
			if(array[i][0]>big)
				big=array[i][0];
			if(array[i][1]>big)
				big=array[i][1];
		}
		big=big+2;
		ArrayList<Integer>[] map=new ArrayList[big];
		//int[] line=new int[len];
		//int max=0;
		
		for(i=0;i<big;i++)
		{
			map[i]=new ArrayList<Integer>();
		}
		
		for(i=0;i<len;i++)
		{
			//System.out.println(array[i][1]+" "+array[i][0]);
			if(!(map[array[i][0]].contains(array[i][1])));
				map[array[i][0]].add((array[i][1]));
			if(!(map[array[i][1]].contains(array[i][0])));
				map[array[i][1]].add((array[i][0]));
		}
		int cou=0;
		
		
		int c[]=new int[big];
		int dis[]=new int[big];
		push(array[0][0]);
		c[array[0][0]]=1;
		
		int now=0;
		dis[array[0][0]]=0;
		while(fir!=top-1)
		{
			now=pop();
			//System.out.println(fir+" "+top+" "+now);
			cou=map[now].size();
			for(i=0;i<cou;i++)
			{
				map[now].get(i);
				if(c[map[now].get(i)]<=0)
				{
					c[map[now].get(i)]+=1;
					push(map[now].get(i));
					dis[map[now].get(i)]=dis[now]+1;
			    }
			}		
			
		}
		//System.out.println(now+" "+dis[now]);
		//c=new int[big];
		top=0;fir=-1;
		push(now);
		dis[now]=0;
		while(fir!=top-1)
		{
			now=pop();
			//System.out.println(fir+" "+top+" "+now);
			cou=map[now].size();
			for(i=0;i<cou;i++)
			{
				map[now].get(i);
				if(c[map[now].get(i)]<=1)
				{
					c[map[now].get(i)]+=1;
					push(map[now].get(i));
					dis[map[now].get(i)]=dis[now]+1;
			    }
			}		
			
		}
		//System.out.println(now+" "+dis[now]);
		/*c=new int[big];
		top=0;fir=-1;
		push(now);
		dis[now]=0;
		while(fir!=top-1)
		{
			now=pop();
			//System.out.println(fir+" "+top+" "+now);
			cou=map[now].size();
			for(i=0;i<cou;i++)
			{
				map[now].get(i);
				if(c[map[now].get(i)]==0)
				{
					c[map[now].get(i)]=1;
					push(map[now].get(i));
					dis[map[now].get(i)]=dis[now]+1;
			    }
			}		
			
		}
		//System.out.println(now+" "+dis[now]);
		c=new int[big];
		top=0;fir=-1;
		push(now);
		dis[now]=0;
		while(fir!=top-1)
		{
			now=pop();
			//System.out.println(fir+" "+top+" "+now);
			cou=map[now].size();
			for(i=0;i<cou;i++)
			{
				map[now].get(i);
				if(c[map[now].get(i)]==0)
				{
					c[map[now].get(i)]=1;
					push(map[now].get(i));
					dis[map[now].get(i)]=dis[now]+1;
			    }
			}		
			
		}
		//System.out.println(now+" "+dis[now]);*/
		return dis[now]+2;
	}
	void push(int a)
	{
		
		q[top]=a;
		top++;
	}
	int pop()
	{
		fir++;
		int t=q[fir];
		
		return t;
	}
	
}

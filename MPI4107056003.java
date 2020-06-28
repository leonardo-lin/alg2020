package trytry;

public class MPI4107056003 extends MPI{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MPI4107056003 A=new MPI4107056003();
		int size=100000000;
		int[] a=new int [size] ;
		int i;
		
		for(i=0;i<size;i++)
		{
			a[i]=(int)(Math.random()*10000000);
			//System.out.println(a[i]);
		}
		double t1=System.nanoTime();
		System.out.println(A.min(a));
		double t2=System.nanoTime();
		//System.out.println((t2-t1)/10000000);
		
	}
	public int min(int[] array)
	{
		int min=1,max=0;
		int i,j,len=array.length;
		for(i=0;i<len;i++)
		{
			if(max<array[i])
			{
				max=array[i];
			}
		}
		max++;
		boolean hash[]=new boolean[max];
		
		
		for(i=0;i<len;i++)
		{
			if(array[i]<=0)
			{
				continue;
			}
			hash[array[i]]=true;
			if(array[i]==min)
			{
				for(j=min;;j++)
				{
					//System.out.println(j);
					if(hash[j]==false)
					{
						min=j;
						
						break;
					}
				}
			}
		}
		
		return min;
		
	}
}

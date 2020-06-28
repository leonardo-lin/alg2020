

public class IslandCounting4107056003 extends IslandCounting{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a= {"1","9","9","6","5","7","2","5","7","3","8","1","8","7","9"};
		String[] b= {"4","7","10","3","1","8","6","9","5","7","3","5","4","4","4"};
		String[] c= {"4","8","2","10","6","9","3","2","3","5"};
		String[] d= {"8","1","2","10","8","8","6","7","5","5"};
		IslandCounting4107056003 A= new IslandCounting4107056003();
		System.out.println(A.count(a,b));
	      
	}

	
	public int count(String[] A, String[] B) {
		int max=A.length;
		int[] a=new int[max];
		int[] b=new int[max];
		int coun=0;
		int i,ma=0;	
		int[] hash=new int[19999999];
		hash[0]=-1;
		for(i=0;i<max;i++)
		{
			a[i]=((int) (Float.parseFloat(A[i])))+1;
			b[i]=((int) (Float.parseFloat(B[i])))+1;
			
			if(a[i]<0)
			{
				a[i]=Math.abs(a[i])+10000000;
			}
			if(b[i]<0)
			{
				b[i]=Math.abs(b[i])+10000000;
			}
			if(ma<a[i])
				ma=a[i];
			
			if(ma<b[i])
				ma=b[i];
			hash[a[i]]=a[i];
			hash[b[i]]=b[i];
		}	
		int tempa,tempb;
		for(i=0;i<max;i++)
		{
			tempb=b[i];
			while(hash[tempb]!=tempb)
			{
				hash[tempb]=hash[hash[tempb]];
				tempb=hash[tempb];
			}			
			tempa=a[i];
			while(hash[tempa]!=tempa)
			{
				hash[tempa]=hash[hash[tempa]];
				tempa=hash[tempa];
			}
			if(tempb==tempa)
			{
				continue;
			}
			else if(tempb>tempa)
			{
				hash[tempb]=tempa;
			}
			else if(tempb<tempa)
			{
				hash[tempa]=tempb;
			}
		}
		for(i=0;i<ma+10;i++)
		{
			if(hash[i]==i)
			{
				coun++;
			}
		}
		return coun;
	}
	
}

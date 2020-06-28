package trytry;

public class slash4107056003 extends slash{

	public static void main(String[] args) {
		
		int[] a= {7,8,9,1,2,3,4,5,6};
		slash4107056003 A=new slash4107056003();
		
		System.out.println(A.slash_min(a));

	}

	
	public int slash_min(int[] A) {
		int i;
		for(i=0;i<A.length-1;i++)
		{
			if(A[i]>A[i+1])
			{
				return (A.length-i-2);
			}
		}
		
		
		
		return 0;
	}

}

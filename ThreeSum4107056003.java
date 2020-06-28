package trytry;


public class ThreeSum4107056003 extends ThreeSum{
	int num=0;
	int k[];
	public ThreeSum4107056003(int k[]) {
		int i=0,j=0,l=0;
		this.k=k;
		for(i=0;i<this.k.length;i++)
		{
			for(j=i;i<this.k.length;j++)
			{
				for(l=0;l<k.length;l++)
				{
					if((this.k[i]+this.k[j]+this.k[l])==0)
					{
						num++;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] k= {5,-5,0,2,-2,9,8,-4,-3}; 
		System.out.println(k[0]);
		ThreeSum4107056003 a=new ThreeSum4107056003(k);
		
		System.out.println(a.T_sum(k));
	}

	@Override
	public int T_sum(int[] A) {
		// TODO Auto-generated method stub
		return num;
	}

}

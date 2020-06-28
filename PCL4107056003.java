package trytry;

public class PCL4107056003 extends PCL{

	public static void main(String[] args) {
		
		int[][] a= {{1,4},{1,1},{1,3},{1,6},{1,7},{2,3},{3,2}};//1
		int[][] b= {{1,4},{2,4},{9,4},{8,3}};//3
		int[][] c= {{1,1},{2,3},{1,1},{4,8}};//true
		int[][] d= {{71553,8422251},{71574,3850474},{8935742,9946322}};
		int[][] e= {{1,1},{987,5678},{2,2},{3,3}};
		int[][] f= {{-1,1},{1,1},{2,2},{0,2},{0,3},{-2,3}};
		int[][] g= {{1,4},{1,5},{1,6},{987,885}};
		int[][] h= {{733687,833883},{785108,849454},{921053,867739}};
		int temp;
		long time1,time2;
		int max=1000000;		
		int[][] q=new int[max][2];
		int i;
		
		for(i=0;i<max;i++)
		{
			if(Math.random()<0)
			{
				temp=-1;
			}
			else
			{
				temp=1;
			}
			q[i][0]=(int)(Math.random()*100000)*temp;
			if(Math.random()<0)
			{
				temp=-1;
			}
			else
			{
				temp=1;
			}
			q[i][1]=(int)(Math.random()*100000)*temp;
		}
		
		System.out.println("測資生成完畢");
		time1 = System.currentTimeMillis();
		PCL4107056003 A=new PCL4107056003();	
		System.out.println(A.checkPCL(q));
		time2 = System.currentTimeMillis();
		System.out.println(time2-time1);
		
		
	}

	
	public boolean checkPCL(int[][] array) {
		int i,j,k,h;
		int max=array.length;
		
		double[] lin=new double[max];
		for(i=0;i<max-1;i++)
		{
			k=i+1;
			for(j=i+1;j<max;j++)
			{				
					
					lin[j]=((double)(array[i][1]-array[j][1])/(double)(array[i][0]-array[j][0]));  
					if(lin[j]==-1.0/0.0)
					{
						lin[j]=1.0/0.0;
					}															
			}
			mergeSort(lin,k,max-1);
			for(h=k;h<max-1;h++)
			{
				if(lin[h]==lin[h+1])
				{
					System.out.println(lin[h]);
					
					return true;
				}
			}
			
			
		}
		
		
		
		return false;
	}
	void merge(double arr[], int l, int m, int r) 
	{ 
	    int i, j, k; 
	    int n1 = m - l + 1; 
	    int n2 =  r - m; 
	    double[] L=new double[n1];
	    double[] R=new double [n2]; 
	    for (i = 0; i < n1; i++) 
	        L[i] = arr[l + i]; 
	    for (j = 0; j < n2; j++) 
	        R[j] = arr[m + 1+ j]; 
	  
	    i = 0; 
	    j = 0; 
	    k = l; 
	    while (i < n1 && j < n2) 
	    { 
	        if (L[i] <= R[j]) 
	        { 
	            arr[k] = L[i]; 
	            i++; 
	        } 
	        else
	        { 
	            arr[k] = R[j]; 
	            j++; 
	        } 
	        k++; 
	    } 
	    while (i < n1) 
	    { 
	        arr[k] = L[i]; 
	        i++; 
	        k++; 
	    }
	    while (j < n2) 
	    { 
	        arr[k] = R[j]; 
	        j++; 
	        k++; 
	    } 
	} 
	void mergeSort(double[] list, int l, int r) 
	{ 
	    if (l < r) 
	    { 
	        
	        int m = l+(r-l)/2; 
	        mergeSort(list, l, m); 
	        mergeSort(list, m+1, r); 
	  
	        merge(list, l, m, r); 
	    } 
	}
}

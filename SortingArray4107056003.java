package trytry;

public class SortingArray4107056003 extends SortingArray{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortingArray4107056003 A=new SortingArray4107056003();
		int[] a = {5, 21, 7, 23, 19}; 
		int[] b= {9,8,7,6,5};
		int[] c= {};
		int[] d= {1};
		int[] e= {3,2,3};
		int[] f= {-1,-7,-9};
		int[] g= {48,35,32,40,45,20,94,43,32,17,66,96};
		int[] j= {1,2,3,0,5};
		int[] k= {9,10,7,8,5,6,3,4,1,2};
		int[] l= {3,3,3,3,3,3};
		int[] m= {54,70,79,25,86,46,16,83,43,93,19,92};
        int[] r= new int[200000];
        
        int i;
        
        for(i=0;i<r.length;i++)
        {
        	r[i]=(int) (Math.random()*100);
        	
        }      
        int test[]=new int [r.length];
        for(i=0;i<r.length;i++)
        {
        	test[i]=r[i];
        }
        //A.tim(r);
        double str=System.nanoTime()*0.0000001;
        A.mergeSort(r, 0,r.length-1);
        double end=System.nanoTime()*0.0000001;
        System.out.println(end-str);
        
        double str1=System.nanoTime()*0.0000001;
        A.tim(test);
        //A.mergeSort(test, 0,r.length-1);
        double end1=System.nanoTime()*0.0000001;
        System.out.println(end1-str1);
        for(i=0;i<r.length-1;i++)
        {
        	if(r[i]>r[i+1])
        	{
        		System.out.println("false");
        	}
        }
        System.out.println("true");
        
	}
	public int[] sorting(int[] A) {
		if(A.length<=1)
		{
			return A;
		}
		else
		{
			tim(A);		
		}

		return A;
	} 
	
	public static void insert(int arr[])
	{ 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
  
            
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
    }
	 
	void merge(int arr[], int l, int m, int r) 
	{ //System.out.print("in");
	    int i, j, k; 
	    int n1 = m - l + 1; 
	    int n2 =  r - m; 
	    int[] L=new int[n1];
	    int[] R=new int [n2]; 
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
	void mergeSort(int arr[], int l, int r) 
	{ 
	    if (l < r) 
	    { 
	        
	        int m = l+(r-l)/2; 
	        mergeSort(arr, l, m); 
	        mergeSort(arr, m+1, r); 
	  
	        merge(arr, l, m, r); 
	    } 
	}
    
    
    public void tim(int[] a)
    {
    	int i;
    	
    	int[] cut =new int[a.length+1];
    	int count=1;
    	for(i=0;i<a.length-1;i++)
    	{
    		if(a[i]>a[i+1])
    		{
    			cut[count++]=i+1;
    		}
    		
    	}
    	cut[count]=a.length;
    	  	
    	int coun=2;
    	//i=0;
    	while(coun<count)
    	{
    		//coun=coun*2;
    		int hal=coun/2;
	    	for(i=0;i<=a.length-2;i+=coun)
	    	{
	    		
	    		if(cut[i+1]<=cut[i]||cut[i+hal]==a.length||cut[i+hal]==0)
	    		{
	    			break;
	    		}
	    		if(cut[i+coun]!=0)
	    		{
	    			merge(a,cut[i],cut[i+hal]-1,cut[i+hal+hal]-1);
	    		}
	    		else
	    		{
	    			merge(a,cut[i],cut[i+hal]-1,a.length-1);
	    		}
	    		
	    	}
	    	
	    	coun=coun*2;
	    	
    	}   	
    	merge(a,cut[0],cut[(coun/2)]-1,a.length-1);
    	   	
    }
	
}

package arrayCombinations;

import java.util.ArrayList;

public class findNonDuplicate {
	
	public static void findNonDuplicate(int []arr)
	{
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j]){
					System.out.println(arr[j]);
					
				}
			}
		}
	}
	
	public static ArrayList FindNon(int [] arr) //4,4,5,5,1,1,2,2,7,2,0,3
	{
		int size = arr.length;
        int temp = 0;
        //int result = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<size;i++){
            boolean flag = true;
            temp = arr[i];//4
            for(int j=0;j<size;j++){
                if(temp == arr[j]){
                    if(i != j){
//                  System.out.println("Match found for "+temp);
                    flag = false;
                    break;
                    }
                }

            }
            if(flag == true)
                //result = temp;
            	list.add(temp);
        }
        return list;
		
		 
	}
	
	public static void appearsOnce(int[]arr)
	{
		int result =0;
		   
	    for(int i:arr)
	    {
	        result ^=i;
	    }

	    System.out.println("Result is "+result);
	}
	
	public static void fib(int n){
//		 if(n == 0)
//		        return 0;
//		    else if(n == 1)
//		      return 1;
//		   else
//		      return fib(n - 1) + fib(n - 2);
		
		int t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; i++)
        {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
	

	// given an array find the element that appears once int it
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,1,5,6,5,5};
		int arr1[] = {4,4,5,5,1,1,2,2,7,2,0,3};
		//appearsOnce(arr1);
		//findNonDuplicate(arr);
		System.out.println(FindNon(arr1));
		
		//int [] arr2 = {1,1,3,2,3,3,3,2,5};
		///System.out.println(FindNon(arr2));
		//fib(5);
	}

}


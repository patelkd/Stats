public class Stats {
	public static void main(String[] args) {
		
		//Max
		//Min
		//Mean
		//Median
		//Q1
		//Q3
		//Median
	
	//mode
		//standard deviation


		int[] a = { -7,-3,2,4};

		// System.out.println(findMax(a));
		// System.out.println(findMin(a));
		// System.out.println(findMean(a));
		// System.out.println(findMedian(a));
	}


	public static int findMax(int[] a) {
		int max = a[0]; 
		for (int i=0; i<a.length; i++) {
			if (a[i]>max) {
				max = a[i];
			}
	
		}
		return max;
	}

	public static int findMin(int[] a) {
		int min = a[0];
	
	for (int i=0; i<a.length; i++) {
			if (a[i]<min) {
				min=a[i];
			}
		}
		return min;
	}
	
	public static double findMean(int[] a) {
		double mean =0;
		int sum = 0;
		for (int i=0; i<a.length; i++) {
			sum =sum + a[i];
			mean = sum/(a.length);
		}
		return mean;
	}

	// public static double findMedian(int[] a) {
	// 	double median=0;
		

	// }
	
}
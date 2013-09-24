public class Stats {
	public static void main(String[] args) {
		
		//Max
		//Min
		//Mean
		//Median
		//Q1
		//Q3
		//mode
		//standard deviation


		int[] a = {53,61,49,67,55,63};

		// System.out.println(findMax(a));
		// System.out.println(findMin(a));
		// System.out.println(findMean(a));
		// System.out.println(findMedian(a));
		// System.out.println(findQ1(a));
		// System.out.println(findQ3(a));
		// System.out.println(findMode(a));
		System.out.println(findStandardDeviation(a));

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

	// 1,2,3,4

	public static double findMedian(int[] a) {
		double median = 0;
		int mid = a.length/2;
		if (a.length % 2 ==0) {
			median = (a[mid-1] + a[mid]) / 2.0;
		} else {
			median = a[mid];
		}
		return median;
		
	}
	
	public static double findQ1(int[] a) {
		double length = a.length;
		double quarter = length/4;
		int placement = (int)quarter;
		double number=0.0;
		double sum = a[placement] + a[placement-1];
		if (length % 4 !=0) {
			number = a[placement];
		} else {
			number = sum/2;
		}
		return number;
	}

	public static double findQ3(int[] a) {
		double length = a.length;
		double quarter = length/4;
		double multiply = quarter * 3;
		int placement = (int)multiply;
		double number=0.0;
		double sum = a[placement] + a[placement-1];
		if (length % 4 != 0) {
			number = a[placement];
		} else {
			number = sum/2;
		}
		return number;
	}

	public static int findMode(int[] a) {
		int temporary, counter, number;
		counter=0;
		number=0;
		for (int i=0; i<a.length; i++) {
			temporary=0;
			for (int k=0; k<a.length; k++) {
				if(a[i]==a[k]) {
					temporary++;
					if(counter<temporary) {
						counter=temporary;
						number=a[i];
					}
				}
			}
		}
		return number;
	}

	public static double findStandardDeviation(int[] a) {
		double mean = findMean(a);
		double sum = 0;
		double variance =0;
		for (int i=0; i<a.length; i++) {
			double diff = mean - a[i];
			double square = diff * diff;
			sum += square;
		}
		variance = sum/a.length-1;
		double sd = Math.sqrt(variance);
		return sd;
	}
}

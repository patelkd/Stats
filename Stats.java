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


		int[] a = {-12,-10,3,8,10};

		System.out.println(max(a));
		System.out.println(min(a));
		System.out.println(mean(a));
		System.out.println(median(a));
		System.out.println(quartile1(a));
		System.out.println(quartile3(a));
		System.out.println(mode(a));
		System.out.println(standardDeviation(a));

	}


	public static int max(int[] a) {
		int max = a[0]; 
		for (int i=0; i<a.length; i++) {
			if (a[i]>max) {
				max = a[i];
			}

		}
		return max;
	}

	public static int min(int[] a) {
		int min = a[0];

	for (int i=0; i<a.length; i++) {
			if (a[i]<min) {
				min=a[i];
			}
		}
		return min;
	}

	public static double mean(int[] a) {
		double mean =0;
		double sum = 0;
		for (int i=0; i<a.length; i++) {
			sum =sum + a[i];
			mean =sum/(a.length);
		}
		return mean;
	}

	// 1,2,3,4

	public static double median(int[] a) {
		double median = 0;
		int mid = a.length/2;
		if (a.length % 2 ==0) {
			median = (a[mid-1] + a[mid]) / 2.0;
		} else {
			median = a[mid];
		}
		return median;

	}

	public static double quartile1(int[] a) {
		double quartile1 =0.0;
		int count = (a.length/2)-1;
		int[] b = new int[count+1];
		for (int i=0; i<=count; i++) {
			b[i] = a[i];
		}
		quartile1 = median(b);
		return quartile1;
	}

	public static double quartile3(int[] a) {
		double quartile3=0.0;
		int count = 0;
		int[] b= new int [count+1];
		for (int i=0; ) 
	}

	public static int mode(int[] a) {
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

	public static double standardDeviation(int[] a) {
		double mean = mean(a);
		double sum = 0;
		double variance =0;
		for (int i=0; i<a.length; i++) {
			double diff = mean - a[i];
			double square = diff * diff;
			sum += square;
		}
		variance = sum/(a.length-1);
		double sd = Math.sqrt(variance);
		return sd;
	}
}

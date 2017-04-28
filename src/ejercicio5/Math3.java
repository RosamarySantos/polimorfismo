package ejercicio5;

import java.util.Arrays;

//de esta clase no se  puede extender
public final class Math3 implements Extremos {

	@Override
	public int min(int[] a) {
		Arrays.sort(a);
		return a[0];
	}

	@Override
	public int max(int[] a) {
		Arrays.sort(a);
		return a[a.length -1];
	}

	@Override
	public double min(double[] a) {
		Arrays.sort(a);
		return a[0];
	}

	@Override
	public double max(double[] a) {
		Arrays.sort(a);
		return a[a.length -1];
	}

}

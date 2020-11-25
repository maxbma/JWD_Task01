package by.tc.lesson01.task07;

public class NearestCoordinate {

	/*A[] = {x1,y1}, B[] = {x2,y2}*/
	public int[] findNearestCoord(int[] A, int[] B)
	{
		double r1 = Math.sqrt(A[0]*A[0] + A[1]*A[1]);
		double r2 = Math.sqrt(B[0]*B[0] + B[1]*B[1]);
		if(r1 < r2) return A;
		else return B;
	}
}

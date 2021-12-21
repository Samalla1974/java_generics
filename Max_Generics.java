package generics_usecases;

public class Max_Generics<T extends Comparable<T>> {
T x,y,z;

public Max_Generics(T x, T y, T z) {
	this.x = x;
	this.y = y;
	this.z = z;
	
}
public T maximum() {
	return Max_Generics.maximum(x,y,z);
	
}
public static <T extends Comparable<T>> T maximum(T x,T y,T z) {
	T max = x;
	if(y.compareTo(max) > 0) {
		max = y;
	}
	if(z.compareTo(max)> 0) {
		max = z;
	}
printMax (x,y,z,max);
return max;

public static void main(String args[]) {
	Integer xInt =2,yInt =3,zInt =5 ;
	new Max_Generics(xint, yint, zint).maximum();
	}
}
}
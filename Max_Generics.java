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
		printMax ( x, y, z, max);
		return max;
}
		
public static String testMax (String x,String y,String z) {
	String max = x;
	if(y.compareTo(max) > 0) {
		max = y;
	}
	if(z.compareTo(max)> 0) {
		max = z;
	}
		printMax ( x, y, z, max);
		return max;
}

public static <T> void printMax(T x, T y, T z,T max) {
	System.out.printf("Max of %s, %s and %s is %s\n",x,y,,z,max); 
}

public static void msin (String args[]) {
	Integer xInt =2,yInt =3,zInt =5;
	Float xF1=6.6f,yF1=7.7F,ZF1=8.8f;
	String xStr = "pear", yStr = "apple", zStr = "orange";
	
	
	
	Max_Generics.testMax(xStr,yStr,zStr);
	new Max_Generics (xint, yint, zint).maximum();
	new Max_Generics (xF1,yF1,zF1).maximum();S
	new Max_Generics (xStr,yStr,zStr).maximum();
}
}


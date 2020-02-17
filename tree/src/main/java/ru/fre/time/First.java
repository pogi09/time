package ru.fre.time;

public class First {
	public static void main (String[] args){
		nHi("man");
		nHi("friends");

		double  k = 11;
		System.out.println("Пл стор кв" + k + "=" +area(k));

		double  s = 6;
		double r = 4;
		System.out.println("Пл стор прямоуг " + s +"и"+ r + " = " +area(s,r));
	}

	public static void nHi(String somebody) {
		System.out.println("Hi, " + somebody + "!");
	}
	public static double area(double k){
		 return k*k;
	}

	public static double area (double s, double r){
		return s*r;
	}

}

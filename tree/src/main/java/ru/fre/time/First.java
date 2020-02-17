package ru.fre.time;

public class First {
	public static void main (String[] args){
		nHi("man");
		nHi("friends");

		Square s = new Square();
		s.k = 11;
		System.out.println("Пл стор кв" + s.k + "=" +area(s));

		Rectangle r = new Rectangle();
		r.a = 6;
		r.b = 4;
		System.out.println("Пл стор прямоуг " + r.a +"и"+ r.b + " = " +area(r));
	}

	public static void nHi(String somebody) {
		System.out.println("Hi, " + somebody + "!");
	}
	public static double area(Square s){
		 return s.k*s.k;
	}

	public static double area (Rectangle r){
		return r.a*r.b;
	}

}

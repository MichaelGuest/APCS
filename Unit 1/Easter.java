package Easter;

public class Easter {

	public static void main(String[] args) 
	{
		
		int y , a , b, c, d, e, f, g, h, i, k, r, m, n, p, z;
		
		y = 1999; //(1)
		a = y % 19; //(2)
		b = y / 100; //(3)
		c = y % 100; //(3)
		d = b / 4; //(4)
		e = b % 4; //(4)
		f = (b + 8) / 25; //(5)  
		g = (b - f + 1) / 3; //(6)
		h = (19 * a + b - d - g + 15) % 30; //(7)
		i = c / 4; //(8)
		k = c % 4; //(8)
		r = (32 + 2 * e + 2 * i - h - k) % 7; //(9)
		m = (a + 11 * h + 22 * r) / 451;//(10)
		n = (h + r - 7 * m + 114) / 31; //(11)
		p = (h + r - 7 * m + 114) % 31; //(11)
		z = p + 1; 
		System.out.println("A = " + a); //(2)
		System.out.println("B = " + b); //(3)
		System.out.println("C = " + c); //(3)
		System.out.println("D = " + d); //(4)
		System.out.println("E = " + e); //(4)
		System.out.println("F = " + f); //(5)
		System.out.println("G = " + g); //(6)
		System.out.println("H = " + h); //(7)
		System.out.println("I = " + i); //(8)
		System.out.println("K = " + k); //(8)
		System.out.println("R = " + r); //(9)
		System.out.println("M = " + m); //(10)
		System.out.println("N = " + n); //(10)
		System.out.println("P = " + p); //(10)
		//Easter in (Y) falls on (n)/(p+1)
		System.out.println("In the year " + y + " Easter will fall on day " + z + " of month " + n);
		
	}


}

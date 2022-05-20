package WhileLoop;

public class WhileLoopEx {
public static void main(String[] args) {
//	print 1-100 numbers
	int a = 1;
	while (a<=100) {
	System.out.println(a);
	a++;
	}
	
	//Even no 1-10
		int e = 2;
		while(e<=10) {
			System.out.println(e);
			e=e+2;
		}

		//Odd no 1-10
			int o = 1;
			while(o<=10) {
				System.out.println(o);
				o=o+2;
			}
			//Desending Order
			
			int d = 10;
			while(d>0) {
				System.out.println(d);
				d--;
			}
			//Acending Order
			System.out.println("ASC");
			int asc = 1;
			while(asc<=10) {
				System.out.println(asc);
				asc++;
			}
}
}

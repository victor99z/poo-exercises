
public class FiboTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fibo f1 = new Fibo(15);
		
		System.out.println(f1.somaAB(2, 5));
		System.out.println(f1.getArrayFibo());
		
	}

}

// 0 1 1 2 3 5 8 13 21

// f(n) = f(n-1) + f(n-2)
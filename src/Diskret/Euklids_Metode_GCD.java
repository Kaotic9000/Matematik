package Diskret;

public class Euklids_Metode_GCD {

	public static void main(String[] args) {

		int a = 1644;
		int b = 952;
		int z;

		if (b > a) {
			z = b;
			b = a;
			a = z;
		}

		System.out.println("Vi benytter Euklids algoritme for at finde GCD" + '\n');
		while (b != 0) {

			int x = a % b;
			System.out.println("a % b = x = " + x);
			System.out.println("Vores a værdi til at være lig b, derefter sættes b til at være lig a % b");

			a = b;
			b = x;
		}
		System.out.println('\n' + "GCD af (a,b) = " + a);
	}
}

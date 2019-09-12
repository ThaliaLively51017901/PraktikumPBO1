import java.util.Scanner;
public class percobaan4{
	public static void main(String[] args){
		Scanner masukan = new Scanner(System.in);
		int var_a, var_b;
		System.out.print("Masukan Nilai Var var_a :");
			var_a = masukan.nextInt();
		System.out.print("Masukan Nilai Var var_b :");
			var_b = masukan.nextInt();
		System.out.println();
		System.out.print("Variabel yang terdapat dalam program : \n");
		System.out.print("var_a = " + var_a);
		System.out.print("var_b = " + var_b);
	}
}
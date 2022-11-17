package excepcionsN2E1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
	
	public static double llegirDouble(String missatge) {
		double var=0;
		boolean error=true;
		System.out.print(missatge);
		while (error) {
			try {
				Scanner input=new Scanner(System.in);
				var = input.nextDouble();
				error=false;
			}
			catch (InputMismatchException e) {
				System.out.print("Error de format. Torna-ho a intentar:");
			}
		}
		return var;
	}
	
	public static float llegirFloat(String missatge) {
		float var=0;
		boolean error=true;
		System.out.print(missatge);
		while (error) {
			try {
				Scanner input=new Scanner(System.in);
				var = input.nextFloat();
				error=false;
			}
			catch (InputMismatchException e) {
				System.out.print("Error de format. Torna-ho a intentar:");
			}
		}
		return var;
	}
	
	public static byte llegirByte(String print) {
		byte var=0;
		boolean error=true;
		System.out.print(print);
		while (error) {
			try {
				Scanner input=new Scanner(System.in);
				var = input.nextByte();
				error=false;
			}
			catch (InputMismatchException e) {
				System.out.print("Error de format. Torna-ho a intentar:");
			}
		}
		return var;
	}
	
	public static int llegirInt(String print) {
		int var=0;
		boolean error=true;
		System.out.print(print);
		while (error) {
			try {
				Scanner input=new Scanner(System.in);
				var = input.nextInt();
				error=false;
			}
			catch (InputMismatchException e) {
				System.out.print("Error de format. Torna-ho a intentar:");
			}
		}
		return var;
	}
	
	public static String llegirString(String print) {
		String var="";
		boolean error=true;
		System.out.print(print);
		while (error) {
			try {
				Scanner input=new Scanner(System.in);
				var = input.nextLine();
				if (var.length()==0) {
					throw new Exception();
				}
				error=false;
			}
			catch (Exception e) {
				System.out.print("Error de format. Torna-ho a intentar:");
			}
		}
		return var;
	}
	
	
	public static char llegirChar(String print) {
		String var;
		char ch='x';
		boolean error=true;
		System.out.print(print);
		while (error) {
			try {
				Scanner input=new Scanner(System.in);
				var = input.nextLine();
				if (var.length() != 1) {
					throw new Exception();
				} else {
					ch = var.charAt(0);
					error=false;
				}
			}
			catch (Exception e) {
				System.out.print("Error de format. Torna-ho a intentar:");
			}
		}
		return ch;
	}
	
	public static boolean llegirSiNo(String print) {
		boolean var=true;
		String var2;
		boolean error=true;
		System.out.print(print);
		while (error) {
			try {
				Scanner input=new Scanner(System.in);
				var2 = input.nextLine();
				if(var2.equalsIgnoreCase("s")) {
					var = true;
					error=false;
				} else if(var2.equalsIgnoreCase("n")) {
					var = false;
					error=false;
				} else {
					throw new Exception();
				}
			}
			catch (Exception e) {
				System.out.print("Error de format. Torna-ho a intentar:");
			}
		}
		return var;
	}

}



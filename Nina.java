/*
 * Nina.java
 * Skapad den 1 september
 */

/**
 * Programmet skriver ut lite information om Nina i console-fönstret
 * @author Rolf Axelsson
 */
public class Nina {
	public void info() {
		System.out.println("Mitt namn är Nina.");
		System.out.println();  // tomrad
		System.out.println("Jag är 16 år gammal och bor i Nässjöö.");
	}
	
	public static void main(String[] args) {
		Nina presentation = new Nina();
		presentation.info();
	}
}

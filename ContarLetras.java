public class ContarLetras {
	public static void main(String[] args) {
		// Verificar si se ha pasado un argumento
		if (args.length > 0) {
			String cadena = args[0];
			int numeroLetras = contarLetras(cadena);
			System.out.println("La cadena \"" + cadena + "\" tiene " +
			numeroLetras + " letras.");
		} else {
			System.out.println("Por favor, introduce una cadena como argumento.");
		}
	}

	// Método para contar el número de letras en una cadena
	public static int contarLetras(String cadena) {
		int contador = 0;
		// Recorrer cada carácter de la cadena y contar solo las letras
		for (int i = 0; i < cadena.length(); i++) {
			char c = cadena.charAt(i);
			if (Character.isLetter(c)) {
				contador++;
			}
		}
		
		return contador;
	}
}

package pilha;

import java.util.Stack;

public class VerificaPalindromo {
	
	
	public static void main(String[] args) {
		
		String nome = "rir";
		
		if(isPalindromo(nome)) {
			System.out.println("'" + nome + "' é um Palíndromo.");
		} else {
			System.out.println("'" + nome + "' NÃO é um Palíndromo.");
		}
		
	}
	
	public static boolean isPalindromo(String str) {
		str = str.replaceAll("//s", "").toLowerCase();
		
		Stack<Character> pilha = new Stack<Character>();
		
		for (char c : str.toCharArray()) {
			pilha.push(c);
		}
		
		StringBuilder StrInvertida = new StringBuilder();
		while (!pilha.isEmpty()) {
			StrInvertida.append(pilha.pop());
		}
		
		return str.equals(StrInvertida.toString());
	}
	
}

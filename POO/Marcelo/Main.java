import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws Exception {

		String nome = readValue("Digite seu nome: ");
		int idade = Integer.parseInt(readValue("Digite sua idade: "));
		String resultado;


		if (idade < 18) {
			resultado = "Olá %s, você tem %d e é menor de idade".formatted(nome, idade);
		} else {
			resultado = "Olá %s, você tem %d e é maior de idade".formatted(nome, idade);
		}

		JOptionPane.showMessageDialog(null, resultado);
	
	}

	private static String readValue(String label) throws IOException {
		System.out.print(label);
		BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
		return buffReader.readLine();
	}

}

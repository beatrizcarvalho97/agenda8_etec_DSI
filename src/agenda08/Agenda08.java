package agenda08;

import javax.swing.JOptionPane;

public class Agenda08 {

	public static void main(String[] args) {
		int idade;
		String nota;
		int totalClientes = 0;
		int notaOtimo = 0;
		int notaBom = 0;
		int notaRegular = 0;
		int notaRuim = 0;
		int notaPessimo = 0;
		int somaIdade = 0;
		float mediaRuim;
		int porcentagemPessimo = 0;

		do {
			idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade:"));
			nota = JOptionPane.showInputDialog("Informe a sua nota: ");
			if (nota.equals("A") || nota.equals("a")) {
				notaOtimo++;
			} else if (nota.equals("B") || nota.equals("b")) {
				notaBom++;
			} else if (nota.equals("C") || nota.equals("c")) {
				notaRegular++;
			} else if (nota.equals("D") || nota.equals("d")) {
				notaRuim++;
				somaIdade = somaIdade + idade;
			} else if (nota.equals("E") || nota.equals("e")) {
				notaPessimo++;
			} else {
				JOptionPane.showMessageDialog(null, "Nota Inválida!");
			}
			totalClientes++;
		} while (totalClientes < 40);
		mediaRuim = (float) somaIdade / notaRuim;
		porcentagemPessimo = (notaPessimo * 100/totalClientes);
		JOptionPane.showMessageDialog(null,"Pesquisa finalizada" +
                                "\nO total de cliente presentes foi " + totalClientes +
				"\nO total de avaliações 'Ótimas' é " + notaOtimo + "\nA média de idade das pessoas que votaram em 'Ruim' é "
						+ mediaRuim + " Anos" + "\nA porcentagem de clientes que avaliaram como 'Péssimo' é "
						+ porcentagemPessimo + "%");
	}

}
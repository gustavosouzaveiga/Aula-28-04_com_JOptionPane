package view;

import javax.swing.JOptionPane;

import model.Pessoa;

public class Execucao {
	public static void main(String[] args) {
		Pessoa ps = new Pessoa();
		ps.setNome("Gustavo de Souza Veiga Alves");
		ps.setEnd("Rua Palmeira das Bermudas, 849");
		ps.setBairro("Jardim dos Ipês");
		ps.setCep("08161-160");
		ps.setCid("São Paulo");
		ps.setEst("São Paulo");
		
		JOptionPane.showMessageDialog(null, ps.getNome() + "\n" + 
		ps.getEnd() + "\n" +	
		ps.getBairro() + "\n" +
		ps.getCep() + "\n" +
		ps.getCid() + "\n" +
		ps.getEst());
	}
}

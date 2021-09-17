package view;

import javax.swing.JOptionPane;

import controller.HistoricoController;
import edu.fatec.Pilha;

public class Principal {
	
	public static void main(String[] args) throws Exception {
		Pilha historico = new Pilha();
		HistoricoController HistoCont = new HistoricoController();
		int input = 0;
		while (input != 9) {
			input = Integer.parseInt(JOptionPane.showInputDialog("Digite uma das opções \n1 - Adicionar Historico \n2 - Remover Historico \n3 - Consulta Historico \n9 - Sair"));
			if (input == 1) {
				String s = "";
				try {
					s = JOptionPane.showInputDialog("Digite o site: colocando:>>>> http://www");
					HistoCont.inserirHistorico(s, historico);
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
			if (input == 2) {
				try {
					String s = HistoCont.removerHistorico(historico);
					System.out.println(s);
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
			
			if (input == 3) {
				try {
					String s = HistoCont.consultaHistorico(historico);
					System.out.println(s);
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
			
			if (input == 9) {
				System.out.println("Adeus!!!");
			}
			
			if ((input != 1) && (input != 2) && (input != 3) && (input != 9)) {
				System.out.println("Operação não é valida!!!");
			}
		}
	}

}

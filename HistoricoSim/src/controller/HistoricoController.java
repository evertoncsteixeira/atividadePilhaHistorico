package controller;

import edu.fatec.Pilha;

public class HistoricoController {
	
	public void inserirHistorico (String site, Pilha p) throws Exception{
		if (!site.toLowerCase().substring(0, 10).equals("http://www")) {
			 System.out.println("Digite novamente: site invalido");
		} else {
			p.push(site);
		}
	}
	
	public String removerHistorico (Pilha p) throws Exception {
		if (p.isEmpty()) {
			System.out.println("Não existe histórico salvo");
			return null;
		} else {
			return p.pop();
		}	
	}
	
	public String consultaHistorico (Pilha p) throws Exception {
		if (p.isEmpty()) {
			System.out.println("Não existe histórico salvo");
			return null;
		} else {
			return p.top();
		}	
	}
}

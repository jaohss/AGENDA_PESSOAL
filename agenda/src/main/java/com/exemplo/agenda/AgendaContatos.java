package com.exemplo.agenda;

import javax.swing.SwingUtilities;
import com.exemplo.agenda.model.ContatoModel;
import com.exemplo.agenda.view.ContatoView;
import com.exemplo.agenda.controller.*;

/**
 * Classe principal que inicializa a aplicação Agenda de contatos
 * Responsável por criar as instâncias dos componentes MVC e iniciar a interface
 * 
 * @author Joao Henrique Santos da Silva
 * @version 1.0
 */

public class AgendaContatos {
	public static void main(String[]args) {
		//Executa a inicialização da aplicaçãi na thread de eventos do Swing
		SwingUtilities.invokeLater(() ->{
			// Criação das instâncias de View, Model e Controller
			ContatoView view = new ContatoView();
			ContatoModel model = new ContatoModel();
			new ContatoController(view, model);
		});
	}

}

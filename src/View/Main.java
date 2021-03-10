/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Agendamento;
import Model.Cliente;
import Model.Pessoa;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author aless
 */
public class Main {
    
    public static void main(String[] args) {
    
        //String nome = "Alessandro";
        //System.out.println(nome);
        
        Servico servico = new Servico(1, "barba", 30);
        
        System.out.println(servico.getDescricao());
        
        Cliente cliente = new Cliente(1, "Ale", "5 av", "0999999");
        System.out.println(cliente.getNome());
        
        Usuario usuario = new Usuario(1, "barb", "barb");
        System.out.println(usuario.getSenha());
        
        Agendamento agendamento = new Agendamento(1, cliente, servico, 30, "26/04/2021 09:15");
        System.out.println(agendamento.getCliente().getCep());
    }

    
}

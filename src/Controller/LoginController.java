/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;
import View.MenuPrincipal;

/**
 *
 * @author aless
 */
public class LoginController {
   
        private final Login view;
        private LoginHelper helper;
        
        public LoginController(Login view){
            this.view = view;
            this.helper = new LoginHelper(view);
        }
    
    
    public void entrarNoSistema() {
        Usuario usuario = helper.obterModelo();
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
        if(usuarioAutenticado != null) {
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose();
        } else {
            view.exibeMensagem("Usuario ou senha invalidos");
        }
    }
    
}

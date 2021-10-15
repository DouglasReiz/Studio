/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Login;

/**
 *
 * @author Jorge
 */
public class LoginDAO {
    public void cadastro(Login l) {
    System.out.println(l.getEmail());
    System.out.println(l.getUsuario());
    System.out.println(l.getSenha());
    System.out.println(l.getPergSeg());
    System.out.println(l.getRespSeg());
    }
}

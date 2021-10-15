/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Endereco;
import Modelo.funcionario;

/**
 *
 * @author Jorge
 */
public class FuncionarioDAO {
    public void cadastro(funcionario f) {
    System.out.println(f.getNome());
    System.out.println(f.getRG());
    System.out.println(f.getCpf());
    System.out.println(f.getSexo());
    System.out.println(f.getCTPS());
    System.out.println(f.getDataNasc());
    System.out.println(f.getEspecialização());
    }
    
    public void Buscar(funcionario f){
    System.out.println(f.getNome());
    System.out.println(f.getRG());
    System.out.println(f.getCpf());
    System.out.println(f.getSexo());
    System.out.println(f.getCTPS());
    System.out.println(f.getDataNasc());
    System.out.println(f.getEspecialização());
    }
    public void Atualizar(funcionario f){
    System.out.println(f.getNome());
    System.out.println(f.getRG());
    System.out.println(f.getCpf());
    System.out.println(f.getSexo());
    System.out.println(f.getCTPS());
    System.out.println(f.getDataNasc());
    System.out.println(f.getEspecialização());
    }
    public void Excluir(funcionario f){
   System.out.println(f.getNome());
    System.out.println(f.getRG());
    System.out.println(f.getCpf());
    System.out.println(f.getSexo());
    System.out.println(f.getCTPS());
    System.out.println(f.getDataNasc());
    System.out.println(f.getEspecialização());
    }

    
    
}

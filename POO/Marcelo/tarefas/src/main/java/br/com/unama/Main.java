package br.com.unama;

import br.com.unama.domain.Categoria;
import br.com.unama.domain.Tarefa;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Desafio 1: \n");

        Tarefa tarefa1 = new Tarefa("Estudar", "Estudar Java", "10/10/2021", 1);
        System.out.println("Titulo Anterior: " + tarefa1.getTitulo());

        tarefa1.setTitulo("Estudar Java");
        System.out.println("Titulo Atual: " + tarefa1.getTitulo());

        // -----
        System.out.println("\nDesafio 2: \n");
        System.out.println(tarefa1.exibirDetalhes());

        // ----
        System.out.println("\nDesafio 3: \n");


        Categoria categoria = new Categoria();
        categoria.setNome("Categoria 1");
        tarefa1.setCategoria(categoria);

        System.out.println(tarefa1.getCategoria().getNome());

    }
}
package com.example.sseTest.bean;

public class RandomNumbers {

    private int number;
    private  String nome;

    public RandomNumbers(int number, String nome) {
        this.number = number;
        this.nome = nome;
    }

    public RandomNumbers() { }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

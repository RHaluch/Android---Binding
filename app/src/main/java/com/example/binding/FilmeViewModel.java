package com.example.binding;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FilmeViewModel extends ViewModel {
    private String titulo;
    private Integer ano;
    private MutableLiveData<Integer> likes;
    private MutableLiveData<String> hype;

    public FilmeViewModel(){
        titulo="TESTE";
        ano = 2000;
        likes= new MutableLiveData<>();
        likes.setValue(0);
        hype = new MutableLiveData<>();
        hype.setValue("Indefinido");
    }

    public void setHype(){
        if(likes.getValue()<10){
            hype.setValue("Baixo");
        }else if(likes.getValue()>=10 && likes.getValue()<20){
            hype.setValue("Medio");
        }else{
            hype.setValue("Alto");
        }
    }

    public MutableLiveData<String> getHype() {
        return hype;
    }

    public void setHype(MutableLiveData<String> hype) {
        this.hype = hype;
    }

    public void onLike(){

        likes.setValue(likes.getValue()+1);
        setHype();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public MutableLiveData<Integer> getLikes() {
        return likes;
    }

    public void setLikes(MutableLiveData<Integer> likes) {
        this.likes = likes;
    }
}

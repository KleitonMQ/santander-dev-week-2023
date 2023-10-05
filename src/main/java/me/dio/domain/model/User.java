package me.dio.domain.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity(name = "tb_user")
public class User {
    //Estas anotações servem para ele tratar a variável de id como chave primária na tabela e ser gerado os valores automaticamente.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    
    //@OneToOne(cascade = CascadeType.ALL) - Significa que se eu apagar este usuário do banco, a Account também é apagada por consequencia.
    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

    @OneToOne(cascade = CascadeType.ALL)
    private Card card;
    
    //fetch = FetchType.EAGER - Signfica que sempre que eu pedir as informações do usuário, também será retornada todas as Features vinculadas.
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Feature> features;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<News> news;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }
    public Card getCard() {
        return card;
    }
    public void setCard(Card card) {
        this.card = card;
    }
    public List<Feature> getFeatures() {
        return features;
    }
    public void setFeatures(List<Feature> features) {
        this.features = features;
    }
    public List<News> getNews() {
        return news;
    }
    public void setNews(List<News> news) {
        this.news = news;
    }

    
}

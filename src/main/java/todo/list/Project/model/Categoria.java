package todo.list.project.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.OneToMany;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
@Entity
public class Categoria  extends PanacheEntity {

    
    @GeneratedValue
    private Long id;

    private String nome;


    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
private List<Lista> itens;

public List<Lista> getItens() {
    return itens;
}



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



}

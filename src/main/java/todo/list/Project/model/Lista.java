package todo.list.Project.model;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
@Entity
public class Lista extends PanacheEntity {

   private String nomeItem;
   private String descricao;
   private int quantidade;
   
public String getNomeItem() {
    return nomeItem;
}
public void setNomeItem(String nomeItem) {
    this.nomeItem = nomeItem;
}
public String getDescricao() {
    return descricao;
}
public void setDescricao(String descricao) {
    this.descricao = descricao;
}
public int getQuantidade() {
    return quantidade;
}
public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
}




}

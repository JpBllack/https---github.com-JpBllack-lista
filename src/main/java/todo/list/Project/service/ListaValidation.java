package todo.list.Project.service;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

public class ListaValidation {
    
    @NotBlank(message = "O nome do item não pode estar em branco")
    private String nomeItem;

    @NotBlank(message = "A descrição do item não pode estar em branco")
    private String descricao;

    @Positive(message = "A quantidade deve ser um número positivo")
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

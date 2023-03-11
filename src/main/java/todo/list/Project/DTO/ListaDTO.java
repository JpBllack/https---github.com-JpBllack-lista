package todo.list.Project.DTO;

    public class ListaDTO {
        private String nomeItem;
        private String descricao;
        private Integer quantidade;
    
        public ListaDTO(String nomeItem, Integer quantidade) {
            this.nomeItem = nomeItem;
            this.quantidade = quantidade;
        }
    
        // getters e setters
        public String getNomeItem() {
            return nomeItem;
        }
    
        public void setNomeItem(String nomeItem) {
            this.nomeItem = nomeItem;
        }
    
        public Integer getQuantidade() {
            return quantidade;
        }
    
        public void setQuantidade(Integer quantidade) {
            this.quantidade = quantidade;
        }

        public String getDescricao() {
            return descricao;
        }
        public void setDescricao(String descricao) {
            this.descricao = descricao;
    }
}
    


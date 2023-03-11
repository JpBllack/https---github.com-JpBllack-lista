package todo.list.project.repository;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import todo.list.project.model.Lista;

@ApplicationScoped
public class ListaRepository implements PanacheRepository<Lista> {
    

    public Lista findByName(String nome){
        return find("nome", nome).firstResult();
    }


}

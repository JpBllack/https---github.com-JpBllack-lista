package todo.list.Project.resource;
import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import todo.list.Project.model.*;

@Path("/listas")
public class ListaResource {

    @GET
    public List<Lista> getAll() {

        // seleciona todas as listas do banco de dados
        return Lista.findAll().list();

    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Lista insert(Lista lista) {

        // adiciona a lista no banco de dados
        lista.persist();

        return lista;
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Lista uptadte(@PathParam("id") Long id, Lista lista) {

        Lista entity = Lista.findById(id);

        entity.getNomeItem();
        entity.getDescricao();
        entity.getQuantidade();

        return entity;
    }
    
}


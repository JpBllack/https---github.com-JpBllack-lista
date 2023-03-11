package todo.list.Project.resource;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import todo.list.Project.model.*;

@Path("/listas")
public class ListaResource {

    @GET
    public List<Lista> getAll() {
        return Lista.findAll().list();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Lista create(Lista lista) {
        lista.persist();
        return lista;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Lista get(@PathParam("id") Long id) {
        return Lista.findById(id);
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Lista update(@PathParam("id") Long id, Lista lista) {
        Lista entity = Lista.findById(id);

        if (entity != null) {
            entity.setNomeItem(lista.getNomeItem());
            entity.setDescricao(lista.getDescricao());
            entity.setQuantidade(lista.getQuantidade());
            entity.persist();
        }

        return entity;
    }

    @GET
    @Path("/{itemId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Lista getById(@PathParam("itemId") Long itemId) {
        return Lista.findById(itemId);
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public void delete(@PathParam("id") Long id) {
        Lista entity = Lista.findById(id);

        if (entity != null) {
            entity.delete();
        }
    }

    @GET
    @Path("/nome/{nome}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Lista> getByNome(@PathParam("nome") String nome) {
        return Lista.find("nomeItem LIKE ?1", "%" + nome + "%").list();
    }

    @GET
    @Path("/categoria/{categoria}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Lista> getByCategoria(@PathParam("categoria") String categoria) {
        Categoria entity = Categoria.find("nome", categoria).firstResult();
        if (entity != null) {
            return entity.getItens();
        }
        return null;
    }

    @PUT
    @Path("/{id}/categoria/{categoria}")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Lista adicionarItemCategoria(@PathParam("id") Long id, @PathParam("categoria") String categoria) {
        Lista entity = Lista.findById(id);
        Categoria catEntity = Categoria.find("nome", categoria).firstResult();
        if (entity != null && catEntity != null) {
            entity.setCategoria(catEntity);
            entity.persist();
            return entity;
        }
        return null;
    }

}

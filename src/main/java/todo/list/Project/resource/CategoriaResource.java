package todo.list.project.resource;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import todo.list.project.model.Categoria;

@Path("/categorias")
public class CategoriaResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Categoria create(Categoria categoria) {
        categoria.persist();
        return categoria;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Categoria> getAll() {
        return Categoria.findAll().list();
    }
}

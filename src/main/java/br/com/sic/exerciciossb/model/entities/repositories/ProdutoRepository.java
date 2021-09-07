package br.com.sic.exerciciossb.model.entities.repositories;

import org.springframework.data.repository.CrudRepository;
import br.com.sic.exerciciossb.model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}

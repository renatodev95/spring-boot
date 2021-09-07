package br.com.sic.exerciciossb.model.entities.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import br.com.sic.exerciciossb.model.entities.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {

}

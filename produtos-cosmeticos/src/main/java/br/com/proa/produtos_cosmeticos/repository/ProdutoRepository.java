package br.com.proa.produtos_cosmeticos.repository;

import br.com.proa.produtos_cosmeticos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
}

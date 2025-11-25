package br.com.proa.produtos_cosmeticos.controller;

import br.com.proa.produtos_cosmeticos.model.Produto;
import br.com.proa.produtos_cosmeticos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @GetMapping
    public List<Produto> pegaProdutos(){
        return repository.findAll();
    }

    @PostMapping
    public void salvarProduto(@PathVariable Produto produto){
        repository.save(produto);
    }

    @GetMapping(value = "/{id}")
    public Produto pegaProdutoPeloId(@PathVariable Long id){
        return repository.findById(id).orElseThrow();
    }
}

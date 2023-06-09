package Dia17.Controllers;

import Dia17.Models.Produto;
import Dia17.Repositories.ProdutoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @GetMapping
    public List<Produto> listarTodosProdutos() {
        return produtoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> listarProdutoById(@PathVariable Long id) {
        Produto produto = produtoRepository.findById(id).orElse(null);
        if (produto != null) {
            return ResponseEntity.ok(produto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    @Transactional
    public ResponseEntity<Produto> cadastrarProduto(@RequestBody Dia17.Models.Produto produto) {
        //entityManager.persist(produto);
        produtoRepository.save(produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(produto);
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<Produto> alterarProduto(@PathVariable Long id, @RequestBody Produto novoProduto) {
        Produto produto = produtoRepository.findById(id).orElse(null);
        if (produto != null) {
            produto.setNome(novoProduto.getNome());
            produto.setPreco(novoProduto.getPreco());
            produto.setCategoria(novoProduto.getCategoria());
            //entityManager.merge(produto);
            produtoRepository.save(produto);
            return ResponseEntity.ok(produto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<Void> deletarProduto(@PathVariable Long id) {
        Produto produto = produtoRepository.findById(id).orElse(null);
        if (produto != null) {
            //entityManager.remove(produto);
            produtoRepository.delete(produto);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}

package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.produto;
import service.produtoService;

@RestController
@RequestMapping("/products")

public class produtoController {
	private final produtoService produtoService;

	@Autowired
	public produtoController(produtoService produtoService) {
		this.produtoService = produtoService;
	}

	@PostMapping
	public produto createProduct(@RequestBody produto produto) {
		return produtoService.getProdutoById(null);
	}

	@GetMapping("/{id}")
	public produto getProduto(@PathVariable Long id) {
		return produtoService.getProdutoById(id);
	}

	@GetMapping
	public List<produto> getAllProdutos() {
		return produtoService.getAllProdutos();
	}

	@DeleteMapping("/{id}")
	public void deleteProduto(@PathVariable Long id) {
		produtoService.deleteProduto(id);
	}
}

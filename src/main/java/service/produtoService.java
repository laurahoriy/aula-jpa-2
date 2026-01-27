package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.produto;
import repository.produtoRepository;

@Service
public class produtoService {
	private final produtoRepository produtoRepository;

	// construtor que recebe a dependencia
	@Autowired
	public produtoService(produtoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}

	public produto saveProduto(produto produto) {
		return produtoRepository.save(produto);
	}

	public produto getProdutoById(Long id) {
		return produtoRepository.findById(id).orElse(null);
	}

	public List<produto> getAllProdutos() {
		return produtoRepository.findAll();
	}

	public void deleteProduto(Long id) {
		produtoRepository.deleteById(id);
	}
}

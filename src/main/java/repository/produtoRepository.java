package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.produto;

public interface produtoRepository extends JpaRepository<produto, Long> {

}

package Dia17.Repositories;

import Dia17.Models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
    
}

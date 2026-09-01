package com.algaworks.algatransito_api.domain.repository;
import com.algaworks.algatransito_api.domain.model.Proprietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProprietarioRepository extends JpaRepository<Proprietario, Long> {}

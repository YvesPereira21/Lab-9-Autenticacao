package br.ufpb.dcx.dsc.figurinhas.repository;

import br.ufpb.dcx.dsc.figurinhas.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
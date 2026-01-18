package br.com.applicati.sampleapplication.repository;


import br.com.applicati.sampleapplication.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

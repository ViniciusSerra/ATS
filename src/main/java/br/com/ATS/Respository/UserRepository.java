package br.com.ATS.Respository;

import br.com.ATS.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository <UserModel,Integer>{
    Optional<UserModel> findAllByUsername(String username);
}

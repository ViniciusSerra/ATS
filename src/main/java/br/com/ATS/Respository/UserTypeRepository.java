package br.com.ATS.Respository;

import br.com.ATS.Model.UserType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTypeRepository extends JpaRepository<UserType, Long> {
    // Você pode adicionar métodos de consulta personalizados, se necessário
}

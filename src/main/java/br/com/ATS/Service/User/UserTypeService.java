package br.com.ATS.Service.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.ATS.Respository.UserTypeRepository;
import br.com.ATS.Model.UserType;
import java.util.List;

@Service
public class UserTypeService {
    private final UserTypeRepository userTypeRepository;

    @Autowired
    public UserTypeService(UserTypeRepository userTypeRepository) {
        this.userTypeRepository = userTypeRepository;
    }

    public List<UserType> getAllUserTypes() {
        return userTypeRepository.findAll();
    }
}


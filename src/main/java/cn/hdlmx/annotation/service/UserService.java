package cn.hdlmx.annotation.service;

import cn.hdlmx.annotation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    @Qualifier(value = "userJdbcRepositoryImp")
    private UserRepository userRepository;

    public void add() {
        System.out.println("UserSercie add ...");
        userRepository.save();
    }
}

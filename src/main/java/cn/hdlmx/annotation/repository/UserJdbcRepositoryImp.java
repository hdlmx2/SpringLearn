package cn.hdlmx.annotation.repository;

import org.springframework.stereotype.Repository;

@Repository//(value = "userRepository")
public class UserJdbcRepositoryImp implements UserRepository {

    public void save() {
        System.out.println("UserJdbcRepositoryImp save...");
    }
}

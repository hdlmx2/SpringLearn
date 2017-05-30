package cn.hdlmx.annotation.repository;

import org.springframework.stereotype.Repository;

@Repository(value = "userRepository")
public class UserRepositoryImp implements UserRepository {
    public void save() {
        System.out.println("RepositoryImp save...");
    }
}

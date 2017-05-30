package cn.hdlmx.annotation.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImp implements UserRepository {
    public void save() {
        System.out.println("UserRepositoryImp save...");
    }
}

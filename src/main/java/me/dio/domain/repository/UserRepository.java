package me.dio.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    /*
     * Esta interface JpaRepoditory facilita o uso de vários 
     * métodos de gerenciamento. Ela já vem configurada com
     * vários métodos para agilizar os comandos para banco de dados. (CRUD)
     */

     boolean existsByAccountNumber(String accountNumber);
}

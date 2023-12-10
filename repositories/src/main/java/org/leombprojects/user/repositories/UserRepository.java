package org.leombprojects.user.repositories;

import org.leombprojects.user.models.UsersModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UsersModel, Long> {
    UsersModel findByUserAndPassword(String user, String password);
}

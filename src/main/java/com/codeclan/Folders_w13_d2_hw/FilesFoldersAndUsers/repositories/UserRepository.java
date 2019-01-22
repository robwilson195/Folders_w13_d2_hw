package com.codeclan.Folders_w13_d2_hw.FilesFoldersAndUsers.repositories;

import com.codeclan.Folders_w13_d2_hw.FilesFoldersAndUsers.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

package com.codeclan.Folders_w13_d2_hw.FilesFoldersAndUsers.repositories;

import com.codeclan.Folders_w13_d2_hw.FilesFoldersAndUsers.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}

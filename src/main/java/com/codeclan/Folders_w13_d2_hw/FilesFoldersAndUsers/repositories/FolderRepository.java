package com.codeclan.Folders_w13_d2_hw.FilesFoldersAndUsers.repositories;

import com.codeclan.Folders_w13_d2_hw.FilesFoldersAndUsers.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}

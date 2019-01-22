package com.codeclan.Folders_w13_d2_hw.FilesFoldersAndUsers.controllers;

import com.codeclan.Folders_w13_d2_hw.FilesFoldersAndUsers.models.Folder;
import com.codeclan.Folders_w13_d2_hw.FilesFoldersAndUsers.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/folders")
public class FolderController {
    @Autowired
    FolderRepository folderRepository;
}

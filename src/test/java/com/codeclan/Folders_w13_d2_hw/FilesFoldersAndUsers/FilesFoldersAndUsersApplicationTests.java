package com.codeclan.Folders_w13_d2_hw.FilesFoldersAndUsers;

import com.codeclan.Folders_w13_d2_hw.FilesFoldersAndUsers.models.File;
import com.codeclan.Folders_w13_d2_hw.FilesFoldersAndUsers.models.Folder;
import com.codeclan.Folders_w13_d2_hw.FilesFoldersAndUsers.models.User;
import com.codeclan.Folders_w13_d2_hw.FilesFoldersAndUsers.repositories.FileRepository;
import com.codeclan.Folders_w13_d2_hw.FilesFoldersAndUsers.repositories.FolderRepository;
import com.codeclan.Folders_w13_d2_hw.FilesFoldersAndUsers.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilesFoldersAndUsersApplicationTests {

	@Autowired
	FileRepository fileRepository;
	@Autowired
	FolderRepository folderRepository;
	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canSaveUsersWithFoldersWithFiles() {
        fileRepository.deleteAll();
	    folderRepository.deleteAll();
        userRepository.deleteAll();

        User user = new User("Steve");
		userRepository.save(user);

		Folder folder1 = new Folder("First_Folder", user);
		folderRepository.save(folder1);
		Folder folder2 = new Folder("Second_Folder", user);
		folderRepository.save(folder2);

		File file1 = new File("first_file", "txt", 155, folder1);
		fileRepository.save(file1);
		File file2 = new File("second_file", "pyn", 130, folder1);
		fileRepository.save(file2);
		File file3 = new File("third_file", "txt", 99, folder2);
		fileRepository.save(file3);
		File file4 = new File("fourth_file", "md", 44, folder2);
		fileRepository.save(file4);
	}
}


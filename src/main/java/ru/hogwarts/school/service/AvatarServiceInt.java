package ru.hogwarts.school.service;

import org.springframework.web.multipart.MultipartFile;
import ru.hogwarts.school.model.Avatar;

import java.io.IOException;

public interface AvatarServiceInt {
    Avatar findAvatarByStudentId(Long studentId);

    void uploadAvatar(Long studentId, MultipartFile avatarFile) throws IOException;
}
package ru.hogwarts.school.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.repository.FacultyRepository;

import java.util.Collection;
import java.util.HashMap;
import java.util.stream.Collectors;
@Service
@AllArgsConstructor

public class FacultyService {

    private FacultyRepository repository;

    public Faculty createFaculty(Faculty faculty) {
        return (Faculty) repository.save(faculty);
    }

    public Faculty findFaculty(long id) {
        return (Faculty) repository.findById(id).orElseThrow(););
    }

    public Faculty editFaculty(Faculty faculty) {
            return (Faculty) repository.save(faculty);
        }

    public void deleteFaculty(Long id) {
        repository.deleteById(id);
    }

    public Collection<Faculty> getAllFacultys() {
        return repository.findAll();
    }

    public Collection<Faculty> getColorFacultys(String color) {
        return repository.findByColor(color);
    }
}

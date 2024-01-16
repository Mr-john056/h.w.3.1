package ru.hogwarts.school.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.model.Student;
import ru.hogwarts.school.repository.StudentRepository;

import java.util.Collection;

@Service
@AllArgsConstructor
public class StudentService {

    private StudentRepository repository;

    public Student createStudent(Student student) {
        return repository.save(student);
    }

    public Student findStudent(long id) {
        return repository.findById(id).orElseThrow();
    }

    public Student editStudent(Student student) {
        return repository.save(student);
    }

    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }

    public Collection<Student> getAllStudentsByAge(StudentService age) {
        return repository.findByAge(age);
    }

    public Collection<Student> getAgeStudent(int age) {
        return repository.findAll();
    }

    public Faculty findFacultyByStudent(long id) {
        return repository.getReferenceById(id).getFaculty();
    }

}

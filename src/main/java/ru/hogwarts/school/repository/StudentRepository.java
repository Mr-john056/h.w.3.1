package ru.hogwarts.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.hogwarts.school.model.Student;

import java.util.Collection;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Collection<Student> findStudentByAge(int age);

    Collection<Student> findByAgeBetween(int min, int max);

    @Query(value = "SELECT count(s) FROM Student s")
    Integer countStudents();

    @Query(value = "SELECT AVG(age) FROM my_student", nativeQuery = true)
    Integer middleAgeByStudents();

    @Query(value = "SELECT s.faculty_id FROM my_student s", nativeQuery = true)
    Integer facultyIdNative();

    @Query(value = "SELECT s.faculty.id from Student s")
    Integer facultyId();

    @Query(value = "SELECT * FROM my_student ORDER BY id DESC LIMIT 5", nativeQuery = true)
    List<Student> getLastFiveStudentsById();
}

package ru.hogwarts.school;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import ru.hogwarts.school.controller.StudentController;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SchoolApplicationTests {

	@Test
	void contextLoads() throws Exception {
		assertThat(StudentController.class).isNotNull();
	}
}

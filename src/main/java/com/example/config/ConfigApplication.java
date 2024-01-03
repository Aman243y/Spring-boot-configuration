package com.example.config;

import com.example.config.Dao.StudentDao;
import com.example.config.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigApplication.class, args);
	}
	@Bean
	public CommandLineRunner onConsole(StudentDao sd){
		return vada ->{
			//System.out.println("hello moto");
			save(sd);
			//findStudent(sd);
			//deleteStudent(sd);
			//UpdateStudent(sd);
			//AllStudent(sd);


		};

	}

	private void AllStudent(StudentDao sd) {
		System.out.println(sd.getStudent());
	}

	private void UpdateStudent(StudentDao sd) {
		int id=3;
		Student theStudent =sd.findBy(id);
		theStudent.setFirstname("Abhishek");
		sd.update(theStudent);
		System.out.println("updated successfully");

	}

	private void deleteStudent(StudentDao sd) {
		int id=1;
		sd.Delete(id);
		System.out.println("Deleted successfully");
	}


	private void findStudent(StudentDao sd) {
		int id =1;
		Student s=sd.findBy(id);
		System.out.println("find"+s);
	}

	private void save(StudentDao sd) {
		Student s =new Student("amoge","anamika","amogekianamikathiExa@gmail.com");
		sd.saveStudent(s);
		System.out.println("data saved successfully");
	}

}

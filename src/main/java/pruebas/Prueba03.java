package pruebas;

import java.time.LocalDateTime;
import java.util.List;

import models.Subject;
import repository.ISubjectRepository;
import repository.SubjectRepositoryImpl;

public class Prueba03 {

	public static void main(String[] args) {
		ISubjectRepository repository = new SubjectRepositoryImpl();
		Subject subject = repository.find(Long.valueOf(2));
		subject.setSubject("Subject Editado " + LocalDateTime.now().toString());

		repository.update(subject);
		List<Subject> subjectList = repository.findAll();
		subjectList.stream().forEach(s -> {
			final String outData = String.format("\n%s | %s | %s", s.getIdsubject(), s.getSubject(), s.getCredits());
			System.out.print(outData);
		});
	}

}

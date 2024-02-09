package pruebas;

import java.util.List;

import models.Subject;
import repository.ISubjectRepository;
import repository.SubjectRepositoryImpl;

public class Prueba02 {

	public static void main(String[] args) {
		ISubjectRepository repository = new SubjectRepositoryImpl();
		Subject subject = new Subject();
		subject.setSubject("Nuevo Subject");
		subject.setCredits(String.valueOf(Math.random() * 100));

		repository.create(subject);

		List<Subject> subjectList = repository.findAll();
		subjectList.stream().forEach(s -> {
			final String outData = String.format("\n%s | %s | %s", s.getIdsubject(), s.getSubject(), s.getCredits());
			System.out.print(outData);
		});

	}

}

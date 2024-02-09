package pruebas;

import java.util.List;

import models.Subject;
import repository.ISubjectRepository;
import repository.SubjectRepositoryImpl;

public class Prueba01 {

	public static void main(String[] args) {
		ISubjectRepository repository = new SubjectRepositoryImpl();
		List<Subject> subjectList = repository.findAll();
		subjectList.stream().forEach(s -> {
			final String outData = String.format("\n%s | %s | %s", s.getIdsubject(), s.getSubject(), s.getCredits());
			System.out.print(outData);
		});
	}

}

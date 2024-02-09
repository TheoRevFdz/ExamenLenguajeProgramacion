package pruebas;

import java.time.LocalDateTime;
import java.util.List;

import models.Subject;
import repository.ISubjectRepository;
import repository.SubjectRepositoryImpl;

public class Prueba04 {

	public static void main(String[] args) {
		ISubjectRepository repository = new SubjectRepositoryImpl();

		repository.delete(Long.valueOf(2));
		System.out.println("Subject " + 2 + " ha sido Eliminado correctamente!.");

		List<Subject> subjectList = repository.findAll();
		subjectList.stream().forEach(s -> {
			final String outData = String.format("\n%s | %s | %s", s.getIdsubject(), s.getSubject(), s.getCredits());
			System.out.print(outData);
		});

	}

}

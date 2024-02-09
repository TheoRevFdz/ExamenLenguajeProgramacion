package repository;

import java.util.List;

import models.Subject;

public interface ISubjectRepository {
	public void create(Subject subject);

	public void update(Subject subject);

	public void delete(Long id);

	public Subject find(Long id);

	public List<Subject> findAll();
}

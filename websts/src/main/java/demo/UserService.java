package demo;

public interface UserService {
	Iterable<User> findAll();
	User save(User entity);
	void delete(int id);
	User find(int id);
}

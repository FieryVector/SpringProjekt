package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements  UserService {
	//private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
	private UserRepository userRepository;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository2)
	{
		this.userRepository = userRepository2;
	}

	@Override
	public Iterable<User> findAll() {
		return userRepository.findAll();
	}
	
	@Override
	public User save(User entity) {
		return userRepository.save(entity);
	}
	
	@Override
	public void delete(int id) {
		userRepository.delete(id);
	}
	
	@Override
	public User find(int id) {
		 return userRepository.findOne(id);
	}
	
}

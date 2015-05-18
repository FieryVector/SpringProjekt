package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ProduktService")
public class ProduktServiceImpl implements ProduktService {

	private ProdukteRepository userres;
	
	@Autowired
	public ProduktServiceImpl(ProdukteRepository user2)
	{
		this.userres = user2;
	}
	
	@Override
	public Iterable<Produkt> findAll()
	{
		return userres.findAll();
	}

	@Override
	public Produkt save(Produkt entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Produkt fint(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}

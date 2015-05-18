package demo;

public interface ProduktService {
	Iterable<Produkt> findAll();
	Produkt save(Produkt entity);
	void delete(int id);
	Produkt fint(int id);
}

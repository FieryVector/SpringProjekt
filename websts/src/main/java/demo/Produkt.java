package demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Produkt {
	
	@Id
	@GeneratedValue
	private int id;
	
	@NotEmpty(message ="{validation.name.NotEmpty.message}")
	@Size(min = 10, max = 20, message = "{validation.name.Size.message}")
	private String name;
	
	@NotEmpty(message ="{validation.message.NotEmpty.message}")
	@Size(min = 100, max = 1000, message = "{validation.name.beschreibung.message}")
	private String beschreibung;
	
	@NotEmpty(message ="{validation.kurzbeschr.NotEmpty.message}")
	@Size(min = 100, max = 200, message = "{validation.name.kurzbeschr.message}")
	private String kurzbeschr;
	
	@Size(min = 0, max = 100, message = "{validation.stueck.kurzbeschr.message}")
	@NotNull
	private int stueck;
	
	@Size(min = 0, max = 2000, message = "{validation.preis.kurzbeschr.message}")
	@NotNull
	private double preis;
	
	private String link;

	public Produkt(){		
	}
	
	public Produkt(int id, String name, double preis)
	{
		setId(id);
		setName(name);
		setPreis(preis);
	}
	
	public Produkt(int id, String name, double preis, String kurzbeschr, String beschreibung, int stueck, String link)
	{
		setId(id);
		setName(name);
		setPreis(preis);
		setBeschreibung(beschreibung);
		setKurzbeschr(kurzbeschr);
		setLink(link);
		setStueck(stueck);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public String getKurzbeschr() {
		return kurzbeschr;
	}

	public void setKurzbeschr(String kurzbeschr) {
		this.kurzbeschr = kurzbeschr;
	}

	public int getStueck() {
		return stueck;
	}

	public void setStueck(int stueck) {
		this.stueck = stueck;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Override
	public String toString() {
		return "Produkte [id=" + id + ", name=" + name + ", beschreibung="
				+ beschreibung + ", kurzbeschr=" + kurzbeschr + ", stueck="
				+ stueck + ", preis=" + preis + ", link=" + link + "]";
	}
}

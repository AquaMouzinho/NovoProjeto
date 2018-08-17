package beans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import Poo.ed.Jantar;

@Named
@ViewScoped
public class JantarBean {
	
	private Jantar jantar = new Jantar(); 
	
	private List <Jantar> jantas = new ArrayList<>();
	
	public Jantar getJantar() {
		return jantar;
	}
	
	public void setJantar(Jantar jantar) {
		this.jantar = jantar;
	}
	
	public List<Jantar> getJantas() {
		return jantas;
	}
	
	public void addJantar() {
		jantas.add(getJantar());
		jantar = new Jantar();
	}
	
	public void updateJantar() {
		for (Jantar jan : jantas) {
			if(jan.getIdJantar() == jantar.getIdJantar()) {
				jan.setAcompanhamentos(jantar.getAcompanhamentos());
				jan.setIdJantar(jantar.getIdJantar());
				jan.setNome(jantar.getNome());
				jan.setPreco(jantar.getPreco());
			}
		}
	}
	public void removeJantar() {
		for (Jantar jan : jantas) {
			if(jan.getIdJantar() == jantar.getIdJantar()) {
				jantas.remove(jan);
			}
		}
	}
	public void mostrarJantar() {
		for (Jantar jan : jantas) {
			if(jan.getIdJantar() == jantar.getIdJantar()) {
				System.out.println(jan);
			}
		}
	}

}
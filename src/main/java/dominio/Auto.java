package dominio;

public class Auto {
	private Estado estado;
	
public void encender(){
	this.estado.encender(this);
}

public void apagar(){
	this.estado.apagar(this);
}

public void acelerar(){
	this.estado.acelerar(this);
}

public void detener(){
	this.estado.detener(this);
}

}


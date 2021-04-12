package amazon;

public class Fecha {
	int dia;
	int mes;
	int ano;

	Fecha() {
		this.dia = 1;
		this.mes = 1;
		this.ano = 1900;

	}

	Fecha(String fec) {
		String[] fecha = fec.split("/");
		this.dia = Integer.parseInt(fecha[0]);
		this.mes = Integer.parseInt(fecha[1]);
		this.ano = Integer.parseInt(fecha[2]);
	}

	void imprimir_fecha() {
		System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
	}

}



package amazon;


public class pedido {
	private int Id;
	private producto[] articulos;
	private int Id_del_cliente;
	private Fecha Fecha;
	private float Importe_total;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public producto[] getArticulos() {
		return articulos;
	}

	public void setArticulos(producto[] articulos) {
		this.articulos = articulos;
	}

	public int getId_del_cliente() {
		return Id_del_cliente;
	}

	public void setId_del_cliente(int id_del_cliente) {
		Id_del_cliente = id_del_cliente;
	}

	public Fecha getFecha() {
		return Fecha;
	}

	public void setFecha(Fecha fecha) {
		Fecha = fecha;
	}

	public float getImporte_total() {
		return Importe_total;
	}

	public void setImporte_total(float importe_total) {
		Importe_total = importe_total;
	}

	pedido() {
		this.Id = 0;
		this.articulos = new producto[0];
		this.Id_del_cliente=0;
		this.Fecha= new Fecha();
		this.Importe_total = 0;
		
	}
	pedido(int Id, int Id_Cli, String Articulo, float Importe, int Stock) {
		this.Id = Id;
		this.articulos = new producto[0];
		this.Id_del_cliente=Id_Cli;
		this.Fecha= new Fecha();
		this.Importe_total = Importe;

	}

	void info() {
		System.out.println("—————————————————————————————————————————————");
		System.out.println("Identificador: " + this.Id);
		System.out.println(": " + this.Marca);
		System.out.println("Modelo: " + this.Articulo);
		System.out.println("Precio: " + this.Precio);
		System.out.println("Stock: " + this.Stock);

	}
}
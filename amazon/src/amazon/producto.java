package amazon;

public class producto {
	private int Id;
	private String Marca;
	private String Articulo;
	private Float Precio;
	private int Stock;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getArticulo() {
		return Articulo;
	}

	public void setArticulo(String articulo) {
		Articulo = articulo;
	}

	public Float getPrecio() {
		return Precio;
	}

	public void setPrecio(Float precio) {
		Precio = precio;
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}

	producto() {
		this.Id = 0;
		this.Marca = "";
		this.Articulo = "";
		this.Precio = (float) 0;
		this.Stock = 0;

	}

	producto(int Id, String Marca, String Articulo, float Precio, int Stock) {
		this.Id = Id;
		this.Marca = Marca;
		this.Articulo = Articulo;
		this.Precio = Precio;
		this.Stock = Stock;

	}

	void info() {
		System.out.println("—————————————————————————————————————————————");
		System.out.println("Identificador: " + this.Id);
		System.out.println("Marca: " + this.Marca);
		System.out.println("Modelo: " + this.Articulo);
		System.out.println("Precio: " + this.Precio);
		System.out.println("Stock: " + this.Stock);

	}
}

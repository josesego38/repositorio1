package amazon;

public class usuario {
	private int Id;
	private String Usuario;
	private String Contrasena;
	private String Rol;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		Usuario = usuario;
	}

	public String getContrasena() {
		return Contrasena;
	}

	public void setContrasena(String contrasena) {
		Contrasena = contrasena;
	}

	public String getRol() {
		return Rol;
	}

	public void setRol(String rol) {
		Rol = rol;
	}

	usuario() {
		this.Id = 0;
		this.Usuario = "";
		this.Contrasena = "";
		this.Rol = "";

	}
	usuario(int Id, String Usuario, String Contrasena, String Rol) {
		this.Id = Id;
		this.Usuario=Usuario;
		this.Contrasena=Contrasena;
		this.Rol=Rol;
	

	}

	void info() {
		System.out.println("—————————————————————————————————————————————");
		System.out.println("Identificador: " + this.Id);
		System.out.println("Usuario: " + this.Usuario);
		System.out.println("Contrasena: " + this.Contrasena);
		System.out.println("Rol: " + this.Rol);
	

	}
}

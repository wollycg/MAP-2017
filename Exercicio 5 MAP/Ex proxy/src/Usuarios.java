
public class Usuarios
{	 
	public String numeroUsuarios;
	public String usuariosConectados;
	
	public Usuarios(String numeroUsuarios, String usuariosConectados) {
		super();
		this.numeroUsuarios = numeroUsuarios;
		this.usuariosConectados = usuariosConectados;
	}

	public String getNumeroUsuarios() {
		return numeroUsuarios;
	}

	public void setNumeroUsuarios(String numeroUsuarios) {
		this.numeroUsuarios = numeroUsuarios;
	}

	public String getUsuariosConectados() {
		return usuariosConectados;
	}

	public void setUsuariosConectados(String usuariosConectados) {
		this.usuariosConectados = usuariosConectados;
	}
	

}

package br.ifba.frontend.model;

public class EquipeTelaModel {

	private Integer id_Equipe;
	private String nome_Equipe;
	private GincanaModel gincana;
	private CursoModel curso;
	private UsuarioModel usuario;

	public Integer getId_Equipe() {
		return id_Equipe;
	}

	public void setId_Equipe(Integer id_Equipe) {
		this.id_Equipe = id_Equipe;
	}

	public String getNome_Equipe() {
		return nome_Equipe;
	}

	public void setNome_Equipe(String nome_Equipe) {
		this.nome_Equipe = nome_Equipe;
	}

	public GincanaModel getGincana() {
		return gincana;
	}

	public void setGincana(GincanaModel gincana) {
		this.gincana = gincana;
	}

	public CursoModel getCurso() {
		return curso;
	}

	public void setCurso(CursoModel curso) {
		this.curso = curso;
	}

	public UsuarioModel getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}

	public EquipeTelaModel() {
		super();
	}

	public EquipeTelaModel(Integer id_Equipe, String nome_Equipe, GincanaModel gincana, CursoModel curso,
			UsuarioModel usuario) {
		super();
		this.id_Equipe = id_Equipe;
		this.nome_Equipe = nome_Equipe;
		this.gincana = gincana;
		this.curso = curso;
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "EquipeTelaModel [id_Equipe=" + id_Equipe + ", nome_Equipe=" + nome_Equipe + ", gincana=" + gincana
				+ ", curso=" + curso + ", usuario=" + usuario + "]";
	}

}
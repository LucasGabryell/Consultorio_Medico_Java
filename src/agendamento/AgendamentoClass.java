package agendamento;

import Pronturario.ClassProntuarios;

public class AgendamentoClass extends ClassProntuarios{
	
	private int codigo;
	private String data;
	private String crm;
	private String cpf;
	private String status;
	private String horario;
	private String reservahorario;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getReservahorario() {
		return reservahorario;
	}
	public void setReservahorario(String reservahorario) {
		this.reservahorario = reservahorario;
	}
	
	
	
}

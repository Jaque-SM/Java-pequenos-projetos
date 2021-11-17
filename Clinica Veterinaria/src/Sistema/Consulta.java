package Sistema;

import java.util.Date;

public class Consulta {
		
	private Date dataConsulta;
	private String relatoConsulta;
	
	
	public Consulta(Date dataConsulta, String relatoConsulta, Consulta c) {
		
		this.dataConsulta = dataConsulta;
		this.relatoConsulta = relatoConsulta;
	}

	public Consulta() {
		this.dataConsulta = dataConsulta;
		this.relatoConsulta = relatoConsulta;
	}
	public Date getDataConsulta() {
		return dataConsulta;
	}
	public void setDataConsulta(Date dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
	public String getRelatoConsulta() {
		return relatoConsulta;
	}
	public void setRelatoConsulta(String relatoConsulta) {
		this.relatoConsulta = relatoConsulta;
	}
	
	
	
	public int registrarConsulta() {
		Consulta c=new Consulta();
		
		if (c.getRelatoConsulta()!=null) {
			System.out.print("\n OKAY!");
			return 1;
		}
		return 0;
		
		
	}
	public String listarConsulta() {
		Consulta c=new Consulta();
		
		String j="\n"+c.getRelatoConsulta();
		
		return j;
	}
	
	
}

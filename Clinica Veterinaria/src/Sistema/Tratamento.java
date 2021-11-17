package Sistema;

import java.sql.Date;

public class Tratamento {
		
	private Date dataInicialTratamento;
	private Date dataFinalTratamento;
	
	Animal a=new Animal();
	
	public Date getDataInicialTratamento() {
		return dataInicialTratamento;
	}
	public void setDataInicialTratamento(Date dataInicialTratamento) {
		this.dataInicialTratamento = dataInicialTratamento;
	}
	public Date getDataFinalTratamento() {
		return dataFinalTratamento;
	}
	public void setDataFinalTratamento(Date dataFinalTratamento) {
		this.dataFinalTratamento = dataFinalTratamento;
	}
	
	
	public int registrarTratamento() {
		
	 Date d=new Date(12, 04, 2020);
	 	
	 if(d.getDate()!=0&&d.getDate()!=0) {
		d=this.getDataInicialTratamento();
		d=this.getDataFinalTratamento();
		return 11;
	}
	return 0;
	}
	
	public int listarTratamento() {
		
		
		
		
		return 0;
		
		
	}
}

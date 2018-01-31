package br.questor.licenser.model;

import java.sql.Date;


public class EntidadesValidade {
    
    protected int CD_VALIDADE;
    protected int CD_ENTIDADE;
    protected int CD_TIPO_REGISTRO;
    protected String DS_REGISTRO;
    protected Date DT_VALIDADE;

    public EntidadesValidade(){
		this.CD_VALIDADE = 0;
		this.CD_ENTIDADE = 0;
		this.CD_TIPO_REGISTRO = 0;
		this.DS_REGISTRO = "000000000-0";
		this.DT_VALIDADE = null;
	}
	
	public EntidadesValidade(int CD_VALIDADE, int CD_ENTIDADE, int CD_TIPO_REGISTRO, String DS_REGISTRO, Date DT_VALIDADE){
		this.CD_VALIDADE = CD_VALIDADE;
		this.CD_ENTIDADE = CD_ENTIDADE;
		this.CD_TIPO_REGISTRO = CD_TIPO_REGISTRO;
		this.DS_REGISTRO = DS_REGISTRO;
		this.DT_VALIDADE = DT_VALIDADE;
	}
    
    public int getCD_VALIDADE() {
        return CD_VALIDADE;
    }

    public void setCD_VALIDADE(int CD_VALIDADE) {
        this.CD_VALIDADE = CD_VALIDADE;
    }

    public int getCD_ENTIDADE() {
        return CD_ENTIDADE;
    }

    public void setCD_ENTIDADE(int CD_ENTIDADE) {
        this.CD_ENTIDADE = CD_ENTIDADE;
    }

    public int getCD_TIPO_REGISTRO() {
        return CD_TIPO_REGISTRO;
    }

    public void setCD_TIPO_REGISTRO(int CD_TIPO_REGISTRO) {
        this.CD_TIPO_REGISTRO = CD_TIPO_REGISTRO;
    }

    public String getDS_REGISTRO() {
        return DS_REGISTRO;
    }

    public void setDS_REGISTRO(String DS_REGISTRO) {
        this.DS_REGISTRO = DS_REGISTRO;
    }

    public Date getDT_VALIDADE() {
        return DT_VALIDADE;
    }

    public void setDT_VALIDADE(Date DT_VALIDADE) {
        this.DT_VALIDADE = DT_VALIDADE;
    }   
}
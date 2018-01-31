package br.questor.licenser.model;

public class TipoRegistro {
    
    protected int CD_TIPO_REGISTRO;
    protected int CD_ORGAO;
    protected String DS_TIPO_REGISTRO;
    protected String SG_TIPO_REGISTRO;

    public TipoRegistro(){
        this.CD_TIPO_REGISTRO = 0;
        this.CD_ORGAO = 0;
        this.DS_TIPO_REGISTRO = " ";
        this.SG_TIPO_REGISTRO = " ";
    }
    
    public TipoRegistro(int CD_TIPO_REGISTRO, int CD_ORGAO, String DS_TIPO_REGISTRO, String SG_TIPO_REGISTRO) {
        this.CD_TIPO_REGISTRO = CD_TIPO_REGISTRO;
        this.CD_ORGAO = CD_ORGAO;
        this.DS_TIPO_REGISTRO = DS_TIPO_REGISTRO;
        this.SG_TIPO_REGISTRO = SG_TIPO_REGISTRO;
    }

    public int getCD_TIPO_REGISTRO() {
        return CD_TIPO_REGISTRO;
    }

    public void setCD_TIPO_REGISTRO(int CD_TIPO_REGISTRO) {
        this.CD_TIPO_REGISTRO = CD_TIPO_REGISTRO;
    }

    public int getCD_ORGAO() {
        return CD_ORGAO;
    }

    public void setCD_ORGAO(int CD_ORGAO) {
        this.CD_ORGAO = CD_ORGAO;
    }

    public String getDS_TIPO_REGISTRO() {
        return DS_TIPO_REGISTRO;
    }

    public void setDS_TIPO_REGISTRO(String DS_TIPO_REGISTRO) {
        this.DS_TIPO_REGISTRO = DS_TIPO_REGISTRO;
    }

    public String getSG_TIPO_REGISTRO() {
        return SG_TIPO_REGISTRO;
    }

    public void setSG_TIPO_REGISTRO(String SG_TIPO_REGISTRO) {
        this.SG_TIPO_REGISTRO = SG_TIPO_REGISTRO;
    }
}
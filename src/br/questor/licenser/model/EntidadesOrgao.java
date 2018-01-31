package br.questor.licenser.model;

public class EntidadesOrgao {
    
    protected int CD_ORGAO;
    protected String DS_ORGAO;
    protected String SG_ORGAO;

    public EntidadesOrgao(){
        this.CD_ORGAO = 0;
        this.DS_ORGAO = " ";
        this.SG_ORGAO = " ";
    }
    
    public EntidadesOrgao(int CD_ORGAO, String DS_ORGAO, String SG_ORGAO) {
        this.CD_ORGAO = CD_ORGAO;
        this.DS_ORGAO = DS_ORGAO;
        this.SG_ORGAO = SG_ORGAO;
    }

    public int getCD_ORGAO() {
        return CD_ORGAO;
    }

    public void setCD_ORGAO(int CD_ORGAO) {
        this.CD_ORGAO = CD_ORGAO;
    }

    public String getDS_ORGAO() {
        return DS_ORGAO;
    }

    public void setDS_ORGAO(String DS_ORGAO) {
        this.DS_ORGAO = DS_ORGAO;
    }

    public String getSG_ORGAO() {
        return SG_ORGAO;
    }

    public void setSG_ORGAO(String SG_ORGAO) {
        this.SG_ORGAO = SG_ORGAO;
    }
    
    
    
}

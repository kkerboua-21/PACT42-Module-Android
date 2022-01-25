package fr.enst.pact42.sportbox;

public class CasierModel {

    private String typeMaterial;
    private String condition;
    private String localisation;
    private boolean access;

    public CasierModel(String typeMaterial, String condition, String localisation){
        this.typeMaterial=typeMaterial;
        this.condition=condition;
        this.localisation=localisation;
    }
     public String getTypeMaterial(){
        return typeMaterial;
     }

    public String getCondition() {
        return condition;
    }

    public String getLocalisation() {
        return localisation;
    }

    public boolean getAccess() {
        return access;
    }

    public void setAccess(boolean access) {
        this.access = access;
    }
}
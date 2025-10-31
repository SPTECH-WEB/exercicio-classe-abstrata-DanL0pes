package school.sptech;

public abstract class Figura {
    private String cor;
    private Integer espessura;

    abstract public Double calcularArea();

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getEspessura() {
        return espessura;
    }

    public void setEspessura(Integer espessura) {
        this.espessura = espessura;
    }

    @Override
    public  String toString(){
        return cor+", "+espessura+", "+this.calcularArea();
    }
}

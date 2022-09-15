public class Aresta {
    private Integer vIn, vOut;
    private String empresas;

    public Aresta(int vIn, int vOut, String empresas) {
        this.vIn = vIn;
        this.vOut = vOut;
        this.empresas = empresas;
    }

    public int getvIn() {
        return vIn;
    }

    public void setvIn(int vIn) {
        this.vIn = vIn;
    }

    public int getvOut() {
        return vOut;
    }

    public void setvOut(int vOut) {
        this.vOut = vOut;
    }

    public String getEmpresas() {
        return empresas;
    }

    public void setEmpresas(String empresas) {
        this.empresas = empresas;
    }
}

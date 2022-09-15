class Aresta {
    private int vIn, vOut, peso;

    public Aresta(int peso, int vIn, int vOut) {
        this.peso = peso;
        this.vIn = vIn;
        this.vOut = vOut;
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

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
public class CreditoCorporativo {
    private String id;
    private double montoPrestado;
    private double saldoPendiente;
    private double tasaInteres;
    private boolean esRiesgoso;
    

    public CreditoCorporativo(String id, double montoPrestado, double saldoPendiente,double tasaInteres, boolean esRiesgoso) {
        this.id = id;
        this.montoPrestado = montoPrestado;
        this.saldoPendiente = saldoPendiente;
        this.tasaInteres = tasaInteres;
        this.esRiesgoso = esRiesgoso;
    }

    public String getid() {
        return id;
    }

    public double getmontoPrestado() {
        return montoPrestado;
    }

    public double getsaldoPendiente() {
        return saldoPendiente;
    }

    public double gettasaInteres() {
        return tasaInteres;
    }

    public boolean getesRiesgoso() {
        return esRiesgoso;
    }
}


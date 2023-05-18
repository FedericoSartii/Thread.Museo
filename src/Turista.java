public class Turista extends Thread{
    private Museo m;

    public Turista(String name, Museo m) {
        super(name);
        this.m = m;
    }
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName() + " sta arrivando al museo");
        m.entraNelMuseo();
        try
        {
            Thread.sleep(3000);
        }
        catch(Exception e){}
        m.esceDalMuseo();
    }
}








































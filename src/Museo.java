public class Museo {
    private static int numeroMaxOspiti = 5;
    private int numeroOspitiDentro = 0;
    public Museo() {}

    public synchronized void entraNelMuseo()
    {
        while(numeroOspitiDentro == numeroMaxOspiti)
        {
            try
            {
                System.out.println(Thread.currentThread().getName() + " attende il suo turno");
                wait();
            }catch(Exception e){}
        }
        System.out.println(Thread.currentThread().getName() + " entra nel museo e sta ammirando la Gioconda");
        numeroOspitiDentro ++;
    }
    
    public synchronized void esceDalMuseo()
    {
        System.out.println(Thread.currentThread().getName() + " sta uscendo dal museo");
        numeroOspitiDentro--;
        notifyAll();
    }

}






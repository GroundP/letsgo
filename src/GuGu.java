public class GuGu {
    void dan(int n)
    {
        for ( int i = 1; i < 10; i++)
            System.out.println(n*i);
    }

    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run();
    }
}

class Runner{
    void run()
    {
        GuGu gugu = new GuGu();
        gugu.dan(7);
    }
}




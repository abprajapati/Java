
    public class ReverseThread extends Thread{
        public int sum;
        public ReverseThread(int sum) {
            this.sum = sum;
        }

        public void run() {
            int i = 50;
            if (sum < i) {
                threadCreation(sum+1);
            }
            System.out.println("Hello from Thread! " + sum);
        }

        public void threadCreation(int sum)
        {
            ReverseThread record = new ReverseThread(sum);
            record.start();
            try {
                record.join();
            } catch (InterruptedException error)
            {
                error.printStackTrace();
            }
        }

    public static void main(String[] args) {
        ReverseThread record = new ReverseThread(1);
        record.start();
    }

}
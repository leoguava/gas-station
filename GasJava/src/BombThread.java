public class BombThread extends Thread {

    double total = 0;
    int counter;

    Bomb bomb;

    public BombThread(int counter, Bomb bomb) {
        this.counter = counter;
        this.bomb = bomb;
    }

    public void run() {
        String currentThread = Thread.currentThread().getName();
        int bombNumber = Integer.parseInt(currentThread.replace("Thread-", "")) + 1;
        try {

            for (int i = 0; i < bomb.cars.size(); i++) {
                bomb.fuel(bomb.cars.get(i));
                total += bomb.price;
                System.out.println(bomb.cars.get(i).brand + " parked on bomb "+bombNumber+" and now it's fill up");
                Thread.sleep(counter);
                bomb.out();

            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {

            System.out.println("The " + bombNumber + "º bomb made $: " + total);
        }
    }

}

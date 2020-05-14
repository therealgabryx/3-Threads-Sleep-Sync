class MyThread extends Thread {
    private int seed;
    private String name;
    // private int count;
    
    public MyThread(int seed, String name) {
      this.seed = seed;
      this.name = name;
    }
    
    @Override
    public void run() {
      for(int i = 0; i < 15; i++) {
        System.out.println(name + " " + seed++);
      }
    }
}
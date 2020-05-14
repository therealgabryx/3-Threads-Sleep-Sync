import java.util.Scanner;

class Nipotino implements Runnable {
  private String name;
  private int count;

  public Nipotino(String name, int count) {
    this.name = name;
    this.count = count;
  }

  public void run() {
    for (int i = 1; i <= count; i++) {
      System.out.println("[" + i + "] chiamata per " + name);
      try {
        Thread.sleep(600);
      } catch (InterruptedException e) {
        System.out.println("");
      }
    }
  }
}

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("\nQuante volte chiamare i nipotini? ");
    int n = sc.nextInt();
    System.out.print("\nOggi si mangia la pizza? (y/n): ");
    char eatingPizza = sc.next().charAt(0);
    if (eatingPizza == 'y' || eatingPizza == 'Y') {
      n = n - 1;
    }
    System.out.print("\n");
    new Thread(new Nipotino("QUI", n)).start();
    new Thread(new Nipotino("QUO", n)).start();
    new Thread(new Nipotino("QUA", n)).start();
  }
}
public class Main {

    public static void main(String[] args) {
        System.out.println("Inicializando metodo main");
        a();
        System.out.println("Finalizando metodo main");
    }

    public static void a() {
        System.out.println("Inicializando metodo a");
        b();
        System.out.println("Finalizando metodo a");
    }

    public static void b() {
        System.out.println("Inicializando metodo b");
        for(int i= 1; i < 4; i++) System.out.println(i);
        c();
        System.out.println("Finalizando metodo b");
    }

    public static void c() {
        System.out.println("Inicializando metodo c");
        // Thread.dumpStack();
        System.out.println("Finalizando metodo c");
    }

}
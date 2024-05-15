import candidatura.ProcessoSeletivo;
import contador.Contador;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo seletivo");

        ProcessoSeletivo.main(args);

        System.out.println("Contador");
        Contador.main(args);
    }
}

package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        // analisarCandidato(1999.0);
        // analisarCandidato(2000.0);
        // analisarCandidato(2200.0);
        // selecionarCandidatosComBaseNoSalario();
        // imprimirSelecionados();
        contatarCandidatos();
    }

    static void analisarCandidato(double expectativaSalarial){
        double salarioBase = 2000.00;
        if (salarioBase > expectativaSalarial) System.out.println("Ligar para o candidato");
        else if (salarioBase == expectativaSalarial) System.out.println("Ligar para o candidato com contra proposta");
        else System.out.println("Aguardando resultados dos demais candidatos");

    }

    static void selecionarCandidatosComBaseNoSalario(){
        String[] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        int candidatosSelecionados = 0;

        double salarioBase = 2000.00;

        for(int i = 0; candidatosSelecionados < 5 && i < candidatos.length; i++){
            String candidato = candidatos[i];
            double pretencaoSalarial = valorPretendido();

            System.out.println("O candidado " + candidato + " tem uma pretenção salarial de " + pretencaoSalarial);
            if(salarioBase >= pretencaoSalarial) {
                System.out.println("Candidato selecionado");
                candidatosSelecionados++;
            }
        }
    }

    static void imprimirSelecionados() {
        String[] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        for (int i=0; i < candidatos.length; i++) {
            System.out.println("Candidato nº" + (i + 1) + ": " + candidatos[i]);
        }
    }

    static void contatarCandidatos(){
        String[] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        for(String candidato: candidatos){
            ligarParaCandidato(candidato);
        }
    }

    static void ligarParaCandidato(String candidato){
        int tentativasRealizadas = 1;
        boolean deveriaContinuar = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            tentativasRealizadas++;
            deveriaContinuar = atendeu || tentativasRealizadas > 3 ? false : true;

        } while( deveriaContinuar && tentativasRealizadas <= 3);

        if (atendeu) System.out.println("Candidado " + candidato + " atendeu");
        else System.out.println("Candidado " + candidato + " não atendeu. Nº de tentativas " + (tentativasRealizadas - 1));
    }

    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

    private static double valorPretendido() {
     return ThreadLocalRandom.current().nextDouble(1800, 2200);
}
}

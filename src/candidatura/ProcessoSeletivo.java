package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        // analisarCandidato(1999.0);
        // analisarCandidato(2000.0);
        // analisarCandidato(2200.0);
        // selecionarCandidatosComBaseNoSalario();
        imprimirSelecionados();
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

    static double valorPretendido() {
     return ThreadLocalRandom.current().nextDouble(1800, 2200);
}
}

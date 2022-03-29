package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String entrada = "";
        TreeSet<Double> vetorInicial = new TreeSet<Double>();
        Double[] vetorSaida;

        boolean continua = false;
        while (continua == false){
            System.out.print("Entre com um número ou E para encerrar: ");
            entrada = sc.nextLine();
            if(entrada.equals("E")){
                vetorSaida = arrumaVetor(vetorInicial);
                for (Double x: vetorSaida) {
                    System.out.print(x + " ");
                }
                continua = true;
            }
            else{
                try{
                    double numeroEntrada = Double.parseDouble(entrada);
                    if(vetorInicial.contains(numeroEntrada)){
                        System.out.println("O número informado não pode ser repetido");
                    }else{
                        vetorInicial.add(numeroEntrada);
                    }
                }catch(Exception e){
                    System.out.println("Não foi entrado com um valor valido.");
                }
            }
        }
    }


    public static Double[] arrumaVetor(TreeSet lista){
        Double[] vetor = new Double[lista.size()];
        vetor = (Double[]) lista.toArray(vetor);
        return vetor;
    }

}

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LerSaidaPing extends Thread{
    private String servidor;
    private String nomeServidor;


    public LerSaidaPing(String site){
        this.servidor = site;
    }

    @Override
    public void run() {
        //verificando nome do servidor
        if(servidor.toLowerCase().contains("uol")){
            nomeServidor="UOL";
        } else if (servidor.toLowerCase().contains("google")) {
            nomeServidor="Google";
        }else if (servidor.toLowerCase().contains("terra")) {
            nomeServidor="Terra";
        }else{
            System.out.println("Não sei o nome desse servidor");
        }
        //verificando tempo medio obtido pela operação
        try{
            if (System.getProperty("os.name").toLowerCase().contains("linux")) {
                Process processo = Runtime.getRuntime().exec("ping -4 -c 10 "+servidor);// Executa o comando ping
                BufferedReader leitor = new BufferedReader(new InputStreamReader(processo.getInputStream()));// Lê a saída do comando
                String linha;
                while((linha = leitor.readLine()) != null){
                    if(linha.contains("/avg/")){
                        String[] linhaComMedia = linha.split("=");
                        String[] media = linhaComMedia[1].split("/");
                        System.out.println("Nome do servidor: "+nomeServidor+"\nMédia = "+media[1].trim()+" ms");
                    }
                }
                processo.waitFor();// função para esperar o processo do ping acabar
                leitor.close();
            } else {
                System.out.println("O Sistema Operacional precisa ser Linux.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

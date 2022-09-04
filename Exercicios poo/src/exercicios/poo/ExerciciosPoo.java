package exercicios.poo;
import java.util.Scanner;
/*import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;*/
import java.text.ParseException;

public class ExerciciosPoo {
    
    public static void main(String[] args) throws ParseException{
        
        Scanner Leitor = new Scanner(System.in);
        
        // poo 1

        /*Pessoa usuario = new Pessoa("", 0, 0f);
        System.out.println("Insira seu nome");
        usuario.setNome(Leitor.nextLine());
        System.out.println("Insira o seu ano de nascimento");
        usuario.setDob(Leitor.nextInt());
        System.out.println("Insira sua altura (m, cm)");
        usuario.setAltura(Leitor.nextDouble());     
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Altura: " + usuario.getAltura());*/
        
        // poo 2
        
        /*int opcao = 0;
        ContaCorrente cliente = new ContaCorrente(0, "", "", 0f, 0f ,0f);
        System.out.println("Insira o número da sua conta");
        cliente.setNumeroConta(Leitor.nextInt());
        System.out.println("Insira seu nome");
        cliente.setNome(Leitor.next());
        while(opcao < 5){
            System.out.println("");
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Alterar nome");
            System.out.println("2 - Consultar dados");
            System.out.println("3 - Deposito");
            System.out.println("4 - Saque");
            System.out.println("5 - Sair");
            System.out.println("");
            opcao = Leitor.nextInt();
            switch (opcao) {
                case 1 :
                    System.out.println("Atualize o seu nome");
                    cliente.setNome(Leitor.next());
                    System.out.println("Seu nome foi atualizado com êxito");
                    break;
                case 2 :
                    cliente.mostrarDados();
                    break;
                case 3 :
                    System.out.println("Insira o valor do depósito");
                    cliente.setDeposito(Leitor.nextFloat());
                    cliente.deposito();
                    break;
                case 4 :
                    System.out.println("Insira o valor do saque");
                    cliente.setRetirada(Leitor.nextFloat());
                    cliente.saque();
                    break;
                default :
                    System.out.println("Obrigado por utilizar nossos serviços");
            }
        }*/
        
        // poo 3 
        
        /*int i = 0;
        int j;
        BombaCombustivel servico = new BombaCombustivel("", 0, 0, 0, 0, 0);
        while(i != 2){
            System.out.println("");
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Alterar Combustivel");
            System.out.println("2 - Sair");
            System.out.println("");
            i = Leitor.nextInt();
            if(i == 1){
                System.out.println("Selecione o combustivel");
                System.out.println("1 - alcool");
                System.out.println("2 - gasolina");
                System.out.println("3 - diesel");
                System.out.println("");
                servico.setC(Leitor.nextInt());
                servico.alterarCombustivel();
               
                System.out.println("O que deseja fazer?");
                System.out.println("1 - Abastecer por valor");
                System.out.println("2 - Abastecer por litro");
                System.out.println("3 - Alterar valor");
                System.out.println("4 - Alterar quantidade");
                System.out.println("");
            } 
            j = Leitor.nextInt();
            switch(j) {
                case 1 : 
                    System.out.println("Selecione o valor");
                    servico.setAbastecerValor(Leitor.nextDouble());
                    servico.abastecerValor();
                    break;
                case 2 : 
                    System.out.println("Selecione a quantidade");
                    servico.setAbastecerPorLitro(Leitor.nextDouble());
                    servico.abastecerPorLitro();
                    break;
                case 3 : 
                    System.out.println("Insira o novo valor");
                    servico.setValorLitro(Leitor.nextDouble());
                    servico.alterarValorCombustivel();
                    break;
                case 4 :
                    System.out.println("Insira a nova quantidade");
                    servico.setQtdCombustivel(Leitor.nextDouble());
                    servico.alterarQtdCombustivel();
                    break;
                default:
            }
        }*/
        
        // poo 4
        
        /*int i = 0;
        Elevador servico = new Elevador(0, 0, 0, 0);
        System.out.println("quantos andares tem o prédio?");
        servico.setTotalAndares(Leitor.nextInt());
        System.out.println("qual a capacidade do elevador?");
        servico.setElevadorCapacidade(Leitor.nextInt());
        System.out.println("O que deseja fazer?");
        System.out.println("1 - inicializar");
        System.out.println("2 - sair do elevador");
        int opcao = Leitor.nextInt();
        if(opcao == 1){
            System.out.println("");
            System.out.println("Você está no térreo");
            while(i <= 4){
                System.out.println("");
                System.out.println("Qual a próxima ação?");
                System.out.println("1 - sobe");
                System.out.println("2 - desce");
                System.out.println("3 - embarcar passoas");
                System.out.println("4 - desembarcar pessoas");
                System.out.println("5 - sair do elevador");
                System.out.println("");
                i = Leitor.nextInt();
                switch (i) {
                    case 1:
                        System.out.println("Quantos andares?");
                        servico.setAndar(Leitor.nextInt());
                        servico.sobe();
                        break;
                    case 2:
                        System.out.println("Quantos andares?");
                        servico.setAndar(Leitor.nextInt());
                        servico.desce();
                        break;
                    case 3:
                        System.out.println("Quantas pessoas?");
                        servico.setPessoas(Leitor.nextInt());
                        servico.entra();
                        break;
                    case 4:
                        System.out.println("Quantas pessoas?");
                        servico.setPessoas(Leitor.nextInt());
                        servico.sai();
                        break;
                    default:
                        System.out.println("Você deixou o elevador");
                        break;
                }
            }
        } else{
            System.out.println("Você deixou o elevador");
        }*/
       
        // poo 5
        
        /*Disciplina aluno = new Disciplina("" , 0, 0, 0);
        System.out.println("Insira seu nome");
        aluno.setNome(Leitor.nextLine());
        System.out.println("Insira a nota da sua primeira prova");
        aluno.setP1(Leitor.nextDouble());
        System.out.println("Insira a nota da sua segunda prova");
        aluno.setP2(Leitor.nextDouble());
        System.out.println("Insira a nota do seu trabalho");
        aluno.setTrabalho(Leitor.nextDouble());
        int i = 0;
        while(i < 3){
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Visualizar média");
            System.out.println("2 - Visualizar situação para a última prova");
            System.out.println("3 - Sair");
            i = Leitor.nextInt();
            switch (i) {
                case 1:
                    aluno.verMedia();
                    break;
                case 2:
                    aluno.provaFinal();
                    break;
                default:
                    break;
            }
        }*/
        
        // poo 6
        
        /*Invoice produto = new Invoice( 1234, "Teclado", 10, 25);
        produto.getInvoiceAmount();*/
        
        // poo 7
        
        /*Funcionario servicosGerais = new Funcionario("João", "Silva", 1212);
        Funcionario secretario = new Funcionario("Maria", "Cardoso", 2000);
        servicosGerais.salarioAnual();
        servicosGerais.aumento();
        secretario.salarioAnual();
        secretario.aumento();*/
        
        // poo 8
        
        /*Data inserirData = new Data(01, 01, 2001);
        System.out.println("Insira o dia");
        inserirData.setDia(Leitor.nextInt());
        System.out.println("Insira o mês");
        inserirData.setMes(Leitor.nextInt());
        System.out.println("Insira o ano");
        inserirData.setAno(Leitor.nextInt());
        inserirData.compararData();
        inserirData.mostrarDia();
        inserirData.mostrarMes();  
        inserirData.mostrarAno();
        inserirData.mostrarMesExtenso();
        inserirData.isBissexto();
        Data cloneData = new Data(inserirData.getDia(), inserirData.getMes(), inserirData.getAno());
        cloneData.criarClone();*/

        // poo 9
        
        /*Escreva uma classe em que cada objeto representa um Voo que acontece em determinada data e em 
        determinado horário. Cada vôo possui no máximo 100 passageiros, e a classe permite controlar a 
        ocupação das vagas. A classe deve ter os seguintes métodos:
        a. Construtor: configura os dados do vôo (recebidos como parâmetro): número do vôo, data (para 
        armazenar a data utilize um objeto da classe Data, criada na questão anterior);
        b. ProximoLivre: retorna o número da próxima cadeira livre
        c. Verifica: verifica se o número da cadeira recebido como parâmetro está ocupada
        d. Ocupa: ocupa determinada cadeira do vôo, cujo número é recebido como parâmetro, e retorna 
        verdadeiro se a cadeira ainda não estiver ocupada (operação foi bem sucedida) e falso caso 
        contrário
        e. Vagas: retorna o número de cadeiras vagas disponíveis (não ocupadas) no vôo
        f. GetVoo: retorna o número do vôo*/
        
        // poo 10

        /*Crie uma classe para representar um jogador de futebol, com os atributos:
        a. nome;
        b. posição;
        c. data de nascimento;
        d. nacionalidade;
        e. altura;
        f. peso;
        Crie os métodos públicos necessários para getters e setters e também um método para imprimir todos os 
        dados do jogador. Crie um método para calcular a idade do jogador e outro método para mostrar quanto 
        tempo falta para o jogador se aposentar. Para isso, considere que os jogadores da posição de defesa se 
        aposentam em média aos 40 anos, os jogadores de meio-campo aos 38 e os atacantes aos 35.*/
        
        // poo 11
        
        /*Ingresso ingressoVip = new Ingresso(0);
        System.out.println("Insira o valor do ingresso");
        ingressoVip.setValor(Leitor.nextDouble());
        ingressoVip.exibirInfo();
        ingressoVip.exibirValorVip();*/
        
        // poo 12
        
        /*Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as seguintes 
        operações:
        a. void armazenarPessoa(String nome, int idade, float altura); //armazena a pessoa em um array
        b. void removerPessoa(String nome); //remove a pessoa do array
        c. int buscarPessoa(String nome); // informa em que posição da agenda está a pessoa
        d. void imprimirAgenda(); // imprime os dados de todas as pessoas da agenda
        e. void imprimirPessoa(int index); // imprime os dados da pessoa que está na posição “i” da agenda*/
        
        // poo 13
        
        /*Crie uma classe Calculadora. Esta classe deve implementar as operações básicas (soma, subtração, divisão 
        e multiplicação). Utilizando o conceito de herança crie uma classe chamada calculadora cientifica que 
        implementa os seguintes cálculos: raizQuadrada e a potencia. Dica utilize a classe Math do pacote 
        java.lang.*/
        
        // poo 14
        
        /*Fatura fatura = new Fatura("12345", "Mouse", 10, 53);
        fatura.getTotalFatura();
        fatura.faturaTeste();*/
        
        // poo 15
        
        /*int i = 0;
        FuncionarioTeste funcionario = new FuncionarioTeste("", "", 0);
        while (i < 2){
            System.out.println("Insira seu nome");
            funcionario.setNome(Leitor.next());
            System.out.println("Insira seu sobrenome");
            funcionario.setSobrenome(Leitor.next());
            System.out.println("Insira seu salario");
            funcionario.setSalario(Leitor.nextDouble());
            funcionario.aumento();
            i++;
        }
        System.out.println(i + " funcionários passaram pela empresa");*/
        
        // poo 16
        
        /*Carro carro1 = new Carro(0, 0);
        Carro carro2 = new Carro(0, 0);
        System.out.println("Abasteça X no carro 1");
        carro1.setVolumeTotal(Leitor.nextFloat());
        carro1.abastecer();
        System.out.println("Viaje X no carro 1");
        carro1.setDistancia(Leitor.nextFloat());
        carro1.viajar();
        carro1.mostrarStats();
        System.out.println("Abasteça X no carro 2");
        carro2.setVolumeTotal(Leitor.nextFloat());
        carro2.abastecer();
        System.out.println("Viaje X no carro 2");
        carro2.setDistancia(Leitor.nextFloat());
        carro2.viajar();
        carro2.mostrarStats();*/
        
        // poo 17
        
        /*17. O agendamento de compromissos é uma das tarefas mais comuns para profissionais. Um sistema com essa 
        finalidade deve ser capaz de gerenciar compromissos, atribuindo a cada um o seu tipo (reunião, pagamento, 
        entrega de projeto); data; nome do participante ( pessoa, empresa etc) alguém com quem acontecerá é o 
        compromisso) e seu telefone. Desenvolva um sistema que seja capaz de fazer operações básicas como 
        agendar, remover e alterar compromissos e exibir compromissos por participante e por data*/
        
        // A fazer: 09, 10, 12, 13 e 17
    }   
}


import java.util.Stack;


// import javax.swing.JLabel;
// import javax.swing.JOptionPane;
// import javax.swing.JPanel;
// import javax.swing.JTextField;

public class Main{
    public static void main(String[] args) {
        // System.out.println("--- Animal ---");
        // Animal cao = new Animal();
        // cao.setNome("Filo");
        // cao.setEspecie("Tiranossauro");
        // cao.setIdade(251);
        // cao.setSexo("Macho");
        // System.out.println(cao);

        // System.out.println("--- Cliente ---");
        // Cliente cliente = new Cliente();
        // cliente.setNome("Airo");
        // cliente.setEmail("email.com");
        // cliente.setTelefone(2345678);
        // cliente.setEndereco("Rua do lado, 53");
        // System.out.println(cliente.getNome());
        
        // System.out.println("---Estoque---");
        // Estoque estoque = new Estoque();
        // estoque.setQuantidade(5);        
        // System.out.println(estoque.getQuantidade());

        // System.out.println("---Fornecedor---");
        // Fornecedor fornecedor = new Fornecedor();
        // fornecedor.setCnpj(87654313);
        // fornecedor.setRazaoSocial("Irmãos Codinhos LTDA");
        // fornecedor.setNomeFantasia("Codigoli Codigola");
        // System.out.println(fornecedor.getRazaoSocial());

        // System.out.println("---Funcionario---");
        // Funcionario funcionario = new Funcionario();
        // funcionario.setNome("Jeremias");
        // funcionario.setCpf(578987456);
        // funcionario.setCargo("Detetive Espiritual");
        // funcionario.setSalario(2547.87);
        // System.out.println("Nome do Funcionário: "+funcionario.getNome() +
        // " - Cargo: "+funcionario.getSalario());

        // System.out.println("---Item---");
        // Item item = new Item();
        // item.setNome("Cola PVA");
        // item.setPreco(5.90);
        // item.setTipo("Material Escritório");
        // item.setDataCompra("15/07/2025");
        // System.out.println(item.getNome());

        // System.out.println("---Produto---");
        // Produto produto = new Produto();
        // produto.setNomeProduto("XPTO");
        // produto.setCodigoBarra(5784521);
        // produto.setDataCompra("06/06/2016");
        // produto.setValidade("validade");
        // produto.setUnidade(1);
        // System.out.println(produto.getNomeProduto());

        // System.out.println("---Serviço---");
        // Servico servico = new Servico();
        // servico.setNomeServico("Banho e Tosa");
        // servico.setTempoEmMinutos(45);
        // servico.setTipoServico("Higiene");
        // servico.setValorServico(35.50);
        // System.out.println(servico.getNomeServico() + " - Valor: " + servico.getValorServico());
        // JOptionPane.showMessageDialog(null, cao);
        // System.out.println("---");
        
        // String option = JOptionPane.showInputDialog(null,"Digite sua opcao",JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null, option, "mensagem",JOptionPane.OK_OPTION);
        // int opcao = Integer.parseInt(option);
        // switch(opcao){
        //     case 1:
        //         String nome = JOptionPane.showInputDialog(null,"Diga um nome para o nome :P","texto texto",JOptionPane.QUESTION_MESSAGE);
        //         JOptionPane.showMessageDialog(null,"voce quis dizer... "+nome);

        //         JPanel panel = new JPanel();
        //         JTextField endereco = new JTextField(15);
        //         JTextField bairro = new JTextField(15);
        //         JTextField cidade = new JTextField(15);
        //         JTextField estado = new JTextField(15);
        //         panel.add(new JLabel("Endereco:"));
        //         panel.add(endereco);
        //         panel.add(new JLabel("Bairro:"));
        //         panel.add(bairro);
        //         panel.add(new JLabel("Cidade:"));
        //         panel.add(cidade);
        //         panel.add(new JLabel("Estado:"));
        //         panel.add(estado);
                
        //         int result = JOptionPane.showConfirmDialog(null, panel, "Please Enter Your Info", JOptionPane.OK_CANCEL_OPTION);
        //         if (result == JOptionPane.OK_OPTION) {
        //         String adress = endereco.getText();
        //         String bairronovo = bairro.getText();
        //         String emaildoex = cidade.getText();
        //         String state = estado.getText();
        //         JOptionPane.showMessageDialog(null, "Name: " + adress + "\nAge: " + bairronovo + "\nEmail: " + emaildoex + "\nState: " + state);
        //         }
        //         break;
        //     case 2:
        //         JPanel novopainel = new JPanel();
        //         JTextField idade = new JTextField(15);
        //         JTextField numero = new JTextField(15);
        //         JTextField cep = new JTextField(15);
        //         JTextField genero = new JTextField(15);
        //         JTextField complemento = new JTextField(15);
        //         novopainel.add(new JLabel("Idade:"));
        //         novopainel.add(idade);
        //         novopainel.add(new JLabel("Numero:"));
        //         novopainel.add(numero);
        //         novopainel.add(new JLabel("Cep:"));
        //         novopainel.add(cep);
        //         novopainel.add(new JLabel("Genero:"));
        //         novopainel.add(genero);
        //         novopainel.add(new JLabel("Complemento:"));
        //         novopainel.add(complemento);
                
        //         int resultado = JOptionPane.showConfirmDialog(null, novopainel, "Preencha seus dados", JOptionPane.OK_CANCEL_OPTION);
        //         if (resultado == JOptionPane.OK_OPTION) {
        //         int idadex = Integer.parseInt(idade.getText());
        //         int numerox = Integer.parseInt(numero.getText());
        //         int cepx = Integer.parseInt(cep.getText());
        //         String generox = genero.getText();
        //         int complementox = Integer.parseInt(complemento.getText());
        //         JOptionPane.showMessageDialog(null, "Idade: " + idadex + "\nNumero: " + numerox + "\nCep: " + cepx + "\nGenero: " + generox + "\nComplemento: " + complementox);
        //         }   
        //         break;
        //     case 3:
        //         JPanel alunoPanel = new JPanel();
        //         JTextField nomeAluno = new JTextField(15);
        //         JTextField nota1 = new JTextField(15);
        //         JTextField nota2 = new JTextField(15);
        //         JTextField nota3 = new JTextField(15);
        //         alunoPanel.add(new JLabel("Nome do Aluno"));
        //         alunoPanel.add(nomeAluno);
        //         alunoPanel.add(new JLabel("Nota 1"));
        //         alunoPanel.add(nota1);
        //         alunoPanel.add(new JLabel("Nota 2"));
        //         alunoPanel.add(nota2);
        //         alunoPanel.add(new JLabel("Nota 3"));
        //         alunoPanel.add(nota3);
        //         int media = 0;
        //         int verificaResultado = JOptionPane.showConfirmDialog(null, alunoPanel, "Preencha seus dados", JOptionPane.OK_CANCEL_OPTION);
        //         if (verificaResultado == JOptionPane.OK_OPTION) {  
        //             String nomeDoAluno = nomeAluno.getText();
        //             int nota1x = Integer.parseInt(nota1.getText());
        //             int nota2x = Integer.parseInt(nota2.getText());
        //             int nota3x = Integer.parseInt(nota3.getText());
        //             media = (nota1x + nota2x + nota3x) / 3;
        //         }
        //         if(media >= 7){
        //             JOptionPane.showMessageDialog(null, "Aprovado! Nota: " + media);
        //         }else{
        //             JOptionPane.showMessageDialog(null, "Reprovado! Nota: " + media);
        //         }
        //         break;
        //     case 4:
        //         JPanel pessoa = new JPanel(new GridLayout(0,6,5,5));
        //         JTextField nomePessoa = new JTextField(15);
        //         JTextField produto1 = new JTextField(15);
        //         JTextField preco1 = new JTextField(15);
        //         JTextField quantidade1 = new JTextField(15);
        //         JTextField produto2 = new JTextField(15);
        //         JTextField preco2 = new JTextField(15);
        //         JTextField quantidade2 = new JTextField(15);
        //         JTextField produto3 = new JTextField(15);
        //         JTextField preco3 = new JTextField(15);
        //         JTextField quantidade3 = new JTextField(15);
        //         pessoa.add(new JLabel("Nome da Pessoa"));
        //         pessoa.add(nomePessoa);
        //         pessoa.add(new JLabel());
        //         pessoa.add(new JLabel());
        //         pessoa.add(new JLabel());        
        //         pessoa.add(new JLabel());   
        //         pessoa.add(new JLabel("\nProduto 1"));
        //         pessoa.add(produto1);
        //         pessoa.add(new JLabel("Preço 1"));
        //         pessoa.add(preco1);
        //         pessoa.add(new JLabel("Quantidade 1"));
        //         pessoa.add(quantidade1);
        //         pessoa.add(new JLabel("Produto 2"));
        //         pessoa.add(produto2);
        //         pessoa.add(new JLabel("Preço 2"));
        //         pessoa.add(preco2);
        //         pessoa.add(new JLabel("Quantidade 2"));
        //         pessoa.add(quantidade2);
        //         pessoa.add(new JLabel("Produto 3"));
        //         pessoa.add(produto3);
        //         pessoa.add(new JLabel("Preço 3"));
        //         pessoa.add(preco3);
        //         pessoa.add(new JLabel("Quantidade 3"));
        //         pessoa.add(quantidade3);
        //         String nomeDaPessoa = nomePessoa.getText();
        //         String produto1x = produto1.getText(); 
        //         int preco1x = Integer.parseInt(preco1.getText());
        //         int quantidade1x = Integer.parseInt(quantidade1.getText());
        //         String produto2x = produto2.getText();
        //         int preco2x = Integer.parseInt(preco2.getText());
        //         int quantidade2x = Integer.parseInt(quantidade2.getText());
        //         String produto3x = produto3.getText();
        //         int preco3x = Integer.parseInt(preco3.getText());
        //         int quantidade3x = Integer.parseInt(quantidade3.getText());
        //         int valor1 = preco1x * quantidade1x;
        //         int valor2 = preco2x * quantidade2x;
        //         int valor3 = preco3x * quantidade3x;
        //         int totalDaSoma = valor1+valor2+valor3;
        //         JOptionPane.showMessageDialog(null,"A compra " + (totalDaSoma <=100?"tem frete gratis":"tem frete"));
        //         break;
        //     case 5:
        //         String novaOpcao = "";
        //         novaOpcao = JOptionPane.showInputDialog(null,"Digite sua opcao",JOptionPane.QUESTION_MESSAGE);
        //         JOptionPane.showMessageDialog(null, novaOpcao, "mensagem",JOptionPane.OK_OPTION);
        //         int opcaoDoSwitch = Integer.parseInt(novaOpcao);
        //         String nomeDoCliente = "";
        //         String emailDoCliente = "";
        //         String telefoneDoCliente = "";
        //         String cadastroProduto = "";
        //         int valorDoProduto = 0;
        //         int quantidadeDoProduto = 0;
        //         while(opcaoDoSwitch != 0){
                    
        //             switch(opcaoDoSwitch){
        //                 case 1:
        //                     nomeDoCliente = JOptionPane.showInputDialog("nome do cliente: ");
        //                     emailDoCliente = JOptionPane.showInputDialog("email do cliente: ");
        //                     telefoneDoCliente = JOptionPane.showInputDialog("telefone do cliente: ");
        //                     break;
        //                 case 2:
        //                     cadastroProduto = JOptionPane.showInputDialog("Nome do Produto: ");
        //                     valorDoProduto = Integer.parseInt(JOptionPane.showInputDialog("Valor do Produto: "));
        //                     quantidadeDoProduto = Integer.parseInt(JOptionPane.showInputDialog("Quantidade do Produto: "));
        //                     break;
        //                 case 3:
        //                     JOptionPane.showMessageDialog(null,"Venda Realizada! "+ nomeDoCliente + " - Comprou " + cadastroProduto + " - E a conta deu: " +(valorDoProduto*quantidadeDoProduto));
        //                     break;
        //                 default:
        //                     JOptionPane.showMessageDialog(null," adios pampa mia ");
        //                     break;
        //             }
        //             opcaoDoSwitch = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite sua opcao",JOptionPane.QUESTION_MESSAGE));
        //         }
                
                
                
                

        //     default:
        //         JOptionPane.showMessageDialog(null, "Fechou amigão!");
        //         break;
        // }    
        // int nota1x = 7,nota2x = 6,nota3x =8;
        // int mediaDoAluno = (nota1x + nota2x + nota3x) / 3;
        
        // if(mediaDoAluno >= 7){
        //     System.out.println("Aprovado!");
        // }else{
        //     System.out.println("Reprovado!");
        // }
        // System.out.println(mediaDoAluno>=7?"Aprovado!":"Reprovado!");
        // int numeroIsoA = 7;
        // int numeroIsoB = 8;
        // int perimetro = (2 * numeroIsoA)+numeroIsoB;
        // System.out.println("resultado do perimetro: "+perimetro);
        // int numeroDoWhile = 10;
        // while(numeroDoWhile >0){
        //     System.out.println(numeroDoWhile);
        //     numeroDoWhile--;
        // }
        // // Números primos;
        // for (int i = 2; i <=50;i++){
            
        //     int cont = 0;          

        //         for(int j = 1;j<=i;j++){
        //             if( i % j == 0){
        //                 cont++;
        //             }
        //         }
        //         if(cont ==2){
        //             System.out.println("numero primo: " +i);
        //         }
        // }

    //numeros divisiveis por 2 e 3
    // for (int num = 0;num<100;num++){
    //     if(num%2 == 0 && num%3 == 0){
    //         System.out.println(" Numero: "+num);
    //     }
    // }
    //impares
    // for(int impar = 0;impar < 200;impar++){
    //     if(impar % 2 == 1){
    //         System.out.println("impar: "+impar);
    //     }
    // }
    //numeros entre 102 e -102
    // for(int num = 102;num > -102;num-- ){
    //     if(num > 0){
    //         System.out.println("numero positivo: "+num);
    //     }else if(num < 0){
    //         System.out.println("numero negativo: "+num);
    //     }else{
    //         System.out.println("numero nulo: "+num);
    //     }
    // }
    //numeros pares entre 500 e -100
    // for (int num = 500;num > -100;num--){
    //     if(num % 2 == 0){
    //         System.out.println("numero par: "+num);
    //     }
    // }
    //laço até 1000 dos multiplos de 7 e 21
    // for (int num = 0;num < 1000;num++){
    //     if(num % 7 == 0 || num % 21 == 0){
    //         System.out.println("numero: "+num);
    //     }
    // }

    // int numeros [] = {10,20,30,40,50};
    // // System.out.println("numero: "+numeros[0]);
    // for (int i =0;i<numeros.length;i++) {
    //     System.out.println("numero: "+numeros[i]);
    // }
    // String nomes [] ={"juca","jeremias","emanuel","ermac","sub-zero","scorpion","johnny cage","reptile","liu kang","raiden"};
    // for (int i =0;i<nomes.length;i++) {
    //     System.out.print("nome: "+nomes[i] + " -");
    // }   
    // System.out.println("lero lero");
    // System.out.println(Arrays.toString(nomes));

    // String capitais [] = {"rio branco","Maceio","Macapá","Manaus","Salvador","Fortaleza","Brasília","Vitória","Goiânia","São Paulo","Curitiba","Florianópolis","entre outras :P"};
    // System.out.println(Arrays.toString(capitais));
    // System.out.println("----- X ----- ");
    // System.out.println(capitais[10]);

    
    // int numeros [] = {10,154,487,8798,5437,468,1457,68,5457,54578,14545,1545,6898,1457,154};
    // System.out.println(Arrays.toString(numeros));
    // System.out.println("----- X ----- ");
    // System.out.println(" numero da posicao 4: "+  numeros[4] + " e da posicao 7: "+ numeros[7]);
    // double numeros [] = {1.1,1.2,1.3,1.4,1.5,1.6,1.7,1.8,1.9,2.0};
    // System.out.println(Arrays.toString(numeros));

    // int matriz [][] = {{1,2,3},{4,5,6},{7,8,9}};
    // for (int[] linha : matriz) {
    //     for (int elemento : linha) {
    //         System.out.print(elemento + " ");
    //     }
    //     System.out.println();
    // }
    // String times[][] = {{"inter","outro inter","novo inter","inter ao contrario"},
    //                     {"gremio","outro gremio","novo gremio","gremio ao contrario"},
    //                     {"flamengo","outro flamengo","novo flamengo","flamengo ao contrario"},
    //                     {"palmeiras","outro palmeiras","novo palmeiras","palmeiras ao contrario"}};
    
    // for (String[] t : times){
    //     System.out.println("Time: "+Arrays.toString(t));
    // }
    // System.out.println("----- X ----- ");
    // System.out.println("Time: "+ times[0][1]);
    // System.out.println("Time: "+ times[1][3]);
    // int numeros[][] = {{1,2,3,4,5,6,7,8},
    //                   {9,10,11,12,13,14,15,16},
    //                   {17,18,19,20,21,22,23,24},
    //                   {25,26,27,28,29,30,31,32},
    //                   {33,34,35,36,37,38,39,40},
    //                   {41,42,43,44,45,46,47,48},
    //                   {49,50,51,52,53,54,55,56},
    //                   {57,58,59,60,61,62,63,64}
    //                   };
    // for(int[] i:numeros){
    //     System.out.println(Arrays.toString(i));
    // }
    // System.out.println("Selecionando posições");
    // System.out.println("numero: "+numeros[4][5]);
    // System.out.println("numero: "+numeros[2][7]);
    // int matriz[][] = {
    //     {1,2,3,4},
    //     {5,6,7,8},
    //     {9,10,11,12},
    //     {13,14,15,16}    
    // };
    // int soma = 0;
    // for(int i =0;i<matriz.length;i++){
    //     soma += matriz[i][i];
    // }
    // System.out.println("Soma dos valores: "+soma);
    // soma = 0;
    // for (int i = 0; i < matriz.length; i++) {
    //     for (int j = 0; j < matriz[i].length; j++) {
    //         if (i == j) {
    //             soma += matriz[i][j];
    //         }
    //     }
    // }
    // System.out.println("Soma com dois for: "+soma);
    // List<String> nomes = new ArrayList<>();
    // nomes.add("Suvaquiano");
    // nomes.add("Erisberto");
    // nomes.add("John Wayne");
    // nomes.add("Abacaxino");
    // nomes.add(1,"Setembrino");
    // String nomeDocidadao = nomes.get(1);
    // System.out.println(" ===== ");
    // System.out.println("Nome que peguei: "+nomeDocidadao);
    
    // System.out.println("nomes = "+nomes.get(1));
    // // Collections.sort(nomes);
    // nomes.stream().sorted().forEach(n -> System.out.println("Nome da lista: "+n));
    // System.out.println("==== X ====");
    // System.out.println("Exercicio capitais");
    // List<String> capitais = new ArrayList<>();
    // capitais.add("Nova Iorque");
    // capitais.add("Toronto");
    // capitais.add("Beijing");
    // capitais.add("Zurique");
    // capitais.add("Brasilia");
    // capitais.add("Paris");
    // capitais.add("Londres");
    // capitais.add("Istambul");
    // capitais.add("Constantinopla");
    // capitais.add("Porto Alegre");

    // capitais.add(3,"Non me toque");
    // capitais.remove(9);
    // System.out.println("Na casa do zodiaco de numero 7:"+capitais.get(7));
    // capitais.stream().sorted().forEach(c -> System.out.println("Capital: "+c));
    // System.out.println("Tamanho da lista: "+capitais.size());
    //    List<Integer> numeros = new ArrayList<>();
    //    for(int i=0;i<20;i++){
    //     numeros.add(i);
    //    }
    //    numeros.add(19,42);
    //    numeros.remove(5);
    //    System.out.println("indice 15: "+numeros.get(15));
    //    numeros.stream().forEach(n -> System.out.println("Numero: "+n));
    //    System.out.println("Tamanho da lista: "+numeros.size());
    Stack<String> novaPilha = new Stack<>();
    novaPilha.add("Erasmo");
    novaPilha.add("Momoa");
    novaPilha.push("Jeremias");
    System.out.println(novaPilha.peek());
    System.out.println(novaPilha.firstElement());
    System.out.println(novaPilha.isEmpty());
    novaPilha.remove(0);
    System.out.println(novaPilha.firstElement());
    novaPilha.add(1, "Josue");
    System.out.println("--- X ---");
    novaPilha.forEach(e -> System.out.println(e));

    System.out.println("-- -X --- -");
    Stack<Integer> pilhaNumeros = new Stack<>();
    for(int i=0;i<20;i++){
        pilhaNumeros.add(i);
    }
    System.out.println("Numero no fim da pilha: "+pilhaNumeros.peek());
    pilhaNumeros.pop();
    pilhaNumeros.pop();
    pilhaNumeros.pop();
    System.out.println("A pilha ta vazia? "+pilhaNumeros.isEmpty());
    pilhaNumeros.forEach(n -> System.out.println("Numero: "+n));

    
   
   
   

}
}
    

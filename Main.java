import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main{
    public static void main(String[] args) {
        System.out.println("--- Animal ---");
        Animal cao = new Animal();
        cao.setNome("Filo");
        cao.setEspecie("Tiranossauro");
        cao.setIdade(251);
        cao.setSexo("Macho");
        System.out.println(cao);

        System.out.println("--- Cliente ---");
        Cliente cliente = new Cliente();
        cliente.setNome("Airo");
        cliente.setEmail("email.com");
        cliente.setTelefone(2345678);
        cliente.setEndereco("Rua do lado, 53");
        System.out.println(cliente.getNome());
        
        System.out.println("---Estoque---");
        Estoque estoque = new Estoque();
        estoque.setQuantidade(5);        
        System.out.println(estoque.getQuantidade());

        System.out.println("---Fornecedor---");
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setCnpj(87654313);
        fornecedor.setRazaoSocial("Irmãos Codinhos LTDA");
        fornecedor.setNomeFantasia("Codigoli Codigola");
        System.out.println(fornecedor.getRazaoSocial());

        System.out.println("---Funcionario---");
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Jeremias");
        funcionario.setCpf(578987456);
        funcionario.setCargo("Detetive Espiritual");
        funcionario.setSalario(2547.87);
        System.out.println("Nome do Funcionário: "+funcionario.getNome() +
        " - Cargo: "+funcionario.getSalario());

        System.out.println("---Item---");
        Item item = new Item();
        item.setNome("Cola PVA");
        item.setPreco(5.90);
        item.setTipo("Material Escritório");
        item.setDataCompra("15/07/2025");
        System.out.println(item.getNome());

        System.out.println("---Produto---");
        Produto produto = new Produto();
        produto.setNomeProduto("XPTO");
        produto.setCodigoBarra(5784521);
        produto.setDataCompra("06/06/2016");
        produto.setValidade("validade");
        produto.setUnidade(1);
        System.out.println(produto.getNomeProduto());

        System.out.println("---Serviço---");
        Servico servico = new Servico();
        servico.setNomeServico("Banho e Tosa");
        servico.setTempoEmMinutos(45);
        servico.setTipoServico("Higiene");
        servico.setValorServico(35.50);
        System.out.println(servico.getNomeServico() + " - Valor: " + servico.getValorServico());
        JOptionPane.showMessageDialog(null, cao);
        System.out.println("---");
        
        String option = JOptionPane.showInputDialog(null,"Digite sua opcao",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, option, "mensagem",JOptionPane.OK_OPTION);
        int opcao = Integer.parseInt(option);
        switch(opcao){
            case 1:
                String nome = JOptionPane.showInputDialog(null,"Diga um nome para o nome :P","texto texto",JOptionPane.QUESTION_MESSAGE);
                JOptionPane.showMessageDialog(null,"voce quis dizer... "+nome);

                JPanel panel = new JPanel();
                JTextField endereco = new JTextField(15);
                JTextField bairro = new JTextField(15);
                JTextField cidade = new JTextField(15);
                JTextField estado = new JTextField(15);
                panel.add(new JLabel("Endereco:"));
                panel.add(endereco);
                panel.add(new JLabel("Bairro:"));
                panel.add(bairro);
                panel.add(new JLabel("Cidade:"));
                panel.add(cidade);
                panel.add(new JLabel("Estado:"));
                panel.add(estado);
                
                int result = JOptionPane.showConfirmDialog(null, panel, "Please Enter Your Info", JOptionPane.OK_CANCEL_OPTION);
                if (result == JOptionPane.OK_OPTION) {
                String adress = endereco.getText();
                String bairronovo = bairro.getText();
                String emaildoex = cidade.getText();
                String state = estado.getText();
                JOptionPane.showMessageDialog(null, "Name: " + adress + "\nAge: " + bairronovo + "\nEmail: " + emaildoex + "\nState: " + state);
                }
                break;
            case 2:
                JPanel novopainel = new JPanel();
                JTextField idade = new JTextField(15);
                JTextField numero = new JTextField(15);
                JTextField cep = new JTextField(15);
                JTextField genero = new JTextField(15);
                JTextField complemento = new JTextField(15);
                novopainel.add(new JLabel("Idade:"));
                novopainel.add(idade);
                novopainel.add(new JLabel("Numero:"));
                novopainel.add(numero);
                novopainel.add(new JLabel("Cep:"));
                novopainel.add(cep);
                novopainel.add(new JLabel("Genero:"));
                novopainel.add(genero);
                novopainel.add(new JLabel("Complemento:"));
                novopainel.add(complemento);
                
                int resultado = JOptionPane.showConfirmDialog(null, novopainel, "Preencha seus dados", JOptionPane.OK_CANCEL_OPTION);
                if (resultado == JOptionPane.OK_OPTION) {
                int idadex = Integer.parseInt(idade.getText());
                int numerox = Integer.parseInt(numero.getText());
                int cepx = Integer.parseInt(cep.getText());
                String generox = genero.getText();
                int complementox = Integer.parseInt(complemento.getText());
                JOptionPane.showMessageDialog(null, "Idade: " + idadex + "\nNumero: " + numerox + "\nCep: " + cepx + "\nGenero: " + generox + "\nComplemento: " + complementox);
                }   
                break;
            case 3:
                JPanel alunoPanel = new JPanel();
                JTextField nomeAluno = new JTextField(15);
                JTextField nota1 = new JTextField(15);
                JTextField nota2 = new JTextField(15);
                JTextField nota3 = new JTextField(15);
                alunoPanel.add(new JLabel("Nome do Aluno"));
                alunoPanel.add(nomeAluno);
                alunoPanel.add(new JLabel("Nota 1"));
                alunoPanel.add(nota1);
                alunoPanel.add(new JLabel("Nota 2"));
                alunoPanel.add(nota2);
                alunoPanel.add(new JLabel("Nota 3"));
                alunoPanel.add(nota3);
                int media = 0;
                int verificaResultado = JOptionPane.showConfirmDialog(null, alunoPanel, "Preencha seus dados", JOptionPane.OK_CANCEL_OPTION);
                if (verificaResultado == JOptionPane.OK_OPTION) {  
                    String nomeDoAluno = nomeAluno.getText();
                    int nota1x = Integer.parseInt(nota1.getText());
                    int nota2x = Integer.parseInt(nota2.getText());
                    int nota3x = Integer.parseInt(nota3.getText());
                    media = (nota1x + nota2x + nota3x) / 3;
                }
                if(media >= 7){
                    JOptionPane.showMessageDialog(null, "Aprovado! Nota: " + media);
                }else{
                    JOptionPane.showMessageDialog(null, "Reprovado! Nota: " + media);
                }
                break;
            case 4:
                JPanel pessoa = new JPanel(new GridLayout(0,6,5,5));
                JTextField nomePessoa = new JTextField(15);
                JTextField produto1 = new JTextField(15);
                JTextField preco1 = new JTextField(15);
                JTextField quantidade1 = new JTextField(15);
                JTextField produto2 = new JTextField(15);
                JTextField preco2 = new JTextField(15);
                JTextField quantidade2 = new JTextField(15);
                JTextField produto3 = new JTextField(15);
                JTextField preco3 = new JTextField(15);
                JTextField quantidade3 = new JTextField(15);
                pessoa.add(new JLabel("Nome da Pessoa"));
                pessoa.add(nomePessoa);
                pessoa.add(new JLabel());
                pessoa.add(new JLabel());
                pessoa.add(new JLabel());        
                pessoa.add(new JLabel());   
                pessoa.add(new JLabel("\nProduto 1"));
                pessoa.add(produto1);
                pessoa.add(new JLabel("Preço 1"));
                pessoa.add(preco1);
                pessoa.add(new JLabel("Quantidade 1"));
                pessoa.add(quantidade1);
                pessoa.add(new JLabel("Produto 2"));
                pessoa.add(produto2);
                pessoa.add(new JLabel("Preço 2"));
                pessoa.add(preco2);
                pessoa.add(new JLabel("Quantidade 2"));
                pessoa.add(quantidade2);
                pessoa.add(new JLabel("Produto 3"));
                pessoa.add(produto3);
                pessoa.add(new JLabel("Preço 3"));
                pessoa.add(preco3);
                pessoa.add(new JLabel("Quantidade 3"));
                pessoa.add(quantidade3);
                String nomeDaPessoa = nomePessoa.getText();
                String produto1x = produto1.getText(); 
                int preco1x = Integer.parseInt(preco1.getText());
                int quantidade1x = Integer.parseInt(quantidade1.getText());
                String produto2x = produto2.getText();
                int preco2x = Integer.parseInt(preco2.getText());
                int quantidade2x = Integer.parseInt(quantidade2.getText());
                String produto3x = produto3.getText();
                int preco3x = Integer.parseInt(preco3.getText());
                int quantidade3x = Integer.parseInt(quantidade3.getText());
                int valor1 = preco1x * quantidade1x;
                int valor2 = preco2x * quantidade2x;
                int valor3 = preco3x * quantidade3x;
                int totalDaSoma = valor1+valor2+valor3;
                JOptionPane.showMessageDialog(null,"A compra " + (totalDaSoma <=100?"tem frete gratis":"tem frete"));
                break;
            case 5:
                String novaOpcao = "";
                novaOpcao = JOptionPane.showInputDialog(null,"Digite sua opcao",JOptionPane.QUESTION_MESSAGE);
                JOptionPane.showMessageDialog(null, novaOpcao, "mensagem",JOptionPane.OK_OPTION);
                int opcaoDoSwitch = Integer.parseInt(novaOpcao);
                String nomeDoCliente = "";
                String emailDoCliente = "";
                String telefoneDoCliente = "";
                String cadastroProduto = "";
                int valorDoProduto = 0;
                int quantidadeDoProduto = 0;
                while(opcaoDoSwitch != 0){
                    
                    switch(opcaoDoSwitch){
                        case 1:
                            nomeDoCliente = JOptionPane.showInputDialog("nome do cliente: ");
                            emailDoCliente = JOptionPane.showInputDialog("email do cliente: ");
                            telefoneDoCliente = JOptionPane.showInputDialog("telefone do cliente: ");
                            break;
                        case 2:
                            cadastroProduto = JOptionPane.showInputDialog("Nome do Produto: ");
                            valorDoProduto = Integer.parseInt(JOptionPane.showInputDialog("Valor do Produto: "));
                            quantidadeDoProduto = Integer.parseInt(JOptionPane.showInputDialog("Quantidade do Produto: "));
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null,"Venda Realizada! "+ nomeDoCliente + " - Comprou " + cadastroProduto + " - E a conta deu: " +(valorDoProduto*quantidadeDoProduto));
                            break;
                        default:
                            JOptionPane.showMessageDialog(null," adios pampa mia ");
                            break;
                    }
                    opcaoDoSwitch = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite sua opcao",JOptionPane.QUESTION_MESSAGE));
                }
                
                
                
                

            default:
                JOptionPane.showMessageDialog(null, "Fechou amigão!");
                break;
        }    
    }
}
    

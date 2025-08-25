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

        System.out.println("---");
        JOptionPane.showMessageDialog(null, cao);
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
            
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null,"digite a idade: ","idade",JOptionPane.QUESTION_MESSAGE));
        System.out.println(idade);

}
    }
}
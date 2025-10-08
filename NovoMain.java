import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class NovoMain {
    public static void main(String[] args) {
        
    //1
    class Aluno{
        String nome;
        LocalDate dataDeNascimento;
        List<Double> notas = new ArrayList<>(); 
        Aluno(String nome,LocalDate dataDeNascimento,List<Double> notas){
            this.nome = nome;
            this.dataDeNascimento = dataDeNascimento;
            this.notas = notas;

        }
        //2
        public double calculaMedia(){
            return notas.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        
        }
        public String toString(){
            return "Nome do Aluno:"+nome+" Media: "+calculaMedia();
        }
        //4
        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if(!(o instanceof Aluno)) return false;

        Aluno aluno = (Aluno) o;

        return Objects.equals(nome, aluno.nome);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nome);
        }


    }
    class Turma{
        List<Aluno> alunos;

        List<Aluno> top3Alunos(List<Aluno> alunos){
            List<Aluno> top3 = new ArrayList<>();
            alunos.sort(Comparator.comparingDouble(Aluno::calculaMedia));
            Collections.reverse(alunos);
            for (int i=0;i<3;i++){
                top3.add(alunos.get(i));
            }
            return top3;
        }
    }
    //Feed de notas para objeto Aluno
    List<Double> notaQuepassa = new ArrayList<>();
        notaQuepassa.add(8.1);
        notaQuepassa.add(9.1);
        notaQuepassa.add(7.5);
    List<Double> notaQueNPassa = new ArrayList<>();
        notaQueNPassa.add(5.1);
        notaQueNPassa.add(1.8);
        notaQueNPassa.add(5.4);

        //3 
        List<Aluno> listaDeAlunos = new ArrayList<>();
        listaDeAlunos.add(new Aluno("Jeremias",LocalDate.of(2025, 05,10),notaQueNPassa));
        listaDeAlunos.add(new Aluno("Olavinho",LocalDate.of(2015, 2,14),notaQueNPassa));
        listaDeAlunos.add(new Aluno("Bira",LocalDate.of(1980, 03,8),notaQuepassa));
        listaDeAlunos.add(new Aluno("Jo",LocalDate.of(1946, 02,01),notaQuepassa));
        listaDeAlunos.add(new Aluno("Boromir",LocalDate.of(1578, 03,15),notaQuepassa));
        listaDeAlunos.add(new Aluno("Frodo",LocalDate.of(1025, 11,10),notaQuepassa));
        listaDeAlunos.add(new Aluno("Jeremias",LocalDate.of(1752, 03,05),notaQueNPassa));

        //5
        Optional<String> busca = listaDeAlunos.stream().filter(a -> a.nome.startsWith("B")).map(a -> a.nome).findFirst();
        System.out.println(busca.orElse("Não"));
        //6
        listaDeAlunos.removeIf(aluno -> aluno.calculaMedia() < 6.0);
        //7
        List<Aluno> aprovados = listaDeAlunos.stream().filter(a -> a.calculaMedia() >= 6.0).collect(Collectors.toList());

        
        //8
        String[] disciplinaslista = {"POO", "HTML", "CSS"};
        List<String> disciplinas = Arrays.asList(disciplinaslista);
        //9        
        listaDeAlunos.sort(Comparator.comparing(a -> a.dataDeNascimento));
       Turma turma = new Turma();
       turma.alunos = listaDeAlunos;
       turma.alunos.sort(Comparator.comparingDouble(Aluno::calculaMedia));
       
       System.out.println(turma.top3Alunos(turma.alunos));



        
    }
}

public class TesteHeranca1{
public static void main(String[] args){
    //vejamos se alunos de graduacao tem nome e idade
    //construto que nao recebe coisa alguma chama: construtor padrao
    AlunoDeGraduacao aluno = new AlunoDeGraduacao();
    aluno.nome ="Joao";
    aluno.idade= 17;
    System.out.printf(
        "Nome: %s, idade: %d\n",
        aluno.nome,
        aluno.idade
    );
}

}
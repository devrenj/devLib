#include <iostream>
#include <string>
using namespace std;

struct materia
{
char nome[30];
float notas[4];
int periodo;
} typedef Materia;

struct aluno {
char nome[30];
char senha[30];
materia materias[2];
} typedef Aluno;

int main(){

Materia matematica;
matematica.nome[0] = 'm';
matematica.periodo = 1;

Materia portugues;
portugues.nome[0] = 'p';
portugues.periodo = 2;

Aluno a1.nome[0] = 'm';
a1.senha[0] = '1';
a1.materias[0] = matematica;
a1.materias[1] = portugues;

Aluno alunos[10];

for(int i=0; i<10; i++){

Aluno[i].materias[0] = matematica;
Aluno[i].materias[1] = portugues;
Aluno[i].nome[0] = 'a' + i;
Aluno[i].senha[0] = '0' + i;

}

  for(int i=0; i<10; i++) {
    for(int j=0; j<4; i++){
      cout << "Digite a nota do aluno " << alunos[i].nome << " na materia" << alunos[i].materias[0].nome << ": ";
      cin >> alunos[i].materias[0].notas[j];

      cout << "Digite a nota do aluno " << alunos[i].nome << " na materia" << alunos[i].materias[1].nome << ": ";
      cin >> alunos[i].materias[1].notas[j];
    }
  }

}
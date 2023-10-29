#include <iostream>
#include <string>
using namespace std;

struct ferramenta
{
char nome[50];
char fabricante[50];
char tipo[50];
float tamanho;
} typedef Ferramenta;

/* //Tentativa de usar função
void mostrar(const ferramenta& ferramentaX){
cout << ferramentaX.nome[i]='\0';
cout << ferramentaX.fabricante[i]='\0';
cout << ferramentaX.tipo[i]='\0';

};
*/

int main() {

Ferramenta chave_fenda;
Ferramenta chave_ing;
Ferramenta martelo;


  for (int i=0;i < 3;i++) {

  cout << "Digite um nome para a ferramenta: ";
  cin >> chave_fenda.nome;


  /* Tentativa de usar função no laço for
  mostrar(chave_fenda);
  mostrar(chave_ing);
  mostrar(martelo);
  */
  }

}
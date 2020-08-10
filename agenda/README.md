## Agenda 0 - Um único contato

O objetivo dessa atividade é implementar uma classe responsável por guardar um **único** contato da agenda telefônica do seu celular. Cada contato pode ter um único telefone.

## Funcionalidades
Seu programa deve:

- **Definir nome**
    - Poder inicializar o contato passando o nome.
        - Se não houver nome, o nome default é "vazio".
- **Inserir telefone no contato** 
    - Um telefone tem uma label e um fone.
    - Labels serão nomes como: casa, fixo, oi.
    - Labels podem ser duplicados.
    - Adapte o print para apresentar os celulares.
- **Remover telefone do contato.**
- **Atualize o contato em lote.**
    - Inicialize o contato apagando os dados antigos e inserindo o telefone passado por parametro.
- **Processando números de telefone.**
    - Processe o telefone para apenas permitir no telefone os seguintes caracteres "0123456789()."
    - Se o usuário tentar inserir individualmente um telefone invalido, avise e não insira o telefone.

***
## Raio X

````java
class Agenda
-contato: Contato
--
+ init(nome: String)
+ update(nome: string, label: string, fone: string)
+ rm(fone: string)
+ show()

class Fone
- label: string
- numero: string
--
+ validate(): bool
+ toString(): string

class Contato
- nome: string
- fone: Fone
--
+ addFone(fone: Fone) : boolean
+ rmFone(fone: string) : boolean
````
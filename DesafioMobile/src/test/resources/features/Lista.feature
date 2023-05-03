#language: pt
#encoding: UTF-8
@lista
Funcionalidade: Criar Lista
eu como um usuário
quero criar minhas anotações e/ ou listas de verificação com um ou mais itens
para organizar minhas tarefas


Contexto: criar lista
Dado que eu cliquei em adicionar lista 
Quando eu selecionar a opca checklist
E informar e salvar o titulo
E eu adicionar tres itens a lista

@CriarLista
Cenario: validar criacao da lista
Entao o app exibe a lista criada 

@MarcarChecked
Cenario: marcar itens como checked
Quando eu clicar sobre um item
Entao o app exibe o item como checked

@EscolherCategoria
Cenario: escolher categoria da lista
Quando eu clicar sobre a categoria
E informar o nome da categoria
E clicar em sobre a categoria criada
Entao o app exibe a categoria da lista

@EditarTitulo
Cenario: editar titulo
Quando eu clicar em editar
E eu editar e salvar o titulo da lista
Entao o app exibe a lista com o titulo editado

@ExcluirItem
Cenario: excluir item
Quando eu arrastar um item pra direita
Entao o app exibe apenas dois itens

@ColocarSenha
Cenario: adicionar senha a lista
Quando tocar em adicionar senha
E eu adicionar e confirmar a senha 
Entao o app exibe a nota com a senha habilitada

@ExcluirLista
Cenario: excluir lista
Quando eu tocar em excluir
E eu confirmar a exclusao
Entao o app exibe a tela inicial vazia

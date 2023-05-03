#language: pt
#encoding: UTF-8

Funcionalidade: Criar categorias

Contexto: Criar categorias
Dado que eu cliquei no menu
Quando eu criar duas categorias 

@ValidarCategorias
Cenario: Validar Categorias
Entao o app apresenta as duas categorias criadas

@MoverCategorias
Cenario: Validar opcao de mudar posicao
E eu tocar e segurar em uma categoria
Entao o app apresenta a opcao para mudar de posicao

@ExcluirCategoria
Cenario: excluir categoria
E eu excluir uma categoria
Entao o app exibe apenas uma categoria
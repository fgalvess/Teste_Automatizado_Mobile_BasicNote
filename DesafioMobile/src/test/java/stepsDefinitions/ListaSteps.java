package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaIcialPage;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.Utils.*;
import org.openqa.selenium.By;

public class ListaSteps {

	TelaIcialPage inicialPage = new TelaIcialPage(driver);

	@Dado("que eu cliquei em adicionar lista")
	public void queEuCliqueiEmAdicionarLista() {
		inicialPage.adicionarLista();
	}

	@Quando("eu selecionar a opca checklist")
	public void euSelecionarAOpcaChecklist() {
		inicialPage.selecionarChecklist();
	}

	@Quando("informar e salvar o titulo")
	public void informarESalvarOTitulo() {
		inicialPage.informarTituloDaLista();
	}

	@Quando("eu adicionar tres itens a lista")
	public void euAdicionarTresItensALista() {
		inicialPage.adicionarTresItens();
	}

	@Entao("o app exibe a lista criada")
	public void oAppExibeAListaCriada() {
		inicialPage.acionarBotaoVoltar();
		assertEquals("Lista", driver.findElement(By.xpath("//android.widget.TextView[@text='Lista']")).getText());
	}

	@Quando("eu clicar sobre um item")
	public void euClicarSobreUmItem() {
		inicialPage.clicarNoItem();
	}

	@Entao("o app exibe o item como checked")
	public void oAppExibeOItemComoChecked() {
		assertTrue(driver.findElement(By.id("notizen.basic.notes.notas.note.notepad:id/imgCheckbox")).isDisplayed());
	}

	@Quando("eu clicar sobre a categoria")
	public void euClicarSobreACategoria() {
		inicialPage.clicarCategoria();
	}

	@Quando("informar o nome da categoria")
	public void informarONomeDaCategoria() {
		inicialPage.informarNomeCategoria();
	}

	@Quando("clicar em sobre a categoria criada")
	public void clicarEmSobreACategoriaCriada() {
		inicialPage.clicarCategoriaCriada();
	}

	@Entao("o app exibe a categoria da lista")
	public void oAppExibeACategoriaDaLista() {
		assertEquals("Categoria da Lista",
				driver.findElement(By.xpath("//android.widget.TextView[@text='Categoria da Lista']")).getText());
	}

	@Quando("eu clicar em editar")
	public void euClicarEmEditar() {
		inicialPage.clicarEmEditar();
	}

	@Quando("eu editar e salvar o titulo da lista")
	public void euEditarESalvarOTituloDaLista() {
		inicialPage.editarTitulo();
	}

	@Entao("o app exibe a lista com o titulo editado")
	public void oAppExibeAListaComOTituloEditado() {
		assertEquals("Lista Editada",
				driver.findElement(By.xpath("//android.widget.TextView[@text='Lista Editada']")).getText());
	}

	@Quando("eu arrastar um item pra direita")
	public void euArrastarUmItemPraDireita() {
		inicialPage.arrastarItemPraDireita();
	}

	@Entao("o app exibe apenas dois itens")
	public void oAppExibeApenasDoisItens() {
		assertTrue(driver.findElement(By.id("notizen.basic.notes.notas.note.notepad:id/recyclerView")).isDisplayed());
	}

	@Quando("tocar em adicionar senha")
	public void tocarEmAdicionarSenha() {
		inicialPage.adicionarSenha();
	}

	@Quando("eu adicionar e confirmar a senha")
	public void euAdicionarEConfirmarASenha() {
		inicialPage.criarSenha();
	}

	@Entao("o app exibe a nota com a senha habilitada")
	public void oAppExibeANotaComASenhaHabilitada() {
		assertTrue(driver.findElement(By.id("notizen.basic.notes.notas.note.notepad:id/imgLock")).isDisplayed());
	}

	@Quando("eu tocar em excluir")
	public void euTocarEmExcluir() {
		inicialPage.acionarBotaoExcluir();
	}

	@Quando("eu confirmar a exclusao")
	public void euConfirmarAExclusao() {
		inicialPage.confirmarExclusao();
	}

	@Entao("o app exibe a tela inicial vazia")
	public void oAppExibeATelaInicialVazia() {
		assertTrue(driver.findElement(By.id("notizen.basic.notes.notas.note.notepad:id/recyclerView")).isDisplayed());
	}

}

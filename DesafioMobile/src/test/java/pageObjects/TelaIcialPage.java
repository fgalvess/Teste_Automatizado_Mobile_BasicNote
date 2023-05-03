package pageObjects;

import org.openqa.selenium.support.PageFactory;
import static utils.Utils.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TelaIcialPage {

	public TelaIcialPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/imgCategory")
	private MobileElement menu;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/btnAddNote")
	private MobileElement addLista;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/txtChecklist")
	private MobileElement opcaoChecklist;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/editText")
	private MobileElement campoTitulo;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/txtAdd")
	private MobileElement salvarTitulo;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/imgPlus")
	private MobileElement addItem;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/imgBack")
	private MobileElement botaoVoltar;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/txtCategory")
	private MobileElement categoriaDoitem;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/layout")
	private MobileElement clicarNoItem;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/txtCategory")
	private MobileElement botaoVoltarCategoria;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/categoryName")
	private MobileElement categoriaCriada;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/imgEdit")
	private MobileElement botaoEditar;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/btnEdit")
	private MobileElement salvarEditar;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/imgLock")
	private MobileElement addSenha;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/editPassword")
	private MobileElement digitarSenha;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/txtBtn")
	private MobileElement confirmSenha;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/imgDelete")
	private MobileElement excluir;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/txtDelete")
	private MobileElement confirmExclusao;

	public void acionarMenu() {
		menu.click();
	}

	public void adicionarLista() {
		addLista.click();
	}

	public void selecionarChecklist() {
		opcaoChecklist.click();
	}

	public void informarTituloDaLista() {
		campoTitulo.sendKeys("Lista");
		salvarTitulo.click();
	}

	public void adicionarTresItens() {
		for (int i = 0; i < 3; i++) {
			addItem.click();
			campoTitulo.sendKeys("Item");
			salvarTitulo.click();
		}
	}

	public void acionarBotaoVoltar() {
		botaoVoltar.click();
	}

	public void clicarNoItem() {
		clicarNoItem.click();
	}

	public void clicarCategoria() {
		categoriaDoitem.click();
	}

	public void informarNomeCategoria() {
		addItem.click();
		campoTitulo.sendKeys("Categoria da Lista");
		salvarTitulo.click();
	}

	public void clicarCategoriaCriada() {
		categoriaCriada.click();
	}

	public void clicarEmEditar() {
		botaoEditar.click();
	}

	public void editarTitulo() {
		campoTitulo.clear();
		campoTitulo.sendKeys("Lista Editada");
		salvarEditar.click();
	}

	public void arrastarItemPraDireita() {
		swipeDireita();
	}

	public void adicionarSenha() {
		addSenha.click();
	}

	public void criarSenha() {
		for (int i = 0; i < 2; i++) {
			digitarSenha.sendKeys("1234");
			confirmSenha.click();
		}
	}

	public void acionarBotaoExcluir() {
		excluir.click();
	}

	public void confirmarExclusao() {
		confirmExclusao.click();
	}
}

package pageObjects;

import static utils.Utils.driver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CategoriasPage {

	Actions acao = new Actions(driver);

	public CategoriasPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/imgPlus")
	private MobileElement addCategoria;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/editText")
	private MobileElement campoCategoria;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/txtAdd")
	private MobileElement botaoSalvarCategoria;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Categoria Dois']")
	private MobileElement categoriaDois;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/imgEdit")
	private MobileElement botaoEditar;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/imgDelete")
	private MobileElement botaoExcluir;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/txtComplete")
	private MobileElement botaoSalvar;

	public void criarCategorias() {
		addCategoria.click();
		campoCategoria.sendKeys("Categoria Um");
		botaoSalvarCategoria.click();
		addCategoria.click();
		campoCategoria.sendKeys("Categoria Dois");
		botaoSalvarCategoria.click();
	}

	public void tocarESegurarCategoria() {
		acao.clickAndHold(categoriaDois).perform();
		;
	}

	public void excluirCategoriaDois() {
		botaoEditar.click();
		botaoExcluir.click();
		botaoSalvar.click();
	}

}

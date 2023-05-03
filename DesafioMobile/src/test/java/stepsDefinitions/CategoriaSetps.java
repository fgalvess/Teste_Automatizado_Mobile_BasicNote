package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CategoriasPage;
import pageObjects.TelaIcialPage;
import static utils.Utils.*;
import org.openqa.selenium.By;

public class CategoriaSetps {

	TelaIcialPage inicialPage = new TelaIcialPage(driver);
	CategoriasPage categoriasPage = new CategoriasPage(driver);

	@Dado("que eu cliquei no menu")
	public void queEuCliqueiNoMenu() {
		inicialPage.acionarMenu();
	}

	@Quando("eu criar duas categorias")
	public void euCriarDuasCategorias() {
		categoriasPage.criarCategorias();
	}

	@Entao("o app apresenta as duas categorias criadas")
	public void oAppApresentaAsDuasCategoriasCriadas() {
		assertEquals("Categoria Um",
				driver.findElement(By.xpath("//android.widget.TextView[@text='Categoria Um']")).getText());
		assertEquals("Categoria Dois",
				driver.findElement(By.xpath("//android.widget.TextView[@text='Categoria Dois']")).getText());
	}

	@Quando("eu tocar e segurar em uma categoria")
	public void euTocarESegurarEmUmaCategoria() {
		categoriasPage.tocarESegurarCategoria();
	}

	@Entao("o app apresenta a opcao para mudar de posicao")
	public void oAppApresentaAOpcaoParaMudarDePosicao() {
		assertTrue(driver.findElement(By.id("notizen.basic.notes.notas.note.notepad:id/imgRank")).isDisplayed());
	}

	@Quando("eu excluir uma categoria")
	public void euExcluirUmaCategoria() {
		categoriasPage.excluirCategoriaDois();
	}

	@Entao("o app exibe apenas uma categoria")
	public void oAppExibeApenasUmaCategoria() {
		assertTrue(driver.findElement(By.id("notizen.basic.notes.notas.note.notepad:id/categoryName")).isDisplayed());
	}

}

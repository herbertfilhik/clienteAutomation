import java.util.regex.Pattern;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

@RunWith(Parameterized.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AutomacaoAleloCliente2 {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private DSL dsl;
	private AutomacaoAleloClientePage page;

	@Parameter(value = 0)
	public String nomeDiretor;
	@Parameter(value = 1)
	public String nomeFilme;
	@Parameter(value = 2)
	public String cpf;
	@Parameter(value = 3)
	public String rg;
	@Parameter(value = 4)
	public String endereco;
	@Parameter(value = 5)
	public String salario;
	@Parameter(value = 6)
	public String telefone;
	@Parameter(value = 7)
	public String profissao;
	@Parameter(value = 8)
	public String descricao;
	@Parameter(value = 9)
	public String dataNascimento;
	@Parameter(value = 10)
	public String dataLancamento;

	public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception {
		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(fileWithPath);
		FileUtils.copyFile(SrcFile, DestFile);
	}

	@Before
	public void setUp() throws Exception {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		// windows exec
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\Utils\\Automation\\chromedriver\\chromedriver.exe");
		// linux exec
		// System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +
		// "//Utils//Automation//chromedriver//chromedriver");
		// Caso deseje rodar em modo nao headless, apenas retire o options do driver =
		// new FirefoxDriver();
		driver = new ChromeDriver();
		Thread.sleep(5000);
		baseUrl = "https://www.google.com";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dsl = new DSL(driver);
		page = new AutomacaoAleloClientePage(driver);
	}

	@After
	public void finaliza() {
		// driver.close();
		driver.quit();
	}

	@Parameters
	public static Collection<Object[]> getCollection() {

		return Arrays.asList(new Object[][] { { "Oliver Stone", "Snowden", "310.227.438-21", "40.823.111-7", "rua a",
				"1000.0", "+99(99)9999-9999", "diretor", "teste", "15/09/1946", "10/11/2016", }, });
	}

	// @Ignore
	@Test
	public void AutomacaoAleloCadastroCliente_01() throws Exception {
		System.out.println("Iniciando o Teste");
		driver.get(baseUrl);
		driver.manage().window().maximize();
		System.out.println("Pesquisando");
		String consultaFilmes = page.consultaFilmes();
		System.out.println(consultaFilmes);
		System.out.println("Retorno do Total de Pesquisa");
		System.out.println("Finalizando o teste");
	}
}
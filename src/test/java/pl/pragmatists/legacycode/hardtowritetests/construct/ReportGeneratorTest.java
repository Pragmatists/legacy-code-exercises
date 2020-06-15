package pl.pragmatists.legacycode.hardtowritetests.construct;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import pl.pragmatists.legacycode.hardtowritetests.statical.User;

/**
 * TODO:
 * uruchom test - zaobserwuj że rzuca wyjątkiem, pomimo braku asercji
 * obejrzyj implementację konstruktora new ReportGenerator()
 * i zaobserwuj problematyczne instrukcje
 * zrefaktoryzuj tak, aby test nie rzucał wyjątku
 * zrefaktoryzuj tak, aby udało się napisać asercję
 * zaimplementuj aby test przechodził
 *
 */
public class ReportGeneratorTest {

	@Test
	public void shouldGenerateReport() throws IOException {
		new ReportGenerator().generateReportFor(aUser("mike"));
		
		//how to assert that something was written to a file?
		//Assertions.assertThat(report).isEqualTo("normal,mike");
	}

	private User aUser(String name) {
		return new User(name + "@email.com",name);
	}
	
}

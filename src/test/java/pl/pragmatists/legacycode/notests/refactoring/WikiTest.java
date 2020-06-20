package pl.pragmatists.legacycode.notests.refactoring;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class WikiTest {

    @Test
    void should_replace_asterisk_with_bold() {
        Wiki wiki = new Wiki();

        String wikiResult = wiki.parse("*text*");

        assertThat(wikiResult).isEqualTo("");
    }
}

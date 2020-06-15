package pl.pragmatists.legacycode.extractandoverride;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayerTest {

    // Extract & override to make the test pass
    @Test
    public void has_hand() {
        Player player = new Player();

        Hand hand = player.getHand();

        assertThat(hand).isNotNull();
    }

}

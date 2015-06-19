package pl.pragmatists.legacycode.extractandoverride;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class PlayerTest {

    // Extract & override to make the test pass
    @Test
    public void has_hand() {
        Player player = new Player();

        Hand hand = player.getHand();

        assertThat(hand).isNotNull();
    }

}
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AzureTranslatorTest {

    AzureTranslator underTest = new AzureTranslator();

    @Test
    @DisplayName("Should translate sample sentence from English to French")
    void shouldTranslateSampleSentence() {
        // given
        String input = "Our greatest weakness lies in giving up. The most certain way to succeed is always to try just one more time.";

        // when
        String output = underTest.translate(input, "fr");

        // then
        assertThat(output).contains("faiblesse", "toujours");
    }
}

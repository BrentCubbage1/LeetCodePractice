package Test;

import Questions.RemoveNeighboringColoredPieces.RemoveColoredPieces;
import org.junit.Assert;
import org.junit.Test;

public class RemoveColoredPiecesTests {

    @Test
    public void testWinnerOfGame() {
        RemoveColoredPieces removeColoredPieces = new RemoveColoredPieces();

        Assert.assertFalse(removeColoredPieces.winnerOfGame("AAABBB"));

        Assert.assertFalse(removeColoredPieces.winnerOfGame("AAABBBB"));

        Assert.assertTrue(removeColoredPieces.winnerOfGame("AABAAABB"));

        Assert.assertFalse(removeColoredPieces.winnerOfGame("AABBB"));

        Assert.assertFalse(removeColoredPieces.winnerOfGame("A"));

        Assert.assertFalse(removeColoredPieces.winnerOfGame("B"));

        Assert.assertTrue(removeColoredPieces.winnerOfGame("AAABBAA"));

        Assert.assertFalse(removeColoredPieces.winnerOfGame(""));

        Assert.assertTrue(removeColoredPieces.winnerOfGame("AAA"));
    }

}

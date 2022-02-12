package hangman.model;

public class BonusScore implements GameScore{

    /**
     * @pre El juego inicia en 0 puntos
     * @pos El puntaje minimo es 0
     * @param correctCount Se bonifica con 10 puntos cada letra correcta
     * @param incorrectCount Se penaliza con 5 puntos cada letra incorrecta
     * @return Puntaje calculado
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        return 0;
    }
}

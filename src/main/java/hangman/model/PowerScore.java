package hangman.model;

public class PowerScore implements GameScore{

    /**
     * @pre El juego incia en 0 puntos
     * @pos El puntaje minimo es 0 puntos
     * @pos Si con las reglas expuestas el puntaje sobrepasa los 500 puntos, el puntaje es 600
     * @param correctCount La i-ésima letra correcta se bonifica con 5^i
     * @param incorrectCount Se penaliza con 8 puntos
     * @return puntaje calculado
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        return 0;
    }
}

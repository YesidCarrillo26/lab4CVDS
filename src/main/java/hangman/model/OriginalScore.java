package hangman.model;

public class OriginalScore implements GameScore{

    /**
     * @pre El juego inicia con 100 puntos
     * @pos El puntaje final minimo es de 0
     * @param correctCount no se bonifica las letras correctas
     * @param incorrectCount se penaliza con 10 puntos cada letra incorrecta
     * @return puntaje calculado
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws HangmanException{
        return 0;
    }
}

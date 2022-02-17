package hangman.model;

import hangman.exceptions.*;

public class OriginalScore implements GameScore{
    private final int puntaje = 100;
    /**
     * @pre Entra el numero de aciertos y el numero de letras incorrectas
     * @pos Devuelve el puntaje final teniendo en cuenta las condiciones
     * 
     * @param correctCount int Numero de letras correctas
     * @param incorrectCount int Numero de letras incorrectas
     * 
     * @throws ExcepcionParametrosInvalidos Ingresa parametros diferentes a los esperados
     */
    
    public int calculateScore(int correctCount,int incorrectCount) throws ExcepcionParametrosInvalidos{
        if(correctCount<0 || incorrectCount<0){
            throw new ExcepcionParametrosInvalidos(ExcepcionParametrosInvalidos.PARAMETRO_NEGATIVO);
        }
        else if(incorrectCount>10){
            return 0;
        }
        else{
            return puntaje-(incorrectCount*10);
        }
    }

    @Override
    public int getScore() {
        return puntaje;
    }
}
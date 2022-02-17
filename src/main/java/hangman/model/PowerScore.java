package hangman.model;

import hangman.exceptions.*;
import static com.google.common.math.IntMath.pow;

public class PowerScore implements GameScore{
    public final int puntaje = 0;
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
        return 0;
    }
}
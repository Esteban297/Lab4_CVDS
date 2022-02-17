package hangman.exceptions;

public class ExcepcionParametrosInvalidos extends Exception{
    public final static String PARAMETRO_NEGATIVO = "Se produjo un error ya que uno o ambos de los parametros ingresados son negativos";

    public ExcepcionParametrosInvalidos(String exception){
        super(exception);
    }
}
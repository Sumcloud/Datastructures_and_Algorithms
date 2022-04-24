package CustomExceptions;

public class ObjectNotFound extends Exception{
    public ObjectNotFound(String errorMessage, Throwable err){
        super(errorMessage, err);
    }
}

package test;

public  class DaoExeption extends RuntimeException {

    public DaoExeption(String message, Throwable cause) {
        super(message, cause);
    }

}
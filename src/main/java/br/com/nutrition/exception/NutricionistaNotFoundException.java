package br.com.nutrition.exception;

public class NutricionistaNotFoundException extends Exception {

  private static final long serialVersionUID = -7630009569979446777L;

  public NutricionistaNotFoundException() {
    super();
  }

  public NutricionistaNotFoundException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

  public NutricionistaNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }

  public NutricionistaNotFoundException(String message) {
    super(message);
  }

  public NutricionistaNotFoundException(Throwable cause) {
    super(cause);
  }

}

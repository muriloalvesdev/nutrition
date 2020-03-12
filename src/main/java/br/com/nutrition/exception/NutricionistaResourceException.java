package br.com.nutrition.exception;

public class NutricionistaResourceException extends Exception {

  private static final long serialVersionUID = -6681777147239341684L;

  public NutricionistaResourceException() {
    super();
  }

  public NutricionistaResourceException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

  public NutricionistaResourceException(String message, Throwable cause) {
    super(message, cause);
  }

  public NutricionistaResourceException(String message) {
    super(message);
  }

  public NutricionistaResourceException(Throwable cause) {
    super(cause);
  }

}

package com.tencent.recovery.crash;

public class DefaultExceptionHandler extends RecoveryExceptionHandler
{
  private Thread.UncaughtExceptionHandler Ard;

  public DefaultExceptionHandler(Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler)
  {
    this.Ard = paramUncaughtExceptionHandler;
  }

  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    super.uncaughtException(paramThread, paramThrowable);
    if (this.Ard != null)
      this.Ard.uncaughtException(paramThread, paramThrowable);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.recovery.crash.DefaultExceptionHandler
 * JD-Core Version:    0.6.2
 */
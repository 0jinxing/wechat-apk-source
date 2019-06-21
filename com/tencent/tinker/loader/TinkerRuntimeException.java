package com.tencent.tinker.loader;

public class TinkerRuntimeException extends RuntimeException
{
  public TinkerRuntimeException(String paramString)
  {
    super("Tinker Exception:".concat(String.valueOf(paramString)));
  }

  public TinkerRuntimeException(String paramString, Throwable paramThrowable)
  {
    super("Tinker Exception:".concat(String.valueOf(paramString)), paramThrowable);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.loader.TinkerRuntimeException
 * JD-Core Version:    0.6.2
 */
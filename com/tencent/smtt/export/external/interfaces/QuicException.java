package com.tencent.smtt.export.external.interfaces;

public abstract class QuicException extends NetworkException
{
  protected QuicException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }

  public abstract int getQuicDetailedErrorCode();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.export.external.interfaces.QuicException
 * JD-Core Version:    0.6.2
 */
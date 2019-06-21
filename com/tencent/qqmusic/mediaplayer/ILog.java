package com.tencent.qqmusic.mediaplayer;

public abstract interface ILog
{
  public abstract void d(String paramString1, String paramString2);

  public abstract void e(String paramString1, String paramString2);

  public abstract void e(String paramString1, String paramString2, Throwable paramThrowable);

  public abstract void e(String paramString1, String paramString2, Object[] paramArrayOfObject);

  public abstract void e(String paramString, Throwable paramThrowable);

  public abstract void i(String paramString1, String paramString2);

  public abstract void i(String paramString1, String paramString2, Throwable paramThrowable);

  public abstract void w(String paramString1, String paramString2);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.ILog
 * JD-Core Version:    0.6.2
 */
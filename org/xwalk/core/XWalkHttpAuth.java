package org.xwalk.core;

public abstract interface XWalkHttpAuth
{
  public abstract void cancel();

  public abstract boolean isFirstAttempt();

  public abstract void proceed(String paramString1, String paramString2);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     org.xwalk.core.XWalkHttpAuth
 * JD-Core Version:    0.6.2
 */
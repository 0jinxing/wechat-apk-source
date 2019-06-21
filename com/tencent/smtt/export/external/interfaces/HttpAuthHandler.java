package com.tencent.smtt.export.external.interfaces;

public abstract interface HttpAuthHandler
{
  public abstract void cancel();

  public abstract void proceed(String paramString1, String paramString2);

  public abstract boolean useHttpAuthUsernamePassword();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.export.external.interfaces.HttpAuthHandler
 * JD-Core Version:    0.6.2
 */
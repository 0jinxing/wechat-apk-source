package com.tencent.mm.opensdk.diffdev;

public abstract interface IDiffDevOAuth
{
  public abstract void addListener(OAuthListener paramOAuthListener);

  public abstract boolean auth(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, OAuthListener paramOAuthListener);

  public abstract void detach();

  public abstract void removeAllListeners();

  public abstract void removeListener(OAuthListener paramOAuthListener);

  public abstract boolean stopAuth();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
 * JD-Core Version:    0.6.2
 */
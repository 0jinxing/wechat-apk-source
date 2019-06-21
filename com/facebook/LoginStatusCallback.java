package com.facebook;

public abstract interface LoginStatusCallback
{
  public abstract void onCompleted(AccessToken paramAccessToken);

  public abstract void onError(Exception paramException);

  public abstract void onFailure();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.facebook.LoginStatusCallback
 * JD-Core Version:    0.6.2
 */
package com.facebook;

public abstract interface FacebookCallback<RESULT>
{
  public abstract void onCancel();

  public abstract void onError(FacebookException paramFacebookException);

  public abstract void onSuccess(RESULT paramRESULT);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.facebook.FacebookCallback
 * JD-Core Version:    0.6.2
 */
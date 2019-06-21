package com.facebook;

public abstract interface FacebookDialog<CONTENT, RESULT>
{
  public abstract boolean canShow(CONTENT paramCONTENT);

  public abstract void registerCallback(CallbackManager paramCallbackManager, FacebookCallback<RESULT> paramFacebookCallback);

  public abstract void registerCallback(CallbackManager paramCallbackManager, FacebookCallback<RESULT> paramFacebookCallback, int paramInt);

  public abstract void show(CONTENT paramCONTENT);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.facebook.FacebookDialog
 * JD-Core Version:    0.6.2
 */
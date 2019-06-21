package com.facebook.internal;

public abstract class FacebookDialogBase$ModeHandler
{
  protected FacebookDialogBase$ModeHandler(FacebookDialogBase paramFacebookDialogBase)
  {
  }

  public abstract boolean canShow(CONTENT paramCONTENT, boolean paramBoolean);

  public abstract AppCall createAppCall(CONTENT paramCONTENT);

  public Object getMode()
  {
    return FacebookDialogBase.BASE_AUTOMATIC_MODE;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.facebook.internal.FacebookDialogBase.ModeHandler
 * JD-Core Version:    0.6.2
 */
package com.facebook;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class FacebookDialogException extends FacebookException
{
  static final long serialVersionUID = 1L;
  private int errorCode;
  private String failingUrl;

  public FacebookDialogException(String paramString1, int paramInt, String paramString2)
  {
    super(paramString1);
    this.errorCode = paramInt;
    this.failingUrl = paramString2;
  }

  public int getErrorCode()
  {
    return this.errorCode;
  }

  public String getFailingUrl()
  {
    return this.failingUrl;
  }

  public final String toString()
  {
    AppMethodBeat.i(96594);
    String str = "{FacebookDialogException: errorCode: " + getErrorCode() + ", message: " + getMessage() + ", url: " + getFailingUrl() + "}";
    AppMethodBeat.o(96594);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.FacebookDialogException
 * JD-Core Version:    0.6.2
 */
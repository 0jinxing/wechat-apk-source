package com.facebook;

public class FacebookOperationCanceledException extends FacebookException
{
  static final long serialVersionUID = 1L;

  public FacebookOperationCanceledException()
  {
  }

  public FacebookOperationCanceledException(String paramString)
  {
    super(paramString);
  }

  public FacebookOperationCanceledException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }

  public FacebookOperationCanceledException(Throwable paramThrowable)
  {
    super(paramThrowable);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.facebook.FacebookOperationCanceledException
 * JD-Core Version:    0.6.2
 */
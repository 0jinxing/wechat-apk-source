package com.tencent.tmassistantsdk.downloadservice;

public class StopRequestException extends Exception
{
  protected static final long serialVersionUID = 1L;
  public final int mFinalErrCode;

  public StopRequestException(int paramInt, String paramString)
  {
    super(paramString);
    this.mFinalErrCode = paramInt;
  }

  public StopRequestException(int paramInt, Throwable paramThrowable)
  {
    super(paramThrowable);
    this.mFinalErrCode = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.downloadservice.StopRequestException
 * JD-Core Version:    0.6.2
 */
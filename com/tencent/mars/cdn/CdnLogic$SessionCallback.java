package com.tencent.mars.cdn;

public abstract interface CdnLogic$SessionCallback
{
  public abstract byte[] decodeSessionResponseBuf(String paramString, byte[] paramArrayOfByte);

  public abstract byte[] getSessionRequestBuf(String paramString, byte[] paramArrayOfByte);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mars.cdn.CdnLogic.SessionCallback
 * JD-Core Version:    0.6.2
 */
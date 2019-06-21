package com.tencent.mm.opensdk.diffdev;

public abstract interface OAuthListener
{
  public abstract void onAuthFinish(OAuthErrCode paramOAuthErrCode, String paramString);

  public abstract void onAuthGotQrcode(String paramString, byte[] paramArrayOfByte);

  public abstract void onQrcodeScanned();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.diffdev.OAuthListener
 * JD-Core Version:    0.6.2
 */
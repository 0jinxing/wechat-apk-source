package com.tencent.mm.plugin.appbrand.jsapi.websocket;

public abstract interface WcWss$a
{
  public abstract int doCertificateVerify(String paramString, byte[][] paramArrayOfByte);

  public abstract void onClose(String paramString1, int paramInt1, int paramInt2, String paramString2);

  public abstract void onHandShake(String paramString, int paramInt, String[] paramArrayOfString1, String[] paramArrayOfString2);

  public abstract void onMessage(String paramString, int paramInt, byte[] paramArrayOfByte, boolean paramBoolean);

  public abstract void onOpen(String paramString1, int paramInt1, boolean paramBoolean, String[] paramArrayOfString1, String[] paramArrayOfString2, int paramInt2, String paramString2);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.websocket.WcWss.a
 * JD-Core Version:    0.6.2
 */
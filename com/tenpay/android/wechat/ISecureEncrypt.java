package com.tenpay.android.wechat;

public abstract interface ISecureEncrypt
{
  public abstract String desedeEncode(String paramString1, String paramString2);

  public abstract String desedeVerifyCode(String paramString1, String paramString2);

  public abstract String encryptPasswd(boolean paramBoolean, String paramString1, String paramString2);

  public abstract String encryptPasswdWithRSA2048(boolean paramBoolean, String paramString1, String paramString2);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tenpay.android.wechat.ISecureEncrypt
 * JD-Core Version:    0.6.2
 */
package com.facebook.internal;

class NativeProtocol$KatanaAppInfo extends NativeProtocol.NativeAppInfo
{
  static final String KATANA_PACKAGE = "com.facebook.katana";

  private NativeProtocol$KatanaAppInfo()
  {
    super(null);
  }

  protected String getLoginActivity()
  {
    return "com.facebook.katana.ProxyAuth";
  }

  protected String getPackage()
  {
    return "com.facebook.katana";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.facebook.internal.NativeProtocol.KatanaAppInfo
 * JD-Core Version:    0.6.2
 */
package com.facebook.internal;

class NativeProtocol$WakizashiAppInfo extends NativeProtocol.NativeAppInfo
{
  static final String WAKIZASHI_PACKAGE = "com.facebook.wakizashi";

  private NativeProtocol$WakizashiAppInfo()
  {
    super(null);
  }

  protected String getLoginActivity()
  {
    return "com.facebook.katana.ProxyAuth";
  }

  protected String getPackage()
  {
    return "com.facebook.wakizashi";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.facebook.internal.NativeProtocol.WakizashiAppInfo
 * JD-Core Version:    0.6.2
 */
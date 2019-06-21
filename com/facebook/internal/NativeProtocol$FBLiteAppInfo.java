package com.facebook.internal;

class NativeProtocol$FBLiteAppInfo extends NativeProtocol.NativeAppInfo
{
  static final String FACEBOOK_LITE_ACTIVITY = "com.facebook.lite.platform.LoginGDPDialogActivity";
  static final String FBLITE_PACKAGE = "com.facebook.lite";

  private NativeProtocol$FBLiteAppInfo()
  {
    super(null);
  }

  protected String getLoginActivity()
  {
    return "com.facebook.lite.platform.LoginGDPDialogActivity";
  }

  protected String getPackage()
  {
    return "com.facebook.lite";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.internal.NativeProtocol.FBLiteAppInfo
 * JD-Core Version:    0.6.2
 */
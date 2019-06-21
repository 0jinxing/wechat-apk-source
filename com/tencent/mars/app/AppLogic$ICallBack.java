package com.tencent.mars.app;

public abstract interface AppLogic$ICallBack
{
  public abstract AppLogic.AccountInfo getAccountInfo();

  public abstract String getAppFilePath();

  public abstract int getClientVersion();

  public abstract String getCurLanguage();

  public abstract AppLogic.DeviceInfo getDeviceType();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mars.app.AppLogic.ICallBack
 * JD-Core Version:    0.6.2
 */
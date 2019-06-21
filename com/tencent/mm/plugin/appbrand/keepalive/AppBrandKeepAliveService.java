package com.tencent.mm.plugin.appbrand.keepalive;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class AppBrandKeepAliveService extends Service
{
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }

  public void onCreate()
  {
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    return 2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.keepalive.AppBrandKeepAliveService
 * JD-Core Version:    0.6.2
 */
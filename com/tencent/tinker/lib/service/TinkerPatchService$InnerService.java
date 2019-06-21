package com.tencent.tinker.lib.service;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.tencent.tinker.lib.util.a;

public class TinkerPatchService$InnerService extends Service
{
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }

  public void onCreate()
  {
    super.onCreate();
    try
    {
      int i = TinkerPatchService.access$000();
      Notification localNotification = new android/app/Notification;
      localNotification.<init>();
      startForeground(i, localNotification);
      stopSelf();
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        a.e("Tinker.TinkerPatchService", "InnerService set service for push exception:%s.", new Object[] { localThrowable });
    }
  }

  public void onDestroy()
  {
    stopForeground(true);
    super.onDestroy();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.lib.service.TinkerPatchService.InnerService
 * JD-Core Version:    0.6.2
 */
package com.tencent.recovery.service;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.IBinder;
import com.tencent.recovery.RecoveryLogic;
import com.tencent.recovery.log.RecoveryLog;
import com.tencent.recovery.model.RecoveryData;
import com.tencent.recovery.model.RecoveryHandleItem;
import com.tencent.recovery.model.RecoveryHandleResult;
import com.tencent.recovery.option.CommonOptions;
import com.tencent.recovery.option.OptionFactory;
import com.tencent.recovery.util.Util;
import java.util.ArrayList;

public class RecoveryHandleService extends IntentService
{
  private static volatile boolean running;

  public RecoveryHandleService()
  {
    super(RecoveryHandleService.class.getName());
  }

  protected RecoveryHandleResult a(Context paramContext, RecoveryData paramRecoveryData, ArrayList<RecoveryHandleItem> paramArrayList, boolean paramBoolean)
  {
    return new RecoveryHandleResult();
  }

  protected void a(RecoveryData paramRecoveryData, ArrayList<RecoveryHandleItem> paramArrayList, boolean paramBoolean)
  {
  }

  public void onCreate()
  {
    RecoveryLog.i("Recovery.RecoveryHandleService", "onCreate", new Object[0]);
    super.onCreate();
  }

  public void onDestroy()
  {
    RecoveryLog.i("Recovery.RecoveryHandleService", "onDestroy", new Object[0]);
    RecoveryLog.dQd();
    super.onDestroy();
  }

  protected final void onHandleIntent(Intent paramIntent)
  {
    boolean bool = paramIntent.getBooleanExtra("KeyIsRetry", false);
    int i = Util.iB(this);
    String str = paramIntent.getStringExtra("KeyReportUploadClassName");
    Object localObject1 = paramIntent.getStringExtra("KeyReportHandleClassName");
    RecoveryData localRecoveryData = (RecoveryData)paramIntent.getParcelableExtra("KeyRecoveryData");
    if ((localRecoveryData == null) || (localRecoveryData.processName == null))
    {
      RecoveryLog.i("Recovery.RecoveryHandleService", "recoveryData is null %b %d %s %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i), str, localObject1 });
      return;
    }
    ArrayList localArrayList = new ArrayList();
    paramIntent = new Intent();
    paramIntent.setClassName(this, (String)localObject1);
    paramIntent = PendingIntent.getService(this, 1000002, paramIntent, 536870912);
    if (paramIntent != null)
      paramIntent.cancel();
    if (running)
      RecoveryLog.i("Recovery.RecoveryHandleService", "handle already running", new Object[0]);
    while (true)
    {
      try
      {
        a(localRecoveryData, localArrayList, bool);
        RecoveryLogic.a(this, localArrayList, str);
        running = false;
        stopSelf();
      }
      catch (Exception paramIntent)
      {
        RecoveryLog.printErrStackTrace("Recovery.RecoveryHandleService", paramIntent, "alreadyRunning", new Object[0]);
        continue;
      }
      running = true;
      RecoveryLog.i("Recovery.RecoveryHandleService", "try to increase recovery process priority", new Object[0]);
      try
      {
        paramIntent = new android/app/Notification;
        paramIntent.<init>();
        if (Build.VERSION.SDK_INT < 18)
        {
          startForeground(-1119860829, paramIntent);
          RecoveryLog.i("Recovery.RecoveryHandleService", "start to handle %s's exception uuid: %s threadId: %d", new Object[] { localRecoveryData.processName, localRecoveryData.eCq, Long.valueOf(Thread.currentThread().getId()) });
          paramIntent = new RecoveryHandleResult();
        }
      }
      catch (Throwable paramIntent)
      {
        try
        {
          while (true)
          {
            Object localObject2 = a(this, localRecoveryData, localArrayList, bool);
            paramIntent = (Intent)localObject2;
            if ((paramIntent.retry) && (!bool))
            {
              localObject2 = new Intent();
              ((Intent)localObject2).setClassName(this, (String)localObject1);
              ((Intent)localObject2).putExtra("KeyReportUploadClassName", str);
              ((Intent)localObject2).putExtra("KeyReportHandleClassName", (String)localObject1);
              ((Intent)localObject2).putExtra("KeyRecoveryData", localRecoveryData);
              ((Intent)localObject2).putExtra("KeyIsRetry", true);
              localObject1 = PendingIntent.getService(this, 1000002, (Intent)localObject2, 536870912);
              if (localObject1 != null)
                ((PendingIntent)localObject1).cancel();
              localObject1 = OptionFactory.iz(this);
              localObject2 = PendingIntent.getService(this, 1000002, (Intent)localObject2, 0);
              long l = System.currentTimeMillis() + ((CommonOptions)localObject1).Ars - 2000L;
              ((AlarmManager)getSystemService("alarm")).set(0, l, (PendingIntent)localObject2);
              RecoveryLog.i("Recovery.RecoveryHandleService", "startAlarm pendingIntent success: %d will retry %s", new Object[] { Integer.valueOf(((PendingIntent)localObject2).hashCode()), Util.nz(l) });
            }
            RecoveryLog.i("Recovery.RecoveryHandleService", "handle recoveryHandleResult %s", new Object[] { paramIntent });
            break;
            startForeground(-1119860829, paramIntent);
            paramIntent = new android/content/Intent;
            paramIntent.<init>(this, InnerService.class);
            startService(paramIntent);
          }
          paramIntent = paramIntent;
          RecoveryLog.i("Recovery.RecoveryHandleService", "try to increase recovery process priority error:".concat(String.valueOf(paramIntent)), new Object[0]);
        }
        catch (Exception localException)
        {
          while (true)
            RecoveryLog.printErrStackTrace("Recovery.RecoveryHandleService", localException, "handle", new Object[0]);
        }
      }
    }
  }

  public static class InnerService extends Service
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
        Notification localNotification = new android/app/Notification;
        localNotification.<init>();
        startForeground(-1119860829, localNotification);
        stopSelf();
        return;
      }
      catch (Throwable localThrowable)
      {
        while (true)
          RecoveryLog.e("Recovery.RecoveryHandleService", "InnerService set service for push exception:%s.", new Object[] { localThrowable });
      }
    }

    public void onDestroy()
    {
      stopForeground(true);
      super.onDestroy();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.recovery.service.RecoveryHandleService
 * JD-Core Version:    0.6.2
 */
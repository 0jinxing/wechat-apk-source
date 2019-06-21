package com.tencent.recovery.service;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.tencent.recovery.log.RecoveryFileLog;
import com.tencent.recovery.log.RecoveryLog;
import com.tencent.recovery.option.CommonOptions;
import com.tencent.recovery.option.OptionFactory;
import com.tencent.recovery.util.Util;

public class RecoveryUploadService extends IntentService
{
  private static final String TAG = "Recovery.RecoveryUploadService";

  public RecoveryUploadService()
  {
    super(RecoveryUploadService.class.getName());
  }

  public static void cancelAlarm(Context paramContext, String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.setClassName(paramContext, paramString);
    localIntent.putExtra("KeyReportUploadClassName", paramString);
    paramContext = PendingIntent.getService(paramContext, 1000001, localIntent, 536870912);
    if (paramContext != null)
      paramContext.cancel();
  }

  // ERROR //
  public static void startAlarm(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aload_1
    //   4: invokestatic 56	com/tencent/recovery/util/Util:isNullOrNil	(Ljava/lang/String;)Z
    //   7: istore_2
    //   8: iload_2
    //   9: ifeq +7 -> 16
    //   12: ldc 2
    //   14: monitorexit
    //   15: return
    //   16: aload_0
    //   17: invokestatic 62	com/tencent/recovery/option/OptionFactory:iz	(Landroid/content/Context;)Lcom/tencent/recovery/option/CommonOptions;
    //   20: astore_3
    //   21: aload_0
    //   22: ldc 64
    //   24: iconst_0
    //   25: invokevirtual 70	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   28: astore 4
    //   30: aload 4
    //   32: ldc 72
    //   34: lconst_0
    //   35: invokeinterface 78 4 0
    //   40: lstore 5
    //   42: invokestatic 84	java/lang/System:currentTimeMillis	()J
    //   45: lstore 7
    //   47: ldc 8
    //   49: ldc 86
    //   51: iconst_2
    //   52: anewarray 88	java/lang/Object
    //   55: dup
    //   56: iconst_0
    //   57: aload_1
    //   58: aastore
    //   59: dup
    //   60: iconst_1
    //   61: lload 5
    //   63: invokestatic 92	com/tencent/recovery/util/Util:nz	(J)Ljava/lang/String;
    //   66: aastore
    //   67: invokestatic 98	com/tencent/recovery/log/RecoveryLog:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   70: new 24	android/content/Intent
    //   73: astore 9
    //   75: aload 9
    //   77: invokespecial 26	android/content/Intent:<init>	()V
    //   80: aload 9
    //   82: aload_0
    //   83: aload_1
    //   84: invokevirtual 30	android/content/Intent:setClassName	(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    //   87: pop
    //   88: aload 9
    //   90: ldc 32
    //   92: aload_1
    //   93: invokevirtual 36	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   96: pop
    //   97: aload_0
    //   98: ldc 37
    //   100: aload 9
    //   102: ldc 38
    //   104: invokestatic 44	android/app/PendingIntent:getService	(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
    //   107: astore_1
    //   108: aload_1
    //   109: ifnull +16 -> 125
    //   112: lload 7
    //   114: lload 5
    //   116: lsub
    //   117: aload_3
    //   118: getfield 104	com/tencent/recovery/option/CommonOptions:Arr	J
    //   121: lcmp
    //   122: ifle +124 -> 246
    //   125: aload_1
    //   126: ifnull +18 -> 144
    //   129: aload_1
    //   130: invokevirtual 47	android/app/PendingIntent:cancel	()V
    //   133: ldc 8
    //   135: ldc 106
    //   137: iconst_0
    //   138: anewarray 88	java/lang/Object
    //   141: invokestatic 98	com/tencent/recovery/log/RecoveryLog:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   144: aload 4
    //   146: invokeinterface 110 1 0
    //   151: ldc 72
    //   153: lload 7
    //   155: invokeinterface 116 4 0
    //   160: invokeinterface 120 1 0
    //   165: pop
    //   166: aload_0
    //   167: ldc 37
    //   169: aload 9
    //   171: ldc 121
    //   173: invokestatic 44	android/app/PendingIntent:getService	(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
    //   176: astore_1
    //   177: aload_3
    //   178: getfield 104	com/tencent/recovery/option/CommonOptions:Arr	J
    //   181: lload 7
    //   183: ladd
    //   184: ldc2_w 122
    //   187: lsub
    //   188: lstore 7
    //   190: aload_0
    //   191: ldc 125
    //   193: invokevirtual 129	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   196: checkcast 131	android/app/AlarmManager
    //   199: astore_0
    //   200: aload_0
    //   201: iconst_0
    //   202: lload 7
    //   204: aload_1
    //   205: invokevirtual 135	android/app/AlarmManager:set	(IJLandroid/app/PendingIntent;)V
    //   208: ldc 8
    //   210: ldc 137
    //   212: iconst_2
    //   213: anewarray 88	java/lang/Object
    //   216: dup
    //   217: iconst_0
    //   218: aload_1
    //   219: invokevirtual 141	android/app/PendingIntent:hashCode	()I
    //   222: invokestatic 147	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   225: aastore
    //   226: dup
    //   227: iconst_1
    //   228: lload 7
    //   230: invokestatic 92	com/tencent/recovery/util/Util:nz	(J)Ljava/lang/String;
    //   233: aastore
    //   234: invokestatic 98	com/tencent/recovery/log/RecoveryLog:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   237: goto -225 -> 12
    //   240: astore_0
    //   241: ldc 2
    //   243: monitorexit
    //   244: aload_0
    //   245: athrow
    //   246: ldc 8
    //   248: ldc 149
    //   250: iconst_0
    //   251: anewarray 88	java/lang/Object
    //   254: invokestatic 98	com/tencent/recovery/log/RecoveryLog:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   257: goto -245 -> 12
    //   260: astore_0
    //   261: ldc 8
    //   263: aload_0
    //   264: ldc 151
    //   266: iconst_0
    //   267: anewarray 88	java/lang/Object
    //   270: invokestatic 155	com/tencent/recovery/log/RecoveryLog:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   273: goto -65 -> 208
    //
    // Exception table:
    //   from	to	target	type
    //   3	8	240	finally
    //   16	108	240	finally
    //   112	125	240	finally
    //   129	144	240	finally
    //   144	200	240	finally
    //   200	208	240	finally
    //   208	237	240	finally
    //   246	257	240	finally
    //   261	273	240	finally
    //   200	208	260	java/lang/Exception
  }

  public static void startAlarmAfter(Context paramContext, String paramString, long paramLong)
  {
    if (Util.isNullOrNil(paramString));
    while (true)
    {
      return;
      RecoveryLog.i("Recovery.RecoveryUploadService", "startAlarmAfter %s %d", new Object[] { paramString, Long.valueOf(paramLong) });
      Intent localIntent = new Intent();
      localIntent.setClassName(paramContext, paramString);
      localIntent.putExtra("KeyReportUploadClassName", paramString);
      paramString = PendingIntent.getService(paramContext, 1000001, localIntent, 536870912);
      if (paramString != null)
        paramString.cancel();
      paramLong = System.currentTimeMillis() + paramLong - 2000L;
      paramString = PendingIntent.getService(paramContext, 1000001, localIntent, 134217728);
      paramContext = (AlarmManager)paramContext.getSystemService("alarm");
      try
      {
        paramContext.set(0, paramLong, paramString);
        RecoveryLog.i("Recovery.RecoveryUploadService", "startAlarmAfter pendingIntent:%d %s", new Object[] { Integer.valueOf(paramString.hashCode()), Util.nz(paramLong) });
      }
      catch (Exception paramContext)
      {
        while (true)
          RecoveryLog.printErrStackTrace("Recovery.RecoveryUploadService", paramContext, "alarmManager.setAlarm", new Object[0]);
      }
    }
  }

  protected void onHandleIntent(Intent paramIntent)
  {
    RecoveryLog.i("Recovery.RecoveryUploadService", "RecoveryUploadReceiver.onHandleIntent", new Object[0]);
    boolean bool = tryToUploadData();
    String str = paramIntent.getStringExtra("KeyReportUploadClassName");
    paramIntent = str;
    if (Util.isNullOrNil(str))
      paramIntent = getClass().getName();
    cancelAlarm(this, paramIntent);
    if (!bool)
      startAlarmAfter(this, paramIntent, OptionFactory.iz(this).Arr);
    RecoveryLog.i("Recovery.RecoveryUploadService", "RecoveryUploadReceiver.uploadDataResult %b", new Object[] { Boolean.valueOf(bool) });
    if ((RecoveryLog.dQe() instanceof RecoveryFileLog))
    {
      RecoveryLog.i("Recovery.RecoveryUploadService", "send broadcast action", new Object[0]);
      RecoveryLog.dQd();
      paramIntent = new Intent();
      paramIntent.setPackage(getPackageName());
      paramIntent.setAction("com.tecent.recovery.intent.action.LOG");
      sendBroadcast(paramIntent);
    }
    stopSelf();
  }

  protected boolean tryToUploadData()
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.recovery.service.RecoveryUploadService
 * JD-Core Version:    0.6.2
 */
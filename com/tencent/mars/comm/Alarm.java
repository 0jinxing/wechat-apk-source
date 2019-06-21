package com.tencent.mars.comm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.Process;
import android.os.SystemClock;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

public class Alarm extends BroadcastReceiver
{
  private static final String KEXTRA_ID = "ID";
  private static final String KEXTRA_PID = "PID";
  private static final String TAG = "MicroMsg.Alarm";
  private static Alarm bc_alarm = null;
  private static TreeMap<Long, AlarmRecord> gPendingAlarms = new TreeMap();
  private static WakerLock wakerlock = null;

  private static boolean cancelAlarmMgr(Context paramContext, PendingIntent paramPendingIntent)
  {
    paramContext = (AlarmManager)paramContext.getSystemService("alarm");
    boolean bool;
    if (paramContext == null)
    {
      ab.e("MicroMsg.Alarm", "am == null");
      bool = false;
    }
    while (true)
    {
      return bool;
      if (paramPendingIntent == null)
      {
        ab.e("MicroMsg.Alarm", "pendingIntent == null");
        bool = false;
      }
      else
      {
        paramContext.cancel(paramPendingIntent);
        paramPendingIntent.cancel();
        bool = true;
      }
    }
  }

  private native void onAlarm(long paramLong);

  public static void resetAlarm(Context paramContext)
  {
    synchronized (gPendingAlarms)
    {
      Iterator localIterator = gPendingAlarms.values().iterator();
      if (localIterator.hasNext())
        cancelAlarmMgr(paramContext, ((AlarmRecord)localIterator.next()).pendingIntent);
    }
    gPendingAlarms.clear();
    if (bc_alarm != null)
    {
      paramContext.unregisterReceiver(bc_alarm);
      bc_alarm = null;
    }
  }

  private static PendingIntent setAlarmMgr(long paramLong1, long paramLong2, Context paramContext)
  {
    AlarmManager localAlarmManager = (AlarmManager)paramContext.getSystemService("alarm");
    if (localAlarmManager == null)
    {
      ab.e("MicroMsg.Alarm", "am == null");
      paramContext = null;
      return paramContext;
    }
    Intent localIntent = new Intent();
    localIntent.setAction("ALARM_ACTION(" + String.valueOf(Process.myPid()) + ")");
    localIntent.putExtra("ID", paramLong1);
    localIntent.putExtra("PID", Process.myPid());
    paramContext = PendingIntent.getBroadcast(paramContext, (int)paramLong1, localIntent, 268435456);
    if (Build.VERSION.SDK_INT >= 19)
      localAlarmManager.setExact(2, paramLong2, paramContext);
    while (true)
    {
      break;
      localAlarmManager.set(2, paramLong2, paramContext);
    }
  }

  public static boolean start(long paramLong, int paramInt, Context paramContext)
  {
    boolean bool = false;
    long l1 = SystemClock.elapsedRealtime();
    if (paramInt < 0)
      ab.e("MicroMsg.Alarm", "id:%d, after:%d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt) });
    while (true)
    {
      return bool;
      if (paramContext == null)
      {
        ab.e("MicroMsg.Alarm", "null==context, id:%d, after:%d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt) });
      }
      else
      {
        synchronized (gPendingAlarms)
        {
          if (wakerlock == null)
          {
            localObject1 = new com/tencent/mars/comm/WakerLock;
            ((WakerLock)localObject1).<init>(paramContext, "MicroMsg.Alarm");
            wakerlock = (WakerLock)localObject1;
            ab.i("MicroMsg.Alarm", "start new wakerlock");
          }
          if (bc_alarm == null)
          {
            localObject1 = new com/tencent/mars/comm/Alarm;
            ((Alarm)localObject1).<init>();
            bc_alarm = (Alarm)localObject1;
            Alarm localAlarm = bc_alarm;
            localObject2 = new android/content/IntentFilter;
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>("ALARM_ACTION(");
            ((IntentFilter)localObject2).<init>(String.valueOf(Process.myPid()) + ")");
            paramContext.registerReceiver(localAlarm, (IntentFilter)localObject2);
          }
          if (gPendingAlarms.containsKey(Long.valueOf(paramLong)))
            ab.e("MicroMsg.Alarm", "id exist=%d", new Object[] { Long.valueOf(paramLong) });
        }
        long l2 = l1;
        if (paramInt >= 0)
          l2 = l1 + paramInt;
        Object localObject1 = setAlarmMgr(paramLong, l2, paramContext);
        if (localObject1 == null);
        paramContext = gPendingAlarms;
        Object localObject2 = new com/tencent/mars/comm/Alarm$AlarmRecord;
        ((AlarmRecord)localObject2).<init>(paramLong, l2, (PendingIntent)localObject1);
        paramContext.put(Long.valueOf(paramLong), localObject2);
        ab.i("MicroMsg.Alarm", "Alarm.start [id: %d, after: %d, size: %d]", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt), Integer.valueOf(gPendingAlarms.size()) });
        bool = true;
      }
    }
  }

  public static boolean stop(long paramLong, Context paramContext)
  {
    ab.i("MicroMsg.Alarm", "Alarm.stop [id: %d]", new Object[] { Long.valueOf(paramLong) });
    boolean bool;
    if (paramContext == null)
    {
      ab.e("MicroMsg.Alarm", "context==null");
      bool = false;
    }
    while (true)
    {
      return bool;
      synchronized (gPendingAlarms)
      {
        if (wakerlock == null)
        {
          localObject = new com/tencent/mars/comm/WakerLock;
          ((WakerLock)localObject).<init>(paramContext, "MicroMsg.Alarm");
          wakerlock = (WakerLock)localObject;
          ab.i("MicroMsg.Alarm", "stop new wakerlock");
        }
        if (bc_alarm == null)
        {
          localObject = new com/tencent/mars/comm/Alarm;
          ((Alarm)localObject).<init>();
          bc_alarm = (Alarm)localObject;
          localObject = new android/content/IntentFilter;
          ((IntentFilter)localObject).<init>();
          paramContext.registerReceiver(bc_alarm, (IntentFilter)localObject);
          ab.i("MicroMsg.Alarm", "stop new Alarm");
        }
        Object localObject = (AlarmRecord)gPendingAlarms.remove(Long.valueOf(paramLong));
        if (localObject != null)
        {
          cancelAlarmMgr(paramContext, ((AlarmRecord)localObject).pendingIntent);
          bool = true;
          continue;
        }
        bool = false;
      }
    }
  }

  public void onReceive(Context arg1, Intent paramIntent)
  {
    if ((??? == null) || (paramIntent == null));
    long l;
    int i;
    while (true)
    {
      return;
      l = paramIntent.getLongExtra("ID", 0L);
      i = paramIntent.getIntExtra("PID", 0);
      if ((0L != l) && (i != 0))
      {
        if (i == Process.myPid())
          break;
        ab.w("MicroMsg.Alarm", "onReceive id:%d, pid:%d, mypid:%d", new Object[] { Long.valueOf(l), Integer.valueOf(i), Integer.valueOf(Process.myPid()) });
      }
    }
    while (true)
    {
      synchronized (gPendingAlarms)
      {
        paramIntent = (AlarmRecord)gPendingAlarms.remove(Long.valueOf(l));
        if (paramIntent != null)
        {
          ab.i("MicroMsg.Alarm", "Alarm.onReceive [id: %d, delta miss time: %d, size: %d]", new Object[] { Long.valueOf(l), Long.valueOf(SystemClock.elapsedRealtime() - paramIntent.waitTime), Integer.valueOf(gPendingAlarms.size()) });
          if (wakerlock != null)
            wakerlock.lock(200L, "Alarm.onReceive");
          onAlarm(l);
        }
      }
      ab.e("MicroMsg.Alarm", "onReceive not found id:%d, pid:%d, gPendingAlarms.size:%d", new Object[] { Long.valueOf(l), Integer.valueOf(i), Integer.valueOf(gPendingAlarms.size()) });
    }
  }

  static class AlarmRecord
    implements Comparable<AlarmRecord>
  {
    final long id;
    PendingIntent pendingIntent;
    long waitTime;

    AlarmRecord(long paramLong1, long paramLong2, PendingIntent paramPendingIntent)
    {
      this.id = paramLong1;
      this.waitTime = paramLong2;
      this.pendingIntent = paramPendingIntent;
    }

    public int compareTo(AlarmRecord paramAlarmRecord)
    {
      return (int)(this.id - paramAlarmRecord.id);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mars.comm.Alarm
 * JD-Core Version:    0.6.2
 */
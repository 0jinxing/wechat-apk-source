package com.tencent.voip.mars.comm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.Process;
import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.voip.mars.xlog.Log;
import java.util.Iterator;
import java.util.TreeSet;

public class Alarm extends BroadcastReceiver
{
  private static final String KEXTRA_ID = "ID";
  private static final String KEXTRA_PID = "PID";
  private static final String TAG = "MicroMsg.Alarm";
  private static TreeSet<Object[]> alarm_waiting_set;
  private static Alarm bc_alarm;
  private static WakerLock wakerlock;

  static
  {
    AppMethodBeat.i(92763);
    wakerlock = null;
    bc_alarm = null;
    alarm_waiting_set = new TreeSet(new Alarm.ComparatorAlarm(null));
    AppMethodBeat.o(92763);
  }

  private static boolean cancelAlarmMgr(Context paramContext, PendingIntent paramPendingIntent)
  {
    AppMethodBeat.i(92761);
    paramContext = (AlarmManager)paramContext.getSystemService("alarm");
    boolean bool;
    if (paramContext == null)
    {
      Log.e("MicroMsg.Alarm", "am == null");
      AppMethodBeat.o(92761);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (paramPendingIntent == null)
      {
        Log.e("MicroMsg.Alarm", "pendingIntent == null");
        AppMethodBeat.o(92761);
        bool = false;
      }
      else
      {
        paramContext.cancel(paramPendingIntent);
        paramPendingIntent.cancel();
        bool = true;
        AppMethodBeat.o(92761);
      }
    }
  }

  private native void onAlarm(long paramLong);

  public static void resetAlarm(Context paramContext)
  {
    AppMethodBeat.i(92757);
    synchronized (alarm_waiting_set)
    {
      Iterator localIterator = alarm_waiting_set.iterator();
      if (localIterator.hasNext())
        cancelAlarmMgr(paramContext, (PendingIntent)((Object[])localIterator.next())[Alarm.TSetData.PENDINGINTENT.ordinal()]);
    }
    alarm_waiting_set.clear();
    if (bc_alarm != null)
    {
      paramContext.unregisterReceiver(bc_alarm);
      bc_alarm = null;
    }
    AppMethodBeat.o(92757);
  }

  private static PendingIntent setAlarmMgr(long paramLong1, long paramLong2, Context paramContext)
  {
    AppMethodBeat.i(92760);
    AlarmManager localAlarmManager = (AlarmManager)paramContext.getSystemService("alarm");
    if (localAlarmManager == null)
    {
      Log.e("MicroMsg.Alarm", "am == null");
      paramContext = null;
      AppMethodBeat.o(92760);
      return paramContext;
    }
    Intent localIntent = new Intent();
    localIntent.setAction("ALARM_ACTION(" + String.valueOf(Process.myPid()) + ")");
    localIntent.putExtra("ID", paramLong1);
    localIntent.putExtra("PID", Process.myPid());
    paramContext = PendingIntent.getBroadcast(paramContext, (int)paramLong1, localIntent, 268435456);
    if (Build.VERSION.SDK_INT < 19)
      localAlarmManager.set(2, paramLong2, paramContext);
    while (true)
    {
      AppMethodBeat.o(92760);
      break;
      localAlarmManager.setExact(2, paramLong2, paramContext);
    }
  }

  public static boolean start(long paramLong, int paramInt, Context paramContext)
  {
    AppMethodBeat.i(92758);
    long l1 = SystemClock.elapsedRealtime();
    boolean bool;
    if (paramInt < 0)
    {
      Log.e("MicroMsg.Alarm", "id:%d, after:%d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt) });
      AppMethodBeat.o(92758);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (paramContext == null)
      {
        Log.e("MicroMsg.Alarm", "null==context, id:%d, after:%d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt) });
        AppMethodBeat.o(92758);
        bool = false;
        continue;
      }
      synchronized (alarm_waiting_set)
      {
        if (wakerlock == null)
        {
          localObject = new com/tencent/voip/mars/comm/WakerLock;
          ((WakerLock)localObject).<init>(paramContext);
          wakerlock = (WakerLock)localObject;
          Log.i("MicroMsg.Alarm", "start new wakerlock");
        }
        if (bc_alarm == null)
        {
          localObject = new com/tencent/voip/mars/comm/Alarm;
          ((Alarm)localObject).<init>();
          bc_alarm = (Alarm)localObject;
          Alarm localAlarm = bc_alarm;
          IntentFilter localIntentFilter = new android/content/IntentFilter;
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>("ALARM_ACTION(");
          localIntentFilter.<init>(String.valueOf(Process.myPid()) + ")");
          paramContext.registerReceiver(localAlarm, localIntentFilter);
        }
        Object localObject = alarm_waiting_set.iterator();
        while (true)
          if (((Iterator)localObject).hasNext())
            if (((Long)((Object[])localObject.next())[Alarm.TSetData.ID.ordinal()]).longValue() == paramLong)
            {
              Log.e("MicroMsg.Alarm", "id exist=%d", new Object[] { Long.valueOf(paramLong) });
              AppMethodBeat.o(92758);
              bool = false;
              break;
            }
        long l2 = l1;
        if (paramInt >= 0)
          l2 = l1 + paramInt;
        paramContext = setAlarmMgr(paramLong, l2, paramContext);
        if (paramContext == null)
        {
          AppMethodBeat.o(92758);
          bool = false;
          continue;
        }
        alarm_waiting_set.add(new Object[] { Long.valueOf(paramLong), Long.valueOf(l2), paramContext });
        AppMethodBeat.o(92758);
        bool = true;
      }
    }
  }

  public static boolean stop(long paramLong, Context paramContext)
  {
    AppMethodBeat.i(92759);
    boolean bool;
    if (paramContext == null)
    {
      Log.e("MicroMsg.Alarm", "context==null");
      AppMethodBeat.o(92759);
      bool = false;
    }
    while (true)
    {
      return bool;
      synchronized (alarm_waiting_set)
      {
        if (wakerlock == null)
        {
          localObject = new com/tencent/voip/mars/comm/WakerLock;
          ((WakerLock)localObject).<init>(paramContext);
          wakerlock = (WakerLock)localObject;
          Log.i("MicroMsg.Alarm", "stop new wakerlock");
        }
        if (bc_alarm == null)
        {
          localObject = new com/tencent/voip/mars/comm/Alarm;
          ((Alarm)localObject).<init>();
          bc_alarm = (Alarm)localObject;
          localObject = new android/content/IntentFilter;
          ((IntentFilter)localObject).<init>();
          paramContext.registerReceiver(bc_alarm, (IntentFilter)localObject);
          Log.i("MicroMsg.Alarm", "stop new Alarm");
        }
        Object localObject = alarm_waiting_set.iterator();
        while (true)
          if (((Iterator)localObject).hasNext())
          {
            Object[] arrayOfObject = (Object[])((Iterator)localObject).next();
            if (((Long)arrayOfObject[Alarm.TSetData.ID.ordinal()]).longValue() == paramLong)
            {
              cancelAlarmMgr(paramContext, (PendingIntent)arrayOfObject[Alarm.TSetData.PENDINGINTENT.ordinal()]);
              ((Iterator)localObject).remove();
              bool = true;
              AppMethodBeat.o(92759);
              break;
            }
          }
        AppMethodBeat.o(92759);
        bool = false;
      }
    }
  }

  public void onReceive(Context arg1, Intent paramIntent)
  {
    AppMethodBeat.i(92762);
    if ((??? == null) || (paramIntent == null))
      AppMethodBeat.o(92762);
    Long localLong;
    Integer localInteger;
    while (true)
    {
      return;
      localLong = Long.valueOf(paramIntent.getLongExtra("ID", 0L));
      localInteger = Integer.valueOf(paramIntent.getIntExtra("PID", 0));
      if ((0L == localLong.longValue()) || (localInteger.intValue() == 0))
      {
        AppMethodBeat.o(92762);
      }
      else
      {
        if (localInteger.intValue() == Process.myPid())
          break;
        Log.w("MicroMsg.Alarm", "onReceive id:%d, pid:%d, mypid:%d", new Object[] { localLong, localInteger, Integer.valueOf(Process.myPid()) });
        AppMethodBeat.o(92762);
      }
    }
    while (true)
    {
      synchronized (alarm_waiting_set)
      {
        Iterator localIterator = alarm_waiting_set.iterator();
        if (localIterator.hasNext())
        {
          Object[] arrayOfObject = (Object[])localIterator.next();
          paramIntent = (Long)arrayOfObject[Alarm.TSetData.ID.ordinal()];
          Log.i("MicroMsg.Alarm", "onReceive id=%d, curId=%d", new Object[] { localLong, paramIntent });
          if (!paramIntent.equals(localLong))
            continue;
          Log.i("MicroMsg.Alarm", "onReceive find alarm id:%d, pid:%d, delta miss time:%d", new Object[] { localLong, localInteger, Long.valueOf(SystemClock.elapsedRealtime() - ((Long)arrayOfObject[Alarm.TSetData.WAITTIME.ordinal()]).longValue()) });
          localIterator.remove();
          i = 1;
          if (i == 0)
            Log.e("MicroMsg.Alarm", "onReceive not found id:%d, pid:%d, alarm_waiting_set.size:%d", new Object[] { localLong, localInteger, Integer.valueOf(alarm_waiting_set.size()) });
          if (wakerlock != null)
            wakerlock.lock(200L);
          if (i != 0)
            onAlarm(localLong.longValue());
          AppMethodBeat.o(92762);
        }
      }
      int i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.voip.mars.comm.Alarm
 * JD-Core Version:    0.6.2
 */
package com.google.android.gms.common.stats;

import android.content.AbstractThreadedSyncAdapter;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager.WakeLock;
import android.os.Process;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class StatsUtils
{
  public static String getEventKey(AbstractThreadedSyncAdapter paramAbstractThreadedSyncAdapter, String paramString)
  {
    AppMethodBeat.i(89972);
    String str = String.valueOf(String.valueOf(Process.myPid() << 32 | System.identityHashCode(paramAbstractThreadedSyncAdapter)));
    paramAbstractThreadedSyncAdapter = paramString;
    if (TextUtils.isEmpty(paramString))
      paramAbstractThreadedSyncAdapter = "";
    paramAbstractThreadedSyncAdapter = String.valueOf(paramAbstractThreadedSyncAdapter);
    if (paramAbstractThreadedSyncAdapter.length() != 0)
    {
      paramAbstractThreadedSyncAdapter = str.concat(paramAbstractThreadedSyncAdapter);
      AppMethodBeat.o(89972);
    }
    while (true)
    {
      return paramAbstractThreadedSyncAdapter;
      paramAbstractThreadedSyncAdapter = new String(str);
      AppMethodBeat.o(89972);
    }
  }

  public static String getEventKey(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(89970);
    long l1 = System.identityHashCode(paramContext);
    long l2 = System.identityHashCode(paramIntent);
    AppMethodBeat.o(89970);
    return String.valueOf(l1 << 32 | l2);
  }

  public static String getEventKey(PowerManager.WakeLock paramWakeLock, String paramString)
  {
    AppMethodBeat.i(89971);
    String str = String.valueOf(String.valueOf(Process.myPid() << 32 | System.identityHashCode(paramWakeLock)));
    paramWakeLock = paramString;
    if (TextUtils.isEmpty(paramString))
      paramWakeLock = "";
    paramWakeLock = String.valueOf(paramWakeLock);
    if (paramWakeLock.length() != 0)
    {
      paramWakeLock = str.concat(paramWakeLock);
      AppMethodBeat.o(89971);
    }
    while (true)
    {
      return paramWakeLock;
      paramWakeLock = new String(str);
      AppMethodBeat.o(89971);
    }
  }

  public static boolean isLoggingEnabled()
  {
    boolean bool = true;
    AppMethodBeat.i(89969);
    StatisticalEventTrackerProvider.StatisticalEventTracker localStatisticalEventTracker = StatisticalEventTrackerProvider.getImpl();
    if ((localStatisticalEventTracker != null) && (localStatisticalEventTracker.isEnabled()) && ((zza(Integer.valueOf(localStatisticalEventTracker.getLogLevel(3)))) || (zza(Integer.valueOf(localStatisticalEventTracker.getLogLevel(2)))) || (zza(Integer.valueOf(localStatisticalEventTracker.getLogLevel(1))))))
      AppMethodBeat.o(89969);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(89969);
    }
  }

  public static boolean isTimeOutEvent(StatsEvent paramStatsEvent)
  {
    AppMethodBeat.i(89973);
    boolean bool;
    switch (paramStatsEvent.getEventType())
    {
    default:
      bool = false;
      AppMethodBeat.o(89973);
    case 6:
    case 9:
    case 12:
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(89973);
    }
  }

  private static boolean zza(Integer paramInteger)
  {
    AppMethodBeat.i(89968);
    boolean bool;
    if (!paramInteger.equals(Integer.valueOf(LoggingConstants.LOG_LEVEL_OFF)))
    {
      bool = true;
      AppMethodBeat.o(89968);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(89968);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.stats.StatsUtils
 * JD-Core Version:    0.6.2
 */
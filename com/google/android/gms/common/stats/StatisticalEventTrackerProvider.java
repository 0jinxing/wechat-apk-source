package com.google.android.gms.common.stats;

import android.os.Bundle;

public class StatisticalEventTrackerProvider
{
  private static StatisticalEventTracker zzyp;

  public static StatisticalEventTracker getImpl()
  {
    return zzyp;
  }

  public static void setImpl(StatisticalEventTracker paramStatisticalEventTracker)
  {
    zzyp = paramStatisticalEventTracker;
  }

  public static abstract interface StatisticalEventTracker
  {
    public abstract int getLogLevel(int paramInt);

    public abstract Bundle getOptions();

    public abstract boolean isEnabled();

    public abstract void registerEvent(ConnectionEvent paramConnectionEvent);

    public abstract void registerEvent(StatsEvent paramStatsEvent);

    public abstract void registerEvent(WakeLockEvent paramWakeLockEvent);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.stats.StatisticalEventTrackerProvider
 * JD-Core Version:    0.6.2
 */
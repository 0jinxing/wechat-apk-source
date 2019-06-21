package com.google.android.gms.common.stats;

public abstract interface StatisticsTracker
{
  public abstract void registerEvent(ConnectionEvent paramConnectionEvent);

  public abstract void registerEvent(WakeLockEvent paramWakeLockEvent);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.stats.StatisticsTracker
 * JD-Core Version:    0.6.2
 */
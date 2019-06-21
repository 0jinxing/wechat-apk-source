package com.google.android.gms.common.util;

public abstract interface Clock
{
  public abstract long currentThreadTimeMillis();

  public abstract long currentTimeMillis();

  public abstract long elapsedRealtime();

  public abstract long nanoTime();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.Clock
 * JD-Core Version:    0.6.2
 */
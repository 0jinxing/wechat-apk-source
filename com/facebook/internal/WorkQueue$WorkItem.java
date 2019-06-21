package com.facebook.internal;

public abstract interface WorkQueue$WorkItem
{
  public abstract boolean cancel();

  public abstract boolean isRunning();

  public abstract void moveToFront();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.facebook.internal.WorkQueue.WorkItem
 * JD-Core Version:    0.6.2
 */
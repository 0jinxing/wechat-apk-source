package com.google.android.gms.wearable;

public abstract interface MessageEvent
{
  public abstract byte[] getData();

  public abstract String getPath();

  public abstract int getRequestId();

  public abstract String getSourceNodeId();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.MessageEvent
 * JD-Core Version:    0.6.2
 */
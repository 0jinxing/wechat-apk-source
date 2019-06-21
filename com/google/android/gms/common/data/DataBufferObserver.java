package com.google.android.gms.common.data;

public abstract interface DataBufferObserver
{
  public abstract void onDataChanged();

  public abstract void onDataRangeChanged(int paramInt1, int paramInt2);

  public abstract void onDataRangeInserted(int paramInt1, int paramInt2);

  public abstract void onDataRangeMoved(int paramInt1, int paramInt2, int paramInt3);

  public abstract void onDataRangeRemoved(int paramInt1, int paramInt2);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.DataBufferObserver
 * JD-Core Version:    0.6.2
 */
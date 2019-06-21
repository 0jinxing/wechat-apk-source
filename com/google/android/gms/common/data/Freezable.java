package com.google.android.gms.common.data;

public abstract interface Freezable<T>
{
  public abstract T freeze();

  public abstract boolean isDataValid();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.Freezable
 * JD-Core Version:    0.6.2
 */
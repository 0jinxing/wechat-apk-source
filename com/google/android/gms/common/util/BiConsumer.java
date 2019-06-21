package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public abstract interface BiConsumer<T, U>
{
  @KeepForSdk
  public abstract void accept(T paramT, U paramU);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.BiConsumer
 * JD-Core Version:    0.6.2
 */
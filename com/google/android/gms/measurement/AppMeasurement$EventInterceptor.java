package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public abstract interface AppMeasurement$EventInterceptor
{
  @KeepForSdk
  public abstract void interceptEvent(String paramString1, String paramString2, Bundle paramBundle, long paramLong);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.measurement.AppMeasurement.EventInterceptor
 * JD-Core Version:    0.6.2
 */
package com.google.firebase.analytics.connector;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;

public abstract interface a
{
  @KeepForSdk
  public abstract void logEvent(String paramString1, String paramString2, Bundle paramBundle);

  @KeepForSdk
  public abstract void setUserProperty(String paramString1, String paramString2, Object paramObject);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.firebase.analytics.connector.a
 * JD-Core Version:    0.6.2
 */
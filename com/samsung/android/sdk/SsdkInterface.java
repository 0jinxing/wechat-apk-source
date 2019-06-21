package com.samsung.android.sdk;

import android.content.Context;

public abstract interface SsdkInterface
{
  public abstract int getVersionCode();

  public abstract String getVersionName();

  public abstract void initialize(Context paramContext);

  public abstract boolean isFeatureEnabled(int paramInt);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.samsung.android.sdk.SsdkInterface
 * JD-Core Version:    0.6.2
 */
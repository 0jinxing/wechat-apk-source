package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public abstract interface LifecycleFragment
{
  @KeepForSdk
  public abstract void addCallback(String paramString, LifecycleCallback paramLifecycleCallback);

  @KeepForSdk
  public abstract <T extends LifecycleCallback> T getCallbackOrNull(String paramString, Class<T> paramClass);

  @KeepForSdk
  public abstract Activity getLifecycleActivity();

  @KeepForSdk
  public abstract boolean isCreated();

  @KeepForSdk
  public abstract boolean isStarted();

  @KeepForSdk
  public abstract void startActivityForResult(Intent paramIntent, int paramInt);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.LifecycleFragment
 * JD-Core Version:    0.6.2
 */
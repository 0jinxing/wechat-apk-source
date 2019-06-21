package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.wearable.CapabilityApi.CapabilityListener;
import com.google.android.gms.wearable.CapabilityClient.OnCapabilityChangedListener;

final class zzaf extends RegisterListenerMethod<zzhg, CapabilityClient.OnCapabilityChangedListener>
{
  private final IntentFilter[] zzba;
  private final CapabilityClient.OnCapabilityChangedListener zzby;
  private final ListenerHolder<CapabilityApi.CapabilityListener> zzbz;

  private zzaf(CapabilityClient.OnCapabilityChangedListener paramOnCapabilityChangedListener, IntentFilter[] paramArrayOfIntentFilter, ListenerHolder<CapabilityClient.OnCapabilityChangedListener> paramListenerHolder)
  {
    super(paramListenerHolder);
    this.zzby = paramOnCapabilityChangedListener;
    this.zzba = paramArrayOfIntentFilter;
    this.zzbz = paramListenerHolder;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzaf
 * JD-Core Version:    0.6.2
 */
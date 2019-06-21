package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey;
import com.google.android.gms.common.api.internal.UnregisterListenerMethod;
import com.google.android.gms.wearable.CapabilityClient.OnCapabilityChangedListener;

final class zzag extends UnregisterListenerMethod<zzhg, CapabilityClient.OnCapabilityChangedListener>
{
  private final CapabilityClient.OnCapabilityChangedListener zzby;

  private zzag(CapabilityClient.OnCapabilityChangedListener paramOnCapabilityChangedListener, ListenerHolder.ListenerKey<CapabilityClient.OnCapabilityChangedListener> paramListenerKey)
  {
    super(paramListenerKey);
    this.zzby = paramOnCapabilityChangedListener;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzag
 * JD-Core Version:    0.6.2
 */
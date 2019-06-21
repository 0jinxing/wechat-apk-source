package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.CapabilityApi.CapabilityListener;

final class zzz extends zzn<Status>
{
  private CapabilityApi.CapabilityListener zzbs;

  private zzz(GoogleApiClient paramGoogleApiClient, CapabilityApi.CapabilityListener paramCapabilityListener)
  {
    super(paramGoogleApiClient);
    this.zzbs = paramCapabilityListener;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzz
 * JD-Core Version:    0.6.2
 */
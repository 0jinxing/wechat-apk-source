package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.CapabilityApi.AddLocalCapabilityResult;
import com.google.android.gms.wearable.CapabilityApi.RemoveLocalCapabilityResult;

public final class zzu
  implements CapabilityApi.AddLocalCapabilityResult, CapabilityApi.RemoveLocalCapabilityResult
{
  private final Status zzp;

  public zzu(Status paramStatus)
  {
    this.zzp = paramStatus;
  }

  public final Status getStatus()
  {
    return this.zzp;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzu
 * JD-Core Version:    0.6.2
 */
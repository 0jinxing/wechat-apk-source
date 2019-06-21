package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

final class zzs
  implements Result
{
  private final Status mStatus;

  public zzs(Status paramStatus)
  {
    this.mStatus = paramStatus;
  }

  public final Status getStatus()
  {
    return this.mStatus;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.auth.zzs
 * JD-Core Version:    0.6.2
 */
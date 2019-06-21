package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

@KeepForSdk
public class StatusPendingResult extends BasePendingResult<Status>
{
  @Deprecated
  public StatusPendingResult(Looper paramLooper)
  {
    super(paramLooper);
  }

  public StatusPendingResult(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.StatusPendingResult
 * JD-Core Version:    0.6.2
 */
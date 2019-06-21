package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;

final class PendingResults$zzb<R extends Result> extends BasePendingResult<R>
{
  private final R zzdm;

  public PendingResults$zzb(GoogleApiClient paramGoogleApiClient, R paramR)
  {
    super(paramGoogleApiClient);
    this.zzdm = paramR;
  }

  public final R createFailedResult(Status paramStatus)
  {
    return this.zzdm;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.PendingResults.zzb
 * JD-Core Version:    0.6.2
 */
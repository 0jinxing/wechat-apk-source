package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.zzbx;

public abstract class ResultTransform<R extends Result, S extends Result>
{
  public final PendingResult<S> createFailedResult(Status paramStatus)
  {
    return new zzbx(paramStatus);
  }

  public Status onFailure(Status paramStatus)
  {
    return paramStatus;
  }

  public abstract PendingResult<S> onSuccess(R paramR);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.ResultTransform
 * JD-Core Version:    0.6.2
 */
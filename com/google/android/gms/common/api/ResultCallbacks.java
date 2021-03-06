package com.google.android.gms.common.api;

import com.google.android.gms.common.annotation.KeepForSdk;

public abstract class ResultCallbacks<R extends Result>
  implements ResultCallback<R>
{
  public abstract void onFailure(Status paramStatus);

  @KeepForSdk
  public final void onResult(R paramR)
  {
    Status localStatus = paramR.getStatus();
    if (localStatus.isSuccess())
      onSuccess(paramR);
    while (true)
    {
      return;
      onFailure(localStatus);
      if ((paramR instanceof Releasable))
        try
        {
          ((Releasable)paramR).release();
        }
        catch (RuntimeException localRuntimeException)
        {
          paramR = String.valueOf(paramR);
          new StringBuilder(String.valueOf(paramR).length() + 18).append("Unable to release ").append(paramR);
        }
    }
  }

  public abstract void onSuccess(R paramR);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.ResultCallbacks
 * JD-Core Version:    0.6.2
 */
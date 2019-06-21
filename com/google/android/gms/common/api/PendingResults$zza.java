package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class PendingResults$zza<R extends Result> extends BasePendingResult<R>
{
  private final R zzdl;

  public PendingResults$zza(R paramR)
  {
    super(Looper.getMainLooper());
    AppMethodBeat.i(60553);
    this.zzdl = paramR;
    AppMethodBeat.o(60553);
  }

  public final R createFailedResult(Status paramStatus)
  {
    AppMethodBeat.i(60554);
    if (paramStatus.getStatusCode() != this.zzdl.getStatus().getStatusCode())
    {
      paramStatus = new UnsupportedOperationException("Creating failed results is not supported");
      AppMethodBeat.o(60554);
      throw paramStatus;
    }
    paramStatus = this.zzdl;
    AppMethodBeat.o(60554);
    return paramStatus;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.PendingResults.zza
 * JD-Core Version:    0.6.2
 */
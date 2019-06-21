package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class PendingResults$zzc<R extends Result> extends BasePendingResult<R>
{
  public PendingResults$zzc(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }

  public final R createFailedResult(Status paramStatus)
  {
    AppMethodBeat.i(60555);
    paramStatus = new UnsupportedOperationException("Creating failed results is not supported");
    AppMethodBeat.o(60555);
    throw paramStatus;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.PendingResults.zzc
 * JD-Core Version:    0.6.2
 */
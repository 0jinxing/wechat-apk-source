package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class Batch extends BasePendingResult<BatchResult>
{
  private final Object mLock;
  private int zzcd;
  private boolean zzce;
  private boolean zzcf;
  private final PendingResult<?>[] zzcg;

  private Batch(List<PendingResult<?>> paramList, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
    AppMethodBeat.i(60486);
    this.mLock = new Object();
    this.zzcd = paramList.size();
    this.zzcg = new PendingResult[this.zzcd];
    if (paramList.isEmpty())
    {
      setResult(new BatchResult(Status.RESULT_SUCCESS, this.zzcg));
      AppMethodBeat.o(60486);
    }
    while (true)
    {
      return;
      for (int i = 0; i < paramList.size(); i++)
      {
        paramGoogleApiClient = (PendingResult)paramList.get(i);
        this.zzcg[i] = paramGoogleApiClient;
        paramGoogleApiClient.addStatusListener(new zza(this));
      }
      AppMethodBeat.o(60486);
    }
  }

  public final void cancel()
  {
    AppMethodBeat.i(60487);
    super.cancel();
    PendingResult[] arrayOfPendingResult = this.zzcg;
    int i = arrayOfPendingResult.length;
    for (int j = 0; j < i; j++)
      arrayOfPendingResult[j].cancel();
    AppMethodBeat.o(60487);
  }

  public final BatchResult createFailedResult(Status paramStatus)
  {
    AppMethodBeat.i(60488);
    paramStatus = new BatchResult(paramStatus, this.zzcg);
    AppMethodBeat.o(60488);
    return paramStatus;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.Batch
 * JD-Core Version:    0.6.2
 */
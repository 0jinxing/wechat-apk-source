package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.Preconditions;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.TimeUnit;

public final class BatchResult
  implements Result
{
  private final Status mStatus;
  private final PendingResult<?>[] zzcg;

  BatchResult(Status paramStatus, PendingResult<?>[] paramArrayOfPendingResult)
  {
    this.mStatus = paramStatus;
    this.zzcg = paramArrayOfPendingResult;
  }

  public final Status getStatus()
  {
    return this.mStatus;
  }

  public final <R extends Result> R take(BatchResultToken<R> paramBatchResultToken)
  {
    AppMethodBeat.i(60491);
    if (paramBatchResultToken.mId < this.zzcg.length);
    for (boolean bool = true; ; bool = false)
    {
      Preconditions.checkArgument(bool, "The result token does not belong to this batch");
      paramBatchResultToken = this.zzcg[paramBatchResultToken.mId].await(0L, TimeUnit.MILLISECONDS);
      AppMethodBeat.o(60491);
      return paramBatchResultToken;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.BatchResult
 * JD-Core Version:    0.6.2
 */
package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzk
  implements PendingResultUtil.StatusConverter
{
  public final ApiException convert(Status paramStatus)
  {
    AppMethodBeat.i(61407);
    paramStatus = ApiExceptionUtil.fromStatus(paramStatus);
    AppMethodBeat.o(61407);
    return paramStatus;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.zzk
 * JD-Core Version:    0.6.2
 */
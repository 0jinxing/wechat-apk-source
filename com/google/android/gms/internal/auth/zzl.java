package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzl extends BaseImplementation.ApiMethodImpl<Result, zzu>
{
  zzl(zzk paramzzk, Api paramApi, GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    super(paramApi, paramGoogleApiClient);
  }

  public final Result createFailedResult(Status paramStatus)
  {
    AppMethodBeat.i(77135);
    paramStatus = new zzs(paramStatus);
    AppMethodBeat.o(77135);
    return paramStatus;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.auth.zzl
 * JD-Core Version:    0.6.2
 */
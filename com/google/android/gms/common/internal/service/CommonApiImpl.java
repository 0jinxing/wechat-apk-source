package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class CommonApiImpl
  implements CommonApi
{
  public final PendingResult<Status> clearDefaultAccount(GoogleApiClient paramGoogleApiClient)
  {
    AppMethodBeat.i(61393);
    paramGoogleApiClient = paramGoogleApiClient.execute(new zzb(this, paramGoogleApiClient));
    AppMethodBeat.o(61393);
    return paramGoogleApiClient;
  }

  static final class zza extends BaseCommonServiceCallbacks
  {
    private final BaseImplementation.ResultHolder<Status> mResultHolder;

    public zza(BaseImplementation.ResultHolder<Status> paramResultHolder)
    {
      this.mResultHolder = paramResultHolder;
    }

    public final void onDefaultAccountCleared(int paramInt)
    {
      AppMethodBeat.i(61392);
      this.mResultHolder.setResult(new Status(paramInt));
      AppMethodBeat.o(61392);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.service.CommonApiImpl
 * JD-Core Version:    0.6.2
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzd<A extends BaseImplementation.ApiMethodImpl<? extends Result, Api.AnyClient>> extends zzb
{
  private final A zzdv;

  public zzd(int paramInt, A paramA)
  {
    super(paramInt);
    this.zzdv = paramA;
  }

  public final void zza(Status paramStatus)
  {
    AppMethodBeat.i(60902);
    this.zzdv.setFailedResult(paramStatus);
    AppMethodBeat.o(60902);
  }

  public final void zza(GoogleApiManager.zza<?> paramzza)
  {
    AppMethodBeat.i(60901);
    try
    {
      this.zzdv.run(paramzza.zzae());
      AppMethodBeat.o(60901);
      return;
    }
    catch (RuntimeException paramzza)
    {
      while (true)
      {
        zza(paramzza);
        AppMethodBeat.o(60901);
      }
    }
  }

  public final void zza(zzaa paramzzaa, boolean paramBoolean)
  {
    AppMethodBeat.i(60904);
    paramzzaa.zza(this.zzdv, paramBoolean);
    AppMethodBeat.o(60904);
  }

  public final void zza(RuntimeException paramRuntimeException)
  {
    AppMethodBeat.i(60903);
    String str = paramRuntimeException.getClass().getSimpleName();
    paramRuntimeException = paramRuntimeException.getLocalizedMessage();
    paramRuntimeException = new Status(10, String.valueOf(str).length() + 2 + String.valueOf(paramRuntimeException).length() + str + ": " + paramRuntimeException);
    this.zzdv.setFailedResult(paramRuntimeException);
    AppMethodBeat.o(60903);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzd
 * JD-Core Version:    0.6.2
 */
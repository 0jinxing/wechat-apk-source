package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzhc extends zzgm<Status>
{
  public zzhc(BaseImplementation.ResultHolder<Status> paramResultHolder)
  {
    super(paramResultHolder);
  }

  public final void zza(zzbp paramzzbp)
  {
    AppMethodBeat.i(71391);
    zza(new Status(paramzzbp.statusCode));
    AppMethodBeat.o(71391);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzhc
 * JD-Core Version:    0.6.2
 */
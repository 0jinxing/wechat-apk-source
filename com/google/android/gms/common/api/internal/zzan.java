package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.annotation.concurrent.GuardedBy;

final class zzan extends zzbe
{
  zzan(zzam paramzzam, zzbc paramzzbc, ConnectionResult paramConnectionResult)
  {
    super(paramzzbc);
  }

  @GuardedBy("mLock")
  public final void zzaq()
  {
    AppMethodBeat.i(60753);
    zzaj.zza(this.zzhz.zzhv, this.zzhy);
    AppMethodBeat.o(60753);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzan
 * JD-Core Version:    0.6.2
 */
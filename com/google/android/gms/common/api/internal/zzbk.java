package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzbk
  implements Runnable
{
  zzbk(GoogleApiManager.zza paramzza, ConnectionResult paramConnectionResult)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(60839);
    this.zzkk.onConnectionFailed(this.zzkl);
    AppMethodBeat.o(60839);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzbk
 * JD-Core Version:    0.6.2
 */
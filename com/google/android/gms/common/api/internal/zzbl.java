package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzbl
  implements BaseGmsClient.SignOutCallbacks
{
  zzbl(GoogleApiManager.zza paramzza)
  {
  }

  public final void onSignOutComplete()
  {
    AppMethodBeat.i(60840);
    GoogleApiManager.zza(this.zzkk.zzjy).post(new zzbm(this));
    AppMethodBeat.o(60840);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzbl
 * JD-Core Version:    0.6.2
 */
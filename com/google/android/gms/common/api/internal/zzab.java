package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.PendingResult.StatusListener;
import com.google.android.gms.common.api.Status;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

final class zzab
  implements PendingResult.StatusListener
{
  zzab(zzaa paramzzaa, BasePendingResult paramBasePendingResult)
  {
  }

  public final void onComplete(Status paramStatus)
  {
    AppMethodBeat.i(60683);
    zzaa.zza(this.zzgz).remove(this.zzgy);
    AppMethodBeat.o(60683);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzab
 * JD-Core Version:    0.6.2
 */
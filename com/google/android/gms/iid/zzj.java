package com.google.android.gms.iid;

import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzj
  implements Runnable
{
  zzj(zzi paramzzi, zzg paramzzg)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(57568);
    Log.isLoggable("EnhancedIntentService", 3);
    zzi.zzd(this.zzbk).handleIntent(this.zzbj.intent);
    this.zzbj.finish();
    AppMethodBeat.o(57568);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.iid.zzj
 * JD-Core Version:    0.6.2
 */
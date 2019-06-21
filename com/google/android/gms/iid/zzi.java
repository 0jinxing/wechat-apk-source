package com.google.android.gms.iid;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.ExecutorService;

public final class zzi extends Binder
{
  private final zze zzbi;

  zzi(zze paramzze)
  {
    this.zzbi = paramzze;
  }

  public final void zzd(zzg paramzzg)
  {
    AppMethodBeat.i(57567);
    if (Binder.getCallingUid() != Process.myUid())
    {
      paramzzg = new SecurityException("Binding only allowed within app");
      AppMethodBeat.o(57567);
      throw paramzzg;
    }
    Log.isLoggable("EnhancedIntentService", 3);
    Log.isLoggable("EnhancedIntentService", 3);
    this.zzbi.zzax.execute(new zzj(this, paramzzg));
    AppMethodBeat.o(57567);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.iid.zzi
 * JD-Core Version:    0.6.2
 */
package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzin
  implements Runnable
{
  zzin(zzii paramzzii, zzie paramzzie)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(69326);
    zzey localzzey = zzii.zzd(this.zzape);
    if (localzzey == null)
    {
      this.zzape.zzge().zzim().log("Failed to send current screen to service");
      AppMethodBeat.o(69326);
    }
    while (true)
    {
      return;
      try
      {
        if (this.zzaow == null)
          localzzey.zza(0L, null, null, this.zzape.getContext().getPackageName());
        while (true)
        {
          zzii.zze(this.zzape);
          AppMethodBeat.o(69326);
          break;
          localzzey.zza(this.zzaow.zzaoj, this.zzaow.zzul, this.zzaow.zzaoi, this.zzape.getContext().getPackageName());
        }
      }
      catch (RemoteException localRemoteException)
      {
        this.zzape.zzge().zzim().zzg("Failed to send current screen to the service", localRemoteException);
        AppMethodBeat.o(69326);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzin
 * JD-Core Version:    0.6.2
 */
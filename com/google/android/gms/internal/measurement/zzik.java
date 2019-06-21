package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzik
  implements Runnable
{
  zzik(zzii paramzzii, zzdz paramzzdz)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(69323);
    zzey localzzey = zzii.zzd(this.zzape);
    if (localzzey == null)
    {
      this.zzape.zzge().zzim().log("Failed to reset data on the service; null service");
      AppMethodBeat.o(69323);
    }
    while (true)
    {
      return;
      try
      {
        localzzey.zzd(this.zzane);
        zzii.zze(this.zzape);
        AppMethodBeat.o(69323);
      }
      catch (RemoteException localRemoteException)
      {
        while (true)
          this.zzape.zzge().zzim().zzg("Failed to reset data on the service", localRemoteException);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzik
 * JD-Core Version:    0.6.2
 */
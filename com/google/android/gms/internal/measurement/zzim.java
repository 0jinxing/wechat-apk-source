package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzim
  implements Runnable
{
  zzim(zzii paramzzii, zzdz paramzzdz)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(69325);
    zzey localzzey = zzii.zzd(this.zzape);
    if (localzzey == null)
    {
      this.zzape.zzge().zzim().log("Discarding data. Failed to send app launch");
      AppMethodBeat.o(69325);
    }
    while (true)
    {
      return;
      try
      {
        localzzey.zza(this.zzane);
        this.zzape.zza(localzzey, null, this.zzane);
        zzii.zze(this.zzape);
        AppMethodBeat.o(69325);
      }
      catch (RemoteException localRemoteException)
      {
        this.zzape.zzge().zzim().zzg("Failed to send app launch to the service", localRemoteException);
        AppMethodBeat.o(69325);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzim
 * JD-Core Version:    0.6.2
 */
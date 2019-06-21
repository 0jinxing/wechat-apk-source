package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.atomic.AtomicReference;

final class zziv
  implements Runnable
{
  zziv(zzii paramzzii, AtomicReference paramAtomicReference, zzdz paramzzdz, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(69334);
    AtomicReference localAtomicReference = this.zzapf;
    try
    {
      localzzey = zzii.zzd(this.zzape);
      if (localzzey == null)
        this.zzape.zzge().zzim().log("Failed to get user properties");
    }
    catch (RemoteException localRemoteException)
    {
    }
    finally
    {
      zzey localzzey;
      this.zzapf.notify();
      AppMethodBeat.o(69334);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zziv
 * JD-Core Version:    0.6.2
 */
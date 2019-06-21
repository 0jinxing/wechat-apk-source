package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

final class zzit
  implements Runnable
{
  zzit(zzii paramzzii, AtomicReference paramAtomicReference, String paramString1, String paramString2, String paramString3, boolean paramBoolean, zzdz paramzzdz)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(69332);
    AtomicReference localAtomicReference = this.zzapf;
    try
    {
      localzzey = zzii.zzd(this.zzape);
      if (localzzey == null)
      {
        this.zzape.zzge().zzim().zzd("Failed to get user properties", zzfg.zzbm(this.zzanj), this.zzanh, this.zzani);
        this.zzapf.set(Collections.emptyList());
      }
    }
    catch (RemoteException localRemoteException)
    {
    }
    finally
    {
      zzey localzzey;
      this.zzapf.notify();
      AppMethodBeat.o(69332);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzit
 * JD-Core Version:    0.6.2
 */
package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.atomic.AtomicReference;

final class zzil
  implements Runnable
{
  zzil(zzii paramzzii, AtomicReference paramAtomicReference, zzdz paramzzdz)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(69324);
    AtomicReference localAtomicReference = this.zzapf;
    try
    {
      localObject1 = zzii.zzd(this.zzape);
      if (localObject1 == null)
        this.zzape.zzge().zzim().log("Failed to get app instance id");
    }
    catch (RemoteException localRemoteException)
    {
    }
    finally
    {
      Object localObject1;
      this.zzapf.notify();
      AppMethodBeat.o(69324);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzil
 * JD-Core Version:    0.6.2
 */
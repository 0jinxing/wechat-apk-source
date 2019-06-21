package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzir
  implements Runnable
{
  zzir(zzii paramzzii, boolean paramBoolean1, boolean paramBoolean2, zzed paramzzed1, zzdz paramzzdz, zzed paramzzed2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(69330);
    zzey localzzey = zzii.zzd(this.zzape);
    if (localzzey == null)
    {
      this.zzape.zzge().zzim().log("Discarding data. Failed to send conditional user property to service");
      AppMethodBeat.o(69330);
      return;
    }
    Object localObject;
    if (this.zzapg)
    {
      zzii localzzii = this.zzape;
      if (this.zzaph)
      {
        localObject = null;
        label59: localzzii.zza(localzzey, (AbstractSafeParcelable)localObject, this.zzane);
      }
    }
    while (true)
    {
      zzii.zze(this.zzape);
      AppMethodBeat.o(69330);
      break;
      localObject = this.zzapi;
      break label59;
      try
      {
        if (!TextUtils.isEmpty(this.zzapj.packageName))
          break label142;
        localzzey.zza(this.zzapi, this.zzane);
      }
      catch (RemoteException localRemoteException)
      {
        this.zzape.zzge().zzim().zzg("Failed to send conditional user property to the service", localRemoteException);
      }
      continue;
      label142: localzzey.zzb(this.zzapi);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzir
 * JD-Core Version:    0.6.2
 */
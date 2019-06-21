package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zziq
  implements Runnable
{
  zziq(zzii paramzzii, boolean paramBoolean1, boolean paramBoolean2, zzeu paramzzeu, zzdz paramzzdz, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(69329);
    zzey localzzey = zzii.zzd(this.zzape);
    if (localzzey == null)
    {
      this.zzape.zzge().zzim().log("Discarding data. Failed to send event to service");
      AppMethodBeat.o(69329);
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
      AppMethodBeat.o(69329);
      break;
      localObject = this.zzank;
      break label59;
      try
      {
        if (!TextUtils.isEmpty(this.zzanj))
          break label139;
        localzzey.zza(this.zzank, this.zzane);
      }
      catch (RemoteException localRemoteException)
      {
        this.zzape.zzge().zzim().zzg("Failed to send event to the service", localRemoteException);
      }
      continue;
      label139: localzzey.zza(this.zzank, this.zzanj, this.zzape.zzge().zziv());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zziq
 * JD-Core Version:    0.6.2
 */
package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzfz
  implements ServiceConnection
{
  private zzfz(zzfx paramzzfx)
  {
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    AppMethodBeat.i(68978);
    if (paramIBinder == null)
    {
      zzfx.zza(this.zzaky).zzge().zzip().log("Install Referrer connection returned with null binder");
      AppMethodBeat.o(68978);
    }
    while (true)
    {
      return;
      try
      {
        this.zzaky.zzakw = zzs.zza(paramIBinder);
        if (this.zzaky.zzakw == null)
        {
          zzfx.zza(this.zzaky).zzge().zzip().log("Install Referrer Service implementation was not found");
          AppMethodBeat.o(68978);
        }
        else
        {
          zzfx.zza(this.zzaky).zzge().zzir().log("Install Referrer Service connected");
          paramIBinder = zzfx.zza(this.zzaky).zzgd();
          paramComponentName = new com/google/android/gms/internal/measurement/zzga;
          paramComponentName.<init>(this);
          paramIBinder.zzc(paramComponentName);
          AppMethodBeat.o(68978);
        }
      }
      catch (Exception paramComponentName)
      {
        zzfx.zza(this.zzaky).zzge().zzip().zzg("Exception occurred while calling Install Referrer API", paramComponentName);
        AppMethodBeat.o(68978);
      }
    }
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    AppMethodBeat.i(68979);
    this.zzaky.zzakw = null;
    zzfx.zza(this.zzaky).zzge().zzir().log("Install Referrer Service disconnected");
    AppMethodBeat.o(68979);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzfz
 * JD-Core Version:    0.6.2
 */
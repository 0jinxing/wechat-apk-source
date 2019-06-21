package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.zzc;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.util.NoSuchElementException;

final class zzcm
  implements IBinder.DeathRecipient, zzcn
{
  private final WeakReference<BasePendingResult<?>> zzmr;
  private final WeakReference<zzc> zzms;
  private final WeakReference<IBinder> zzmt;

  private zzcm(BasePendingResult<?> paramBasePendingResult, zzc paramzzc, IBinder paramIBinder)
  {
    AppMethodBeat.i(60897);
    this.zzms = new WeakReference(paramzzc);
    this.zzmr = new WeakReference(paramBasePendingResult);
    this.zzmt = new WeakReference(paramIBinder);
    AppMethodBeat.o(60897);
  }

  private final void zzcf()
  {
    AppMethodBeat.i(60900);
    BasePendingResult localBasePendingResult = (BasePendingResult)this.zzmr.get();
    Object localObject = (zzc)this.zzms.get();
    if ((localObject != null) && (localBasePendingResult != null))
      ((zzc)localObject).remove(localBasePendingResult.zzo().intValue());
    localObject = (IBinder)this.zzmt.get();
    if (localObject != null);
    while (true)
    {
      try
      {
        ((IBinder)localObject).unlinkToDeath(this, 0);
        AppMethodBeat.o(60900);
        return;
      }
      catch (NoSuchElementException localNoSuchElementException)
      {
      }
      AppMethodBeat.o(60900);
    }
  }

  public final void binderDied()
  {
    AppMethodBeat.i(60899);
    zzcf();
    AppMethodBeat.o(60899);
  }

  public final void zzc(BasePendingResult<?> paramBasePendingResult)
  {
    AppMethodBeat.i(60898);
    zzcf();
    AppMethodBeat.o(60898);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzcm
 * JD-Core Version:    0.6.2
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

public final class zzg extends zzc<Boolean>
{
  private final ListenerHolder.ListenerKey<?> zzea;

  public zzg(ListenerHolder.ListenerKey<?> paramListenerKey, TaskCompletionSource<Boolean> paramTaskCompletionSource)
  {
    super(4, paramTaskCompletionSource);
    this.zzea = paramListenerKey;
  }

  public final void zzb(GoogleApiManager.zza<?> paramzza)
  {
    AppMethodBeat.i(60914);
    zzbv localzzbv = (zzbv)paramzza.zzbn().remove(this.zzea);
    if (localzzbv != null)
    {
      localzzbv.zzlu.unregisterListener(paramzza.zzae(), this.zzdu);
      localzzbv.zzlt.clearListener();
      AppMethodBeat.o(60914);
    }
    while (true)
    {
      return;
      this.zzdu.trySetResult(Boolean.FALSE);
      AppMethodBeat.o(60914);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzg
 * JD-Core Version:    0.6.2
 */
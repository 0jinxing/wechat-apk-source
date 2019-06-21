package com.google.android.gms.common.api.internal;

import android.support.v4.f.a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

final class zzz
  implements OnCompleteListener<Map<zzh<?>, String>>
{
  private SignInConnectionListener zzgv;

  zzz(zzw paramzzw, SignInConnectionListener paramSignInConnectionListener)
  {
    this.zzgv = paramSignInConnectionListener;
  }

  final void cancel()
  {
    AppMethodBeat.i(61007);
    this.zzgv.onComplete();
    AppMethodBeat.o(61007);
  }

  public final void onComplete(Task<Map<zzh<?>, String>> paramTask)
  {
    AppMethodBeat.i(61008);
    zzw.zza(this.zzgu).lock();
    Object localObject1;
    try
    {
      if (!zzw.zzb(this.zzgu))
      {
        this.zzgv.onComplete();
        return;
      }
      if (paramTask.isSuccessful())
      {
        localObject1 = this.zzgu;
        paramTask = new android/support/v4/f/a;
        paramTask.<init>(zzw.zzm(this.zzgu).size());
        zzw.zzb((zzw)localObject1, paramTask);
        paramTask = zzw.zzm(this.zzgu).values().iterator();
        while (paramTask.hasNext())
        {
          localObject1 = (zzv)paramTask.next();
          zzw.zzg(this.zzgu).put(((GoogleApi)localObject1).zzm(), ConnectionResult.RESULT_SUCCESS);
        }
      }
    }
    finally
    {
      zzw.zza(this.zzgu).unlock();
      AppMethodBeat.o(61008);
    }
    if ((paramTask.getException() instanceof AvailabilityException))
    {
      paramTask = (AvailabilityException)paramTask.getException();
      if (zzw.zze(this.zzgu))
      {
        Object localObject2 = this.zzgu;
        localObject1 = new android/support/v4/f/a;
        ((a)localObject1).<init>(zzw.zzm(this.zzgu).size());
        zzw.zzb((zzw)localObject2, (Map)localObject1);
        localObject1 = zzw.zzm(this.zzgu).values().iterator();
        while (((Iterator)localObject1).hasNext())
        {
          Object localObject3 = (zzv)((Iterator)localObject1).next();
          localObject2 = ((GoogleApi)localObject3).zzm();
          ConnectionResult localConnectionResult = paramTask.getConnectionResult((GoogleApi)localObject3);
          if (zzw.zza(this.zzgu, (zzv)localObject3, localConnectionResult))
          {
            localObject3 = zzw.zzg(this.zzgu);
            localConnectionResult = new com/google/android/gms/common/ConnectionResult;
            localConnectionResult.<init>(16);
            ((Map)localObject3).put(localObject2, localConnectionResult);
          }
          else
          {
            zzw.zzg(this.zzgu).put(localObject2, localConnectionResult);
          }
        }
      }
      zzw.zzb(this.zzgu, paramTask.zzl());
    }
    while (true)
    {
      if (this.zzgu.isConnected())
      {
        zzw.zzd(this.zzgu).putAll(zzw.zzg(this.zzgu));
        if (zzw.zzf(this.zzgu) == null)
        {
          zzw.zzi(this.zzgu);
          zzw.zzj(this.zzgu);
          zzw.zzl(this.zzgu).signalAll();
        }
      }
      this.zzgv.onComplete();
      zzw.zza(this.zzgu).unlock();
      AppMethodBeat.o(61008);
      break;
      paramTask.getException();
      zzw.zzb(this.zzgu, Collections.emptyMap());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzz
 * JD-Core Version:    0.6.2
 */
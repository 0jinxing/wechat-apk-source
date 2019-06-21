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

final class zzy
  implements OnCompleteListener<Map<zzh<?>, String>>
{
  private zzy(zzw paramzzw)
  {
  }

  public final void onComplete(Task<Map<zzh<?>, String>> paramTask)
  {
    AppMethodBeat.i(61006);
    zzw.zza(this.zzgu).lock();
    Object localObject1;
    try
    {
      boolean bool = zzw.zzb(this.zzgu);
      if (!bool)
        return;
      if (paramTask.isSuccessful())
      {
        localObject1 = this.zzgu;
        paramTask = new android/support/v4/f/a;
        paramTask.<init>(zzw.zzc(this.zzgu).size());
        zzw.zza((zzw)localObject1, paramTask);
        paramTask = zzw.zzc(this.zzgu).values().iterator();
        while (paramTask.hasNext())
        {
          localObject1 = (zzv)paramTask.next();
          zzw.zzd(this.zzgu).put(((GoogleApi)localObject1).zzm(), ConnectionResult.RESULT_SUCCESS);
        }
      }
    }
    finally
    {
      zzw.zza(this.zzgu).unlock();
      AppMethodBeat.o(61006);
    }
    if ((paramTask.getException() instanceof AvailabilityException))
    {
      paramTask = (AvailabilityException)paramTask.getException();
      if (zzw.zze(this.zzgu))
      {
        localObject1 = this.zzgu;
        Object localObject2 = new android/support/v4/f/a;
        ((a)localObject2).<init>(zzw.zzc(this.zzgu).size());
        zzw.zza((zzw)localObject1, (Map)localObject2);
        localObject1 = zzw.zzc(this.zzgu).values().iterator();
        while (((Iterator)localObject1).hasNext())
        {
          Object localObject3 = (zzv)((Iterator)localObject1).next();
          localObject2 = ((GoogleApi)localObject3).zzm();
          ConnectionResult localConnectionResult = paramTask.getConnectionResult((GoogleApi)localObject3);
          if (zzw.zza(this.zzgu, (zzv)localObject3, localConnectionResult))
          {
            localObject3 = zzw.zzd(this.zzgu);
            localConnectionResult = new com/google/android/gms/common/ConnectionResult;
            localConnectionResult.<init>(16);
            ((Map)localObject3).put(localObject2, localConnectionResult);
          }
          else
          {
            zzw.zzd(this.zzgu).put(localObject2, localConnectionResult);
          }
        }
      }
      zzw.zza(this.zzgu, paramTask.zzl());
      zzw.zza(this.zzgu, zzw.zzf(this.zzgu));
      label377: if (zzw.zzg(this.zzgu) != null)
      {
        zzw.zzd(this.zzgu).putAll(zzw.zzg(this.zzgu));
        zzw.zza(this.zzgu, zzw.zzf(this.zzgu));
      }
      if (zzw.zzh(this.zzgu) != null)
        break label517;
      zzw.zzi(this.zzgu);
      zzw.zzj(this.zzgu);
    }
    while (true)
    {
      zzw.zzl(this.zzgu).signalAll();
      zzw.zza(this.zzgu).unlock();
      AppMethodBeat.o(61006);
      break;
      paramTask.getException();
      zzw.zza(this.zzgu, Collections.emptyMap());
      localObject1 = this.zzgu;
      paramTask = new com/google/android/gms/common/ConnectionResult;
      paramTask.<init>(8);
      zzw.zza((zzw)localObject1, paramTask);
      break label377;
      label517: zzw.zza(this.zzgu, false);
      zzw.zzk(this.zzgu).zzc(zzw.zzh(this.zzgu));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzy
 * JD-Core Version:    0.6.2
 */
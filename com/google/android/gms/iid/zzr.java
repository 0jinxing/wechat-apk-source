package com.google.android.gms.iid;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

public final class zzr
{
  private final ScheduledExecutorService zzbz;

  @GuardedBy("this")
  private zzt zzca;

  @GuardedBy("this")
  private int zzcb;
  private final Context zzk;

  public zzr(Context paramContext)
  {
    this(paramContext, Executors.newSingleThreadScheduledExecutor());
    AppMethodBeat.i(57599);
    AppMethodBeat.o(57599);
  }

  private zzr(Context paramContext, ScheduledExecutorService paramScheduledExecutorService)
  {
    AppMethodBeat.i(57600);
    this.zzca = new zzt(this, null);
    this.zzcb = 1;
    this.zzk = paramContext.getApplicationContext();
    this.zzbz = paramScheduledExecutorService;
    AppMethodBeat.o(57600);
  }

  private final <T> Task<T> zzd(zzz<T> paramzzz)
  {
    try
    {
      AppMethodBeat.i(57602);
      Object localObject;
      if (Log.isLoggable("MessengerIpcClient", 3))
      {
        String str = String.valueOf(paramzzz);
        int i = String.valueOf(str).length();
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>(i + 9);
        ((StringBuilder)localObject).append("Queueing ").append(str);
      }
      if (!this.zzca.zze(paramzzz))
      {
        localObject = new com/google/android/gms/iid/zzt;
        ((zzt)localObject).<init>(this, null);
        this.zzca = ((zzt)localObject);
        this.zzca.zze(paramzzz);
      }
      paramzzz = paramzzz.zzcl.getTask();
      AppMethodBeat.o(57602);
      return paramzzz;
    }
    finally
    {
    }
    throw paramzzz;
  }

  private final int zzq()
  {
    try
    {
      int i = this.zzcb;
      this.zzcb = (i + 1);
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final Task<Bundle> zzd(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(57601);
    paramBundle = zzd(new zzab(zzq(), 1, paramBundle));
    AppMethodBeat.o(57601);
    return paramBundle;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.iid.zzr
 * JD-Core Version:    0.6.2
 */
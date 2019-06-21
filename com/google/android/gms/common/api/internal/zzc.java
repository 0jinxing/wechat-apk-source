package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

abstract class zzc<T> extends zzb
{
  protected final TaskCompletionSource<T> zzdu;

  public zzc(int paramInt, TaskCompletionSource<T> paramTaskCompletionSource)
  {
    super(paramInt);
    this.zzdu = paramTaskCompletionSource;
  }

  public void zza(Status paramStatus)
  {
    this.zzdu.trySetException(new ApiException(paramStatus));
  }

  public final void zza(GoogleApiManager.zza<?> paramzza)
  {
    try
    {
      zzb(paramzza);
      return;
    }
    catch (DeadObjectException paramzza)
    {
      zza(zzb.zzb(paramzza));
      throw paramzza;
    }
    catch (RemoteException paramzza)
    {
      while (true)
        zza(zzb.zzb(paramzza));
    }
    catch (RuntimeException paramzza)
    {
      while (true)
        zza(paramzza);
    }
  }

  public void zza(zzaa paramzzaa, boolean paramBoolean)
  {
  }

  public void zza(RuntimeException paramRuntimeException)
  {
    this.zzdu.trySetException(paramRuntimeException);
  }

  protected abstract void zzb(GoogleApiManager.zza<?> paramzza);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzc
 * JD-Core Version:    0.6.2
 */
package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzcj extends Handler
{
  public zzcj(zzch paramzzch, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(60890);
    switch (paramMessage.what)
    {
    default:
      int i = paramMessage.what;
      new StringBuilder(70).append("TransformationResultHandler received unknown message type: ").append(i);
      AppMethodBeat.o(60890);
      return;
    case 0:
      Object localObject = (PendingResult)paramMessage.obj;
      paramMessage = zzch.zzf(this.zzml);
      if (localObject == null);
      while (true)
      {
        try
        {
          localObject = zzch.zzg(this.zzml);
          Status localStatus = new com/google/android/gms/common/api/Status;
          localStatus.<init>(13, "Transform returned null");
          zzch.zza((zzch)localObject, localStatus);
          AppMethodBeat.o(60890);
          break;
          if ((localObject instanceof zzbx))
          {
            zzch.zza(zzch.zzg(this.zzml), ((zzbx)localObject).getStatus());
            continue;
          }
        }
        finally
        {
          AppMethodBeat.o(60890);
        }
        zzch.zzg(this.zzml).zza(localPendingResult);
      }
    case 1:
    }
    RuntimeException localRuntimeException = (RuntimeException)paramMessage.obj;
    paramMessage = String.valueOf(localRuntimeException.getMessage());
    if (paramMessage.length() != 0)
      "Runtime exception on the transformation worker thread: ".concat(paramMessage);
    while (true)
    {
      AppMethodBeat.o(60890);
      throw localRuntimeException;
      new String("Runtime exception on the transformation worker thread: ");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzcj
 * JD-Core Version:    0.6.2
 */
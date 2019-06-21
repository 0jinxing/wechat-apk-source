package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzbf extends Handler
{
  zzbf(zzbd paramzzbd, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(60834);
    switch (paramMessage.what)
    {
    default:
      int i = paramMessage.what;
      new StringBuilder(31).append("Unknown message id: ").append(i);
      AppMethodBeat.o(60834);
    case 1:
      while (true)
      {
        return;
        ((zzbe)paramMessage.obj).zzc(this.zzjh);
        AppMethodBeat.o(60834);
      }
    case 2:
    }
    paramMessage = (RuntimeException)paramMessage.obj;
    AppMethodBeat.o(60834);
    throw paramMessage;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzbf
 * JD-Core Version:    0.6.2
 */
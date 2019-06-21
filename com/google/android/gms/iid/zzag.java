package com.google.android.gms.iid;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzag extends Handler
{
  zzag(zzaf paramzzaf, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(57547);
    this.zzcx.zze(paramMessage);
    AppMethodBeat.o(57547);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.iid.zzag
 * JD-Core Version:    0.6.2
 */
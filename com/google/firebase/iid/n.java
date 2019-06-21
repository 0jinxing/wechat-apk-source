package com.google.firebase.iid;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class n extends Handler
{
  n(m paramm, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(108743);
    m.a(this.bvU, paramMessage);
    AppMethodBeat.o(108743);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.firebase.iid.n
 * JD-Core Version:    0.6.2
 */
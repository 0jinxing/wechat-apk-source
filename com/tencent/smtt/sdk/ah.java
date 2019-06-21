package com.tencent.smtt.sdk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;

class ah extends Handler
{
  ah(ag paramag, Looper paramLooper)
  {
    super(paramLooper);
  }

  public void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(64255);
    if (paramMessage.what == 150)
      ag.a(this.a);
    AppMethodBeat.o(64255);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.ah
 * JD-Core Version:    0.6.2
 */
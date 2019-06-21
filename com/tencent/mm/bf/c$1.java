package com.tencent.mm.bf;

import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class c$1
  implements Runnable
{
  public c$1(c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(116540);
    Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler()
    {
      public final boolean queueIdle()
      {
        AppMethodBeat.i(116539);
        ab.d("MicroMsg.SpeexEncoderWorker", "queueIdle  ");
        e.ajY().b(c.1.this.fQB);
        AppMethodBeat.o(116539);
        return false;
      }
    });
    AppMethodBeat.o(116540);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bf.c.1
 * JD-Core Version:    0.6.2
 */
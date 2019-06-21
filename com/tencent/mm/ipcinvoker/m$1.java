package com.tencent.mm.ipcinvoker;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.h.b;

final class m$1
  implements Runnable
{
  m$1(m paramm, HandlerThread paramHandlerThread)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(114056);
    b.i("IPC.ThreadPool", "createHandlerThread(id : %d)", new Object[] { Integer.valueOf(this.eGm.getThreadId()) });
    AppMethodBeat.o(114056);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.m.1
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.ipcinvoker;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

final class m$a
  implements com.tencent.mm.ipcinvoker.a.b
{
  private int eGo;
  HandlerThread mHandlerThread;

  m$a()
  {
    AppMethodBeat.i(114062);
    this.eGo = 3;
    HandlerThread localHandlerThread = new HandlerThread("ThreadPool#InnerWorkerThread-" + hashCode());
    localHandlerThread.start();
    com.tencent.mm.ipcinvoker.h.b.i("IPC.ExecutorServiceCreatorImpl", "createHandlerThread(hash : %d)", new Object[] { Integer.valueOf(localHandlerThread.hashCode()) });
    this.mHandlerThread = localHandlerThread;
    AppMethodBeat.o(114062);
  }

  public final ExecutorService PS()
  {
    AppMethodBeat.i(114063);
    m.a.2 local2 = new m.a.2(this, this.eGo, new m.a.1(this));
    local2.setMaximumPoolSize((int)(this.eGo * 1.5D));
    local2.setRejectedExecutionHandler(new m.a.3(this));
    AppMethodBeat.o(114063);
    return local2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.m.a
 * JD-Core Version:    0.6.2
 */
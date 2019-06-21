package com.tencent.mm.ipcinvoker;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

final class b$2
  implements Runnable
{
  b$2(b paramb, b.a parama, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(114009);
    com.tencent.mm.ipcinvoker.h.b.i("IPC.IPCBridgeManager", "on connect timeout(%s, tid : %s)", new Object[] { Integer.valueOf(this.eFO.hashCode()), Long.valueOf(Thread.currentThread().getId()) });
    if (!this.eFO.eFT)
      AppMethodBeat.o(114009);
    while (true)
    {
      return;
      synchronized (this.eFO)
      {
        if (!this.eFO.eFT)
        {
          AppMethodBeat.o(114009);
          continue;
        }
        this.eFO.eFT = false;
        this.eFO.notifyAll();
        this.eFO.eFU = null;
      }
      synchronized (b.a(this.eFQ))
      {
        b.a(this.eFQ).remove(this.eFP);
        AppMethodBeat.o(114009);
        continue;
        localObject2 = finally;
        AppMethodBeat.o(114009);
        throw localObject2;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.b.2
 * JD-Core Version:    0.6.2
 */
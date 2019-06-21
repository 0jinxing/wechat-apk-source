package com.tencent.mm.ipcinvoker;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class g$3
  implements Runnable
{
  g$3(String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(114038);
    b localb = b.PL();
    String str = this.eFP;
    if (e.lg(str))
    {
      com.tencent.mm.ipcinvoker.h.b.i("IPC.IPCBridgeManager", "the same process(%s), do not need to build IPCBridge.", new Object[] { str });
      AppMethodBeat.o(114038);
    }
    while (true)
    {
      return;
      localb.ld(str);
      AppMethodBeat.o(114038);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.g.3
 * JD-Core Version:    0.6.2
 */
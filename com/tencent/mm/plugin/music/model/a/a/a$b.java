package com.tencent.mm.plugin.music.model.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.i;
import com.tencent.mm.ipcinvoker.type.IPCString;
import com.tencent.mm.ipcinvoker.type.IPCVoid;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;

public final class a$b
  implements i<IPCVoid, IPCString>
{
  private static IPCString aIf()
  {
    AppMethodBeat.i(104937);
    try
    {
      ab.i("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "ipc getAccPath task");
      String str = g.RP().eJM;
      IPCString localIPCString1 = new com/tencent/mm/ipcinvoker/type/IPCString;
      localIPCString1.<init>(str);
      AppMethodBeat.o(104937);
      return localIPCString1;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Audio.MusicDataSourceCrossProcessImp", localException, "ipc getAccPath task", new Object[0]);
        IPCString localIPCString2 = new IPCString("");
        AppMethodBeat.o(104937);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.model.a.a.a.b
 * JD-Core Version:    0.6.2
 */
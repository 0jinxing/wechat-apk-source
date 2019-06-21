package com.tencent.mm.plugin.music.model.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.i;
import com.tencent.mm.ipcinvoker.type.IPCInteger;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public final class a$f
  implements i<IPCInteger, IPCInteger>
{
  private static IPCInteger b(IPCInteger paramIPCInteger)
  {
    AppMethodBeat.i(104945);
    try
    {
      ab.i("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "ipc getRemovePlayingAudioPlayerGroupCount task");
      int i = paramIPCInteger.value;
      i = ((Integer)g.RP().Ry().get(ac.a.xQV, Integer.valueOf(i))).intValue();
      IPCInteger localIPCInteger = new com/tencent/mm/ipcinvoker/type/IPCInteger;
      localIPCInteger.<init>(i);
      AppMethodBeat.o(104945);
      paramIPCInteger = localIPCInteger;
      return paramIPCInteger;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Audio.MusicDataSourceCrossProcessImp", localException, "ipc getRemovePlayingAudioPlayerGroupCount task", new Object[0]);
        paramIPCInteger = new IPCInteger(paramIPCInteger.value);
        AppMethodBeat.o(104945);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.model.a.a.a.f
 * JD-Core Version:    0.6.2
 */
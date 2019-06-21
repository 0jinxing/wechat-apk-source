package com.tencent.mm.plugin.music.model.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.i;
import com.tencent.mm.ipcinvoker.type.IPCLong;
import com.tencent.mm.ipcinvoker.type.IPCVoid;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public final class a$c
  implements i<IPCVoid, IPCLong>
{
  private static IPCLong bUp()
  {
    AppMethodBeat.i(104939);
    try
    {
      ab.i("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "ipc getLastScanMusicPieceFileTime task");
      long l = ((Long)g.RP().Ry().get(ac.a.xQR, Long.valueOf(0L))).longValue();
      IPCLong localIPCLong1 = new com/tencent/mm/ipcinvoker/type/IPCLong;
      localIPCLong1.<init>(l);
      AppMethodBeat.o(104939);
      return localIPCLong1;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Audio.MusicDataSourceCrossProcessImp", localException, "ipc getLastScanMusicPieceFileTime task", new Object[0]);
        IPCLong localIPCLong2 = new IPCLong(0L);
        AppMethodBeat.o(104939);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.model.a.a.a.c
 * JD-Core Version:    0.6.2
 */
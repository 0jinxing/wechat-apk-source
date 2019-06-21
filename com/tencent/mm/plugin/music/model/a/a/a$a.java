package com.tencent.mm.plugin.music.model.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.ipcinvoker.i;
import com.tencent.mm.ipcinvoker.type.IPCString;
import com.tencent.mm.ipcinvoker.type.IPCVoid;
import com.tencent.mm.plugin.music.model.e.d;
import com.tencent.mm.sdk.platformtools.ab;

public final class a$a
  implements i<IPCString, IPCVoid>
{
  private static IPCVoid b(IPCString paramIPCString)
  {
    AppMethodBeat.i(104935);
    try
    {
      ab.i("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "ipc deletePieceMusicInfo Task, musicId:%s", new Object[] { paramIPCString });
      String str = paramIPCString.value;
      paramIPCString = com.tencent.mm.plugin.music.model.e.bUm();
      ab.i("MicroMsg.Music.PieceMusicInfoStorage", "deletePieceMusicInfo raw=%d musicId=%s", new Object[] { Integer.valueOf(paramIPCString.bSd.delete("PieceMusicInfo", "musicId=?", new String[] { str })), str });
      paramIPCString.oNq.remove(str);
      paramIPCString = new IPCVoid();
      AppMethodBeat.o(104935);
      return paramIPCString;
    }
    catch (Exception paramIPCString)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.Audio.MusicDataSourceCrossProcessImp", paramIPCString, "ipc deletePieceMusicInfo task", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.model.a.a.a.a
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.music.model.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aw.h;
import com.tencent.mm.ipcinvoker.i;
import com.tencent.mm.ipcinvoker.type.IPCString;
import com.tencent.mm.plugin.music.cache.ipc.IPCAudioParamResponse;
import com.tencent.mm.plugin.music.model.e;
import com.tencent.mm.plugin.music.model.e.c;
import com.tencent.mm.plugin.music.model.e.d;
import com.tencent.mm.sdk.platformtools.ab;

public final class a$e
  implements i<IPCString, IPCAudioParamResponse>
{
  private static IPCAudioParamResponse d(IPCString paramIPCString)
  {
    AppMethodBeat.i(104943);
    try
    {
      ab.d("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "ipc getPieceMusicInfo Task, src:%s", new Object[] { paramIPCString });
      paramIPCString = paramIPCString.value;
      Object localObject = e.bUm().Tq(paramIPCString);
      if (localObject == null)
      {
        ab.e("MicroMsg.Music.MusicDataSourceMainProcessImp", "initData pMusic is null!'");
        paramIPCString = null;
        if (paramIPCString == null)
          break label135;
        localObject = new com/tencent/mm/plugin/music/cache/ipc/IPCAudioParamResponse;
        ((IPCAudioParamResponse)localObject).<init>(paramIPCString);
        AppMethodBeat.o(104943);
        paramIPCString = (IPCString)localObject;
      }
      while (true)
      {
        return paramIPCString;
        paramIPCString = new com/tencent/mm/aw/h;
        paramIPCString.<init>();
        paramIPCString.cFI = ((c)localObject).field_musicId;
        paramIPCString.musicUrl = ((c)localObject).field_musicUrl;
        paramIPCString.fileName = ((c)localObject).field_fileName;
        paramIPCString.fKw = ((c)localObject).field_fileCacheComplete;
        paramIPCString.fKx = ((c)localObject).field_pieceFileMIMEType;
        paramIPCString.fKv = ((c)localObject).field_indexBitData;
        paramIPCString.fKy = ((c)localObject).field_removeDirtyBit;
        break;
        label135: ab.e("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "pmInfo is null");
        paramIPCString = new IPCAudioParamResponse();
        AppMethodBeat.o(104943);
      }
    }
    catch (Exception paramIPCString)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.Audio.MusicDataSourceCrossProcessImp", paramIPCString, "ipc getPieceMusicInfo task", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.model.a.a.a.e
 * JD-Core Version:    0.6.2
 */
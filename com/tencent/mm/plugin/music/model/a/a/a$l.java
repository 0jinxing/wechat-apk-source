package com.tencent.mm.plugin.music.model.a.a;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.ipcinvoker.i;
import com.tencent.mm.ipcinvoker.type.IPCString;
import com.tencent.mm.plugin.music.h.b;
import com.tencent.mm.plugin.music.model.e;
import com.tencent.mm.plugin.music.model.e.c;
import com.tencent.mm.plugin.music.model.e.d;
import com.tencent.mm.sdk.platformtools.ab;

public final class a$l
  implements i<IPCString, IPCString>
{
  private static IPCString c(IPCString paramIPCString)
  {
    int i = 1;
    AppMethodBeat.i(104957);
    try
    {
      ab.i("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "ipc updatePieceMusicInfo Task, src:%s", new Object[] { paramIPCString });
      String str1 = paramIPCString.value;
      locald = e.bUm();
      if (TextUtils.isEmpty(str1))
      {
        ab.i("MicroMsg.Music.PieceMusicInfoStorage", "updatePieceMusicByUrl url is empty!");
        paramIPCString = null;
      }
      while (true)
      {
        if (paramIPCString == null)
          break label235;
        paramIPCString = paramIPCString.field_musicId;
        Object localObject = new com/tencent/mm/ipcinvoker/type/IPCString;
        ((IPCString)localObject).<init>(paramIPCString);
        AppMethodBeat.o(104957);
        paramIPCString = (IPCString)localObject;
        return paramIPCString;
        String str2 = b.Tu(str1);
        localObject = locald.Tq(str2);
        paramIPCString = (IPCString)localObject;
        if (localObject == null)
        {
          paramIPCString = new com/tencent/mm/plugin/music/model/e/c;
          paramIPCString.<init>();
          i = 0;
        }
        paramIPCString.field_musicId = str2;
        paramIPCString.field_musicUrl = str1;
        paramIPCString.field_fileName = b.Tv(str1);
        ab.i("MicroMsg.Music.PieceMusicInfoStorage", "updatePieceMusicByUrl musicId:%s, field_fileName:%s", new Object[] { str2, paramIPCString.field_fileName });
        if (i == 0)
          break;
        ab.i("MicroMsg.Music.PieceMusicInfoStorage", "update PieceMusicInfo");
        locald.c(paramIPCString, new String[0]);
        locald.oNq.put(str2, paramIPCString);
      }
    }
    catch (Exception paramIPCString)
    {
      while (true)
      {
        d locald;
        ab.printErrStackTrace("MicroMsg.Audio.MusicDataSourceCrossProcessImp", paramIPCString, "ipc updatePieceMusicInfo task", new Object[0]);
        paramIPCString = new IPCString("");
        AppMethodBeat.o(104957);
        continue;
        ab.i("MicroMsg.Music.PieceMusicInfoStorage", "insert PieceMusicInfo");
        locald.b(paramIPCString);
        continue;
        label235: paramIPCString = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.model.a.a.a.l
 * JD-Core Version:    0.6.2
 */
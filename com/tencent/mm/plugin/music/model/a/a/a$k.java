package com.tencent.mm.plugin.music.model.a.a;

import android.content.ContentValues;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.ipcinvoker.i;
import com.tencent.mm.ipcinvoker.type.IPCVoid;
import com.tencent.mm.plugin.music.cache.ipc.IPCAudioParamRequest;
import com.tencent.mm.plugin.music.model.e.c;
import com.tencent.mm.plugin.music.model.e.d;
import com.tencent.mm.sdk.platformtools.ab;

public final class a$k
  implements i<IPCAudioParamRequest, IPCVoid>
{
  private static IPCVoid a(IPCAudioParamRequest paramIPCAudioParamRequest)
  {
    boolean bool = true;
    AppMethodBeat.i(104955);
    try
    {
      Object localObject = paramIPCAudioParamRequest.cFI;
      if (paramIPCAudioParamRequest.fKv != null);
      while (true)
      {
        ab.i("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "ipc updateMusicFileIndexBitCache Task, musicId:%s, bitset is valid:%b", new Object[] { localObject, Boolean.valueOf(bool) });
        localObject = paramIPCAudioParamRequest.cFI;
        paramIPCAudioParamRequest = paramIPCAudioParamRequest.fKv;
        d locald = com.tencent.mm.plugin.music.model.e.bUm();
        ContentValues localContentValues = new android/content/ContentValues;
        localContentValues.<init>();
        localContentValues.put("indexBitData", paramIPCAudioParamRequest);
        int i = locald.bSd.update("PieceMusicInfo", localContentValues, "musicId=?", new String[] { localObject });
        if (i <= 0)
          ab.i("MicroMsg.Music.PieceMusicInfoStorage", "updateMusicFileIndexBitCache raw=%d musicId=%s", new Object[] { Integer.valueOf(i), localObject });
        localObject = (c)locald.oNq.get(localObject);
        if (localObject != null)
          ((c)localObject).field_indexBitData = paramIPCAudioParamRequest;
        paramIPCAudioParamRequest = new IPCVoid();
        AppMethodBeat.o(104955);
        return paramIPCAudioParamRequest;
        bool = false;
      }
    }
    catch (Exception paramIPCAudioParamRequest)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.Audio.MusicDataSourceCrossProcessImp", paramIPCAudioParamRequest, "ipc updateMusicFileIndexBitCache task", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.model.a.a.a.k
 * JD-Core Version:    0.6.2
 */
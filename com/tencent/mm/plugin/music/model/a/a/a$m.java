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

public final class a$m
  implements i<IPCAudioParamRequest, IPCVoid>
{
  private static IPCVoid a(IPCAudioParamRequest paramIPCAudioParamRequest)
  {
    AppMethodBeat.i(104959);
    try
    {
      ab.i("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "ipc updateMusicFileCacheComplete Task, musicId:%s, complete:%d", new Object[] { paramIPCAudioParamRequest.cFI, Integer.valueOf(paramIPCAudioParamRequest.oLm) });
      String str = paramIPCAudioParamRequest.cFI;
      int i = paramIPCAudioParamRequest.oLm;
      d locald = com.tencent.mm.plugin.music.model.e.bUm();
      paramIPCAudioParamRequest = new android/content/ContentValues;
      paramIPCAudioParamRequest.<init>();
      paramIPCAudioParamRequest.put("fileCacheComplete", Integer.valueOf(i));
      if (i == 1)
        paramIPCAudioParamRequest.put("removeDirtyBit", Integer.valueOf(1));
      ab.i("MicroMsg.Music.PieceMusicInfoStorage", "updateMusicFileCacheComplete raw=%d musicId=%s fileCacheComplete=%d", new Object[] { Integer.valueOf(locald.bSd.update("PieceMusicInfo", paramIPCAudioParamRequest, "musicId=?", new String[] { str })), str, Integer.valueOf(i) });
      paramIPCAudioParamRequest = (c)locald.oNq.get(str);
      if (paramIPCAudioParamRequest != null)
      {
        paramIPCAudioParamRequest.field_fileCacheComplete = i;
        if (i == 1)
          paramIPCAudioParamRequest.field_removeDirtyBit = 1;
      }
      paramIPCAudioParamRequest = new IPCVoid();
      AppMethodBeat.o(104959);
      return paramIPCAudioParamRequest;
    }
    catch (Exception paramIPCAudioParamRequest)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.Audio.MusicDataSourceCrossProcessImp", paramIPCAudioParamRequest, "ipc updateMusicFileCacheComplete task", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.model.a.a.a.m
 * JD-Core Version:    0.6.2
 */
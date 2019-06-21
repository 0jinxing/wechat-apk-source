package com.tencent.mm.plugin.music.model.a.a;

import android.content.ContentValues;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.ipcinvoker.i;
import com.tencent.mm.ipcinvoker.type.IPCVoid;
import com.tencent.mm.plugin.music.cache.ipc.IPCAudioParamRequest;
import com.tencent.mm.plugin.music.model.e.c;
import com.tencent.mm.plugin.music.model.e.d;
import com.tencent.mm.sdk.platformtools.ab;

public final class a$i
  implements i<IPCAudioParamRequest, IPCVoid>
{
  private static IPCVoid a(IPCAudioParamRequest paramIPCAudioParamRequest)
  {
    AppMethodBeat.i(104951);
    try
    {
      ab.i("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "ipc setMusicMIMETypeByMusicId Task, musicId:%s, mimeType:%s", new Object[] { paramIPCAudioParamRequest.cFI, paramIPCAudioParamRequest.mimeType });
      Object localObject1 = paramIPCAudioParamRequest.cFI;
      paramIPCAudioParamRequest = paramIPCAudioParamRequest.mimeType;
      Object localObject2 = com.tencent.mm.plugin.music.model.e.bUm().Tq((String)localObject1);
      if (localObject2 == null)
        ab.e("MicroMsg.Music.MusicDataSourceMainProcessImp", "setMusicMIMETypeByMusicId pMusic is null!'");
      while (true)
      {
        paramIPCAudioParamRequest = new IPCVoid();
        AppMethodBeat.o(104951);
        return paramIPCAudioParamRequest;
        if ((!TextUtils.isEmpty(((c)localObject2).field_pieceFileMIMEType)) && (((c)localObject2).field_pieceFileMIMEType.equals(paramIPCAudioParamRequest)))
          break;
        ab.i("MicroMsg.Music.MusicDataSourceMainProcessImp", "updatePieceFileMIMEType()");
        d locald = com.tencent.mm.plugin.music.model.e.bUm();
        localObject2 = new android/content/ContentValues;
        ((ContentValues)localObject2).<init>();
        ((ContentValues)localObject2).put("pieceFileMIMEType", paramIPCAudioParamRequest);
        ab.i("MicroMsg.Music.PieceMusicInfoStorage", "updatePieceFileMIMEType raw=%d musicId=%s", new Object[] { Integer.valueOf(locald.bSd.update("PieceMusicInfo", (ContentValues)localObject2, "musicId=?", new String[] { localObject1 })), localObject1 });
        localObject1 = (c)locald.oNq.get(localObject1);
        if (localObject1 != null)
          ((c)localObject1).field_pieceFileMIMEType = paramIPCAudioParamRequest;
      }
    }
    catch (Exception paramIPCAudioParamRequest)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Audio.MusicDataSourceCrossProcessImp", paramIPCAudioParamRequest, "ipc setMusicMIMETypeByMusicId task", new Object[0]);
        continue;
        ab.e("MicroMsg.Music.MusicDataSourceMainProcessImp", "don't need update the piece file mime type");
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.model.a.a.a.i
 * JD-Core Version:    0.6.2
 */
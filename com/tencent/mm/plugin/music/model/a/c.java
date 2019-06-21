package com.tencent.mm.plugin.music.model.a;

import android.content.ContentValues;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.aw.h;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.ipcinvoker.type.IPCBoolean;
import com.tencent.mm.ipcinvoker.type.IPCInteger;
import com.tencent.mm.ipcinvoker.type.IPCLong;
import com.tencent.mm.ipcinvoker.type.IPCString;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.music.cache.ipc.IPCAudioParamRequest;
import com.tencent.mm.plugin.music.cache.ipc.IPCAudioParamResponse;
import com.tencent.mm.plugin.music.model.a.a.a.b;
import com.tencent.mm.plugin.music.model.a.a.a.c;
import com.tencent.mm.plugin.music.model.a.a.a.d;
import com.tencent.mm.plugin.music.model.a.a.a.e;
import com.tencent.mm.plugin.music.model.a.a.a.f;
import com.tencent.mm.plugin.music.model.a.a.a.g;
import com.tencent.mm.plugin.music.model.a.a.a.h;
import com.tencent.mm.plugin.music.model.a.a.a.i;
import com.tencent.mm.plugin.music.model.a.a.a.j;
import com.tencent.mm.plugin.music.model.a.a.a.k;
import com.tencent.mm.plugin.music.model.a.a.a.l;
import com.tencent.mm.plugin.music.model.a.a.a.m;
import com.tencent.mm.sdk.platformtools.ab;

public final class c
  implements com.tencent.mm.plugin.music.cache.c
{
  public final String SP(String paramString)
  {
    AppMethodBeat.i(104920);
    paramString = b.SP(paramString);
    AppMethodBeat.o(104920);
    return paramString;
  }

  public final h SQ(String paramString)
  {
    AppMethodBeat.i(104923);
    IPCAudioParamResponse localIPCAudioParamResponse = (IPCAudioParamResponse)XIPCInvoker.a("com.tencent.mm", new IPCString(paramString), a.e.class);
    if (localIPCAudioParamResponse != null)
    {
      paramString = new h();
      paramString.cFI = localIPCAudioParamResponse.cFI;
      paramString.musicUrl = localIPCAudioParamResponse.musicUrl;
      paramString.fileName = localIPCAudioParamResponse.fileName;
      paramString.fKw = localIPCAudioParamResponse.fKw;
      paramString.fKx = localIPCAudioParamResponse.fKx;
      paramString.fKv = localIPCAudioParamResponse.fKv;
      paramString.fKy = localIPCAudioParamResponse.fKy;
      AppMethodBeat.o(104923);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(104923);
    }
  }

  public final String SR(String paramString)
  {
    AppMethodBeat.i(104924);
    IPCString localIPCString = (IPCString)XIPCInvoker.a("com.tencent.mm", new IPCString(paramString), a.l.class);
    if (localIPCString == null)
    {
      paramString = com.tencent.mm.plugin.music.h.b.Tu(paramString);
      AppMethodBeat.o(104924);
    }
    while (true)
    {
      return paramString;
      paramString = localIPCString.value;
      AppMethodBeat.o(104924);
    }
  }

  public final void SS(String paramString)
  {
    AppMethodBeat.i(104925);
    XIPCInvoker.a("com.tencent.mm", new IPCString(paramString), com.tencent.mm.plugin.music.model.a.a.a.a.class);
    AppMethodBeat.o(104925);
  }

  public final String ST(String paramString)
  {
    AppMethodBeat.i(104929);
    paramString = (IPCString)XIPCInvoker.a("com.tencent.mm", new IPCString(paramString), a.d.class);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(104929);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.value;
      AppMethodBeat.o(104929);
    }
  }

  public final com.tencent.mm.plugin.music.c.a SU(String paramString)
  {
    AppMethodBeat.i(104930);
    paramString = com.tencent.mm.plugin.music.model.a.a.b.Tm(paramString);
    paramString = com.tencent.mm.plugin.music.model.e.bUk().Tp(paramString);
    com.tencent.mm.plugin.music.c.a locala = new com.tencent.mm.plugin.music.c.a();
    if (paramString != null)
    {
      locala.oLp = paramString.field_wifiDownloadedLength;
      locala.oLr = paramString.field_songWifiFileLength;
      locala.oLq = paramString.field_wifiEndFlag;
      locala.oLn = paramString.field_downloadedLength;
      locala.oLo = paramString.field_songFileLength;
      locala.endFlag = paramString.field_endFlag;
      locala.mimeType = paramString.field_mimetype;
    }
    AppMethodBeat.o(104930);
    return locala;
  }

  public final void a(String paramString, com.tencent.mm.plugin.music.c.a parama)
  {
    AppMethodBeat.i(104931);
    paramString = com.tencent.mm.plugin.music.model.a.a.b.Tm(paramString);
    Object localObject1 = com.tencent.mm.plugin.music.model.e.bUk();
    long l = parama.oLp;
    Object localObject2 = new ContentValues();
    ((ContentValues)localObject2).put("wifiDownloadedLength", Long.valueOf(l));
    ab.i("MicroMsg.Music.MusicStorage", "update raw=%d musicId=%s wifiDownloadedLength=%d", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.music.model.e.b)localObject1).bSd.update("Music", (ContentValues)localObject2, "musicId=?", new String[] { paramString })), paramString, Long.valueOf(l) });
    localObject2 = (com.tencent.mm.plugin.music.model.e.a)((com.tencent.mm.plugin.music.model.e.b)localObject1).oNq.get(paramString);
    if (localObject2 != null)
      ((com.tencent.mm.plugin.music.model.e.a)localObject2).field_wifiDownloadedLength = l;
    localObject1 = com.tencent.mm.plugin.music.model.e.bUk();
    int i = parama.oLq;
    localObject2 = new ContentValues();
    ((ContentValues)localObject2).put("wifiEndFlag", Integer.valueOf(i));
    ab.i("MicroMsg.Music.MusicStorage", "update raw=%d musicId=%s wifiEndFlag=%d", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.music.model.e.b)localObject1).bSd.update("Music", (ContentValues)localObject2, "musicId=?", new String[] { paramString })), paramString, Integer.valueOf(i) });
    localObject2 = (com.tencent.mm.plugin.music.model.e.a)((com.tencent.mm.plugin.music.model.e.b)localObject1).oNq.get(paramString);
    if (localObject2 != null)
      ((com.tencent.mm.plugin.music.model.e.a)localObject2).field_wifiEndFlag = i;
    localObject2 = com.tencent.mm.plugin.music.model.e.bUk();
    l = parama.oLr;
    localObject1 = new ContentValues();
    ((ContentValues)localObject1).put("songWifiFileLength", Long.valueOf(l));
    ab.i("MicroMsg.Music.MusicStorage", "update raw=%d musicId=%s songWifiFileLength=%d", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.music.model.e.b)localObject2).bSd.update("Music", (ContentValues)localObject1, "musicId=?", new String[] { paramString })), paramString, Long.valueOf(l) });
    localObject2 = (com.tencent.mm.plugin.music.model.e.a)((com.tencent.mm.plugin.music.model.e.b)localObject2).oNq.get(paramString);
    if (localObject2 != null)
      ((com.tencent.mm.plugin.music.model.e.a)localObject2).field_songWifiFileLength = l;
    localObject1 = com.tencent.mm.plugin.music.model.e.bUk();
    l = parama.oLn;
    localObject2 = new ContentValues();
    ((ContentValues)localObject2).put("downloadedLength", Long.valueOf(l));
    ab.i("MicroMsg.Music.MusicStorage", "update raw=%d musicId=%s downloadedLength=%d", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.music.model.e.b)localObject1).bSd.update("Music", (ContentValues)localObject2, "musicId=?", new String[] { paramString })), paramString, Long.valueOf(l) });
    localObject2 = (com.tencent.mm.plugin.music.model.e.a)((com.tencent.mm.plugin.music.model.e.b)localObject1).oNq.get(paramString);
    if (localObject2 != null)
      ((com.tencent.mm.plugin.music.model.e.a)localObject2).field_downloadedLength = l;
    localObject1 = com.tencent.mm.plugin.music.model.e.bUk();
    i = parama.endFlag;
    localObject2 = new ContentValues();
    ((ContentValues)localObject2).put("endFlag", Integer.valueOf(i));
    ab.i("MicroMsg.Music.MusicStorage", "update raw=%d musicId=%s endFlag=%d", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.music.model.e.b)localObject1).bSd.update("Music", (ContentValues)localObject2, "musicId=?", new String[] { paramString })), paramString, Integer.valueOf(i) });
    localObject2 = (com.tencent.mm.plugin.music.model.e.a)((com.tencent.mm.plugin.music.model.e.b)localObject1).oNq.get(paramString);
    if (localObject2 != null)
      ((com.tencent.mm.plugin.music.model.e.a)localObject2).field_endFlag = i;
    localObject2 = com.tencent.mm.plugin.music.model.e.bUk();
    l = parama.oLo;
    parama = new ContentValues();
    parama.put("songFileLength", Long.valueOf(l));
    ab.i("MicroMsg.Music.MusicStorage", "update raw=%d musicId=%s songFileLength=%d", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.music.model.e.b)localObject2).bSd.update("Music", parama, "musicId=?", new String[] { paramString })), paramString, Long.valueOf(l) });
    paramString = (com.tencent.mm.plugin.music.model.e.a)((com.tencent.mm.plugin.music.model.e.b)localObject2).oNq.get(paramString);
    if (paramString != null)
      paramString.field_songFileLength = l;
    AppMethodBeat.o(104931);
  }

  public final int bTA()
  {
    AppMethodBeat.i(104918);
    IPCInteger localIPCInteger = (IPCInteger)XIPCInvoker.a("com.tencent.mm", new IPCInteger(3), a.f.class);
    int i;
    if (localIPCInteger == null)
    {
      AppMethodBeat.o(104918);
      i = 3;
    }
    while (true)
    {
      return i;
      i = localIPCInteger.value;
      AppMethodBeat.o(104918);
    }
  }

  public final long bTB()
  {
    AppMethodBeat.i(104921);
    IPCLong localIPCLong = (IPCLong)XIPCInvoker.a("com.tencent.mm", null, a.c.class);
    long l;
    if (localIPCLong == null)
    {
      l = 0L;
      AppMethodBeat.o(104921);
    }
    while (true)
    {
      return l;
      l = localIPCLong.value;
      AppMethodBeat.o(104921);
    }
  }

  public final boolean bTC()
  {
    AppMethodBeat.i(104933);
    int i = ((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(com.tencent.mm.plugin.expt.a.a.a.lFN, 0);
    ab.i("MicroMsg.PieceDataSourceService", "open_mix_audio:%d", new Object[] { Integer.valueOf(i) });
    if (i == 1)
      AppMethodBeat.o(104933);
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      AppMethodBeat.o(104933);
    }
  }

  public final boolean bTD()
  {
    AppMethodBeat.i(104934);
    IPCBoolean localIPCBoolean = (IPCBoolean)XIPCInvoker.a("com.tencent.mm", null, a.g.class);
    boolean bool;
    if (localIPCBoolean == null)
    {
      bool = false;
      AppMethodBeat.o(104934);
    }
    while (true)
    {
      return bool;
      bool = localIPCBoolean.value;
      AppMethodBeat.o(104934);
    }
  }

  public final boolean bTz()
  {
    AppMethodBeat.i(104917);
    IPCBoolean localIPCBoolean = (IPCBoolean)XIPCInvoker.a("com.tencent.mm", null, a.j.class);
    boolean bool;
    if (localIPCBoolean == null)
    {
      bool = false;
      AppMethodBeat.o(104917);
    }
    while (true)
    {
      return bool;
      bool = localIPCBoolean.value;
      AppMethodBeat.o(104917);
    }
  }

  public final void cH(String paramString, int paramInt)
  {
    AppMethodBeat.i(104927);
    IPCAudioParamRequest localIPCAudioParamRequest = new IPCAudioParamRequest();
    localIPCAudioParamRequest.cFI = paramString;
    localIPCAudioParamRequest.oLm = paramInt;
    XIPCInvoker.a("com.tencent.mm", localIPCAudioParamRequest, a.m.class);
    AppMethodBeat.o(104927);
  }

  public final void fm(String paramString1, String paramString2)
  {
    AppMethodBeat.i(104928);
    IPCAudioParamRequest localIPCAudioParamRequest = new IPCAudioParamRequest();
    localIPCAudioParamRequest.cFI = paramString1;
    localIPCAudioParamRequest.mimeType = paramString2;
    XIPCInvoker.a("com.tencent.mm", localIPCAudioParamRequest, a.i.class);
    AppMethodBeat.o(104928);
  }

  public final void fn(String paramString1, String paramString2)
  {
    AppMethodBeat.i(104932);
    String str = com.tencent.mm.plugin.music.model.a.a.b.Tm(paramString1);
    paramString1 = com.tencent.mm.plugin.music.model.e.bUk();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("mimetype", paramString2);
    paramString1.bSd.update("Music", localContentValues, "musicId=?", new String[] { str });
    paramString1 = (com.tencent.mm.plugin.music.model.e.a)paramString1.oNq.get(str);
    if (paramString1 != null)
      paramString1.field_mimetype = paramString2;
    AppMethodBeat.o(104932);
  }

  public final String getAccPath()
  {
    AppMethodBeat.i(104919);
    Object localObject = (IPCString)XIPCInvoker.a("com.tencent.mm", null, a.b.class);
    if (localObject == null)
    {
      AppMethodBeat.o(104919);
      localObject = null;
    }
    while (true)
    {
      return localObject;
      localObject = ((IPCString)localObject).value;
      AppMethodBeat.o(104919);
    }
  }

  public final void jm(long paramLong)
  {
    AppMethodBeat.i(104922);
    XIPCInvoker.a("com.tencent.mm", new IPCLong(paramLong), a.h.class);
    AppMethodBeat.o(104922);
  }

  public final void y(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(104926);
    IPCAudioParamRequest localIPCAudioParamRequest = new IPCAudioParamRequest();
    localIPCAudioParamRequest.cFI = paramString;
    localIPCAudioParamRequest.fKv = paramArrayOfByte;
    XIPCInvoker.a("com.tencent.mm", localIPCAudioParamRequest, a.k.class);
    AppMethodBeat.o(104926);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.model.a.c
 * JD-Core Version:    0.6.2
 */
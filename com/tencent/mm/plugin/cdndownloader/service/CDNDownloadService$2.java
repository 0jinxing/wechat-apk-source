package com.tencent.mm.plugin.cdndownloader.service;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.c;
import com.tencent.mm.i.d;
import com.tencent.mm.i.g.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.ByteArrayOutputStream;

final class CDNDownloadService$2
  implements g.a
{
  public final int a(String paramString, int paramInt, c paramc, d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(948);
    String str1;
    String str2;
    if (paramc == null)
    {
      str1 = "null";
      if (paramd != null)
        break label94;
      str2 = "null";
      label23: ab.d("MicroMsg.CDNDownloadService", "on cdn callback mediaId = %s, startRet = %d, keep_ProgressInfo = %s, keep_SceneResult = %s", new Object[] { paramString, Integer.valueOf(paramInt), str1, str2 });
      if (paramInt != -21006)
        break label104;
      ab.i("MicroMsg.CDNDownloadService", "duplicate request, ignore this request, media id is %s", new Object[] { paramString });
      AppMethodBeat.o(948);
    }
    while (true)
    {
      return 0;
      str1 = paramc.toString();
      break;
      label94: str2 = paramd.toString();
      break label23;
      label104: if (paramInt != 0)
      {
        ab.e("MicroMsg.CDNDownloadService", "start failed : %d, media id is :%s", new Object[] { Integer.valueOf(paramInt), paramString });
        CDNDownloadService.O(paramString, 4, paramInt);
        AppMethodBeat.o(948);
      }
      else
      {
        if (paramc == null)
          break label172;
        CDNDownloadService.n(paramString, paramc.field_finishedLength, paramc.field_toltalLength);
        AppMethodBeat.o(948);
      }
    }
    label172: if (paramd != null)
    {
      if (paramd.field_retCode == 0)
        break label235;
      ab.e("MicroMsg.CDNDownloadService", "cdntra clientid:%s sceneResult.retCode:%d sceneResult[%s]", new Object[] { paramString, Integer.valueOf(paramd.field_retCode), paramd });
      CDNDownloadService.O(paramString, 4, paramd.field_retCode);
    }
    while (true)
    {
      AppMethodBeat.o(948);
      break;
      label235: ab.i("MicroMsg.CDNDownloadService", "cdn trans suceess, media id : %s", new Object[] { paramString });
      CDNDownloadService.O(paramString, 3, 0);
    }
  }

  public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
  {
  }

  public final byte[] l(String paramString, byte[] paramArrayOfByte)
  {
    return new byte[0];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cdndownloader.service.CDNDownloadService.2
 * JD-Core Version:    0.6.2
 */
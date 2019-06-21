package com.tencent.mm.plugin.cdndownloader.h;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.c;
import com.tencent.mm.i.d;
import com.tencent.mm.i.g.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.ByteArrayOutputStream;

final class a$1
  implements g.a
{
  a$1(a parama)
  {
  }

  public final int a(String paramString, int paramInt, c paramc, d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(966);
    String str1;
    String str2;
    if (paramc == null)
    {
      str1 = "null";
      if (paramd != null)
        break label94;
      str2 = "null";
      label23: ab.d("FileDownloaderWAGameProxy", "on cdn callback mediaId = %s, startRet = %d, keep_ProgressInfo = %s, keep_SceneResult = %s", new Object[] { paramString, Integer.valueOf(paramInt), str1, str2 });
      if (paramInt != -21006)
        break label104;
      ab.i("FileDownloaderWAGameProxy", "duplicate request, ignore this request, media id is %s", new Object[] { paramString });
      AppMethodBeat.o(966);
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
        ab.e("FileDownloaderWAGameProxy", "start failed : %d, media id is :%s", new Object[] { Integer.valueOf(paramInt), paramString });
        a.a(this.ktD, paramString, 4, paramInt, false);
        AppMethodBeat.o(966);
      }
      else
      {
        if (paramc == null)
          break label181;
        a.a(this.ktD, paramString, paramc.field_finishedLength, paramc.field_toltalLength);
        AppMethodBeat.o(966);
      }
    }
    label181: if (paramd != null)
    {
      if (paramd.field_retCode == 0)
        break label253;
      ab.e("FileDownloaderWAGameProxy", "cdntra clientid:%s sceneResult.retCode:%d sceneResult[%s]", new Object[] { paramString, Integer.valueOf(paramd.field_retCode), paramd });
      a.a(this.ktD, paramString, 4, paramd.field_retCode, paramd.field_isResume);
    }
    while (true)
    {
      AppMethodBeat.o(966);
      break;
      label253: ab.i("FileDownloaderWAGameProxy", "cdn trans suceess, media id : %s", new Object[] { paramString });
      a.a(this.ktD, paramString, 3, 0, paramd.field_isResume);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cdndownloader.h.a.1
 * JD-Core Version:    0.6.2
 */
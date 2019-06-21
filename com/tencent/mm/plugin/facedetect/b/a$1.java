package com.tencent.mm.plugin.facedetect.b;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.c;
import com.tencent.mm.i.g.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.ByteArrayOutputStream;

final class a$1
  implements g.a
{
  a$1(a parama)
  {
  }

  public final int a(String paramString, int paramInt, c paramc, com.tencent.mm.i.d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(57);
    if (paramInt == -21005)
    {
      ab.i("MicroMsg.FaceUploadProcessor", "hy: ERR_CNDCOM_MEDIA_IS_UPLOADING cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { paramString, Integer.valueOf(paramInt), paramc, paramd });
      AppMethodBeat.o(57);
    }
    while (true)
    {
      return 0;
      if ((paramd != null) && (paramd.field_retCode == 0))
      {
        ab.i("MicroMsg.FaceUploadProcessor", "hy: sceneResult.field_retCode == 0 cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { paramString, Integer.valueOf(paramInt), paramc, paramd });
        paramc = paramd.field_fileId;
        paramString = new Bundle();
        paramString.putString("key_pic_cdn_id", paramc);
        paramString.putString("key_cdn_aes_key", paramd.field_aesKey);
        paramc = this.lSs;
        if (paramc.lSg != null)
          paramc.lSg.n("ok", paramString);
        h.pYm.a(917L, 13L, 1L, false);
        AppMethodBeat.o(57);
      }
      else if (paramd != null)
      {
        ab.w("MicroMsg.FaceUploadProcessor", "hy: cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { paramString, Integer.valueOf(paramInt), paramc, paramd });
        h.pYm.a(917L, 14L, 1L, false);
        this.lSs.m(3, 90020, "cdn ret error");
        AppMethodBeat.o(57);
      }
      else if (paramInt != 0)
      {
        ab.w("MicroMsg.FaceUploadProcessor", "hy: start error!; cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { paramString, Integer.valueOf(paramInt), paramc, paramd });
        h.pYm.a(917L, 14L, 1L, false);
        this.lSs.m(3, 90021, "cdn start error");
        AppMethodBeat.o(57);
      }
      else
      {
        ab.i("MicroMsg.FaceUploadProcessor", "hy: on process, cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { paramString, Integer.valueOf(paramInt), paramc, paramd });
        if (paramc != null)
        {
          double d = paramc.field_finishedLength / paramc.field_toltalLength;
          ab.d("MicroMsg.FaceUploadProcessor", "hy: cdn process: %f", new Object[] { Double.valueOf(d) });
          paramString = this.lSs;
          if (paramString.lSg != null)
            paramString.lSg.w(d);
        }
        AppMethodBeat.o(57);
      }
    }
  }

  public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
  {
  }

  public final byte[] l(String paramString, byte[] paramArrayOfByte)
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.b.a.1
 * JD-Core Version:    0.6.2
 */
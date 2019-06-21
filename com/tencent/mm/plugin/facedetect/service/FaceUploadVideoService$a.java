package com.tencent.mm.plugin.facedetect.service;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.ai.p;
import com.tencent.mm.i.c;
import com.tencent.mm.i.d;
import com.tencent.mm.i.g.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.facedetect.b.r;
import com.tencent.mm.plugin.facedetect.model.FaceDetectReporter;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.ByteArrayOutputStream;

final class FaceUploadVideoService$a
  implements g.a
{
  private long lTH = -1L;
  private String mAppId = null;
  private String mFileName = null;

  private FaceUploadVideoService$a(FaceUploadVideoService paramFaceUploadVideoService, long paramLong, String paramString1, String paramString2)
  {
    this.lTH = paramLong;
    this.mAppId = paramString1;
    this.mFileName = paramString2;
  }

  public final int a(String paramString, int paramInt, c paramc, d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(353);
    ab.i("MicroMsg.FaceUploadVideoService", "hy: sceneResult.field_retCode == 0 cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { paramString, Integer.valueOf(paramInt), paramc, paramd });
    if ((paramd != null) && (paramd.field_retCode == 0))
    {
      ab.i("MicroMsg.FaceUploadVideoService", "hy: upload video done. now upload");
      h.pYm.a(917L, 23L, 1L, false);
      FaceDetectReporter.i(this.lTH, 0, 0);
      g.Rg().a(1197, this.lWc);
      g.Rg().a(new r(this.mFileName, this.lTH, this.mAppId, paramd.field_fileId, paramd.field_aesKey), 0);
      AppMethodBeat.o(353);
    }
    while (true)
    {
      return 0;
      if (paramd != null)
      {
        ab.w("MicroMsg.FaceUploadVideoService", "hy: upload video cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { paramString, Integer.valueOf(paramInt), paramc, paramd });
        e.deleteFile(this.mFileName);
        h.pYm.a(917L, 24L, 1L, false);
        FaceDetectReporter.i(this.lTH, 1, paramd.field_retCode);
        AppMethodBeat.o(353);
      }
      else
      {
        if (paramInt == 0)
          break;
        ab.w("MicroMsg.FaceUploadVideoService", "hy: upload video start error!; cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { paramString, Integer.valueOf(paramInt), paramc, paramd });
        e.deleteFile(this.mFileName);
        h.pYm.a(917L, 24L, 1L, false);
        FaceDetectReporter.i(this.lTH, 1, paramInt);
        AppMethodBeat.o(353);
      }
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.service.FaceUploadVideoService.a
 * JD-Core Version:    0.6.2
 */
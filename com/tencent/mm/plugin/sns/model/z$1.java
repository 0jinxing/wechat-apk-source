package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.g.a;
import com.tencent.mm.plugin.report.a;
import com.tencent.mm.plugin.sns.lucky.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.ByteArrayOutputStream;

final class z$1
  implements g.a
{
  z$1(z paramz)
  {
  }

  public final int a(String paramString, int paramInt, com.tencent.mm.i.c paramc, com.tencent.mm.i.d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(36345);
    if (paramInt == -21005)
    {
      ab.d("MicroMsg.NetSceneMMSnsUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { this.qKc.fFa, Integer.valueOf(paramInt), paramc, paramd });
      this.qKc.ehi.onSceneEnd(3, -1, "doScene failed", this.qKc);
      AppMethodBeat.o(36345);
    }
    while (true)
    {
      return 0;
      if ((paramd != null) && (paramd.field_retCode == 0))
      {
        ab.i("MicroMsg.NetSceneMMSnsUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { this.qKc.fFa, Integer.valueOf(paramInt), paramc, paramd });
        this.qKc.a(paramd.field_fileUrl, 1, paramd.field_thumbUrl, 1, "upload_" + this.qKc.fFa, paramd.field_filemd5);
        ab.i("MicroMsg.NetSceneMMSnsUpload", "uploadsns cdndone pass: " + (System.currentTimeMillis() - this.qKc.qKa) + " " + paramd.field_filemd5);
        new com.tencent.mm.g.b.a.f(a.r(new Object[] { Integer.valueOf(0), Integer.valueOf(1), Long.valueOf(this.qKc.startTime), Long.valueOf(bo.anU()), Integer.valueOf(com.tencent.mm.al.c.bW(ah.getContext())), Integer.valueOf(this.qKc.fFb), Integer.valueOf(paramd.field_fileLength), paramd.field_transInfo, "", "", "", "", "", "", "", paramd.efY })).ajK();
        this.qKc.ehi.onSceneEnd(0, 0, "doScene", this.qKc);
        AppMethodBeat.o(36345);
      }
      else
      {
        if ((paramd != null) && (paramd.field_retCode != 0))
        {
          ab.i("MicroMsg.NetSceneMMSnsUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { this.qKc.fFa, Integer.valueOf(paramInt), paramc, paramd });
          if (this.qKc.qKb == 21)
          {
            if ((paramd.field_retCode > -10000) || (paramd.field_retCode <= -20000))
              break label696;
            b.kT(10);
          }
          while (true)
          {
            z.a(this.qKc, paramd.field_retCode);
            paramString = a.r(new Object[] { Integer.valueOf(paramd.field_retCode), Integer.valueOf(1), Long.valueOf(this.qKc.startTime), Long.valueOf(bo.anU()), Integer.valueOf(com.tencent.mm.al.c.bW(ah.getContext())), Integer.valueOf(this.qKc.fFb), Integer.valueOf(paramd.field_fileLength), paramd.field_transInfo, "", "", "", "", "", "", "", paramd.efY });
            new com.tencent.mm.g.b.a.f(paramString).ajK();
            new com.tencent.mm.g.b.a.d(paramString).ajK();
            this.qKc.ehi.onSceneEnd(3, -1, "doScene failed", this.qKc);
            AppMethodBeat.o(36345);
            break;
            label696: if ((paramd.field_retCode <= -20000) && (paramd.field_retCode >= -22000))
              b.kT(11);
            else if ((paramd.field_retCode <= -5103000) && (paramd.field_retCode >= -5103087))
              b.kT(9);
            else
              b.kT(15);
          }
        }
        if (paramInt != 0)
        {
          ab.i("MicroMsg.NetSceneMMSnsUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { this.qKc.fFa, Integer.valueOf(paramInt), paramc, paramd });
          this.qKc.CQ(0);
          if (paramd != null)
            new com.tencent.mm.g.b.a.f(a.r(new Object[] { Integer.valueOf(paramInt), Integer.valueOf(1), Long.valueOf(this.qKc.startTime), Long.valueOf(bo.anU()), Integer.valueOf(com.tencent.mm.al.c.bW(ah.getContext())), Integer.valueOf(this.qKc.fFb), Integer.valueOf(paramd.field_fileLength), paramd.field_transInfo, "", "", "", "", "", "", "", paramd.efY })).ajK();
          this.qKc.ehi.onSceneEnd(3, -1, "doScene failed", this.qKc);
          AppMethodBeat.o(36345);
        }
        else
        {
          ab.d("MicroMsg.NetSceneMMSnsUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { this.qKc.fFa, Integer.valueOf(paramInt), paramc, paramd });
          AppMethodBeat.o(36345);
        }
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.z.1
 * JD-Core Version:    0.6.2
 */
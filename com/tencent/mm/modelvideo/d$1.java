package com.tencent.mm.modelvideo;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.al.e;
import com.tencent.mm.i.g.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.ByteArrayOutputStream;

final class d$1
  implements g.a
{
  d$1(d paramd)
  {
  }

  public final int a(String paramString, int paramInt, com.tencent.mm.i.c paramc, com.tencent.mm.i.d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(50665);
    if (paramInt == -21006)
    {
      ab.d("MicroMsg.NetSceneDownloadVideo", "%s cdntra  ERR_CNDCOM_MEDIA_IS_DOWNLOADING clientid:%s", new Object[] { this.fVp.alb(), this.fVp.fFa });
      AppMethodBeat.o(50665);
    }
    while (true)
    {
      return 0;
      if (paramInt != 0)
      {
        u.um(this.fVp.fileName);
        paramString = com.tencent.mm.plugin.report.a.r(new Object[] { Integer.valueOf(paramInt), Integer.valueOf(2), Long.valueOf(this.fVp.startTime), Long.valueOf(bo.anU()), Integer.valueOf(com.tencent.mm.al.c.bW(ah.getContext())), Integer.valueOf(this.fVp.fVl), Integer.valueOf(this.fVp.frO), "" });
        new com.tencent.mm.g.b.a.f(paramString).ajK();
        new com.tencent.mm.g.b.a.d(paramString).ajK();
        this.fVp.ehi.onSceneEnd(3, paramInt, "", this.fVp);
        AppMethodBeat.o(50665);
      }
      else
      {
        this.fVp.fVj = u.ut(this.fVp.fileName);
        if ((this.fVp.fVj == null) || (this.fVp.fVj.status == 113))
        {
          if (this.fVp.fVj == null);
          for (int i = -1; ; i = this.fVp.fVj.status)
          {
            ab.i("MicroMsg.NetSceneDownloadVideo", "%s upload video info is null or has paused, status:%d", new Object[] { this.fVp.alb(), Integer.valueOf(i) });
            this.fVp.EH();
            this.fVp.ehi.onSceneEnd(3, paramInt, "upload video info is null or has paused, status".concat(String.valueOf(i)), this.fVp);
            AppMethodBeat.o(50665);
            break;
          }
        }
        if (paramc == null)
          break;
        if (paramc.field_finishedLength == this.fVp.frO)
        {
          ab.d("MicroMsg.NetSceneDownloadVideo", "cdntra ignore progress 100%");
          AppMethodBeat.o(50665);
        }
        else if ((this.fVp.fVj.fWY > paramc.field_finishedLength) && (!this.fVp.fVh))
        {
          ab.e("MicroMsg.NetSceneDownloadVideo", "%s cdnEndProc error oldpos:%d newpos:%d", new Object[] { this.fVp.alb(), Integer.valueOf(this.fVp.fVj.fWY), Integer.valueOf(paramc.field_finishedLength) });
          u.um(this.fVp.fileName);
          this.fVp.ehi.onSceneEnd(3, paramInt, "", this.fVp);
          AppMethodBeat.o(50665);
        }
        else
        {
          paramInt = 1024;
          this.fVp.fVj.fXb = bo.anT();
          if (this.fVp.fVj.fWY < paramc.field_finishedLength)
          {
            this.fVp.fVj.fWY = paramc.field_finishedLength;
            paramInt = 1040;
          }
          this.fVp.fVj.bJt = paramInt;
          u.f(this.fVp.fVj);
          ab.d("MicroMsg.NetSceneDownloadVideo", "%s cdntra progresscallback id:%s finish:%d total:%d", new Object[] { this.fVp.alb(), this.fVp.fFa, Integer.valueOf(paramc.field_finishedLength), Integer.valueOf(paramc.field_toltalLength) });
          AppMethodBeat.o(50665);
        }
      }
    }
    if (paramd != null)
    {
      ab.i("MicroMsg.NetSceneDownloadVideo", "%s cdntra sceneResult.retCode:%d useTime:%d ", new Object[] { this.fVp.alb(), Integer.valueOf(paramd.field_retCode), Long.valueOf(bo.anU() - this.fVp.fVo) });
      paramString = this.fVp;
      paramc = this.fVp.fVk;
      if ((paramc != null) && (paramd != null))
        break label1154;
      ab.w("MicroMsg.NetSceneDownloadVideo", "it had not task info or scene Result, don't report.");
      label712: if (paramd.field_retCode == 0)
        break label1248;
      u.um(this.fVp.fileName);
      if (this.fVp.fVh)
        com.tencent.mm.plugin.report.service.h.pYm.a(354L, 13L, 1L, false);
      if (this.fVp.fVi)
        com.tencent.mm.plugin.report.service.h.pYm.a(354L, 252L, 1L, false);
      this.fVp.ehi.onSceneEnd(3, paramd.field_retCode, "", this.fVp);
    }
    while (true)
    {
      new com.tencent.mm.g.b.a.f(com.tencent.mm.plugin.report.a.r(new Object[] { Integer.valueOf(paramd.field_retCode), Integer.valueOf(2), Long.valueOf(this.fVp.startTime), Long.valueOf(bo.anU()), Integer.valueOf(com.tencent.mm.al.c.bW(ah.getContext())), Integer.valueOf(this.fVp.fVl), Integer.valueOf(this.fVp.frO), paramd.field_transInfo, "", "", "", "", "", "", "", paramd.efY })).ajK();
      if (paramd.field_retCode != 0)
        new com.tencent.mm.g.b.a.d(com.tencent.mm.plugin.report.a.r(new Object[] { Integer.valueOf(paramd.field_retCode), Integer.valueOf(2), Long.valueOf(this.fVp.startTime), Long.valueOf(bo.anU()), Integer.valueOf(com.tencent.mm.al.c.bW(ah.getContext())), Integer.valueOf(this.fVp.fVl), Integer.valueOf(this.fVp.frO), paramd.field_transInfo, "", "", "", "", "", "", "", paramd.efY })).ajK();
      a.a(this.fVp.fVj, 1);
      this.fVp.fVk = null;
      AppMethodBeat.o(50665);
      break;
      label1154: if (paramc.field_smallVideoFlag == 1)
      {
        ab.i("MicroMsg.NetSceneDownloadVideo", "it download short video, don't report.");
        break label712;
      }
      if ((paramc == null) || (paramd == null))
        break label712;
      ab.i("MicroMsg.NetSceneDownloadVideo", "%s sceneResult.field_recvedBytes %d, time [%d, %d]", new Object[] { paramString.alb(), Integer.valueOf(paramd.field_recvedBytes), Long.valueOf(paramd.field_startTime), Long.valueOf(paramd.field_endTime) });
      o.alm();
      e.a(null, paramd, paramc, true);
      break label712;
      label1248: if (this.fVp.fVh)
        com.tencent.mm.plugin.report.service.h.pYm.a(354L, 12L, 1L, false);
      if (this.fVp.fVi)
        com.tencent.mm.plugin.report.service.h.pYm.a(354L, 137L, 1L, false);
      this.fVp.mo(paramd.field_fileLength);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.d.1
 * JD-Core Version:    0.6.2
 */
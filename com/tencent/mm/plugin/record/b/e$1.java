package com.tencent.mm.plugin.record.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.i.g.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.c;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import java.io.ByteArrayOutputStream;
import java.io.File;

final class e$1
  implements g.a
{
  e$1(e parame)
  {
  }

  public final int a(String paramString, final int paramInt, com.tencent.mm.i.c paramc, com.tencent.mm.i.d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(135653);
    if (paramc == null)
    {
      paramBoolean = true;
      ab.d("MicroMsg.NetSceneDownloadAppAttach", "summerbig callback mediaId[%s], startRet[%d], progressInfo[%s], sceneResult[%s], finish[%b]", new Object[] { paramString, Integer.valueOf(paramInt), paramc, paramd, Boolean.valueOf(paramBoolean) });
      if (paramInt != -21006)
        break label92;
      ab.i("MicroMsg.NetSceneDownloadAppAttach", "summerbig callback cdntra  ERR_CNDCOM_MEDIA_IS_DOWNLOADING clientid:%s", new Object[] { this.pJr.fFa });
      AppMethodBeat.o(135653);
    }
    while (true)
    {
      return 0;
      paramBoolean = false;
      break;
      label92: if (paramInt != 0)
      {
        a.jC(this.pJr.pJj.xDa);
        new com.tencent.mm.g.b.a.f(com.tencent.mm.plugin.report.a.r(new Object[] { Integer.valueOf(paramInt), Integer.valueOf(2), Long.valueOf(this.pJr.startTime), Long.valueOf(bo.anU()), Integer.valueOf(com.tencent.mm.al.c.bW(ah.getContext())), Integer.valueOf(com.tencent.mm.i.a.MediaType_FILE), Integer.valueOf(0), "" })).ajK();
        al.d(new e.1.1(this, paramInt));
        AppMethodBeat.o(135653);
      }
      else
      {
        this.pJr.pJj = a.i(paramString, this.pJr.cvx);
        if (this.pJr.pJj == null)
        {
          ab.e("MicroMsg.NetSceneDownloadAppAttach", "summerbig attachInfo is null");
          al.d(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(135646);
              e.1.this.pJr.ehi.onSceneEnd(3, paramInt, "", e.1.this.pJr);
              AppMethodBeat.o(135646);
            }
          });
          AppMethodBeat.o(135653);
        }
        else if (this.pJr.pJj.field_status == 102L)
        {
          ab.i("MicroMsg.NetSceneDownloadAppAttach", "summerbig dancy attach download has paused, status:%d", new Object[] { Long.valueOf(this.pJr.pJj.field_status) });
          com.tencent.mm.al.f.afx().rN(this.pJr.fFa);
          al.d(new e.1.3(this, paramInt));
          AppMethodBeat.o(135653);
        }
        else
        {
          if (paramc == null)
            break label582;
          if (paramc.field_finishedLength == this.pJr.pJj.field_totalLen)
          {
            ab.i("MicroMsg.NetSceneDownloadAppAttach", "summerbig callback cdntra ignore progress 100%");
            AppMethodBeat.o(135653);
          }
          else if (this.pJr.pJj.field_offset > paramc.field_finishedLength)
          {
            ab.e("MicroMsg.NetSceneDownloadAppAttach", "summerbig callback cdnEndProc error oldpos:%d newpos:%d", new Object[] { Long.valueOf(this.pJr.pJj.field_offset), Integer.valueOf(paramc.field_finishedLength) });
            a.jC(this.pJr.pJj.xDa);
            al.d(new e.1.4(this, paramInt));
            AppMethodBeat.o(135653);
          }
          else
          {
            this.pJr.pJj.field_offset = paramc.field_finishedLength;
            com.tencent.mm.plugin.s.a.aUq().a(this.pJr.pJj, new String[0]);
            if (this.pJr.fEW != null)
              al.d(new e.1.5(this));
            ab.d("MicroMsg.NetSceneDownloadAppAttach", "summerbig callback cdntra progresscallback id:%s finish:%d total:%d", new Object[] { this.pJr.fFa, Integer.valueOf(paramc.field_finishedLength), Integer.valueOf(paramc.field_toltalLength) });
            AppMethodBeat.o(135653);
          }
        }
      }
    }
    label582: if (paramd != null)
    {
      if (paramd.field_retCode == 0)
        break label1002;
      a.jC(this.pJr.pJj.xDa);
      ab.e("MicroMsg.NetSceneDownloadAppAttach", "summerbig callback cdntra sceneResult.retCode :%d", new Object[] { Integer.valueOf(paramd.field_retCode) });
      label630: new com.tencent.mm.g.b.a.f(com.tencent.mm.plugin.report.a.r(new Object[] { Integer.valueOf(paramd.field_retCode), Integer.valueOf(2), Long.valueOf(this.pJr.startTime), Long.valueOf(bo.anU()), Integer.valueOf(com.tencent.mm.al.c.bW(ah.getContext())), Integer.valueOf(com.tencent.mm.i.a.MediaType_FILE), Long.valueOf(this.pJr.pJj.field_totalLen), paramd.field_transInfo, "", "", "", "", "", "", "", paramd.efY })).ajK();
      if (paramd.field_retCode != 0)
        new com.tencent.mm.g.b.a.d(com.tencent.mm.plugin.report.a.r(new Object[] { Integer.valueOf(paramd.field_retCode), Integer.valueOf(2), Long.valueOf(this.pJr.startTime), Long.valueOf(bo.anU()), Integer.valueOf(com.tencent.mm.al.c.bW(ah.getContext())), Integer.valueOf(com.tencent.mm.i.a.MediaType_FILE), Long.valueOf(this.pJr.pJj.field_totalLen), paramd.field_transInfo, "", "", "", "", "", "", "", paramd.efY })).ajK();
      if (this.pJr.fEW != null)
        al.d(new e.1.6(this));
      if (paramd.field_retCode == 0)
        break label1294;
      al.d(new e.1.7(this, paramd));
    }
    while (true)
    {
      AppMethodBeat.o(135653);
      break;
      label1002: new File(this.pJr.pJn).renameTo(new File(this.pJr.pJj.field_fileFullPath));
      this.pJr.pJj.field_status = 199L;
      this.pJr.pJj.field_offset = this.pJr.pJj.field_totalLen;
      com.tencent.mm.plugin.s.a.aUq().a(this.pJr.pJj, new String[0]);
      com.tencent.mm.plugin.report.service.h.pYm.a(198L, 45L, this.pJr.pJj.field_totalLen, false);
      com.tencent.mm.plugin.report.service.h.pYm.a(198L, 46L, 1L, false);
      paramc = com.tencent.mm.plugin.report.service.h.pYm;
      if (this.pJr.cKd == null)
      {
        paramString = "";
        label1142: if (!t.kH(paramString))
          break label1249;
      }
      label1249: for (long l = 48L; ; l = 47L)
      {
        paramc.a(198L, l, 1L, false);
        paramString = ((j)g.K(j.class)).bOr().jf(this.pJr.pJj.field_msgInfoId);
        if (paramString.field_status != 5)
          break label1257;
        paramString.setStatus(3);
        ((j)g.K(j.class)).bOr().a(paramString.field_msgId, paramString);
        break;
        paramString = this.pJr.cKd.field_talker;
        break label1142;
      }
      label1257: ((j)g.K(j.class)).bOr().a(new h.c(paramString.field_talker, "update", paramString));
      break label630;
      label1294: al.d(new e.1.8(this));
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
 * Qualified Name:     com.tencent.mm.plugin.record.b.e.1
 * JD-Core Version:    0.6.2
 */
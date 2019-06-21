package com.tencent.mm.modelvideo;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.i.g.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bf;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class m$a
  implements com.tencent.mm.ai.f, g.a
{
  long fVs;
  s fVt;
  String fWl;
  List<s> foD;
  long startTime;

  private m$a(m paramm)
  {
  }

  public final int a(String arg1, int paramInt, com.tencent.mm.i.c paramc, com.tencent.mm.i.d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(50742);
    ab.d("MicroMsg.SightMassSendService", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { this.fWl, Integer.valueOf(paramInt), paramc, paramd });
    if (paramInt == -21005)
    {
      ab.d("MicroMsg.SightMassSendService", "cdntra  ERR_CNDCOM_MEDIA_IS_UPLOADING clientid:%s", new Object[] { this.fWl });
      AppMethodBeat.o(50742);
    }
    while (true)
    {
      return 0;
      if (paramInt != 0)
      {
        m.ak(this.foD);
        ab.e("MicroMsg.SightMassSendService", "upload to CDN error, massSendId %d, errCode %d", new Object[] { Long.valueOf(this.fVs), Integer.valueOf(paramInt) });
        new com.tencent.mm.g.b.a.f(com.tencent.mm.plugin.report.a.r(new Object[] { Integer.valueOf(paramInt), Integer.valueOf(1), Long.valueOf(this.startTime), Long.valueOf(bo.anU()), Integer.valueOf(com.tencent.mm.al.c.bW(ah.getContext())), Integer.valueOf(com.tencent.mm.i.a.MediaType_TinyVideo), Integer.valueOf(0), "" })).ajK();
        this.fWk.e(this.fVs, 3, paramInt);
        AppMethodBeat.o(50742);
      }
      else if (paramc != null)
      {
        ab.v("MicroMsg.SightMassSendService", "progress length %d", new Object[] { Integer.valueOf(paramc.field_finishedLength) });
        paramd = this.foD.iterator();
        while (paramd.hasNext())
        {
          ??? = (s)paramd.next();
          ???.fXb = bo.anT();
          ???.fVG = paramc.field_finishedLength;
          ???.bJt = 1032;
          u.f(???);
        }
        AppMethodBeat.o(50742);
      }
      else
      {
        if (paramd != null)
        {
          if (paramd.field_retCode == 0)
            break;
          ab.e("MicroMsg.SightMassSendService", "cdntra sceneResult.retCode :%d arg[%s] info[%s], massSendId[%d]", new Object[] { Integer.valueOf(paramd.field_retCode), paramd.field_arg, paramd.field_transInfo, Long.valueOf(this.fVs) });
          m.ak(this.foD);
          ??? = com.tencent.mm.plugin.report.a.r(new Object[] { Integer.valueOf(paramd.field_retCode), Integer.valueOf(1), Long.valueOf(this.startTime), Long.valueOf(bo.anU()), Integer.valueOf(com.tencent.mm.al.c.bW(ah.getContext())), Integer.valueOf(com.tencent.mm.i.a.MediaType_TinyVideo), Integer.valueOf(paramd.field_fileLength), paramd.field_transInfo, "", "", "", "", "", "", "", paramd.efY });
          new com.tencent.mm.g.b.a.f(???).ajK();
          new com.tencent.mm.g.b.a.d(???).ajK();
          this.fWk.e(this.fVs, 3, paramd.field_retCode);
        }
        AppMethodBeat.o(50742);
      }
    }
    ab.i("MicroMsg.SightMassSendService", "uploadvideo by cdn, isHitCacheUpload[%d] massSendId[%d]", new Object[] { Integer.valueOf(paramd.field_UploadHitCacheType), Long.valueOf(this.fVs) });
    ??? = "<msg><videomsg aeskey=\"" + paramd.field_aesKey + "\" cdnthumbaeskey=\"" + paramd.field_aesKey + "\" cdnvideourl=\"" + paramd.field_fileId + "\" ";
    ??? = ??? + "cdnthumburl=\"" + paramd.field_fileId + "\" ";
    ??? = ??? + "length=\"" + paramd.field_fileLength + "\" ";
    String str = ??? + "cdnthumblength=\"" + paramd.field_thumbimgLength + "\"/></msg>";
    ab.i("MicroMsg.SightMassSendService", "cdn callback new build cdnInfo:%s", new Object[] { str });
    ??? = this.foD.iterator();
    while (???.hasNext())
    {
      paramc = (s)???.next();
      if (bo.isNullOrNil(paramc.alw()))
      {
        paramc.fXj = str;
        paramc.bJt = 2097152;
        paramBoolean = u.f(paramc);
        ab.i("MicroMsg.SightMassSendService", "massSendId[%d] info %s, update recv xml ret %B", new Object[] { Long.valueOf(this.fVs), paramc.getFileName(), Boolean.valueOf(paramBoolean) });
      }
    }
    while (true)
    {
      synchronized (m.a(this.fWk))
      {
        paramc = (String)m.b(this.fWk).get(Long.valueOf(this.fVs));
        if (bo.isNullOrNil(paramc))
          ab.i("MicroMsg.SightMassSendService", "check cdn client id FAIL do NOTHING, massSendId %d, oldClientId %s, selfClientId %s", new Object[] { Long.valueOf(this.fVs), paramc, this.fWl });
      }
      ab.i("MicroMsg.SightMassSendService", "check cdn client id ok do MASS SEND, massSendId %d, oldClientId %s, selfClientId %s", new Object[] { Long.valueOf(this.fVs), paramc, this.fWl });
      m.b(this.fWk).put(Long.valueOf(this.fVs), "done_upload_cdn_client_id");
      g.Rg().a(245, this);
      paramc = new com/tencent/mm/modelvideo/e;
      paramc.<init>(this.fVs, this.fVt, paramd, this.fWl);
      if (!g.Rg().a(paramc, 0))
      {
        ab.e("MicroMsg.SightMassSendService", "try to do NetSceneMassUploadSight fail");
        g.Rg().b(245, this);
        this.fWk.e(this.fVs, 3, 0);
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

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(50743);
    g.Rg().b(245, this);
    if ((paramInt1 == 4) && (paramInt2 == -22))
    {
      ab.e("MicroMsg.SightMassSendService", "ERR: onGYNetEnd BLACK  errtype:" + paramInt1 + " errCode:" + paramInt2 + " massSendId:" + this.fVs);
      m.al(this.foD);
      this.fWk.e(this.fVs, paramInt1, paramInt2);
      AppMethodBeat.o(50743);
    }
    while (true)
    {
      return;
      if ((paramInt1 == 4) && (paramInt2 != 0))
      {
        ab.e("MicroMsg.SightMassSendService", "ERR: onGYNetEnd SERVER FAILED errtype:" + paramInt1 + " errCode:" + paramInt2 + "  massSendId:" + this.fVs);
        m.ak(this.foD);
        this.fWk.e(this.fVs, paramInt1, paramInt2);
        AppMethodBeat.o(50743);
      }
      else if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        ab.e("MicroMsg.SightMassSendService", "ERR: onGYNetEnd FAILED (WILL RETRY) errtype:" + paramInt1 + " errCode:" + paramInt2 + "  massSendId:" + this.fVs);
        m.ak(this.foD);
        this.fWk.e(this.fVs, paramInt1, paramInt2);
        AppMethodBeat.o(50743);
      }
      else
      {
        paramm = this.foD.iterator();
        if (paramm.hasNext())
        {
          paramString = (s)paramm.next();
          paramString.fXb = bo.anT();
          paramString.status = 199;
          paramString.bJt = 1280;
          if (u.f(paramString))
          {
            if (paramString != null)
              break label378;
            ab.e("MicroMsg.VideoLogic", "video info is null");
          }
          while (true)
          {
            ab.v("MicroMsg.SightMassSendService", "massSendId %d, file %s, set status %d", new Object[] { Long.valueOf(this.fVs), paramString.getFileName(), Integer.valueOf(199) });
            break;
            label378: bi localbi;
            if (paramString.fXe > 0)
            {
              localbi = ((j)g.K(j.class)).bOr().jf(paramString.fXe);
              paramInt1 = localbi.getType();
              ab.i("MicroMsg.VideoLogic", "ashutest::updateWriteFinMassMsgInfo, msg type %d", new Object[] { Integer.valueOf(paramInt1) });
              if ((43 == paramInt1) || (62 == paramInt1))
              {
                localbi.hO(1);
                localbi.ju(paramString.getUser());
                localbi.eI(paramString.cKK);
                localbi.setStatus(2);
                localbi.setContent(q.d(paramString.alt(), paramString.fXd, false));
                ((j)g.K(j.class)).bOr().a(paramString.fXe, localbi);
                ab.d("MicroMsg.VideoLogic", "updateWriteFinMassMsgInfo msgId:%d", new Object[] { Long.valueOf(localbi.field_msgId) });
              }
            }
            else
            {
              localbi = new bi();
              localbi.ju(paramString.getUser());
              localbi.setType(62);
              localbi.hO(1);
              localbi.jv(paramString.getFileName());
              localbi.setStatus(2);
              localbi.eJ(bf.oC(paramString.getUser()));
              paramString.fXe = ((int)bf.l(localbi));
              paramString.bJt = 8192;
              u.f(paramString);
              ab.d("MicroMsg.VideoLogic", "updateWriteFinMassMsgInfo insert msgId:%d", new Object[] { Long.valueOf(localbi.field_msgId) });
            }
          }
        }
        paramString = this.fWk;
        long l = this.fVs;
        g.RS().aa(new m.1(paramString, l));
        AppMethodBeat.o(50743);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.m.a
 * JD-Core Version:    0.6.2
 */
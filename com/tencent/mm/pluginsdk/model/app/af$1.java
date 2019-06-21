package com.tencent.mm.pluginsdk.model.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.vu;
import com.tencent.mm.g.a.vu.a;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.i.g.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import java.io.ByteArrayOutputStream;

final class af$1
  implements g.a
{
  af$1(af paramaf)
  {
  }

  public final int a(String paramString, int paramInt, com.tencent.mm.i.c paramc, com.tencent.mm.i.d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(27359);
    ab.d("MicroMsg.NetSceneSendAppMsg", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { this.vcx.fFa, Integer.valueOf(paramInt), paramc, paramd });
    if (paramInt == -21005)
    {
      ab.d("MicroMsg.NetSceneSendAppMsg", "cdntra  ERR_CNDCOM_MEDIA_IS_UPLOADING clientid:%s", new Object[] { this.vcx.fFa });
      AppMethodBeat.o(27359);
    }
    while (true)
    {
      return 0;
      if (paramInt != 0)
      {
        this.vcx.cKd.setStatus(5);
        e.pXa.a(111L, 34L, 1L, true);
        aw.ZK();
        com.tencent.mm.model.c.XO().a(this.vcx.cKd.field_msgId, this.vcx.cKd);
        new com.tencent.mm.g.b.a.f(com.tencent.mm.plugin.report.a.r(new Object[] { Integer.valueOf(paramInt), Integer.valueOf(1), Long.valueOf(this.vcx.startTime), Long.valueOf(bo.anU()), Integer.valueOf(com.tencent.mm.al.c.bW(ah.getContext())), Integer.valueOf(com.tencent.mm.i.a.MediaType_FILE), Integer.valueOf(0), "" })).ajK();
        this.vcx.ehi.onSceneEnd(3, paramInt, "", this.vcx);
        AppMethodBeat.o(27359);
      }
      else
      {
        if (paramd != null)
        {
          if (paramd.field_retCode == 0)
            break;
          ab.e("MicroMsg.NetSceneSendAppMsg", "cdntra sceneResult.retCode :%d arg[%s] info[%s]", new Object[] { Integer.valueOf(paramd.field_retCode), paramd.field_arg, paramd.field_transInfo, "", "", "", "", "", "", "", paramd.efY });
          this.vcx.cKd.setStatus(5);
          e.pXa.a(111L, 34L, 1L, true);
          aw.ZK();
          com.tencent.mm.model.c.XO().a(this.vcx.cKd.field_msgId, this.vcx.cKd);
          paramc = com.tencent.mm.plugin.report.a.r(new Object[] { Integer.valueOf(paramd.field_retCode), Integer.valueOf(1), Long.valueOf(this.vcx.startTime), Long.valueOf(bo.anU()), Integer.valueOf(com.tencent.mm.al.c.bW(ah.getContext())), Integer.valueOf(com.tencent.mm.i.a.MediaType_FILE), Integer.valueOf(paramd.field_fileLength), paramd.field_transInfo, "", "", "", "", "", "", "", paramd.efY });
          new com.tencent.mm.g.b.a.f(paramc).ajK();
          new com.tencent.mm.g.b.a.d(paramc).ajK();
          this.vcx.ehi.onSceneEnd(3, paramd.field_retCode, "", this.vcx);
        }
        if ((paramString != null) && (paramString.equals(this.vcx.fFa)) && (this.vcx.qJr != null) && (this.vcx.qJr.cSV.cSW != -1))
        {
          com.tencent.mm.sdk.b.a.xxA.m(this.vcx.qJr);
          this.vcx.qJr = null;
        }
        AppMethodBeat.o(27359);
      }
    }
    if ((this.vcx.fVJ > 0) && (paramd.field_fileLength > 0))
    {
      paramc = this.vcx.fVJ + "," + paramd.field_fileLength + "," + paramd.field_fileId;
      if (this.vcx.fVJ * 2 <= paramd.field_fileLength)
        break label875;
    }
    label875: for (boolean bool = true; ; bool = false)
    {
      ao.D("SendAppMsgThumbTooBig", paramc, bool);
      ab.i("MicroMsg.NetSceneSendAppMsg", "summersafecdn cdnCallback upload attach by cdn, isHitCacheUpload: %d, onlyCheckExist[%b], exist[%b], aesKey[%s], md5[%s]", new Object[] { Integer.valueOf(paramd.field_UploadHitCacheType), Boolean.valueOf(paramBoolean), Boolean.valueOf(paramd.field_exist_whencheck), bo.anv(paramd.field_aesKey), paramd.field_filemd5 });
      aw.Rg().a(new ag(this.vcx.cvx, false, paramd, new af.1.1(this, paramd), this.vcx.hcl, null), 0);
      break;
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
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.af.1
 * JD-Core Version:    0.6.2
 */
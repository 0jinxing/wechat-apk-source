package com.tencent.mm.pluginsdk.model.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.compatible.util.g;
import com.tencent.mm.i.g.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.ByteArrayOutputStream;

final class ai$1
  implements g.a
{
  ai$1(ai paramai)
  {
  }

  public final int a(String paramString, int paramInt, com.tencent.mm.i.c paramc, com.tencent.mm.i.d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(27375);
    paramString = this.vcF.fFa;
    boolean bool1;
    boolean bool2;
    if (paramc != null)
    {
      bool1 = true;
      if (paramd == null)
        break label149;
      bool2 = true;
      label29: ab.d("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s], progressing[%b], finish[%b], onlyCheckExist[%b]", new Object[] { paramString, Integer.valueOf(paramInt), paramc, paramd, Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(paramBoolean) });
      am.aUq().b(this.vcF.pJl, this.vcF.pJj);
      if (paramInt != -21005)
        break label155;
      ab.i("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback ERR_CNDCOM_MEDIA_IS_UPLOADING clientid:%s", new Object[] { this.vcF.fFa });
      AppMethodBeat.o(27375);
    }
    while (true)
    {
      return 0;
      bool1 = false;
      break;
      label149: bool2 = false;
      break label29;
      label155: if (paramInt != 0)
      {
        l.jC(this.vcF.pJj.xDa);
        am.aUq().b(this.vcF.pJl, this.vcF.pJj);
        this.vcF.pJj.field_signature = "";
        paramBoolean = am.aUq().a(this.vcF.pJj, new String[0]);
        ab.w("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback startRet[%d] rowid[%d], reset signature ret[%b]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(this.vcF.pJl), Boolean.valueOf(paramBoolean) });
        this.vcF.ehi.onSceneEnd(3, paramInt, "", this.vcF);
        new com.tencent.mm.g.b.a.f(com.tencent.mm.plugin.report.a.r(new Object[] { Integer.valueOf(paramInt), Integer.valueOf(1), Long.valueOf(this.vcF.startTime), Long.valueOf(bo.anU()), Integer.valueOf(com.tencent.mm.al.c.bW(ah.getContext())), Integer.valueOf(com.tencent.mm.i.a.MediaType_FILE), Integer.valueOf(0), "" })).ajK();
        AppMethodBeat.o(27375);
      }
      else if (this.vcF.pJj.field_status == 105L)
      {
        ab.i("MicroMsg.NetSceneUploadAppAttach", "attach upload has paused, status:%d, rowid:%d", new Object[] { Long.valueOf(this.vcF.pJj.field_status), Long.valueOf(this.vcF.pJl) });
        com.tencent.mm.al.f.afx().rN(this.vcF.fFa);
        this.vcF.ehi.onSceneEnd(3, paramInt, "attach  has paused, status" + this.vcF.pJj.field_status, this.vcF);
        AppMethodBeat.o(27375);
      }
      else
      {
        if (paramc == null)
          break label628;
        this.vcF.pJj.field_lastModifyTime = bo.anT();
        this.vcF.pJj.field_offset = paramc.field_finishedLength;
        paramBoolean = am.aUq().a(this.vcF.pJj, new String[0]);
        if (!paramBoolean)
        {
          ab.e("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback onGYNetEnd update info ret:".concat(String.valueOf(paramBoolean)));
          this.vcF.retCode = (-10000 - g.getLine());
          this.vcF.ehi.onSceneEnd(3, paramInt, "", this.vcF);
          AppMethodBeat.o(27375);
        }
        else
        {
          AppMethodBeat.o(27375);
        }
      }
    }
    label628: if (paramd != null)
    {
      if (paramd.field_retCode == 0)
        break label1042;
      ab.e("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback sceneResult.retCode :%d arg[%s] info[%s]", new Object[] { Integer.valueOf(paramd.field_retCode), paramd.field_arg, paramd.field_transInfo, "", "", "", "", "", "", "", paramd.efY });
      l.jC(this.vcF.pJj.xDa);
      am.aUq().b(this.vcF.pJl, this.vcF.pJj);
      this.vcF.pJj.field_signature = "";
      paramBoolean = am.aUq().a(this.vcF.pJj, new String[0]);
      ab.w("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback startRet[%d] sceneResult.field_retCode[%d], rowid[%d], reset signature ret[%b]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramd.field_retCode), Long.valueOf(this.vcF.pJl), Boolean.valueOf(paramBoolean) });
      paramString = com.tencent.mm.plugin.report.a.r(new Object[] { Integer.valueOf(paramd.field_retCode), Integer.valueOf(1), Long.valueOf(this.vcF.startTime), Long.valueOf(bo.anU()), Integer.valueOf(com.tencent.mm.al.c.bW(ah.getContext())), Integer.valueOf(com.tencent.mm.i.a.MediaType_FILE), Integer.valueOf(paramd.field_fileLength), paramd.field_transInfo, "", "", "", "", "", "", "", paramd.efY });
      new com.tencent.mm.g.b.a.f(paramString).ajK();
      new com.tencent.mm.g.b.a.d(paramString).ajK();
      this.vcF.ehi.onSceneEnd(3, paramd.field_retCode, "", this.vcF);
    }
    while (true)
    {
      AppMethodBeat.o(27375);
      break;
      label1042: ab.i("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback upload attach by cdn, isHitCacheUpload: %d, onlyCheckExist[%b], exist[%b], signature[%s]", new Object[] { Integer.valueOf(paramd.field_UploadHitCacheType), Boolean.valueOf(paramBoolean), Boolean.valueOf(paramd.field_exist_whencheck), bo.anv(this.vcF.pJj.field_signature) });
      if (paramBoolean)
      {
        if (paramd.field_exist_whencheck)
        {
          aw.Rg().a(new z(this.vcF.csH, this.vcF.pJj.field_fileFullPath, this.vcF.toUser, new ai.1.1(this, paramInt, paramd)), 0);
        }
        else
        {
          ab.i("MicroMsg.NetSceneUploadAppAttach", "summerbig upload check but not exist");
          aw.Rg().a(new z(null, this.vcF.pJj.field_fileFullPath, this.vcF.toUser, new ai.1.2(this, paramInt)), 0);
        }
      }
      else
        a(paramInt, paramd);
    }
  }

  final void a(int paramInt, com.tencent.mm.i.d paramd)
  {
    AppMethodBeat.i(27376);
    this.vcF.pJj.field_status = 199L;
    boolean bool = am.aUq().a(this.vcF.pJj, new String[0]);
    if (!bool)
    {
      ab.e("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback onGYNetEnd update info ret:".concat(String.valueOf(bool)));
      this.vcF.retCode = (-10000 - g.getLine());
      this.vcF.ehi.onSceneEnd(3, paramInt, "", this.vcF);
      AppMethodBeat.o(27376);
    }
    while (true)
    {
      return;
      l.a(this.vcF.pJj.field_msgInfoId, this.vcF.pJj.field_mediaSvrId, paramd);
      aw.Rg().a(new ag(this.vcF.pJj.field_msgInfoId, true, paramd, new ai.1.3(this, paramd), this.vcF.cvF, this.vcF.pJj), 0);
      AppMethodBeat.o(27376);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.ai.1
 * JD-Core Version:    0.6.2
 */
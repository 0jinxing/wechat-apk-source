package com.tencent.mm.at;

import android.graphics.BitmapFactory.Options;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.clk;
import com.tencent.mm.protocal.protobuf.cll;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class m extends com.tencent.mm.ai.m
  implements k
{
  private int eFn;
  private final b ehh;
  private f ehi;
  private e fFJ;
  private m.a fFK;

  public m(int paramInt, clk paramclk, e parame, com.tencent.mm.i.d paramd, m.a parama)
  {
    AppMethodBeat.i(78354);
    b.a locala = new b.a();
    locala.fsJ = new clk();
    locala.fsK = new cll();
    locala.uri = "/cgi-bin/micromsg-bin/uploadmsgimg";
    locala.fsI = 110;
    locala.fsL = 9;
    locala.fsM = 1000000009;
    this.ehh = locala.acD();
    this.fFK = parama;
    this.eFn = paramInt;
    this.fFJ = parame;
    parama = (clk)this.ehh.fsG.fsP;
    parama.vEB = paramclk.vEB;
    parama.vEC = paramclk.vEC;
    parama.xja = paramclk.xja;
    parama.nao = paramclk.nao;
    parama.vEG = paramclk.vEG;
    parama.vRz = paramclk.vRz;
    parame = com.tencent.mm.sdk.platformtools.d.amj(o.ahl().q(parame.fDB, "", ""));
    if (parame != null)
    {
      paramInt = parame.outWidth;
      parama.xji = paramInt;
      if (parame == null)
        break label542;
      paramInt = parame.outHeight;
      label206: parama.xjh = paramInt;
      parama.xjf = paramd.field_fileId;
      parama.xjg = paramd.field_thumbimgLength;
      parama.ptw = paramd.field_thumbimgLength;
      parama.ptx = 0;
      parama.pty = paramd.field_thumbimgLength;
      parama.ptz = new SKBuiltinBuffer_t().setBuffer(new byte[0]);
      parama.fKh = paramclk.fKh;
      parama.vCs = paramclk.vCs;
      parama.vCu = paramclk.vCu;
      parama.vCt = paramclk.vCt;
      parama.vRx = 1;
      if (!paramd.Jm())
        break label547;
      ab.i("MicroMsg.NetSceneUploadMsgImgForCdn", "summersafecdn isUploadBySafeCDNWithMD5 field_upload_by_safecdn[%b], field_UploadHitCacheType[%d], crc[%d], aeskey[%s]", new Object[] { Boolean.valueOf(paramd.field_upload_by_safecdn), Integer.valueOf(paramd.field_UploadHitCacheType), Integer.valueOf(paramd.field_filecrc), paramd.field_aesKey });
      parama.wWT = 1;
      parama.vRw = "";
      parama.wxW = "";
      label398: parama.wqw = paramclk.wqw;
      if (paramclk.wqw != 1)
        break label570;
      parama.xjd = paramd.field_fileLength;
      parama.xje = paramd.field_midimgLength;
      parama.xjb = paramd.field_fileId;
    }
    for (parama.xjc = paramd.field_fileId; ; parama.xjc = paramd.field_fileId)
    {
      parama.vRy = paramd.field_filecrc;
      parama.Md5 = paramd.field_filemd5;
      ab.i("MicroMsg.NetSceneUploadMsgImgForCdn", "summersafecdn NetSceneUploadMsgImgForCdn MsgForwardType[%d], hitmd5[%d], key[%s], crc[%d]", new Object[] { Integer.valueOf(parama.vRz), Integer.valueOf(parama.wWT), bo.anv(parama.vRw), Integer.valueOf(parama.vRy) });
      AppMethodBeat.o(78354);
      return;
      paramInt = 0;
      break;
      label542: paramInt = 0;
      break label206;
      label547: parama.vRw = paramd.field_aesKey;
      parama.wxW = paramd.field_aesKey;
      break label398;
      label570: parama.xjd = 0;
      parama.xje = paramd.field_fileLength;
      parama.xjb = "";
    }
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(78355);
    ab.i("MicroMsg.NetSceneUploadMsgImgForCdn", "cdntra req[%s]", new Object[] { ((clk)this.ehh.fsG.fsP).toString() });
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(78355);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(78356);
    ab.i("MicroMsg.NetSceneUploadMsgImgForCdn", "onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3);
    paramString = (cll)((b)paramq).fsH.fsP;
    ab.i("MicroMsg.NetSceneUploadMsgImgForCdn", "onGYNetEnd createtime:%d msgId:%d ", new Object[] { Integer.valueOf(paramString.pcX), Long.valueOf(paramString.ptF) });
    if (this.fFK != null)
      this.fFK.a(paramString.ptF, paramString.pcX, paramInt2, paramInt3);
    this.ehi.onSceneEnd(0, 0, "", this);
    AppMethodBeat.o(78356);
  }

  public final int getType()
  {
    return 110;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.m
 * JD-Core Version:    0.6.2
 */
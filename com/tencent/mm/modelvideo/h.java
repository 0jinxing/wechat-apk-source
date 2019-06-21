package com.tencent.mm.modelvideo;

import android.graphics.BitmapFactory.Options;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.a;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bh;
import com.tencent.mm.model.r;
import com.tencent.mm.n.a;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.cfh;
import com.tencent.mm.protocal.protobuf.cls;
import com.tencent.mm.protocal.protobuf.clt;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.util.HashMap;
import junit.framework.Assert;

public final class h extends m
  implements k
{
  private com.tencent.mm.ai.b ehh;
  private f ehi;
  private int fVP;
  private com.tencent.mm.i.d fVQ;
  private h.a fVR;
  String fileName;

  public h(String paramString, int paramInt, com.tencent.mm.i.d paramd, h.a parama)
  {
    AppMethodBeat.i(50710);
    this.fileName = null;
    this.fVP = 0;
    this.fVQ = null;
    this.fVR = null;
    if (paramString != null);
    for (boolean bool2 = true; ; bool2 = false)
    {
      Assert.assertTrue(bool2);
      bool2 = bool1;
      if (paramd != null)
        bool2 = true;
      Assert.assertTrue(bool2);
      Assert.assertTrue(true);
      this.fileName = paramString;
      this.fVQ = paramd;
      this.fVR = parama;
      this.fVP = paramInt;
      AppMethodBeat.o(50710);
      return;
    }
  }

  private String alb()
  {
    AppMethodBeat.i(50714);
    String str = this.fileName + "_" + hashCode();
    AppMethodBeat.o(50714);
    return str;
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(50711);
    this.ehi = paramf;
    Object localObject = u.ut(this.fileName);
    if (localObject == null)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneUploadVideoForCdn", "Get info Failed file:" + this.fileName);
      this.fVR.cC(3, -1);
      i = -1;
      AppMethodBeat.o(50711);
      return i;
    }
    paramf = new b.a();
    paramf.fsJ = new cls();
    paramf.fsK = new clt();
    paramf.uri = "/cgi-bin/micromsg-bin/uploadvideo";
    paramf.fsI = 149;
    paramf.fsL = 39;
    paramf.fsM = 1000000039;
    this.ehh = paramf.acD();
    cls localcls = (cls)this.ehh.fsG.fsP;
    localcls.xjp = 0;
    localcls.xjo = this.fVQ.field_fileLength;
    localcls.xjq = new SKBuiltinBuffer_t().setBuffer(new byte[0]);
    localcls.wEt = 0;
    localcls.wEs = this.fVQ.field_thumbimgLength;
    localcls.wEu = new SKBuiltinBuffer_t().setBuffer(new byte[0]);
    localcls.ndG = r.Yz();
    localcls.ndF = this.fVQ.field_toUser;
    localcls.vFF = this.fileName;
    if (((s)localObject).fXh == 1)
      localcls.xjr = 2;
    if (((s)localObject).fXk == 3)
      localcls.xjr = 3;
    localcls.wYj = ((s)localObject).fXd;
    label296: label451: label508: String str;
    if (com.tencent.mm.network.ab.ch(ah.getContext()))
    {
      i = 1;
      localcls.wdl = i;
      localcls.wEv = 2;
      localcls.xjg = this.fVQ.field_thumbimgLength;
      localcls.xjs = this.fVQ.field_fileId;
      localcls.wxU = this.fVQ.field_fileId;
      localcls.vRx = 1;
      if (!this.fVQ.Jm())
        break label1093;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneUploadVideoForCdn", "%s summersafecdn isUploadBySafeCDNWithMD5 field_upload_by_safecdn[%b], field_UploadHitCacheType[%d], crc[%d], aeskey[%s]", new Object[] { alb(), Boolean.valueOf(this.fVQ.field_upload_by_safecdn), Integer.valueOf(this.fVQ.field_UploadHitCacheType), Integer.valueOf(this.fVQ.field_filecrc), this.fVQ.field_aesKey });
      localcls.wWT = 1;
      localcls.vRw = "";
      localcls.wxW = "";
      localcls.xju = this.fVQ.field_filemd5;
      localcls.xjE = this.fVQ.field_mp4identifymd5;
      localcls.vRy = this.fVQ.field_filecrc;
      if ((this.fVP > 0) && (this.fVP <= 1048576))
        break label1120;
      paramf = bh.aae();
      localcls.vEG = paramf;
      localcls.xjD = ((s)localObject).cMn;
      paramf = ((s)localObject).fXm;
      if ((paramf == null) || (bo.isNullOrNil(paramf.fiG)))
        break label1187;
      localcls.xjv = bo.bc(paramf.fiG, "");
      localcls.xjw = paramf.wid;
      localcls.xjx = bo.bc(paramf.fiI, "");
      localcls.xjz = bo.bc(paramf.fiK, "");
      localcls.xjy = bo.bc(paramf.fiJ, "");
      localcls.xjA = bo.bc(paramf.fiL, "");
      label626: if (paramf != null)
      {
        localcls.xjC = bo.bc(paramf.fiM, "");
        localcls.xjB = bo.bc(paramf.fiN, "");
      }
      o.all();
      localObject = t.ui(this.fileName);
      paramf = com.tencent.mm.sdk.platformtools.d.amj((String)localObject);
      if (paramf == null)
        break label1232;
      localcls.xji = paramf.outWidth;
      localcls.xjh = paramf.outHeight;
      label699: o.all();
      localObject = t.uh(this.fileName);
      paramf = n.alj();
      if (bo.isNullOrNil((String)localObject))
        break label1251;
      paramf = (n.a)paramf.fWm.get(localObject);
      if (paramf == null)
        break label1251;
      i = paramf.fWD;
      switch (i)
      {
      case 4:
      case 5:
      default:
        label744: localcls.vRz = 0;
        localcls.vFH = 0;
        label804: str = alb();
        localObject = this.fileName;
        paramf = this.fVQ.field_toUser;
        if (this.fVQ.field_aesKey != null)
          break;
      case 1:
      case 2:
      case 3:
      case 6:
      case 7:
      case 8:
      }
    }
    for (int i = -1; ; i = this.fVQ.field_aesKey.length())
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneUploadVideoForCdn", "%s summersafecdn cdntra doscene file:%s touser:%s aes:%d fileid:%s thumb:[%d %d %d], thumbaeskey [%s] funcFlag: %d, md5:%s HitMd5:%d CRC32:%d, VideoNewMd5:%s AESKey:%s stream %s streamtime: %d title %s thumburl %s msgSource[%s] msgForwardType[%d] Source[%d]", new Object[] { str, localObject, paramf, Integer.valueOf(i), this.fVQ.field_fileId, Integer.valueOf(this.fVQ.field_thumbimgLength), Integer.valueOf(localcls.xji), Integer.valueOf(localcls.xjh), bo.anv(localcls.wxW), Integer.valueOf(localcls.xjr), localcls.xju, Integer.valueOf(localcls.wWT), Integer.valueOf(localcls.vRy), localcls.xjE, bo.anv(localcls.vRw), localcls.xjv, Integer.valueOf(localcls.xjw), localcls.xjx, localcls.xjA, localcls.vEG, Integer.valueOf(localcls.vRz), Integer.valueOf(localcls.vFH) });
      i = a(parame, this.ehh, this);
      AppMethodBeat.o(50711);
      break;
      i = 2;
      break label296;
      label1093: localcls.vRw = this.fVQ.field_aesKey;
      localcls.wxW = this.fVQ.field_aesKey;
      break label451;
      label1120: paramf = new StringBuilder();
      paramf.append("<msgsource>");
      paramf.append("<videopreloadlen>").append(this.fVP).append("</videopreloadlen>");
      paramf.append("</msgsource>");
      com.tencent.mm.plugin.report.service.h.pYm.a(354L, 35L, 1L, false);
      paramf = paramf.toString();
      break label508;
      label1187: if ((paramf == null) || (bo.isNullOrNil(paramf.fiK)) || (bo.isNullOrNil(paramf.fiJ)))
        break label626;
      localcls.xjz = paramf.fiK;
      localcls.xjy = paramf.fiJ;
      break label626;
      label1232: com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.NetSceneUploadVideoForCdn", "cdntra getImageOptions for thumb failed path:%s", new Object[] { localObject });
      break label699;
      label1251: i = 0;
      break label744;
      localcls.vRz = 1;
      localcls.vFH = 2;
      break label804;
      localcls.vRz = 1;
      localcls.vFH = 1;
      break label804;
      localcls.vRz = 2;
      localcls.vFH = 3;
      break label804;
      localcls.vRz = 3;
      localcls.vFH = 4;
      break label804;
      localcls.vRz = 1;
      localcls.vFH = 5;
      break label804;
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(50713);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneUploadVideoForCdn", "%s cdntra onGYNetEnd errtype[%d %d]", new Object[] { alb(), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    paramArrayOfByte = (clt)((com.tencent.mm.ai.b)paramq).fsH.fsP;
    paramq = u.ut(this.fileName);
    if (paramq == null)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneUploadVideoForCdn", "ERR: onGYNetEnd Get INFO FAILED :" + this.fileName);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      this.fVR.cC(3, -1);
      AppMethodBeat.o(50713);
    }
    while (true)
    {
      return;
      if ((paramInt2 == 4) && (paramInt3 == 102))
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneUploadVideoForCdn", "summersafecdn ERR: MM_ERR_GET_AESKEY_FAILED errtype:" + paramInt2 + " errCode:" + paramInt3 + "  file:" + this.fileName + " user:" + paramq.getUser());
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        this.fVR.cC(paramInt2, paramInt3);
        AppMethodBeat.o(50713);
      }
      else if ((paramInt2 == 4) && (paramInt3 == -22))
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneUploadVideoForCdn", "ERR: onGYNetEnd BLACK  errtype:" + paramInt2 + " errCode:" + paramInt3 + "  file:" + this.fileName + " user:" + paramq.getUser());
        u.un(this.fileName);
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        this.fVR.cC(paramInt2, paramInt3);
        AppMethodBeat.o(50713);
      }
      else if ((paramInt2 == 4) && (paramInt3 != 0))
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneUploadVideoForCdn", "ERR: onGYNetEnd SERVER FAILED errtype:" + paramInt2 + " errCode:" + paramInt3 + "  file:" + this.fileName + " user:" + paramq.getUser());
        u.um(this.fileName);
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        this.fVR.cC(paramInt2, paramInt3);
        AppMethodBeat.o(50713);
      }
      else
      {
        if ((paramInt2 == 0) && (paramInt3 == 0))
          break;
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneUploadVideoForCdn", "ERR: onGYNetEnd FAILED (WILL RETRY) errtype:" + paramInt2 + " errCode:" + paramInt3 + "  file:" + this.fileName + " user:" + paramq.getUser());
        u.um(this.fileName);
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        this.fVR.cC(paramInt2, paramInt3);
        AppMethodBeat.o(50713);
      }
    }
    paramq.fXb = bo.anT();
    paramq.cKK = paramArrayOfByte.ptF;
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneUploadVideoForCdn", "%s dkmsgid  set svrmsgid %d -> %d", new Object[] { alb(), Long.valueOf(paramq.cKK), Integer.valueOf(ae.giA) });
    if ((10007 == ae.giz) && (ae.giA != 0) && (paramq.cKK != 0L))
    {
      paramq.cKK = ae.giA;
      ae.giA = 0;
    }
    paramq.status = 199;
    paramq.bJt = 1284;
    boolean bool;
    if (this.fVQ.Jm())
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneUploadVideoForCdn", "%s summersafecdn aeskey[%s], old RecvXml[%s]", new Object[] { alb(), paramArrayOfByte.vRw, paramq.alw() });
      if (bo.isNullOrNil(paramArrayOfByte.vRw))
        break label1309;
      Object localObject = "<msg><videomsg aeskey=\"" + paramArrayOfByte.vRw + "\" cdnthumbaeskey=\"" + paramArrayOfByte.vRw + "\" cdnvideourl=\"" + this.fVQ.field_fileId + "\" ";
      localObject = (String)localObject + "cdnthumburl=\"" + this.fVQ.field_fileId + "\" ";
      localObject = (String)localObject + "length=\"" + this.fVQ.field_fileLength + "\" ";
      localObject = (String)localObject + "cdnthumblength=\"" + this.fVQ.field_thumbimgLength + "\"/></msg>";
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneUploadVideoForCdn", "cdn callback new build cdnInfo:%s", new Object[] { localObject });
      paramq.fXj = ((String)localObject);
      localObject = o.all();
      o.all();
      bool = ((t)localObject).s(t.uh(this.fileName), this.fVQ.field_fileId, paramArrayOfByte.vRw);
      localObject = com.tencent.mm.plugin.report.service.h.pYm;
      if (bool)
      {
        paramInt1 = 1;
        label975: ((com.tencent.mm.plugin.report.service.h)localObject).e(12696, new Object[] { Integer.valueOf(paramInt1 + 900), Integer.valueOf(paramq.frO) });
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneUploadVideoForCdn", "%s summersafecdn aeskey[%s], new RecvXml[%s], saveret[%b]", new Object[] { alb(), paramArrayOfByte.vRw, paramq.alw(), Boolean.valueOf(bool) });
      }
    }
    else
    {
      label1052: u.f(paramq);
      u.d(paramq);
      paramArrayOfByte = ((j)g.K(j.class)).bOr().jf(paramq.fXe);
      com.tencent.mm.modelstat.b.fRa.j(paramArrayOfByte);
      paramArrayOfByte = paramq.getUser();
      paramArrayOfByte = ((j)g.K(j.class)).XM().aoO(paramArrayOfByte);
      if ((paramArrayOfByte != null) && ((int)paramArrayOfByte.ewQ > 0))
        break label1331;
      bool = false;
      label1145: if ((!bool) && (!com.tencent.mm.model.t.nl(paramq.getUser())))
        break label1341;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneUploadVideoForCdn", "%s upload to biz :%s", new Object[] { alb(), paramq.getUser() });
      if (paramq.cKK < 0L)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneUploadVideoForCdn", "ERR: finish video invaild MSGSVRID :" + paramq.cKK + " file:" + this.fileName + " toUser:" + paramq.getUser());
        u.um(this.fileName);
        this.fVR.cC(3, -1);
      }
    }
    while (true)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      this.fVR.cC(0, 0);
      AppMethodBeat.o(50713);
      break;
      paramInt1 = 2;
      break label975;
      label1309: com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.NetSceneUploadVideoForCdn", "%s summersafecdn need aeskey but ret null", new Object[] { alb() });
      break label1052;
      label1331: bool = paramArrayOfByte.dsf();
      break label1145;
      label1341: com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneUploadVideoForCdn", "%s not upload to biz", new Object[] { alb() });
      if (paramq.cKK <= 0L)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneUploadVideoForCdn", "ERR: finish video invaild MSGSVRID :" + paramq.cKK + " file:" + this.fileName + " toUser:" + paramq.getUser());
        u.um(this.fileName);
        this.fVR.cC(3, -1);
      }
    }
  }

  public final void a(m.a parama)
  {
    AppMethodBeat.i(50712);
    u.um(this.fileName);
    AppMethodBeat.o(50712);
  }

  public final int acn()
  {
    return 1;
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  public final int getType()
  {
    return 149;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.h
 * JD-Core Version:    0.6.2
 */
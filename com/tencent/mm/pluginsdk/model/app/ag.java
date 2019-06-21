package com.tencent.mm.pluginsdk.model.app;

import android.graphics.BitmapFactory.Options;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.at.g;
import com.tencent.mm.at.o;
import com.tencent.mm.g.a.vt;
import com.tencent.mm.g.a.vt.a;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bh;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.model.u;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.protocal.protobuf.bwb;
import com.tencent.mm.protocal.protobuf.bwc;
import com.tencent.mm.protocal.protobuf.cde;
import com.tencent.mm.protocal.protobuf.cdg;
import com.tencent.mm.protocal.protobuf.dv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import java.util.Locale;

public final class ag extends m
  implements com.tencent.mm.network.k
{
  private bi cKd;
  private long cvx;
  private com.tencent.mm.i.d eFt;
  private com.tencent.mm.ai.b ehh;
  private com.tencent.mm.ai.f ehi;
  private String hcl;
  private vt qJq;
  private boolean vcA;
  private a vcB;
  private com.tencent.mm.g.a.n vcw;
  private b vcz;

  public ag(long paramLong, boolean paramBoolean, com.tencent.mm.i.d paramd, a parama, String paramString, b paramb)
  {
    AppMethodBeat.i(27363);
    this.cvx = 0L;
    this.eFt = null;
    this.vcz = null;
    this.cKd = null;
    this.vcA = false;
    this.vcB = null;
    this.cvx = paramLong;
    this.hcl = paramString;
    this.eFt = paramd;
    this.vcB = parama;
    this.vcA = paramBoolean;
    this.vcz = paramb;
    parama = new b.a();
    parama.fsJ = new bwb();
    parama.fsK = new bwc();
    parama.uri = "/cgi-bin/micromsg-bin/sendappmsg";
    parama.fsI = 222;
    parama.fsL = 107;
    parama.fsM = 1000000107;
    this.ehh = parama.acD();
    ab.i("MicroMsg.NetSceneSendAppMsgForCdn", "summerbig NetSceneSendAppMsgForCdn msgId[%d], sceneResult[%s], sessionId[%s], attachInfo[%s]. stack[%s]", new Object[] { Long.valueOf(paramLong), paramd, paramString, paramb, bo.dpG() });
    AppMethodBeat.o(27363);
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(27364);
    this.ehi = paramf;
    aw.ZK();
    this.cKd = c.XO().jf(this.cvx);
    int i;
    if ((this.cKd == null) || (this.cKd.field_msgId != this.cvx))
    {
      ab.e("MicroMsg.NetSceneSendAppMsgForCdn", "summerbig cdntra doscene msginfo null id:%d", new Object[] { Long.valueOf(this.cvx) });
      this.vcB.cC(3, -1);
      i = -1;
      AppMethodBeat.o(27364);
    }
    while (true)
    {
      return i;
      j.b localb = j.b.me(this.cKd.field_content);
      if (localb == null)
      {
        ab.e("MicroMsg.NetSceneSendAppMsgForCdn", "summerbig cdntra doscene AppMessage.Content.parse null id:%d", new Object[] { Long.valueOf(this.cvx) });
        this.vcB.cC(3, -1);
      }
      bwb localbwb = (bwb)this.ehh.fsG.fsP;
      dv localdv = new dv();
      localdv.fKh = localb.appId;
      localdv.vFF = (this.cKd.field_talker + this.cKd.field_msgId + "T" + this.cKd.field_createTime);
      localdv.pcX = ((int)bo.anT());
      localdv.ndF = this.cKd.field_talker;
      localdv.ndG = r.Yz();
      localdv.jCt = localb.type;
      localdv.vFE = localb.sdkVer;
      localdv.vFH = localb.fgr;
      label315: v.b localb1;
      String str;
      cdg localcdg;
      if (com.tencent.mm.aj.f.kq(this.cKd.field_talker))
      {
        localdv.vEG = com.tencent.mm.aj.a.e.rw(this.cKd.dqJ);
        localdv.vFJ = localb.cMj;
        localdv.vFK = localb.cMk;
        localdv.vFL = localb.cMl;
        localb1 = v.Zp().nV(this.hcl);
        if (localb1 != null)
        {
          this.qJq = new vt();
          this.qJq.cSG.url = localb.url;
          this.qJq.cSG.cSH = localb1.getString("prePublishId", "");
          this.qJq.cSG.cSJ = localb1.getString("preUsername", "");
          this.qJq.cSG.cSK = localb1.getString("preChatName", "");
          this.qJq.cSG.cSL = localb1.getInt("preMsgIndex", 0);
          this.qJq.cSG.cSP = localb1.getInt("sendAppMsgScene", 0);
          this.qJq.cSG.cSQ = localb1.getInt("getA8KeyScene", 0);
          this.qJq.cSG.cSR = localb1.getString("referUrl", null);
          this.qJq.cSG.cSS = localb1.getString("adExtStr", null);
          this.qJq.cSG.cSM = this.cKd.field_talker;
          this.qJq.cSG.cST = localb.title;
          aw.ZK();
          paramf = c.XM().aoO(this.cKd.field_talker);
          if (paramf != null)
            this.qJq.cSG.cSN = paramf.Oi();
          this.qJq.cSG.cSO = com.tencent.mm.model.n.mA(this.cKd.field_talker);
          str = "";
          paramf = str;
          if (localb.cMn != null)
          {
            localcdg = new cdg();
            paramf = Base64.decode(localb.cMn, 0);
          }
        }
      }
      try
      {
        localcdg.parseFrom(paramf);
        paramf = str;
        if (localcdg.xcU != null)
          paramf = localcdg.xcU.mVX;
        localbwb.wWS = String.format(Locale.US, "prePublishId=%s&preUserName=%s&preChatName=%s&preChatType=%d&getA8KeyScene=%d&sourceAppId=%s", new Object[] { this.qJq.cSG.cSH, this.qJq.cSG.cSJ, this.qJq.cSG.cSK, Integer.valueOf(u.ad(this.qJq.cSG.cSJ, this.qJq.cSG.cSK)), Integer.valueOf(this.qJq.cSG.cSQ), paramf });
        int j;
        label941: boolean bool;
        if ((localb1 != null) && (localb.type == 33))
        {
          this.vcw = new com.tencent.mm.g.a.n();
          j = localb1.getInt("fromScene", 1);
          this.vcw.csr.scene = j;
          i = localb1.getInt("appservicetype", 0);
          this.vcw.csr.bQe = i;
          paramf = localb1.getString("preChatName", "");
          if (2 == j)
          {
            str = localb1.getString("preUsername", "");
            this.vcw.csr.cst = (paramf + ":" + str);
            paramf = this.cKd.field_talker;
            bool = localb1.getBoolean("moreRetrAction", false);
            if (!paramf.endsWith("@chatroom"))
              break label1564;
            paramf = this.vcw.csr;
            if (!bool)
              break label1559;
            i = 5;
            label985: paramf.action = i;
            this.vcw.csr.css = (localb.fiZ + 1);
            this.vcw.csr.csu = localb.fiO;
            this.vcw.csr.csl = localb.fiP;
            this.vcw.csr.appId = localb.fiQ;
            this.vcw.csr.csw = bo.anT();
            this.vcw.csr.csx = 1;
          }
        }
        else
        {
          ab.d("MicroMsg.NetSceneSendAppMsgForCdn", "stev summerbig SnsPostOperationFields: ShareUrlOriginal=%s, ShareUrlOpen=%s, JsAppId=%s", new Object[] { localb.cMj, localb.cMk, localb.cMl });
          int k = 0;
          int m = 0;
          j = m;
          i = k;
          if (!bo.isNullOrNil(this.cKd.field_imgPath))
          {
            paramf = com.tencent.mm.sdk.platformtools.d.amj(o.ahl().sj(this.cKd.field_imgPath));
            j = m;
            i = k;
            if (paramf != null)
            {
              i = paramf.outWidth;
              j = paramf.outHeight;
            }
          }
          if (this.eFt.Jm())
          {
            ab.i("MicroMsg.NetSceneSendAppMsgForCdn", "summersafecdn app sceneResult crc[%d], safecdn[%b], hitcachetype[%d], aeskey[%s]", new Object[] { Integer.valueOf(this.eFt.field_filecrc), Boolean.valueOf(this.eFt.field_upload_by_safecdn), Integer.valueOf(this.eFt.field_UploadHitCacheType), this.eFt.field_aesKey });
            this.eFt.field_aesKey = "";
            localbwb.wWT = 1;
          }
          localbwb.vRy = this.eFt.field_filecrc;
          paramf = null;
          if (this.vcA)
            paramf = "@cdn_" + this.eFt.field_fileId + "_" + this.eFt.field_aesKey + "_1";
          localdv.ncM = j.b.a(localb, paramf, this.eFt, i, j);
          localbwb.wWQ = localdv;
          if ((this.vcz != null) && ((localb.fgs != 0) || (localb.fgo > 26214400)))
          {
            localbwb.guQ = this.vcz.field_signature;
            localbwb.vHo = com.tencent.mm.i.a.efE;
          }
          localbwb.Md5 = localb.filemd5;
          if (!bo.isNullOrNil(this.eFt.field_filemd5))
            break label1592;
          ab.i("MicroMsg.NetSceneSendAppMsgForCdn", "summerbig sceneResult filemd5 is null use content.filemd5[%s]", new Object[] { localb.filemd5 });
        }
        while (true)
        {
          ab.i("MicroMsg.NetSceneSendAppMsgForCdn", "summerbig file md5[%s], HitMd5[%d], signature[%s], type[%d], sceneResult[%s], fromScene[%s]", new Object[] { localbwb.Md5, Integer.valueOf(localbwb.wWT), bo.anv(localbwb.guQ), Integer.valueOf(localbwb.vHo), this.eFt, localbwb.wWS });
          i = a(parame, this.ehh, this);
          AppMethodBeat.o(27364);
          break;
          localdv.vEG = bh.aae();
          break label315;
          this.vcw.csr.cst = paramf;
          break label941;
          label1559: i = 2;
          break label985;
          label1564: paramf = this.vcw.csr;
          if (bool);
          for (i = 4; ; i = 1)
          {
            paramf.action = i;
            break;
          }
          label1592: localbwb.Md5 = this.eFt.field_filemd5;
        }
      }
      catch (Exception paramf)
      {
        while (true)
          paramf = str;
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(27365);
    paramArrayOfByte = (bwb)((com.tencent.mm.ai.b)paramq).fsG.fsP;
    ab.i("MicroMsg.NetSceneSendAppMsgForCdn", "summerbig cdntra onGYNetEnd [%d,%d,%s] msgId:%d, oldContent[%s], newContent[%s]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, Long.valueOf(this.cvx), this.cKd.field_content, paramArrayOfByte.wWQ.ncM });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      if ((paramInt2 == 4) && (paramInt3 == 102))
      {
        ab.w("MicroMsg.NetSceneSendAppMsgForCdn", "summersafecdn MM_ERR_GET_AESKEY_FAILED");
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        this.vcB.cC(paramInt2, paramInt3);
        AppMethodBeat.o(27365);
      }
      while (true)
      {
        return;
        this.cKd.setStatus(5);
        aw.ZK();
        c.XO().a(this.cKd.field_msgId, this.cKd);
        ab.e("MicroMsg.NetSceneSendAppMsgForCdn", "summerbig send app msg failed, err=" + paramInt2 + "," + paramInt3);
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        this.vcB.cC(paramInt2, paramInt3);
        AppMethodBeat.o(27365);
      }
    }
    paramq = (bwc)((com.tencent.mm.ai.b)paramq).fsH.fsP;
    ab.i("MicroMsg.NetSceneSendAppMsgForCdn", "summersafecdn svrid[%d]. aeskey[%s], old content[%s]", new Object[] { Long.valueOf(paramq.ptF), paramq.vRw, this.cKd.field_content });
    if ((this.eFt != null) && (this.eFt.Jm()))
    {
      if (bo.isNullOrNil(paramq.vRw))
        break label605;
      paramArrayOfByte = j.b.me(this.cKd.field_content);
      paramArrayOfByte.eyr = paramq.vRw;
      this.cKd.setContent(j.b.a(paramArrayOfByte, null, null));
      ab.i("MicroMsg.NetSceneSendAppMsgForCdn", "summersafecdn aeskey[%s], new content[%s]", new Object[] { paramq.vRw, this.cKd.field_content });
    }
    while (true)
    {
      this.cKd.setStatus(2);
      this.cKd.eI(paramq.ptF);
      aw.ZK();
      c.XO().a(this.cKd.field_msgId, this.cKd);
      com.tencent.mm.modelstat.b.fRa.a(this.cKd, com.tencent.mm.af.k.k(this.cKd));
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      this.vcB.cC(paramInt2, paramInt3);
      if ((this.qJq != null) && (!bo.isNullOrNil(this.qJq.cSG.url)))
      {
        this.qJq.cSG.cSI = ("msg_" + Long.toString(paramq.ptF));
        com.tencent.mm.sdk.b.a.xxA.m(this.qJq);
      }
      if (this.vcw != null)
      {
        this.vcw.csr.csv = ("msg_" + this.cKd.field_msgSvrId);
        com.tencent.mm.sdk.b.a.xxA.m(this.vcw);
      }
      AppMethodBeat.o(27365);
      break;
      label605: ab.w("MicroMsg.NetSceneSendAppMsgForCdn", "summersafecdn need aeskey but ret null");
    }
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  public final int getType()
  {
    return 222;
  }

  static abstract interface a
  {
    public abstract void cC(int paramInt1, int paramInt2);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.ag
 * JD-Core Version:    0.6.2
 */
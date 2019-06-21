package com.tencent.mm.pluginsdk.model.app;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.at.o;
import com.tencent.mm.g.a.n.a;
import com.tencent.mm.g.a.vt;
import com.tencent.mm.g.a.vt.a;
import com.tencent.mm.g.a.vu;
import com.tencent.mm.g.a.vu.a;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.i.g.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bh;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.model.u;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.bwb;
import com.tencent.mm.protocal.protobuf.bwc;
import com.tencent.mm.protocal.protobuf.cde;
import com.tencent.mm.protocal.protobuf.cdg;
import com.tencent.mm.protocal.protobuf.dv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ap;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Locale;
import junit.framework.Assert;

public final class af extends m
  implements com.tencent.mm.network.k
{
  bi cKd;
  long cvx;
  private com.tencent.mm.ai.b ehh;
  com.tencent.mm.ai.f ehi;
  String fFa;
  private g.a fFk;
  int fVJ;
  String hcl;
  private String mSignature;
  private vt qJq;
  vu qJr;
  long startTime;
  private com.tencent.mm.g.a.n vcw;

  public af(long paramLong, String paramString1, String paramString2)
  {
    AppMethodBeat.i(27360);
    this.cKd = null;
    this.cvx = 0L;
    this.startTime = 0L;
    this.fFa = "";
    this.fVJ = 0;
    this.fFk = new af.1(this);
    this.cvx = paramLong;
    this.hcl = paramString1;
    this.mSignature = paramString2;
    b.a locala = new b.a();
    locala.fsJ = new bwb();
    locala.fsK = new bwc();
    locala.uri = "/cgi-bin/micromsg-bin/sendappmsg";
    locala.fsI = 222;
    locala.fsL = 107;
    locala.fsM = 1000000107;
    this.ehh = locala.acD();
    ab.i("MicroMsg.NetSceneSendAppMsg", "summersafecdn NetSceneSendAppMsg msgid[%d], sessionid[%s], signature[%s], stack[%s]", new Object[] { Long.valueOf(paramLong), paramString1, bo.anv(paramString2), bo.dpG() });
    AppMethodBeat.o(27360);
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(27361);
    this.ehi = paramf;
    if (this.startTime == 0L)
      this.startTime = bo.anU();
    aw.ZK();
    this.cKd = com.tencent.mm.model.c.XO().jf(this.cvx);
    int i;
    if ((this.cKd == null) || (this.cKd.field_msgId != this.cvx))
    {
      i = -1;
      AppMethodBeat.o(27361);
      return i;
    }
    paramf = j.b.me(this.cKd.field_content);
    Object localObject1;
    if (paramf == null)
    {
      localObject1 = ap.aps(this.cKd.field_content);
      if (bo.isNullOrNil(((ap)localObject1).xXL))
      {
        paramf = new j.b();
        paramf.fgq = ((ap)localObject1).cvZ;
        paramf.type = 8;
        ab.i("MicroMsg.NetSceneSendAppMsg", "create new content. loss appid");
      }
    }
    while (true)
    {
      label147: localObject1 = "content != null [[" + this.cKd.field_content + "]]";
      if (paramf != null);
      for (boolean bool = true; ; bool = false)
      {
        Assert.assertTrue((String)localObject1, bool);
        if (paramf != null)
          break label228;
        this.cKd = null;
        i = -1;
        AppMethodBeat.o(27361);
        break;
        paramf = j.b.me(((ap)localObject1).xXL);
        break label147;
      }
      label228: if (!bo.isNullOrNil(this.cKd.field_imgPath));
      for (localObject1 = o.ahl().sj(this.cKd.field_imgPath); ; localObject1 = "")
        while (true)
        {
          Object localObject2 = v.Zp().nU(this.hcl);
          if ((localObject2 != null) && (((v.b)localObject2).containsKey("_tmpl_webview_transfer_scene")))
          {
            this.qJr = new vu();
            this.qJr.cSV.cSW = ((v.b)localObject2).getInt("_tmpl_webview_transfer_scene", -1);
          }
          if ((paramf.type == 8) || (paramf.type == 9) || (paramf.type == 6))
          {
            ab.i("MicroMsg.NetSceneSendAppMsg", "cdntra cdn not support Emoji or voiceremind now type:%d", new Object[] { Integer.valueOf(paramf.type) });
            i = 0;
          }
          while (true)
          {
            if (i == 0)
              break label963;
            ab.d("MicroMsg.NetSceneSendAppMsg", "cdntra use cdn return -1 for onGYNetEnd clientId:%s", new Object[] { this.fFa });
            i = 0;
            AppMethodBeat.o(27361);
            break;
            if (bo.isNullOrNil((String)localObject1))
            {
              ab.i("MicroMsg.NetSceneSendAppMsg", "cdntra cdn not support no thumb msg type:%d", new Object[] { Integer.valueOf(paramf.type) });
              i = 0;
            }
            else
            {
              this.fVJ = com.tencent.mm.a.e.cs((String)localObject1);
              if ((paramf.type == 33) || (paramf.type == 36) || (paramf.type == 46) || (paramf.type == 44));
              for (i = 1; ; i = 0)
              {
                if ((i != 0) || (this.fVJ < 262144))
                  break label530;
                ab.w("MicroMsg.NetSceneSendAppMsg", "cdntra thumb[%s][%d] Too Big Not Use CDN TRANS", new Object[] { localObject1, Integer.valueOf(this.fVJ) });
                i = 0;
                break;
              }
              label530: ab.i("MicroMsg.NetSceneSendAppMsg", "cdntra content.type:%d  thumbPath:%s,  thumbLength:%d ", new Object[] { Integer.valueOf(paramf.type), localObject1, Integer.valueOf(this.fVJ) });
              if (!bo.isNullOrNil(paramf.csD))
              {
                ab.w("MicroMsg.NetSceneSendAppMsg", "cdntra attach has been upload by cdn msgid:%d", new Object[] { Long.valueOf(this.cvx) });
                i = 0;
              }
              else if (i == 0)
              {
                com.tencent.mm.al.f.afx();
                if (!com.tencent.mm.al.b.lg(4))
                {
                  com.tencent.mm.al.f.afx();
                  ab.w("MicroMsg.NetSceneSendAppMsg", "cdntra not use cdn flag:%b ", new Object[] { Boolean.valueOf(com.tencent.mm.al.b.lg(4)) });
                  i = 0;
                }
              }
              else
              {
                this.fFa = com.tencent.mm.al.c.a("upappmsg", this.cKd.field_createTime, this.cKd.field_talker, this.cKd.field_msgId);
                if (bo.isNullOrNil(this.fFa))
                {
                  ab.w("MicroMsg.NetSceneSendAppMsg", "cdntra genClientId failed not use cdn msgid:%d", new Object[] { Long.valueOf(this.cKd.field_msgId) });
                  i = 0;
                }
                else
                {
                  localObject2 = new com.tencent.mm.i.g();
                  ((com.tencent.mm.i.g)localObject2).egl = this.fFk;
                  ((com.tencent.mm.i.g)localObject2).field_mediaId = this.fFa;
                  ((com.tencent.mm.i.g)localObject2).field_fullpath = "";
                  ((com.tencent.mm.i.g)localObject2).field_thumbpath = ((String)localObject1);
                  ((com.tencent.mm.i.g)localObject2).field_fileType = com.tencent.mm.i.a.MediaType_THUMBIMAGE;
                  ((com.tencent.mm.i.g)localObject2).field_talker = this.cKd.field_talker;
                  ((com.tencent.mm.i.g)localObject2).field_priority = com.tencent.mm.i.a.efC;
                  ((com.tencent.mm.i.g)localObject2).field_needStorage = false;
                  ((com.tencent.mm.i.g)localObject2).field_isStreamMedia = false;
                  ((com.tencent.mm.i.g)localObject2).egl = this.fFk;
                  ((com.tencent.mm.i.g)localObject2).field_force_aeskeycdn = true;
                  ((com.tencent.mm.i.g)localObject2).field_trysafecdn = false;
                  ab.i("MicroMsg.NetSceneSendAppMsg", "summersafecdn cdntra checkUseCdn content.type[%d], thumb[%s], useCdnTransClientId[%s], fileType[%d], enable_hitcheck[%b], onlycheckexist[%b], force_aeskeycdn[%b], trysafecdn[%b]", new Object[] { Integer.valueOf(paramf.type), localObject1, this.fFa, Integer.valueOf(((com.tencent.mm.i.g)localObject2).field_fileType), Boolean.valueOf(((com.tencent.mm.i.g)localObject2).field_enable_hitcheck), Boolean.valueOf(((com.tencent.mm.i.g)localObject2).field_onlycheckexist), Boolean.valueOf(((com.tencent.mm.i.g)localObject2).field_force_aeskeycdn), Boolean.valueOf(((com.tencent.mm.i.g)localObject2).field_trysafecdn) });
                  if (!com.tencent.mm.al.f.afx().e((com.tencent.mm.i.g)localObject2))
                  {
                    ab.e("MicroMsg.NetSceneSendAppMsg", "cdntra addSendTask failed.");
                    this.fFa = "";
                    i = 0;
                  }
                  else
                  {
                    i = 1;
                  }
                }
              }
            }
          }
          label963: bwb localbwb = (bwb)this.ehh.fsG.fsP;
          dv localdv = new dv();
          localdv.fKh = paramf.appId;
          localdv.vFF = (this.cKd.field_talker + this.cKd.field_msgId + "T" + this.cKd.field_createTime);
          localdv.ncM = j.b.a(paramf, null, null, 0, 0);
          localdv.pcX = ((int)bo.anT());
          localdv.ndF = this.cKd.field_talker;
          localdv.ndG = r.Yz();
          localdv.jCt = paramf.type;
          localdv.vFE = paramf.sdkVer;
          localdv.vFH = paramf.fgr;
          label1144: v.b localb;
          String str;
          cdg localcdg;
          if (com.tencent.mm.aj.f.kq(this.cKd.field_talker))
          {
            localdv.vEG = com.tencent.mm.aj.a.e.rw(this.cKd.dqJ);
            localdv.vFJ = paramf.cMj;
            localdv.vFK = paramf.cMk;
            localdv.vFL = paramf.cMl;
            localb = v.Zp().nV(this.hcl);
            if (localb != null)
            {
              this.qJq = new vt();
              this.qJq.cSG.url = paramf.url;
              this.qJq.cSG.cSH = localb.getString("prePublishId", "");
              this.qJq.cSG.cSJ = localb.getString("preUsername", "");
              this.qJq.cSG.cSK = localb.getString("preChatName", "");
              this.qJq.cSG.cSL = localb.getInt("preMsgIndex", 0);
              this.qJq.cSG.cSP = localb.getInt("sendAppMsgScene", 0);
              this.qJq.cSG.cSQ = localb.getInt("getA8KeyScene", 0);
              this.qJq.cSG.cSR = localb.getString("referUrl", null);
              this.qJq.cSG.cSS = localb.getString("adExtStr", null);
              this.qJq.cSG.cSM = this.cKd.field_talker;
              this.qJq.cSG.cST = paramf.title;
              aw.ZK();
              localObject2 = com.tencent.mm.model.c.XM().aoO(this.cKd.field_talker);
              if (localObject2 != null)
                this.qJq.cSG.cSN = ((ad)localObject2).Oi();
              this.qJq.cSG.cSO = com.tencent.mm.model.n.mA(this.cKd.field_talker);
              str = "";
              localObject2 = str;
              if (paramf.cMn != null)
              {
                localcdg = new cdg();
                localObject2 = Base64.decode(paramf.cMn, 0);
              }
            }
          }
          try
          {
            localcdg.parseFrom((byte[])localObject2);
            localObject2 = str;
            if (localcdg.xcU != null)
              localObject2 = localcdg.xcU.mVX;
            localbwb.wWS = String.format(Locale.US, "prePublishId=%s&preUserName=%s&preChatName=%s&preChatType=%d&getA8KeyScene=%d&sourceAppId=%s", new Object[] { this.qJq.cSG.cSH, this.qJq.cSG.cSJ, this.qJq.cSG.cSK, Integer.valueOf(u.ad(this.qJq.cSG.cSJ, this.qJq.cSG.cSK)), Integer.valueOf(this.qJq.cSG.cSQ), localObject2 });
            if ((localb != null) && (paramf.type == 33))
            {
              this.vcw = new com.tencent.mm.g.a.n();
              i = localb.getInt("fromScene", 1);
              this.vcw.csr.scene = i;
              int j = localb.getInt("appservicetype", 0);
              this.vcw.csr.bQe = j;
              str = localb.getString("preChatName", "");
              if (2 == i)
              {
                localObject2 = localb.getString("preUsername", "");
                this.vcw.csr.cst = (str + ":" + (String)localObject2);
                label1766: localObject2 = this.cKd.field_talker;
                bool = localb.getBoolean("moreRetrAction", false);
                if (!((String)localObject2).endsWith("@chatroom"))
                  break label2168;
                localObject2 = this.vcw.csr;
                if (!bool)
                  break label2163;
                i = 5;
                label1813: ((n.a)localObject2).action = i;
                this.vcw.csr.css = (paramf.fiZ + 1);
                this.vcw.csr.csu = paramf.fiO;
                this.vcw.csr.csl = paramf.fiP;
                this.vcw.csr.appId = paramf.fiQ;
                this.vcw.csr.csw = bo.anT();
                this.vcw.csr.csx = 1;
              }
            }
            else
            {
              ab.d("MicroMsg.NetSceneSendAppMsg", "SnsPostOperationFields: ShareUrlOriginal=%s, ShareUrlOpen=%s, JsAppId=%s", new Object[] { paramf.cMj, paramf.cMk, paramf.cMl });
              if (!bo.isNullOrNil((String)localObject1))
              {
                localObject2 = com.tencent.mm.a.e.e((String)localObject1, 0, -1);
                if (!bo.cb((byte[])localObject2))
                  localdv.vFG = new SKBuiltinBuffer_t().setBuffer((byte[])localObject2);
              }
              if (localdv.vFG == null)
                break label2198;
            }
            label2198: for (i = localdv.vFG.getILen(); ; i = -1)
            {
              ab.d("MicroMsg.NetSceneSendAppMsg", "doScene thumbFile:[%s] thumbdata:%d", new Object[] { localObject1, Integer.valueOf(i) });
              localbwb.wWQ = localdv;
              if ((paramf.fgs != 0) || (paramf.fgo > 26214400))
                localbwb.vHo = com.tencent.mm.i.a.efE;
              localbwb.Md5 = paramf.filemd5;
              localbwb.guQ = this.mSignature;
              ab.i("MicroMsg.NetSceneSendAppMsg", "summersafecdn file md5[%s], signature[%s], type[%d], fromScene[%s]", new Object[] { localbwb.Md5, bo.anv(localbwb.guQ), Integer.valueOf(localbwb.vHo), localbwb.wWS });
              i = a(parame, this.ehh, this);
              AppMethodBeat.o(27361);
              break;
              localdv.vEG = bh.aae();
              break label1144;
              this.vcw.csr.cst = str;
              break label1766;
              label2163: i = 2;
              break label1813;
              label2168: localObject2 = this.vcw.csr;
              if (bool);
              for (i = 4; ; i = 1)
              {
                ((n.a)localObject2).action = i;
                break;
              }
            }
          }
          catch (Exception localException)
          {
            while (true)
              Object localObject3 = str;
          }
        }
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(27362);
    ab.i("MicroMsg.NetSceneSendAppMsg", "summersafecdn cdntra onGYNetEnd [%d,%d,%s] msgId:%d, oldContent[%s]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, Long.valueOf(this.cvx), this.cKd.field_content });
    if ((paramInt2 == 3) && (paramInt3 == -1) && (!bo.isNullOrNil(this.fFa)))
    {
      ab.w("MicroMsg.NetSceneSendAppMsg", "cdntra using cdn trans,  wait cdn service callback! clientid:%s", new Object[] { this.fFa });
      AppMethodBeat.o(27362);
    }
    while (true)
    {
      return;
      if ((paramInt2 != 0) || (paramInt3 != 0))
      {
        this.cKd.setStatus(5);
        com.tencent.mm.plugin.report.e.pXa.a(111L, 34L, 1L, true);
        aw.ZK();
        com.tencent.mm.model.c.XO().a(this.cKd.field_msgId, this.cKd);
        ab.e("MicroMsg.NetSceneSendAppMsg", "send app msg failed, err=" + paramInt2 + "," + paramInt3 + ", msgId " + this.cKd.field_msgId);
        if (paramInt2 == 4)
          com.tencent.mm.plugin.report.service.h.pYm.e(10420, new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(1), Long.valueOf(this.startTime), Long.valueOf(bo.anU()), Integer.valueOf(com.tencent.mm.al.c.bW(ah.getContext())), Integer.valueOf(com.tencent.mm.i.a.MediaType_THUMBIMAGE), Integer.valueOf(0) });
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(27362);
        continue;
      }
      paramArrayOfByte = (bwc)((com.tencent.mm.ai.b)paramq).fsH.fsP;
      bwb localbwb = (bwb)((com.tencent.mm.ai.b)paramq).fsG.fsP;
      this.cKd.setStatus(2);
      this.cKd.eI(paramArrayOfByte.ptF);
      aw.ZK();
      com.tencent.mm.model.c.XO().a(this.cKd.field_msgId, this.cKd);
      com.tencent.mm.modelstat.b.fRa.a(this.cKd, com.tencent.mm.af.k.k(this.cKd));
      if ((this.qJq != null) && (!bo.isNullOrNil(this.qJq.cSG.url)))
      {
        this.qJq.cSG.cSI = ("msg_" + Long.toString(paramArrayOfByte.ptF));
        com.tencent.mm.sdk.b.a.xxA.m(this.qJq);
      }
      if ((this.qJr != null) && (this.qJr.cSV.cSW != -1))
        com.tencent.mm.sdk.b.a.xxA.m(this.qJr);
      paramArrayOfByte = j.b.me(this.cKd.field_content);
      if ((paramArrayOfByte != null) && ("wx4310bbd51be7d979".equals(paramArrayOfByte.appId)))
      {
        if ((bo.isNullOrNil(this.cKd.field_talker)) || (!t.kH(this.cKd.field_talker)))
          break label819;
        paramInt1 = 1;
        paramq = "";
      }
      try
      {
        paramArrayOfByte = URLEncoder.encode(paramArrayOfByte.description, "UTF-8");
        paramq = paramArrayOfByte;
        paramArrayOfByte = new StringBuilder("1,");
        if (paramInt1 != 0)
        {
          paramInt1 = 2;
          paramq = paramInt1 + ",," + paramq;
          ab.i("MicroMsg.NetSceneSendAppMsg", "androidSystemShareFixed(13717) %s", new Object[] { paramq });
          com.tencent.mm.plugin.report.service.h.pYm.X(13717, paramq);
          if (this.vcw != null)
          {
            this.vcw.csr.csv = ("msg_" + this.cKd.field_msgSvrId);
            com.tencent.mm.sdk.b.a.xxA.m(this.vcw);
          }
          if (localbwb.wWQ.vFG != null)
            com.tencent.mm.plugin.report.service.h.pYm.e(10420, new Object[] { Integer.valueOf(0), Integer.valueOf(1), Long.valueOf(this.startTime), Long.valueOf(bo.anU()), Integer.valueOf(com.tencent.mm.al.c.bW(ah.getContext())), Integer.valueOf(com.tencent.mm.i.a.MediaType_THUMBIMAGE), Integer.valueOf(localbwb.wWQ.vFG.getILen()) });
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(27362);
          continue;
          label819: paramInt1 = 0;
        }
      }
      catch (UnsupportedEncodingException paramArrayOfByte)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.NetSceneSendAppMsg", paramArrayOfByte, "", new Object[0]);
          continue;
          paramInt1 = 1;
        }
      }
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
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.af
 * JD-Core Version:    0.6.2
 */
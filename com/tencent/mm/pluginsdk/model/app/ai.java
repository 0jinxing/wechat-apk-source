package com.tencent.mm.pluginsdk.model.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.at.o;
import com.tencent.mm.g.a.np;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.i.g.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.ckq;
import com.tencent.mm.protocal.protobuf.ckr;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import java.util.Map;

public final class ai extends m
  implements k
{
  j.b csH;
  String cvF;
  private boolean eFq;
  int eFs;
  com.tencent.mm.i.d eFt;
  com.tencent.mm.sdk.b.c eFv;
  private com.tencent.mm.ai.b ehh;
  com.tencent.mm.ai.f ehi;
  String fFa;
  private g.a fFk;
  boolean fFs;
  private String fgq;
  b pJj;
  long pJl;
  int retCode;
  long startTime;
  String toUser;
  private boolean vcD;
  private long vcE;

  public ai(long paramLong, String paramString1, String paramString2)
  {
    AppMethodBeat.i(27380);
    this.pJj = null;
    this.csH = null;
    this.pJl = -1L;
    this.fgq = null;
    this.vcD = true;
    this.fFs = true;
    this.retCode = 0;
    this.startTime = 0L;
    this.vcE = -1L;
    this.fFa = "";
    this.fFk = new ai.1(this);
    this.eFq = false;
    this.eFs = 0;
    this.eFv = new ai.2(this);
    this.pJl = paramLong;
    this.fgq = paramString1;
    this.cvF = paramString2;
    paramString2 = new b.a();
    paramString2.fsJ = new ckq();
    paramString2.fsK = new ckr();
    paramString2.uri = "/cgi-bin/micromsg-bin/uploadappattach";
    paramString2.fsI = 220;
    paramString2.fsL = 105;
    paramString2.fsM = 1000000105;
    this.ehh = paramString2.acD();
    ab.i("MicroMsg.NetSceneUploadAppAttach", "summerbig new NetSceneUploadAppAttach rowid[%d], emoticonmd5[%s], stack[%s]", new Object[] { Long.valueOf(paramLong), paramString1, bo.dpG() });
    AppMethodBeat.o(27380);
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(27381);
    this.ehi = paramf;
    this.pJj = new b();
    int i;
    if ((!am.aUq().b(this.pJl, this.pJj)) || (this.pJj == null))
    {
      ab.e("MicroMsg.NetSceneUploadAppAttach", com.tencent.mm.compatible.util.g.Mq() + " summerbig get info failed rowid:" + this.pJl);
      this.retCode = (-10000 - com.tencent.mm.compatible.util.g.getLine());
      this.pJj = null;
      i = -1;
      AppMethodBeat.o(27381);
    }
    while (true)
    {
      return i;
      label1540: label1546: label1551: if (this.pJj.field_status != 101L)
      {
        ab.e("MicroMsg.NetSceneUploadAppAttach", com.tencent.mm.compatible.util.g.Mq() + " summerbig get field_status failed rowid:" + this.pJl + " status:" + this.pJj.field_status);
        i = -1;
        AppMethodBeat.o(27381);
      }
      else
      {
        if (this.startTime == 0L)
        {
          this.startTime = bo.anU();
          this.vcE = this.pJj.field_offset;
        }
        ab.i("MicroMsg.NetSceneUploadAppAttach", "summerbig doScene rowid[%d], fileFullPath[%s], totalLen[%d],isUpload[%b], isUseCdn[%b], type[%d]", new Object[] { Long.valueOf(this.pJl), this.pJj.field_fileFullPath, Long.valueOf(this.pJj.field_totalLen), Boolean.valueOf(this.pJj.field_isUpload), Integer.valueOf(this.pJj.field_isUseCdn), Long.valueOf(this.pJj.field_type) });
        label1168: label2070: if (bo.isNullOrNil(this.pJj.field_appId))
        {
          ab.e("MicroMsg.NetSceneUploadAppAttach", "summerbig doScene checkArgs : appId is null");
          if ((this.pJj.field_type != 8L) && (this.pJj.field_type != 6L))
          {
            this.retCode = (-10000 - com.tencent.mm.compatible.util.g.getLine());
            i = -1;
            AppMethodBeat.o(27381);
          }
        }
        else
        {
          if ((this.pJj.field_type == 8L) || (this.pJj.field_type == 9L))
          {
            ab.i("MicroMsg.NetSceneUploadAppAttach", "summerbig cdntra cdn not support Emoji or voiceremind now type:%d", new Object[] { Long.valueOf(this.pJj.field_type) });
            i = 0;
          }
          Object localObject;
          while (true)
          {
            if (i == 0)
              break label1661;
            ab.d("MicroMsg.NetSceneUploadAppAttach", "summerbig doScene cdntra use cdn return -1 for onGYNetEnd client rowid:%d", new Object[] { Long.valueOf(this.pJl) });
            i = 0;
            AppMethodBeat.o(27381);
            break;
            com.tencent.mm.al.f.afx();
            if ((!com.tencent.mm.al.b.lg(4)) && (this.pJj.field_isUseCdn != 1))
            {
              com.tencent.mm.al.f.afx();
              ab.w("MicroMsg.NetSceneUploadAppAttach", "summerbig cdntra not use cdn flag:%b getCdnInfo:%d", new Object[] { Boolean.valueOf(com.tencent.mm.al.b.lg(4)), Integer.valueOf(this.pJj.field_isUseCdn) });
              i = 0;
            }
            else
            {
              aw.ZK();
              bi localbi = com.tencent.mm.model.c.XO().jf(this.pJj.field_msgInfoId);
              if (localbi.field_msgId != this.pJj.field_msgInfoId)
              {
                ab.w("MicroMsg.NetSceneUploadAppAttach", "summerbig cdntra read msg info failed msgId[%d], rowid[%d], createtime[%d], len[%d], status[%d], upload[%b], useCdn[%d], mediaId[%s]", new Object[] { Long.valueOf(this.pJj.field_msgInfoId), Long.valueOf(this.pJj.xDa), Long.valueOf(this.pJj.field_createTime), Long.valueOf(this.pJj.field_totalLen), Long.valueOf(this.pJj.field_status), Boolean.valueOf(this.pJj.field_isUpload), Integer.valueOf(this.pJj.field_isUseCdn), this.pJj.field_mediaId });
                this.toUser = null;
                i = 0;
              }
              else
              {
                this.toUser = localbi.field_talker;
                paramf = "";
                if (!bo.isNullOrNil(localbi.field_imgPath))
                  paramf = o.ahl().sj(localbi.field_imgPath);
                int j = com.tencent.mm.a.e.cs(paramf);
                int k = com.tencent.mm.a.e.cs(this.pJj.field_fileFullPath);
                if (j >= com.tencent.mm.i.a.efW)
                {
                  ab.w("MicroMsg.NetSceneUploadAppAttach", "summerbig cdntra thumb[%s][%d] Too Big Not Use CDN TRANS", new Object[] { paramf, Integer.valueOf(j) });
                  i = 0;
                }
                else
                {
                  this.fFa = com.tencent.mm.al.c.a("upattach", this.pJj.field_createTime, localbi.field_talker, this.pJl);
                  ab.w("MicroMsg.NetSceneUploadAppAttach", "summerbig cdntra genClientId field_createTime[%d], useCdnTransClientId[%s]", new Object[] { Long.valueOf(this.pJj.field_createTime), this.fFa });
                  if (bo.isNullOrNil(this.fFa))
                  {
                    ab.w("MicroMsg.NetSceneUploadAppAttach", "summerbig cdntra genClientId failed not use cdn rowid:%d", new Object[] { Long.valueOf(this.pJl) });
                    i = 0;
                  }
                  else
                  {
                    com.tencent.mm.i.g localg = new com.tencent.mm.i.g();
                    String str = localbi.field_content;
                    localObject = str;
                    if (t.kH(localbi.field_talker))
                    {
                      i = bf.ox(localbi.field_content);
                      localObject = str;
                      if (i != -1)
                        localObject = (localbi.field_content + " ").substring(i + 2).trim();
                    }
                    this.csH = j.b.me(bo.anj((String)localObject));
                    label1100: int m;
                    label1145: boolean bool;
                    if (this.csH != null)
                    {
                      ab.d("MicroMsg.NetSceneUploadAppAttach", "summerbig cdntra amc.cdnAttachUrl[%s], amc.aesKey[%s], amc.filemd5[%s], amc.type[%d]", new Object[] { this.csH.fgD, bo.anv(this.csH.eyr), this.csH.filemd5, Integer.valueOf(this.csH.type) });
                      localg.field_fileId = this.csH.fgD;
                      localg.field_aesKey = this.csH.eyr;
                      localg.field_filemd5 = this.csH.filemd5;
                      if ((this.csH.fgs != 0) || (this.csH.fgo > 26214400))
                      {
                        i = 1;
                        localg.egl = this.fFk;
                        localg.field_mediaId = this.fFa;
                        localg.field_fullpath = this.pJj.field_fileFullPath;
                        localg.field_thumbpath = paramf;
                        if (i == 0)
                          break label1525;
                        m = com.tencent.mm.i.a.efE;
                        localg.field_fileType = m;
                        if (i == 0)
                          break label1533;
                        localObject = bo.nullAsNil(this.pJj.field_signature);
                        localg.field_svr_signature = ((String)localObject);
                        if (i == 0)
                          break label1540;
                        bool = bo.isNullOrNil(this.pJj.field_signature);
                        label1191: localg.field_onlycheckexist = bool;
                        localg.field_fake_bigfile_signature_aeskey = this.pJj.field_fakeAeskey;
                        localg.field_fake_bigfile_signature = this.pJj.field_fakeSignature;
                        localg.field_talker = localbi.field_talker;
                        localg.field_priority = com.tencent.mm.i.a.efC;
                        localg.field_totalLen = k;
                        localg.field_needStorage = false;
                        localg.field_isStreamMedia = false;
                        localg.field_enable_hitcheck = this.fFs;
                        if (!t.kH(localbi.field_talker))
                          break label1546;
                      }
                    }
                    for (i = 1; ; i = 0)
                    {
                      localg.field_chattype = i;
                      localg.field_force_aeskeycdn = false;
                      localg.field_trysafecdn = true;
                      ab.i("MicroMsg.NetSceneUploadAppAttach", "summerbig cdntra checkUseCdn msgId:%d file[%s][%d] thumb[%s][%d], useCdnTransClientId[%s], fileType[%d], enable_hitcheck[%b], onlycheckexist[%b] force_aeskeycdn[%b] trysafecdn[%b] aeskey[%s], md5[%s], signature[%s], faeskey[%s], fsignature[%s]", new Object[] { Long.valueOf(this.pJj.field_msgInfoId), localg.field_fullpath, Integer.valueOf(k), paramf, Integer.valueOf(j), this.fFa, Integer.valueOf(localg.field_fileType), Boolean.valueOf(localg.field_enable_hitcheck), Boolean.valueOf(localg.field_onlycheckexist), Boolean.valueOf(localg.field_force_aeskeycdn), Boolean.valueOf(localg.field_trysafecdn), bo.anv(localg.field_aesKey), localg.field_filemd5, bo.anv(localg.field_svr_signature), bo.anv(localg.field_fake_bigfile_signature_aeskey), bo.anv(localg.field_fake_bigfile_signature) });
                      if (com.tencent.mm.al.f.afx().e(localg))
                        break label1551;
                      ab.e("MicroMsg.NetSceneUploadAppAttach", "summerbig cdntra addSendTask failed.");
                      this.fFa = "";
                      i = 0;
                      break;
                      i = 0;
                      break label1100;
                      ab.i("MicroMsg.NetSceneUploadAppAttach", "summerbig cdntra parse content xml failed");
                      i = 0;
                      break label1100;
                      label1525: m = com.tencent.mm.i.a.MediaType_FILE;
                      break label1145;
                      label1533: localObject = "";
                      break label1168;
                      bool = false;
                      break label1191;
                    }
                    if (this.pJj.field_isUseCdn != 1)
                    {
                      this.pJj.field_isUseCdn = 1;
                      bool = am.aUq().a(this.pJj, new String[0]);
                      if (!bool)
                      {
                        ab.e("MicroMsg.NetSceneUploadAppAttach", "summerbig checkUseCdn update info ret:".concat(String.valueOf(bool)));
                        this.retCode = (-10000 - com.tencent.mm.compatible.util.g.getLine());
                        this.ehi.onSceneEnd(3, -1, "", this);
                        i = 0;
                      }
                    }
                    else
                    {
                      ab.i("MicroMsg.NetSceneUploadAppAttach", "summerbig checkUseCdn ret true useCdnTransClientId[%s]", new Object[] { this.fFa });
                      i = 1;
                    }
                  }
                }
              }
            }
          }
          label1661: if (this.pJj.field_netTimes > 3200L)
          {
            l.jC(this.pJj.xDa);
            ab.e("MicroMsg.NetSceneUploadAppAttach", com.tencent.mm.compatible.util.g.Mq() + " summerbig doScene info.field_netTimes > DOSCENE_LIMIT SET ERROR! rowid:" + this.pJl);
            i = -1;
            AppMethodBeat.o(27381);
          }
          else
          {
            paramf = this.pJj;
            paramf.field_netTimes += 1L;
            if (bo.isNullOrNil(this.pJj.field_clientAppDataId))
            {
              ab.e("MicroMsg.NetSceneUploadAppAttach", "summerbig doScene checkArgs : clientAppDataId is null");
              this.retCode = (-10000 - com.tencent.mm.compatible.util.g.getLine());
              i = -1;
              AppMethodBeat.o(27381);
            }
            else if ((this.pJj.field_totalLen <= 0L) || (this.pJj.field_totalLen > 26214400L))
            {
              ab.e("MicroMsg.NetSceneUploadAppAttach", "summerbig doScene checkArgs : totalLen is invalid, totalLen = " + this.pJj.field_totalLen);
              this.retCode = (-10000 - com.tencent.mm.compatible.util.g.getLine());
              if (this.pJj.field_totalLen > 26214400L)
                l.jC(this.pJj.xDa);
              i = -1;
              AppMethodBeat.o(27381);
            }
            else if (bo.isNullOrNil(this.pJj.field_fileFullPath))
            {
              ab.e("MicroMsg.NetSceneUploadAppAttach", "summerbig doScene checkArgs : fileFullPath is null");
              this.retCode = (-10000 - com.tencent.mm.compatible.util.g.getLine());
              i = -1;
              AppMethodBeat.o(27381);
            }
            else if (com.tencent.mm.a.e.cs(this.pJj.field_fileFullPath) > 26214400)
            {
              ab.e("MicroMsg.NetSceneUploadAppAttach", "summerbig doScene doScene : file is too large");
              l.jC(this.pJj.xDa);
              i = -1;
              AppMethodBeat.o(27381);
            }
            else
            {
              if (bo.isNullOrNil(this.fgq));
              for (paramf = com.tencent.mm.a.e.f(this.pJj.field_fileFullPath, (int)this.pJj.field_offset, 8192); ; paramf = com.tencent.mm.a.e.f(this.pJj.field_fileFullPath, (int)this.pJj.field_offset, 32768))
              {
                if (!bo.cb(paramf))
                  break label2070;
                ab.e("MicroMsg.NetSceneUploadAppAttach", "summerbig doScene doScene : data is null");
                this.retCode = (-10000 - com.tencent.mm.compatible.util.g.getLine());
                i = -1;
                AppMethodBeat.o(27381);
                break;
              }
              localObject = (ckq)this.ehh.fsG.fsP;
              ((ckq)localObject).fKh = this.pJj.field_appId;
              ((ckq)localObject).vFE = ((int)this.pJj.field_sdkVer);
              ((ckq)localObject).xit = this.pJj.field_clientAppDataId;
              ((ckq)localObject).jCt = ((int)this.pJj.field_type);
              ((ckq)localObject).jBB = r.Yz();
              ((ckq)localObject).ptw = ((int)this.pJj.field_totalLen);
              ((ckq)localObject).ptx = ((int)this.pJj.field_offset);
              if ((this.fgq != null) && (this.vcD))
              {
                ((ckq)localObject).wdO = this.fgq;
                ((ckq)localObject).ptw = ((int)this.pJj.field_totalLen);
                ((ckq)localObject).pty = 0;
                ((ckq)localObject).ptz = new SKBuiltinBuffer_t().setBuffer(new byte[0]);
                this.vcD = false;
                i = a(parame, this.ehh, this);
                AppMethodBeat.o(27381);
              }
              else
              {
                ((ckq)localObject).pty = paramf.length;
                ((ckq)localObject).ptz = new SKBuiltinBuffer_t().setBuffer(paramf);
                if (this.fgq != null)
                  ((ckq)localObject).wdO = this.fgq;
                i = a(parame, this.ehh, this);
                AppMethodBeat.o(27381);
              }
            }
          }
        }
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(27382);
    ab.d("MicroMsg.NetSceneUploadAppAttach", "onGYNetEnd : errType = " + paramInt2 + ", errCode = " + paramInt3);
    if ((paramInt2 == 3) && (paramInt3 == -1) && (!bo.isNullOrNil(this.fFa)))
    {
      ab.w("MicroMsg.NetSceneUploadAppAttach", "cdntra using cdn trans,  wait cdn service callback! clientid:%s", new Object[] { this.fFa });
      AppMethodBeat.o(27382);
    }
    while (true)
    {
      return;
      if ((paramInt2 != 0) || (paramInt3 != 0))
      {
        ab.e("MicroMsg.NetSceneUploadAppAttach", "onGYNetEnd : errType = " + paramInt2 + ", errCode = " + paramInt3);
        this.retCode = (-10000 - com.tencent.mm.compatible.util.g.getLine());
        if (paramInt2 == 4)
          com.tencent.mm.plugin.report.service.h.pYm.e(10420, new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(1), Long.valueOf(this.startTime), Long.valueOf(bo.anU()), Integer.valueOf(com.tencent.mm.al.c.bW(com.tencent.mm.sdk.platformtools.ah.getContext())), Integer.valueOf(com.tencent.mm.i.a.MediaType_FILE), Long.valueOf(this.pJj.field_totalLen - this.vcE) });
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(27382);
      }
      else
      {
        paramString = (ckr)((com.tencent.mm.ai.b)paramq).fsH.fsP;
        if ((paramString.fKh != null) && (this.fgq == null) && ((!paramString.fKh.equals(this.pJj.field_appId)) || (!paramString.xit.equals(this.pJj.field_clientAppDataId))))
        {
          ab.e("MicroMsg.NetSceneUploadAppAttach", "argument is not consistent");
          this.retCode = (-10000 - com.tencent.mm.compatible.util.g.getLine());
          this.ehi.onSceneEnd(3, -1, "", this);
          AppMethodBeat.o(27382);
        }
        else if ((paramString.ptw < 0) || (paramString.ptw != this.pJj.field_totalLen) || (paramString.ptx < 0) || (paramString.ptx > this.pJj.field_totalLen))
        {
          ab.e("MicroMsg.NetSceneUploadAppAttach", "dataLen, startPos or totalLen is incorrect");
          this.retCode = (-10000 - com.tencent.mm.compatible.util.g.getLine());
          this.ehi.onSceneEnd(3, -1, "", this);
          AppMethodBeat.o(27382);
        }
        else
        {
          this.pJj.field_offset = paramString.ptx;
          paramq = this.pJj;
          if (l.aiK(paramString.fKk));
          for (paramString = paramString.fKk; ; paramString = "")
          {
            paramq.field_mediaSvrId = paramString;
            if (this.pJj.field_status != 105L)
              break label589;
            ab.w("MicroMsg.NetSceneUploadAppAttach", "onGYNetEnd STATUS PAUSE [" + this.pJj.field_mediaSvrId + "," + this.pJj.field_offset + "] ");
            this.ehi.onSceneEnd(paramInt2, -1, "", this);
            AppMethodBeat.o(27382);
            break;
          }
          label589: if (this.pJj.field_offset == this.pJj.field_totalLen)
          {
            if (bo.isNullOrNil(this.pJj.field_mediaSvrId))
            {
              ab.e("MicroMsg.NetSceneUploadAppAttach", "finish upload but mediaid == null!");
              this.retCode = (-10000 - com.tencent.mm.compatible.util.g.getLine());
              this.ehi.onSceneEnd(3, -1, "", this);
              l.jC(this.pJj.xDa);
              AppMethodBeat.o(27382);
            }
            else
            {
              this.pJj.field_status = 199L;
              com.tencent.mm.plugin.report.service.h.pYm.e(10420, new Object[] { Integer.valueOf(0), Integer.valueOf(1), Long.valueOf(this.startTime), Long.valueOf(bo.anU()), Integer.valueOf(com.tencent.mm.al.c.bW(com.tencent.mm.sdk.platformtools.ah.getContext())), Integer.valueOf(com.tencent.mm.i.a.MediaType_FILE), Long.valueOf(this.pJj.field_totalLen - this.vcE) });
            }
          }
          else
          {
            boolean bool = am.aUq().a(this.pJj, new String[0]);
            if (!bool)
            {
              ab.e("MicroMsg.NetSceneUploadAppAttach", "onGYNetEnd update info ret:".concat(String.valueOf(bool)));
              this.retCode = (-10000 - com.tencent.mm.compatible.util.g.getLine());
              d(null);
              this.ehi.onSceneEnd(3, -1, "", this);
              AppMethodBeat.o(27382);
            }
            else if (this.pJj.field_status == 199L)
            {
              this.ehi.onSceneEnd(0, 0, "", this);
              AppMethodBeat.o(27382);
            }
            else
            {
              if (a(this.ftf, this.ehi) < 0)
              {
                ab.e("MicroMsg.NetSceneUploadAppAttach", "onGYNetEnd : doScene fail");
                this.ehi.onSceneEnd(3, -1, "", this);
              }
              AppMethodBeat.o(27382);
            }
          }
        }
      }
    }
  }

  public final int acn()
  {
    return 3200;
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  final void d(com.tencent.mm.i.d paramd)
  {
    AppMethodBeat.i(27383);
    if (this.pJj.field_type != 2L)
      AppMethodBeat.o(27383);
    while (true)
    {
      return;
      com.tencent.mm.storage.c localc = com.tencent.mm.model.c.c.abi().ll("100131");
      if (localc.isValid())
        this.eFs = com.tencent.mm.platformtools.ah.getInt((String)localc.dru().get("needUploadData"), 1);
      if ((this.eFq) || (this.eFs == 0))
      {
        AppMethodBeat.o(27383);
      }
      else
      {
        this.eFt = paramd;
        this.eFq = true;
        paramd = new np();
        com.tencent.mm.sdk.b.a.xxA.c(this.eFv);
        paramd.cJU.filePath = this.pJj.field_fileFullPath;
        com.tencent.mm.sdk.b.a.xxA.m(paramd);
        AppMethodBeat.o(27383);
      }
    }
  }

  public final int getType()
  {
    return 220;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.ai
 * JD-Core Version:    0.6.2
 */
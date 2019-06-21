package com.tencent.mm.plugin.record.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.i.g.a;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.c;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.xj;
import com.tencent.mm.protocal.protobuf.xk;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;

public final class e extends m
  implements k
{
  private String cHr;
  bi cKd;
  public long cvx;
  private com.tencent.mm.ai.b ehh;
  com.tencent.mm.ai.f ehi;
  com.tencent.mm.ai.g fEW;
  String fFa;
  private g.a fFk;
  private long jvz;
  com.tencent.mm.pluginsdk.model.app.b pJj;
  public long pJl;
  private int pJm;
  String pJn;
  private boolean pJo;
  private boolean pJp;
  private boolean pJq;
  public int retCode;
  long startTime;
  private int type;

  public e(long paramLong1, long paramLong2, com.tencent.mm.ai.g paramg)
  {
    AppMethodBeat.i(135655);
    this.pJj = null;
    this.pJl = -1L;
    this.cHr = "";
    this.cvx = 0L;
    this.cKd = null;
    this.fFa = "";
    this.startTime = 0L;
    this.pJm = -1;
    this.pJn = "";
    this.type = 0;
    this.retCode = 0;
    this.pJo = false;
    this.pJp = false;
    this.jvz = 0L;
    this.pJq = false;
    this.fFk = new e.1(this);
    this.jvz = paramLong2;
    this.cvx = paramLong1;
    this.pJj = com.tencent.mm.plugin.s.a.aUq().lZ(paramLong1);
    this.fEW = paramg;
    this.pJp = true;
    if (this.pJj == null)
    {
      ab.e("MicroMsg.NetSceneDownloadAppAttach", "big appMsg, info is null, msgid = , svrId".concat(String.valueOf(paramLong1)), new Object[] { Long.valueOf(paramLong2) });
      AppMethodBeat.o(135655);
    }
    while (true)
    {
      return;
      paramg = new b.a();
      paramg.fsJ = new xj();
      paramg.fsK = new xk();
      paramg.uri = "/cgi-bin/micromsg-bin/downloadappattach";
      paramg.fsI = 221;
      paramg.fsL = 106;
      paramg.fsM = 1000000106;
      this.ehh = paramg.acD();
      AppMethodBeat.o(135655);
    }
  }

  public e(long paramLong, String paramString, com.tencent.mm.ai.g paramg)
  {
    this(paramString, paramLong, paramg);
    this.cvx = paramLong;
  }

  public e(com.tencent.mm.pluginsdk.model.app.b paramb)
  {
    AppMethodBeat.i(135656);
    this.pJj = null;
    this.pJl = -1L;
    this.cHr = "";
    this.cvx = 0L;
    this.cKd = null;
    this.fFa = "";
    this.startTime = 0L;
    this.pJm = -1;
    this.pJn = "";
    this.type = 0;
    this.retCode = 0;
    this.pJo = false;
    this.pJp = false;
    this.jvz = 0L;
    this.pJq = false;
    this.fFk = new e.1(this);
    this.pJj = paramb;
    this.pJo = true;
    this.cHr = this.pJj.field_mediaId;
    this.fEW = null;
    this.type = 0;
    if (paramb == null)
    {
      ab.e("MicroMsg.NetSceneDownloadAppAttach", "summerbig <init>, info is null, mediaId = " + this.cHr);
      AppMethodBeat.o(135656);
    }
    while (true)
    {
      return;
      b.a locala = new b.a();
      locala.fsJ = new xj();
      locala.fsK = new xk();
      locala.uri = "/cgi-bin/micromsg-bin/downloadappattach";
      locala.fsI = 221;
      locala.fsL = 106;
      locala.fsM = 1000000106;
      this.ehh = locala.acD();
      ab.i("MicroMsg.NetSceneDownloadAppAttach", "summerbig NetSceneDownloadAppAttach info fullpath[%s], justSaveFile[%b], stack[%s]", new Object[] { paramb.field_fileFullPath, Boolean.TRUE, bo.dpG() });
      AppMethodBeat.o(135656);
    }
  }

  public e(String paramString)
  {
    this(paramString, 0L, null);
  }

  private e(String paramString, long paramLong, com.tencent.mm.ai.g paramg)
  {
    AppMethodBeat.i(135657);
    this.pJj = null;
    this.pJl = -1L;
    this.cHr = "";
    this.cvx = 0L;
    this.cKd = null;
    this.fFa = "";
    this.startTime = 0L;
    this.pJm = -1;
    this.pJn = "";
    this.type = 0;
    this.retCode = 0;
    this.pJo = false;
    this.pJp = false;
    this.jvz = 0L;
    this.pJq = false;
    this.fFk = new e.1(this);
    this.cHr = paramString;
    this.cvx = paramLong;
    this.fEW = paramg;
    this.type = 0;
    this.pJj = com.tencent.mm.plugin.s.a.aUq().aiE(paramString);
    if (this.pJj == null)
      this.pJj = com.tencent.mm.plugin.s.a.aUq().lZ(paramLong);
    if (this.pJj == null)
    {
      ab.e("MicroMsg.NetSceneDownloadAppAttach", "summerbig <init>, info is null, mediaId = ".concat(String.valueOf(paramString)));
      AppMethodBeat.o(135657);
    }
    while (true)
    {
      return;
      paramString = new b.a();
      paramString.fsJ = new xj();
      paramString.fsK = new xk();
      paramString.uri = "/cgi-bin/micromsg-bin/downloadappattach";
      paramString.fsI = 221;
      paramString.fsL = 106;
      paramString.fsM = 1000000106;
      this.ehh = paramString.acD();
      ab.d("MicroMsg.NetSceneDownloadAppAttach", "summerbig NetSceneDownloadAppAttach , type[%d], info fullpath[%s], field_type[%d], signature[%s], stack[%s]", new Object[] { Integer.valueOf(0), this.pJj.field_fileFullPath, Long.valueOf(this.pJj.field_type), this.pJj.field_signature, bo.dpG() });
      AppMethodBeat.o(135657);
    }
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(135660);
    this.ehi = paramf;
    if (this.pJj == null)
    {
      ab.e("MicroMsg.NetSceneDownloadAppAttach", com.tencent.mm.compatible.util.g.Mq() + " get info failed mediaId:" + this.cHr);
      this.retCode = (-10000 - com.tencent.mm.compatible.util.g.getLine());
      i = -1;
      AppMethodBeat.o(135660);
    }
    while (true)
    {
      return i;
      this.cKd = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().jf(this.cvx);
      if ((this.cKd == null) || (this.cKd.field_msgId != this.cvx))
      {
        ab.e("MicroMsg.NetSceneDownloadAppAttach", com.tencent.mm.compatible.util.g.Mq() + " get msginfo failed mediaId:%s  msgId:%d", new Object[] { this.cHr, Long.valueOf(this.cvx) });
        this.retCode = (-10000 - com.tencent.mm.compatible.util.g.getLine());
        i = -1;
        AppMethodBeat.o(135660);
      }
      else
      {
        if (this.startTime == 0L)
        {
          this.startTime = bo.anU();
          this.pJm = ((int)this.pJj.field_offset);
        }
        if (this.jvz != 0L)
        {
          paramf = (xj)this.ehh.fsG.fsP;
          paramf.jBB = r.Yz();
          paramf.ptw = ((int)this.pJj.field_totalLen);
          paramf.ptx = ((int)this.pJj.field_offset);
          paramf.pty = 0;
          paramf.jCt = 40;
          paramf.ptF = this.jvz;
          i = a(parame, this.ehh, this);
          AppMethodBeat.o(135660);
        }
        else
        {
          Object localObject = this.cKd.field_content;
          paramf = (com.tencent.mm.ai.f)localObject;
          if (t.kH(this.cKd.field_talker))
          {
            i = bf.ox(this.cKd.field_content);
            paramf = (com.tencent.mm.ai.f)localObject;
            if (i != -1)
              paramf = (this.cKd.field_content + " ").substring(i + 2).trim();
          }
          paramf = j.b.me(bo.anj(paramf));
          if (paramf == null)
          {
            ab.e("MicroMsg.NetSceneDownloadAppAttach", "summerbig checkUseCdn cdntra parse content xml failed: mediaId:%s", new Object[] { this.cHr });
            i = 0;
          }
          while (true)
          {
            if (i == 0)
              break label1138;
            ab.d("MicroMsg.NetSceneDownloadAppAttach", "cdntra use cdn return -1 for onGYNetEnd mediaid:%s", new Object[] { this.cHr });
            i = 0;
            AppMethodBeat.o(135660);
            break;
            ab.i("MicroMsg.NetSceneDownloadAppAttach", "summerbig cdntra checkUseCdn msgid:%d total:%d fullpath:%s fileid:%s aeskey:%s ", new Object[] { Long.valueOf(this.cvx), Long.valueOf(this.pJj.field_totalLen), this.pJj.field_fileFullPath, paramf.fgD, bo.anv(paramf.eyr) });
            if (((bo.isNullOrNil(paramf.fgD)) && (bo.isNullOrNil(paramf.fgu))) || (bo.isNullOrNil(paramf.eyr)))
            {
              ab.w("MicroMsg.NetSceneDownloadAppAttach", "summerbig cdntra checkUseCdn msgId:%d Not use CDN  cdnAttachUrl:%s aes:%s ", new Object[] { Long.valueOf(this.cvx), paramf.fgD, bo.anv(paramf.eyr) });
              i = 0;
            }
            else
            {
              this.fFa = com.tencent.mm.al.c.a("downattach", this.pJj.field_createTime, this.cKd.field_talker, this.pJl);
              if (bo.isNullOrNil(this.fFa))
              {
                ab.w("MicroMsg.NetSceneDownloadAppAttach", "summerbig cdntra genClientId failed not use cdn rowid:%d", new Object[] { Long.valueOf(this.pJl) });
                i = 0;
              }
              else
              {
                com.tencent.mm.a.e.cx(this.pJj.field_fileFullPath);
                this.pJn = (this.pJj.field_fileFullPath + "_tmp");
                localObject = new com.tencent.mm.i.g();
                ((com.tencent.mm.i.g)localObject).field_mediaId = this.fFa;
                ((com.tencent.mm.i.g)localObject).field_fullpath = this.pJn;
                if ((paramf.fgs != 0) || (paramf.fgo > 26214400))
                {
                  i = com.tencent.mm.i.a.efE;
                  label757: ((com.tencent.mm.i.g)localObject).field_fileType = i;
                  ((com.tencent.mm.i.g)localObject).field_totalLen = ((int)this.pJj.field_totalLen);
                  ((com.tencent.mm.i.g)localObject).field_aesKey = paramf.eyr;
                  ((com.tencent.mm.i.g)localObject).field_fileId = paramf.fgD;
                  ((com.tencent.mm.i.g)localObject).field_svr_signature = this.pJj.field_signature;
                  ((com.tencent.mm.i.g)localObject).field_fake_bigfile_signature_aeskey = this.pJj.field_fakeAeskey;
                  ((com.tencent.mm.i.g)localObject).field_fake_bigfile_signature = this.pJj.field_fakeSignature;
                  ((com.tencent.mm.i.g)localObject).field_onlycheckexist = false;
                  ((com.tencent.mm.i.g)localObject).field_priority = com.tencent.mm.i.a.efC;
                  ((com.tencent.mm.i.g)localObject).egl = this.fFk;
                  if (!t.kH(this.cKd.field_talker))
                    break label1042;
                }
                label1042: for (i = 1; ; i = 0)
                {
                  ((com.tencent.mm.i.g)localObject).field_chattype = i;
                  if (!bo.isNullOrNil(paramf.fgu))
                  {
                    ((com.tencent.mm.i.g)localObject).field_fileType = 19;
                    ((com.tencent.mm.i.g)localObject).field_authKey = paramf.fgA;
                    ((com.tencent.mm.i.g)localObject).egm = paramf.fgu;
                    ((com.tencent.mm.i.g)localObject).field_fileId = "";
                  }
                  ab.i("MicroMsg.NetSceneDownloadAppAttach", "summerbig checkUseCdn addRecvTask taskInfo field_fileType[%d], fileFullPath[%s], aeskey[%s], signature[%s], faeskey[%s], fsignature[%s], onlycheckexist[%s]", new Object[] { Integer.valueOf(((com.tencent.mm.i.g)localObject).field_fileType), ((com.tencent.mm.i.g)localObject).field_fullpath, bo.anv(((com.tencent.mm.i.g)localObject).field_aesKey), bo.anv(((com.tencent.mm.i.g)localObject).field_svr_signature), bo.anv(((com.tencent.mm.i.g)localObject).field_fake_bigfile_signature_aeskey), bo.anv(((com.tencent.mm.i.g)localObject).field_fake_bigfile_signature), Boolean.valueOf(((com.tencent.mm.i.g)localObject).field_onlycheckexist) });
                  if (com.tencent.mm.al.f.afx().b((com.tencent.mm.i.g)localObject, -1))
                    break label1047;
                  ab.e("MicroMsg.NetSceneDownloadAppAttach", "summerbig cdntra addSendTask failed.");
                  this.fFa = "";
                  i = 0;
                  break;
                  i = com.tencent.mm.i.a.MediaType_FILE;
                  break label757;
                }
                label1047: if (this.pJj.field_isUseCdn != 1)
                {
                  this.pJj.field_isUseCdn = 1;
                  boolean bool = com.tencent.mm.plugin.s.a.aUq().a(this.pJj, new String[0]);
                  if (!bool)
                  {
                    ab.e("MicroMsg.NetSceneDownloadAppAttach", "summerbig checkUseCdn update info ret:".concat(String.valueOf(bool)));
                    this.retCode = (-10000 - com.tencent.mm.compatible.util.g.getLine());
                    this.ehi.onSceneEnd(3, -1, "", this);
                    i = 0;
                  }
                }
                else
                {
                  i = 1;
                }
              }
            }
          }
          label1138: if (this.pJj.field_status == 102L)
          {
            this.pJj.field_status = 101L;
            if (!this.pJo)
              com.tencent.mm.plugin.s.a.aUq().a(this.pJj, new String[0]);
          }
          this.pJl = this.pJj.xDa;
          if ((bo.isNullOrNil(this.pJj.field_mediaSvrId)) && (this.jvz == 0L))
          {
            ab.e("MicroMsg.NetSceneDownloadAppAttach", "checkArgs : mediaId is null");
            this.retCode = (-10000 - com.tencent.mm.compatible.util.g.getLine());
            i = -1;
            AppMethodBeat.o(135660);
          }
          else if ((this.pJj.field_totalLen <= 0L) || (this.pJj.field_totalLen > 26214400L))
          {
            ab.e("MicroMsg.NetSceneDownloadAppAttach", "checkArgs : totalLen is invalid, totalLen = " + this.pJj.field_totalLen);
            this.retCode = (-10000 - com.tencent.mm.compatible.util.g.getLine());
            i = -1;
            AppMethodBeat.o(135660);
          }
          else
          {
            if ((!bo.isNullOrNil(this.pJj.field_fileFullPath)) || (this.jvz != 0L))
              break;
            ab.e("MicroMsg.NetSceneDownloadAppAttach", "checkArgs : fileFullPath is null");
            this.retCode = (-10000 - com.tencent.mm.compatible.util.g.getLine());
            i = -1;
            AppMethodBeat.o(135660);
          }
        }
      }
    }
    int j = com.tencent.mm.a.e.cs(this.pJj.field_fileFullPath);
    int i = j;
    if (this.pJq)
    {
      i = j - 6;
      if (i <= 0)
        break label1476;
    }
    while (true)
    {
      if (i == this.pJj.field_offset)
        break label1481;
      ab.e("MicroMsg.NetSceneDownloadAppAttach", "checkArgs : fileFullPath is invalid, fileLength = " + i + ", info.field_offset = " + this.pJj.field_offset);
      this.retCode = (-10000 - com.tencent.mm.compatible.util.g.getLine());
      i = -1;
      AppMethodBeat.o(135660);
      break;
      label1476: i = 0;
    }
    label1481: ab.i("MicroMsg.NetSceneDownloadAppAttach", "downing attach by non cdn, appId: %s,  mediaId: %s, sdkVer: %d", new Object[] { this.pJj.field_appId, this.pJj.field_mediaSvrId, Long.valueOf(this.pJj.field_sdkVer) });
    paramf = (xj)this.ehh.fsG.fsP;
    paramf.fKh = this.pJj.field_appId;
    paramf.fKk = this.pJj.field_mediaSvrId;
    paramf.vFE = ((int)this.pJj.field_sdkVer);
    paramf.jBB = r.Yz();
    paramf.ptw = ((int)this.pJj.field_totalLen);
    paramf.ptx = ((int)this.pJj.field_offset);
    paramf.pty = 0;
    if (this.jvz != 0L)
      paramf.ptF = this.jvz;
    if (this.type != 0);
    for (paramf.jCt = this.type; ; paramf.jCt = ((int)this.pJj.field_type))
    {
      i = a(parame, this.ehh, this);
      AppMethodBeat.o(135660);
      break;
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(135661);
    ab.d("MicroMsg.NetSceneDownloadAppAttach", "onGYNetEnd : errType = " + paramInt2 + ", errCode = " + paramInt3);
    if ((paramInt2 == 3) && (paramInt3 == -1) && (!bo.isNullOrNil(this.fFa)))
    {
      ab.w("MicroMsg.NetSceneDownloadAppAttach", "cdntra using cdn trans,  wait cdn service callback! clientid:%s", new Object[] { this.fFa });
      AppMethodBeat.o(135661);
    }
    while (true)
    {
      return;
      if ((paramInt2 != 0) || (paramInt3 != 0))
      {
        ab.e("MicroMsg.NetSceneDownloadAppAttach", "onGYNetEnd : errType = " + paramInt2 + ", errCode = " + paramInt3);
        this.retCode = (-10000 - com.tencent.mm.compatible.util.g.getLine());
        if (paramInt2 == 4)
          com.tencent.mm.plugin.report.service.h.pYm.e(10420, new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(2), Long.valueOf(this.startTime), Long.valueOf(bo.anU()), Integer.valueOf(com.tencent.mm.al.c.bW(ah.getContext())), Integer.valueOf(com.tencent.mm.i.a.MediaType_FILE), Integer.valueOf(0) });
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(135661);
      }
      else
      {
        paramString = (xk)((com.tencent.mm.ai.b)paramq).fsH.fsP;
        this.pJj.field_totalLen = paramString.ptw;
        if ((paramString.fKk != null) && (!paramString.fKk.equals(this.pJj.field_mediaSvrId)))
        {
          ab.e("MicroMsg.NetSceneDownloadAppAttach", "argument is not consistent");
          this.retCode = (-10000 - com.tencent.mm.compatible.util.g.getLine());
          this.ehi.onSceneEnd(3, -1, "", this);
          AppMethodBeat.o(135661);
        }
        else if (paramString.ptx != this.pJj.field_offset)
        {
          ab.e("MicroMsg.NetSceneDownloadAppAttach", "startPos, totalLen is incorrect startpos:" + paramString.ptx);
          this.retCode = (-10000 - com.tencent.mm.compatible.util.g.getLine());
          this.ehi.onSceneEnd(3, -1, "", this);
          AppMethodBeat.o(135661);
        }
        else if (paramString.pty + this.pJj.field_offset > this.pJj.field_totalLen)
        {
          ab.e("MicroMsg.NetSceneDownloadAppAttach", "data buffer is incorrect datalen:" + paramString.pty + " off:" + this.pJj.field_offset + " total?:" + this.pJj.field_totalLen);
          this.retCode = (-10000 - com.tencent.mm.compatible.util.g.getLine());
          this.ehi.onSceneEnd(3, -1, "", this);
          AppMethodBeat.o(135661);
        }
        else
        {
          paramq = aa.a(paramString.ptz);
          if ((paramq == null) || (paramq.length == 0) || (paramq.length != paramString.pty))
          {
            ab.e("MicroMsg.NetSceneDownloadAppAttach", "data buffer is incorrect");
            this.retCode = (-10000 - com.tencent.mm.compatible.util.g.getLine());
            this.ehi.onSceneEnd(3, -1, "", this);
            AppMethodBeat.o(135661);
          }
          else
          {
            String str = new String(paramq);
            ab.d("MicroMsg.NetSceneDownloadAppAttach", "dancy download big appmsg : %s", new Object[] { Boolean.valueOf(this.pJp) });
            StringBuffer localStringBuffer;
            if ((this.pJj.field_offset < this.pJj.field_totalLen) && (this.pJp))
            {
              paramArrayOfByte = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().jf(this.pJj.field_msgInfoId);
              if (!str.startsWith("<appmsg"))
                break label958;
              if (!t.kH(paramArrayOfByte.field_talker))
                break label946;
              if (!bo.isNullOrNil(paramArrayOfByte.field_content))
              {
                paramString = paramArrayOfByte.field_content.split("\n", 2)[0];
                localStringBuffer = new StringBuffer();
                this.pJj.field_fullXml = (paramString + "\n");
                paramString = new StringBuffer();
                paramString.append(this.pJj.field_fullXml).append(str);
                this.pJj.field_fullXml = paramString.toString();
              }
            }
            while (true)
            {
              paramArrayOfByte.setContent(this.pJj.field_fullXml);
              ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().a(this.pJj.field_msgInfoId, paramArrayOfByte);
              ab.d("MicroMsg.NetSceneDownloadAppAttach", "dancy download full xml succed! xml: [%s]", new Object[] { str });
              paramInt1 = com.tencent.mm.a.e.e(this.pJj.field_fileFullPath, paramq);
              if ((bo.isNullOrNil(this.pJj.field_fileFullPath)) || (paramInt1 == 0))
                break label1201;
              ab.e("MicroMsg.NetSceneDownloadAppAttach", "append to file failed:".concat(String.valueOf(paramInt1)));
              this.retCode = (-10000 - com.tencent.mm.compatible.util.g.getLine());
              this.ehi.onSceneEnd(3, -1, "", this);
              AppMethodBeat.o(135661);
              break;
              label946: this.pJj.field_fullXml = str;
              continue;
              label958: if (!paramArrayOfByte.field_content.startsWith("<msg>"))
              {
                paramString = new StringBuffer();
                paramString.append(paramArrayOfByte.field_content).append(str);
                this.pJj.field_fullXml = paramString.toString();
              }
              if ((str.endsWith("</appmsg>")) || (this.pJj.field_offset + paramq.length == this.pJj.field_totalLen))
              {
                if (t.kH(paramArrayOfByte.field_talker))
                {
                  paramString = paramArrayOfByte.field_content.split("\n", 2);
                  Object localObject = paramString[0];
                  localStringBuffer = new StringBuffer();
                  localObject = localStringBuffer.append((String)localObject).append("\n<msg>");
                  if (paramString.length > 1);
                  for (paramString = paramString[1]; ; paramString = "")
                  {
                    ((StringBuffer)localObject).append(paramString).append(str).append("</msg>");
                    this.pJj.field_fullXml = localStringBuffer.toString();
                    break;
                  }
                }
                paramString = new StringBuffer();
                paramString.append("<msg>").append(this.pJj.field_fullXml).append("</msg>");
                this.pJj.field_fullXml = paramString.toString();
              }
            }
            label1201: paramString = this.pJj;
            paramString.field_offset += paramq.length;
            if (this.pJj.field_offset == this.pJj.field_totalLen)
              this.pJj.field_status = 199L;
            if (this.fEW != null)
              al.d(new e.2(this));
            if (this.pJo);
            for (boolean bool = true; ; bool = com.tencent.mm.plugin.s.a.aUq().a(this.pJj, new String[0]))
            {
              if (bool)
                break label1351;
              ab.e("MicroMsg.NetSceneDownloadAppAttach", "onGYNetEnd update info ret:".concat(String.valueOf(paramInt1)));
              this.retCode = (-10000 - com.tencent.mm.compatible.util.g.getLine());
              this.ehi.onSceneEnd(3, -1, "", this);
              AppMethodBeat.o(135661);
              break;
            }
            label1351: if (this.pJj.field_status == 199L)
            {
              com.tencent.mm.plugin.report.service.h.pYm.e(10420, new Object[] { Integer.valueOf(0), Integer.valueOf(2), Long.valueOf(this.startTime), Long.valueOf(bo.anU()), Integer.valueOf(com.tencent.mm.al.c.bW(ah.getContext())), Integer.valueOf(com.tencent.mm.i.a.MediaType_FILE), Long.valueOf(this.pJj.field_totalLen - this.pJm) });
              paramString = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().jf(this.pJj.field_msgInfoId);
              ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().a(new h.c(paramString.field_talker, "update", paramString));
              this.ehi.onSceneEnd(0, 0, "", this);
              AppMethodBeat.o(135661);
            }
            else if (this.pJj.field_status == 102L)
            {
              this.ehi.onSceneEnd(3, -1, "", this);
              this.retCode = -20102;
              AppMethodBeat.o(135661);
            }
            else
            {
              if (a(this.ftf, this.ehi) < 0)
              {
                ab.e("MicroMsg.NetSceneDownloadAppAttach", "onGYNetEnd : doScene fail");
                this.ehi.onSceneEnd(3, -1, "", this);
              }
              AppMethodBeat.o(135661);
            }
          }
        }
      }
    }
  }

  public final void a(e.a parama)
  {
    AppMethodBeat.i(135659);
    if (!this.pJo)
    {
      com.tencent.mm.al.f.afx().rO(this.fFa);
      this.pJj = com.tencent.mm.plugin.s.a.aUq().lZ(this.cvx);
      if (this.pJj == null)
      {
        ab.i("MicroMsg.NetSceneDownloadAppAttach", "pause get by msgid  %是is null then get by mediaId %s", new Object[] { Long.valueOf(this.cvx), this.cHr });
        this.pJj = com.tencent.mm.plugin.s.a.aUq().aiE(this.cHr);
      }
    }
    ab.i("MicroMsg.NetSceneDownloadAppAttach", "summerbig pause listener[%s], info[%s], justSaveFile[%b], stack[%s]", new Object[] { parama, this.pJj, Boolean.valueOf(this.pJo), bo.dpG() });
    if (this.pJj == null)
      AppMethodBeat.o(135659);
    while (true)
    {
      return;
      if ((this.pJj.field_status == 101L) && (parama != null))
        parama.ceD();
      this.pJj.field_status = 102L;
      if (!this.pJo)
        ab.i("MicroMsg.NetSceneDownloadAppAttach", "pause done %s", new Object[] { Boolean.valueOf(com.tencent.mm.plugin.s.a.aUq().a(this.pJj, new String[0])) });
      AppMethodBeat.o(135659);
    }
  }

  public final int acn()
  {
    return 400;
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  public final void ceC()
  {
    AppMethodBeat.i(135658);
    this.pJq = true;
    if (this.pJq)
      com.tencent.mm.a.e.e(this.pJj.field_fileFullPath, "#!AMR\n".getBytes());
    AppMethodBeat.o(135658);
  }

  public final String getMediaId()
  {
    if (this.pJj == null);
    for (String str = ""; ; str = this.pJj.field_mediaSvrId)
      return str;
  }

  public final int getType()
  {
    return 221;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.b.e
 * JD-Core Version:    0.6.2
 */
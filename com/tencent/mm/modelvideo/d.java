package com.tencent.mm.modelvideo;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.a;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.al.c;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.i.g.a;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bf.b;
import com.tencent.mm.model.n;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.c;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.xl;
import com.tencent.mm.protocal.protobuf.xm;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.bh;
import com.tencent.mm.storage.bi;
import java.util.HashSet;
import java.util.Map;
import junit.framework.Assert;

public final class d extends m
  implements k
{
  private String cHr;
  private com.tencent.mm.ai.b ehh;
  com.tencent.mm.ai.f ehi;
  String fFa;
  String fFh;
  int fFi;
  private g.a fFk;
  boolean fVh;
  boolean fVi;
  s fVj;
  com.tencent.mm.i.h fVk;
  int fVl;
  private boolean fVm;
  boolean fVn;
  long fVo;
  String fileName;
  int frO;
  private ap frk;
  int retCode;
  private int startOffset;
  long startTime;

  public d(String paramString)
  {
    this(paramString, false);
  }

  public d(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(50670);
    this.fVj = null;
    this.fFa = "";
    this.startOffset = 0;
    this.startTime = 0L;
    this.frO = 0;
    this.retCode = 0;
    this.fVl = com.tencent.mm.i.a.MediaType_VIDEO;
    this.fVm = false;
    this.fVn = true;
    this.fFh = null;
    this.fFi = 0;
    this.fVo = 0L;
    this.fFk = new d.1(this);
    this.frk = new ap(new d.3(this), false);
    if (paramString != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      this.fileName = paramString;
      this.fVh = paramBoolean;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneDownloadVideo", "%s NetSceneDownloadVideo:  file [%s] isCompleteOnlineVideo [%b]", new Object[] { alb(), paramString, Boolean.valueOf(paramBoolean) });
      AppMethodBeat.o(50670);
      return;
    }
  }

  private boolean ala()
  {
    AppMethodBeat.i(50671);
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.NetSceneDownloadVideo", "%s parseVideoMsgXML content: %s", new Object[] { alb(), this.fVj.alw() });
    Object localObject1 = br.z(this.fVj.alw(), "msg");
    if (localObject1 == null)
    {
      com.tencent.mm.plugin.report.service.h.pYm.a(111L, 214L, 1L, false);
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.NetSceneDownloadVideo", "%s cdntra parse video recv xml failed", new Object[] { alb() });
      bool = false;
      AppMethodBeat.o(50671);
    }
    String str1;
    Object localObject2;
    String str2;
    Object localObject3;
    while (true)
    {
      return bool;
      str1 = (String)((Map)localObject1).get(".msg.videomsg.$cdnvideourl");
      localObject2 = (String)((Map)localObject1).get(".msg.videomsg.$tpvideourl");
      if ((bo.isNullOrNil(str1)) && (bo.isNullOrNil((String)localObject2)))
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(111L, 213L, 1L, false);
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.NetSceneDownloadVideo", "%s cdntra parse video recv xml failed", new Object[] { alb() });
        bool = false;
        AppMethodBeat.o(50671);
      }
      else
      {
        str2 = (String)((Map)localObject1).get(".msg.videomsg.$aeskey");
        this.frO = bo.getInt((String)((Map)localObject1).get(".msg.videomsg.$length"), 0);
        localObject3 = (String)((Map)localObject1).get(".msg.videomsg.$fileparam");
        this.fFa = c.a("downvideo", this.fVj.createTime, this.fVj.getUser(), this.fVj.getFileName());
        if (!bo.isNullOrNil(this.fFa))
          break;
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.NetSceneDownloadVideo", "%s cdntra genClientId failed not use cdn file:%s", new Object[] { alb(), this.fVj.getFileName() });
        bool = false;
        AppMethodBeat.o(50671);
      }
    }
    if ((!this.fVh) && (this.frO < 1048576) && (this.fVj != null) && (this.fVj.cFa > 0))
    {
      this.fVh = true;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneDownloadVideo", "%s less 1M and had preload, reset isCompleteOnlineVideo [%b]", new Object[] { alb(), Boolean.valueOf(this.fVh) });
    }
    Object localObject4 = (String)((Map)localObject1).get(".msg.videomsg.$md5");
    Object localObject5 = new StringBuilder();
    o.all();
    localObject5 = t.uh(this.fileName) + ".tmp";
    this.fVk = new com.tencent.mm.i.h();
    this.fVk.filename = this.fVj.getFileName();
    this.fVk.egB = ((String)localObject4);
    this.fVk.egC = this.frO;
    this.fVk.egD = 0;
    this.fVk.cEV = this.fVj.alt();
    this.fVk.egE = this.fVj.getUser();
    com.tencent.mm.i.h localh = this.fVk;
    int i;
    label522: label639: int k;
    if (com.tencent.mm.model.t.kH(this.fVj.getUser()))
    {
      i = n.mA(this.fVj.getUser());
      localh.cEX = i;
      this.fVk.field_mediaId = this.fFa;
      this.fVk.field_fullpath = ((String)localObject5);
      this.fVk.field_fileType = com.tencent.mm.i.a.MediaType_VIDEO;
      this.fVk.field_totalLen = this.frO;
      this.fVk.field_aesKey = str2;
      this.fVk.field_fileId = str1;
      this.fVk.field_priority = com.tencent.mm.i.a.efC;
      this.fVk.egl = this.fFk;
      this.fVk.field_wxmsgparam = ((String)localObject3);
      localObject3 = this.fVk;
      if (!com.tencent.mm.model.t.kH(this.fVj.getUser()))
        break label1673;
      i = 1;
      ((com.tencent.mm.i.h)localObject3).field_chattype = i;
      this.fVk.egF = this.fVj.egF;
      if (!bo.isNullOrNil((String)localObject2))
      {
        localObject1 = (String)((Map)localObject1).get(".msg.videomsg.$tpauthkey");
        this.fVk.field_fileId = "";
        this.fVk.field_fileType = 19;
        this.fVk.field_authKey = ((String)localObject1);
        this.fVk.egm = ((String)localObject2);
      }
      localObject1 = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().Q(this.fVj.getUser(), this.fVj.cKK);
      this.fVk.egH = ((cy)localObject1).field_createTime;
      this.fVk.cKK = ((cy)localObject1).field_msgSvrId;
      localObject2 = bf.oE(((cy)localObject1).dqJ);
      localObject3 = this.fVk;
      if (localObject2 == null)
        break label1679;
      i = ((bf.b)localObject2).fmG;
      label799: ((com.tencent.mm.i.h)localObject3).egI = i;
      if (this.fVj.getUser().equals(((cy)localObject1).field_talker))
      {
        localObject3 = this.fVk;
        if (localObject2 != null)
          break label1685;
        i = 0;
        label837: ((com.tencent.mm.i.h)localObject3).field_limitrate = i;
      }
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.NetSceneDownloadVideo", "%s limitrate:%d file:%s", new Object[] { alb(), Integer.valueOf(this.fVk.field_limitrate), this.fVj.getFileName() });
      if (!com.tencent.mm.al.f.afx().fyQ.contains("video_" + this.fVj.fXe))
        break label1698;
      com.tencent.mm.al.f.afx().fyQ.remove("video_" + this.fVj.fXe);
      this.fVk.field_autostart = true;
      label962: if (3 == this.fVj.fXk)
        this.fVk.field_smallVideoFlag = 1;
      if ((bo.isNullOrNil((String)localObject4)) || (this.fVh))
        break label1730;
      localObject2 = ((com.tencent.mm.plugin.m.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.m.a.a.class)).XT().es((String)localObject4, this.frO);
      j = (int)com.tencent.mm.vfs.e.asZ((String)localObject2);
      k = this.frO - j;
      o.all();
      localObject3 = t.uh(this.fileName);
      int m = (int)com.tencent.mm.vfs.e.asZ((String)localObject3);
      if (m > 0)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.NetSceneDownloadVideo", "%s already copy dup file, but download again, something error here.", new Object[] { alb() });
        bool = com.tencent.mm.vfs.e.deleteFile((String)localObject3);
        localObject2 = ((com.tencent.mm.plugin.m.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.m.a.a.class)).XT();
        int n = this.frO;
        i = 0;
        if (!bo.isNullOrNil((String)localObject4))
          i = ((bh)localObject2).bSd.delete("MediaDuplication", "md5=? AND size=? AND status!=?", new String[] { localObject4, String.valueOf(n), "100" });
        localObject2 = u.ut(this.fileName);
        ((s)localObject2).fWY = 0;
        ((s)localObject2).bJt = 16;
        u.f((s)localObject2);
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.NetSceneDownloadVideo", "%s don't copy dup file, go to download now. target video len %d, delete file:%b,delete db: %d", new Object[] { alb(), Integer.valueOf(m), Boolean.valueOf(bool), Integer.valueOf(i) });
        localObject2 = "";
      }
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneDownloadVideo", "%s MediaCheckDuplicationStorage: totallen:%s md5:%s  dup(len:%d path:%s) diffLen:%d to:%s target video len %d", new Object[] { alb(), Integer.valueOf(this.frO), localObject4, Integer.valueOf(j), localObject2, Integer.valueOf(k), localObject5, Integer.valueOf(m) });
      if (bo.isNullOrNil((String)localObject2))
        break label1716;
      if ((k < 0) || (k > 16))
        break label1730;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneDownloadVideo", "%s MediaCheckDuplicationStorage copy dup file now :%s -> %s", new Object[] { alb(), localObject2, localObject5 });
      com.tencent.mm.vfs.e.y((String)localObject2, (String)localObject5);
      mo(this.frO);
      ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().a(new h.c(((cy)localObject1).field_talker, "update", (bi)localObject1));
      localObject2 = com.tencent.mm.plugin.report.service.h.pYm;
      long l1 = this.fVj.cKK;
      long l2 = this.fVj.createTime;
      localObject5 = this.fVj.getUser();
      if (3 == this.fVj.fXk)
        break label1709;
      i = 43;
      label1454: ((com.tencent.mm.plugin.report.service.h)localObject2).e(13267, new Object[] { str1, Long.valueOf(l1), localObject4, Long.valueOf(l2), localObject5, Integer.valueOf(i), Integer.valueOf(j) });
      i = 1;
      label1517: if (i != 0)
        break label1762;
      this.cHr = this.fVk.field_mediaId;
      this.fVo = bo.anU();
      if (this.fVj.videoFormat != 2)
        break label1736;
    }
    label1673: label1679: label1685: label1698: label1709: label1716: label1730: label1736: for (boolean bool = true; ; bool = false)
    {
      this.fVi = bool;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneDownloadVideo", "%s check use cdn isHadHevcLocalFile[%b] isCompleteOnlineVideo[%b]", new Object[] { alb(), Boolean.valueOf(this.fVi), Boolean.valueOf(this.fVh) });
      if (this.fVh)
        break label1989;
      if (com.tencent.mm.al.f.afx().b(this.fVk, -1))
        break label1741;
      com.tencent.mm.plugin.report.service.h.pYm.a(111L, 212L, 1L, false);
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneDownloadVideo", "%s cdntra addSendTask failed.", new Object[] { alb() });
      this.fFa = "";
      bool = false;
      AppMethodBeat.o(50671);
      break;
      i = 0;
      break label522;
      i = 0;
      break label639;
      i = 0;
      break label799;
      i = ((bf.b)localObject2).fmE / 8;
      break label837;
      this.fVk.field_autostart = false;
      break label962;
      i = 62;
      break label1454;
      this.fFh = ((String)localObject4);
      this.fFi = this.frO;
      i = 0;
      break label1517;
    }
    label1741: if (this.fVi)
      com.tencent.mm.plugin.report.service.h.pYm.a(354L, 135L, 1L, false);
    label1762: if (this.fVj.fXi != 1)
    {
      this.fVj.fXi = 1;
      this.fVj.bJt = 524288;
      u.f(this.fVj);
    }
    if (3 != this.fVj.fXk)
    {
      localObject2 = this.fVj.getUser();
      if (!bo.isNullOrNil((String)localObject2))
        if (!com.tencent.mm.model.t.kH((String)localObject2))
          break label2177;
    }
    label2177: for (int j = n.mA((String)localObject2); ; j = 0)
      try
      {
        localObject4 = ((ConnectivityManager)ah.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
        k = ((NetworkInfo)localObject4).getSubtype();
        i = ((NetworkInfo)localObject4).getType();
        if (i == 1)
          i = 1;
        while (true)
        {
          localObject2 = (String)localObject2 + "," + j + "," + str1 + "," + this.frO + "," + i;
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneDownloadVideo", "%s dk12024 report:%s", new Object[] { alb(), localObject2 });
          com.tencent.mm.plugin.report.service.h.pYm.X(12024, (String)localObject2);
          bool = true;
          AppMethodBeat.o(50671);
          break;
          label1989: this.fVn = false;
          localObject2 = this.fVk;
          o.all();
          ((com.tencent.mm.i.h)localObject2).field_fullpath = t.uh(this.fileName);
          if (this.fVi)
          {
            this.fVk.field_requestVideoFormat = 2;
            com.tencent.mm.plugin.report.service.h.pYm.a(354L, 251L, 1L, false);
          }
          o.alm().a(this.fVk, false);
          break label1762;
          if ((k == 13) || (k == 15) || (k == 14))
            i = 4;
          else if ((k == 3) || (k == 4) || (k == 5) || (k == 6) || (k == 12))
            i = 3;
          else if ((k == 1) || (k == 2))
            i = 2;
          else
            i = 0;
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneDownloadVideo", "getNetType : %s", new Object[] { bo.l(localException) });
          i = 0;
        }
      }
  }

  final boolean EH()
  {
    boolean bool = false;
    AppMethodBeat.i(50669);
    if (!bo.isNullOrNil(this.cHr))
    {
      if (!this.fVh)
        break label71;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneDownloadVideo", "%s cancel online video task.", new Object[] { alb() });
      o.alm().m(this.cHr, null);
    }
    while (true)
    {
      bool = true;
      this.fVm = true;
      AppMethodBeat.o(50669);
      return bool;
      label71: com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneDownloadVideo", "%s cancel offline video task.", new Object[] { alb() });
      com.tencent.mm.al.f.afx().rO(this.cHr);
    }
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    int i = 1;
    int j = -1;
    AppMethodBeat.i(50673);
    this.ehi = paramf;
    this.fVj = u.ut(this.fileName);
    if (this.fVj == null)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneDownloadVideo", "ERR: Get INFO FAILED :" + this.fileName);
      this.retCode = (0 - com.tencent.mm.compatible.util.g.getLine() - 10000);
      AppMethodBeat.o(50673);
      i = j;
    }
    while (true)
    {
      return i;
      if ((this.fVj != null) && (3 == this.fVj.fXk))
        this.fVl = com.tencent.mm.i.a.MediaType_TinyVideo;
      if (this.startTime == 0L)
      {
        this.startTime = bo.anU();
        this.startOffset = this.fVj.fWY;
      }
      if (ala())
      {
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.NetSceneDownloadVideo", "cdntra use cdn return -1 for onGYNetEnd clientid:%s", new Object[] { this.fileName });
        AppMethodBeat.o(50673);
        i = 0;
      }
      else if (this.fVj.status != 112)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneDownloadVideo", "ERR: STATUS: " + this.fVj.status + " [" + this.fileName + "," + this.fVj.cKK + "," + this.fVj.alt() + "," + this.fVj.getUser() + "]");
        this.retCode = (0 - com.tencent.mm.compatible.util.g.getLine() - 10000);
        AppMethodBeat.o(50673);
        i = j;
      }
      else
      {
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.NetSceneDownloadVideo", "start doScene  [" + this.fileName + "," + this.fVj.cKK + "," + this.fVj.alt() + "," + this.fVj.getUser() + "]  filesize:" + this.fVj.fWY + " file:" + this.fVj.frO + " netTimes:" + this.fVj.fXf);
        if (!u.ul(this.fileName))
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneDownloadVideo", "ERR: NET TIMES: " + this.fVj.fXf + " [" + this.fileName + "," + this.fVj.cKK + "," + this.fVj.alt() + "," + this.fVj.getUser() + "] ");
          u.um(this.fileName);
          this.retCode = (0 - com.tencent.mm.compatible.util.g.getLine() - 10000);
          AppMethodBeat.o(50673);
          i = j;
        }
        else if (this.fVj.cKK <= 0L)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneDownloadVideo", "ERR: MSGSVRID: " + this.fVj.cKK + " [" + this.fileName + "," + this.fVj.cKK + "," + this.fVj.alt() + "," + this.fVj.getUser() + "] ");
          u.um(this.fileName);
          this.retCode = (0 - com.tencent.mm.compatible.util.g.getLine() - 10000);
          AppMethodBeat.o(50673);
          i = j;
        }
        else
        {
          if ((this.fVj.fWY >= 0) && (this.fVj.frO > this.fVj.fWY) && (this.fVj.frO > 0))
            break;
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneDownloadVideo", "ERR: fileSize:" + this.fVj.fWY + " total:" + this.fVj.frO + " [" + this.fileName + "," + this.fVj.cKK + "," + this.fVj.alt() + "," + this.fVj.getUser() + "] ");
          u.um(this.fileName);
          this.retCode = (0 - com.tencent.mm.compatible.util.g.getLine() - 10000);
          AppMethodBeat.o(50673);
          i = j;
        }
      }
    }
    paramf = new b.a();
    paramf.fsJ = new xl();
    paramf.fsK = new xm();
    paramf.uri = "/cgi-bin/micromsg-bin/downloadvideo";
    paramf.fsI = 150;
    paramf.fsL = 40;
    paramf.fsM = 1000000040;
    this.ehh = paramf.acD();
    paramf = (xl)this.ehh.fsG.fsP;
    paramf.ptF = this.fVj.cKK;
    paramf.ptx = this.fVj.fWY;
    paramf.ptw = this.fVj.frO;
    if (com.tencent.mm.network.ab.ch(ah.getContext()));
    while (true)
    {
      paramf.wdl = i;
      i = a(parame, this.ehh, this);
      AppMethodBeat.o(50673);
      break;
      i = 2;
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(50677);
    if (this.fVm)
    {
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.NetSceneDownloadVideo", "onGYNetEnd Call Stop by Service  [" + this.fileName + "," + this.fVj.cKK + "," + this.fVj.alt() + "," + this.fVj.getUser() + "] ");
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(50677);
    }
    while (true)
    {
      return;
      if ((paramInt2 == 3) && (paramInt3 == -1) && (!bo.isNullOrNil(this.fFa)))
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.NetSceneDownloadVideo", "cdntra using cdn trans,  wait cdn service callback! clientid:%s", new Object[] { this.fFa });
        AppMethodBeat.o(50677);
      }
      else
      {
        paramArrayOfByte = (xm)((com.tencent.mm.ai.b)paramq).fsH.fsP;
        paramq = (xl)((com.tencent.mm.ai.b)paramq).fsG.fsP;
        this.fVj = u.ut(this.fileName);
        if (this.fVj == null)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneDownloadVideo", "ERR: onGYNetEnd Get INFO FAILED :" + this.fileName);
          this.retCode = (0 - com.tencent.mm.compatible.util.g.getLine() - 10000);
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(50677);
        }
        else if (this.fVj.status == 113)
        {
          com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.NetSceneDownloadVideo", "onGYNetEnd STATUS PAUSE [" + this.fileName + "," + this.fVj.cKK + "," + this.fVj.alt() + "," + this.fVj.getUser() + "] ");
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(50677);
        }
        else if (this.fVj.status != 112)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneDownloadVideo", "ERR: onGYNetEnd STATUS ERR: status:" + this.fVj.status + " [" + this.fileName + "," + this.fVj.cKK + "," + this.fVj.alt() + "," + this.fVj.getUser() + "] ");
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(50677);
        }
        else if ((paramInt2 == 4) && (paramInt3 != 0))
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(111L, 208L, 1L, false);
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneDownloadVideo", "ERR: onGYNetEnd SERVER FAILED errtype:" + paramInt2 + " errCode:" + paramInt3 + " [" + this.fileName + "," + this.fVj.cKK + "," + this.fVj.alt() + "," + this.fVj.getUser() + "] ");
          u.um(this.fileName);
          com.tencent.mm.plugin.report.service.h.pYm.e(10420, new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(2), Long.valueOf(this.startTime), Long.valueOf(bo.anU()), Integer.valueOf(c.bW(ah.getContext())), Integer.valueOf(this.fVl), Integer.valueOf(this.frO - this.startOffset) });
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(50677);
        }
        else if ((paramInt2 != 0) || (paramInt3 != 0))
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(111L, 207L, 1L, false);
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneDownloadVideo", "ERR: onGYNetEnd SERVER FAILED (SET PAUSE) errtype:" + paramInt2 + " errCode:" + paramInt3 + " [" + this.fileName + "," + this.fVj.cKK + "," + this.fVj.alt() + "," + this.fVj.getUser() + "] ");
          this.fVj.status = 113;
          u.f(this.fVj);
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(50677);
        }
        else if (bo.cb(paramArrayOfByte.ptz.getBuffer().wR))
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneDownloadVideo", "ERR: onGYNetEnd Recv BUF ZERO length  [" + this.fileName + "," + this.fVj.cKK + "," + this.fVj.alt() + "," + this.fVj.getUser() + "] ");
          u.um(this.fileName);
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(50677);
        }
        else if (paramArrayOfByte.ptx != paramq.ptx)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneDownloadVideo", "ERR: onGYNetEnd OFFSET ERROR respStartPos:" + paramArrayOfByte.ptx + " reqStartPos:" + paramq.ptx + " [" + this.fileName + "," + this.fVj.cKK + "," + this.fVj.alt() + "," + this.fVj.getUser() + "] ");
          u.um(this.fileName);
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(50677);
        }
        else if (paramArrayOfByte.ptw != paramq.ptw)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneDownloadVideo", "ERR: onGYNetEnd respTotal:" + paramArrayOfByte.ptw + " reqTotal:" + paramq.ptw + " [" + this.fileName + "," + this.fVj.cKK + "," + this.fVj.alt() + "," + this.fVj.getUser() + "] ");
          u.um(this.fileName);
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(50677);
        }
        else if (paramq.ptw < paramArrayOfByte.ptx)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneDownloadVideo", "ERR: onGYNetEnd respTotal:" + paramArrayOfByte.ptw + " respStartPos:" + paramq.ptx + " [" + this.fileName + "," + this.fVj.cKK + "," + this.fVj.alt() + "," + this.fVj.getUser() + "] ");
          u.um(this.fileName);
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(50677);
        }
        else if (paramArrayOfByte.ptF != paramq.ptF)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneDownloadVideo", "ERR: onGYNetEnd respMsgId:" + paramArrayOfByte.ptF + " reqMsgId:" + paramq.ptF + " [" + this.fileName + "," + this.fVj.cKK + "," + this.fVj.alt() + "," + this.fVj.getUser() + "] ");
          u.um(this.fileName);
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(50677);
        }
        else
        {
          com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.NetSceneDownloadVideo", "onGYNetEnd respBuf:" + paramArrayOfByte.ptz.getILen() + " reqStartPos:" + paramq.ptx + " totallen:" + paramq.ptw + " [" + this.fileName + "," + this.fVj.cKK + "," + this.fVj.alt() + "," + this.fVj.getUser() + "] ");
          o.all();
          int i = t.a(t.uh(this.fileName), paramq.ptx, paramArrayOfByte.ptz.getBuffer().toByteArray());
          if (i < 0)
          {
            com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneDownloadVideo", "ERR: onGYNetEnd WRITEFILE RET:" + i + " [" + this.fileName + "," + this.fVj.cKK + "," + this.fVj.alt() + "," + this.fVj.getUser() + "] ");
            u.um(this.fileName);
            this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
            AppMethodBeat.o(50677);
          }
          else if (i > this.fVj.frO)
          {
            com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneDownloadVideo", "ERR: onGYNetEnd WRITEFILE newOffset:" + i + " totalLen:" + this.fVj.frO + " [" + this.fileName + "," + this.fVj.cKK + "," + this.fVj.alt() + "," + this.fVj.getUser() + "] ");
            u.um(this.fileName);
            this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
            AppMethodBeat.o(50677);
          }
          else
          {
            paramq = this.fileName;
            paramArrayOfByte = u.ut(paramq);
            if (paramArrayOfByte == null)
            {
              com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.Mq() + " getinfo failed: " + paramq);
              paramInt1 = 0 - com.tencent.mm.compatible.util.g.getLine();
            }
            while (true)
            {
              if (paramInt1 >= 0)
                break label2514;
              com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneDownloadVideo", "ERR: onGYNetEnd updateAfterRecv Ret:" + paramInt1 + " newOffset :" + i + " [" + this.fileName + "," + this.fVj.cKK + "," + this.fVj.alt() + "," + this.fVj.getUser() + "] ");
              this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
              AppMethodBeat.o(50677);
              break;
              paramArrayOfByte.fWY = i;
              paramArrayOfByte.fXb = bo.anT();
              paramArrayOfByte.bJt = 1040;
              int j = 0;
              paramInt1 = j;
              if (paramArrayOfByte.frO > 0)
              {
                paramInt1 = j;
                if (i >= paramArrayOfByte.frO)
                {
                  u.e(paramArrayOfByte);
                  paramArrayOfByte.status = 199;
                  paramArrayOfByte.bJt |= 256;
                  com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.VideoLogic", "END!!!  updateRecv  file:" + paramq + " newsize:" + i + " total:" + paramArrayOfByte.frO + " status:" + paramArrayOfByte.status + " netTimes:" + paramArrayOfByte.fXf);
                  paramInt1 = 1;
                }
              }
              com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.VideoLogic", "updateRecv " + com.tencent.mm.compatible.util.g.Mq() + " file:" + paramq + " newsize:" + i + " total:" + paramArrayOfByte.frO + " status:" + paramArrayOfByte.status);
              if (!u.f(paramArrayOfByte))
                paramInt1 = 0 - com.tencent.mm.compatible.util.g.getLine();
            }
            label2514: if (paramInt1 == 1)
            {
              com.tencent.mm.plugin.report.service.h.pYm.e(10420, new Object[] { Integer.valueOf(0), Integer.valueOf(2), Long.valueOf(this.startTime), Long.valueOf(bo.anU()), Integer.valueOf(c.bW(ah.getContext())), Integer.valueOf(this.fVl), Integer.valueOf(this.frO - this.startOffset) });
              a.a(this.fVj, 1);
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneDownloadVideo", "!!!FIN [" + this.fileName + "," + this.fVj.cKK + "," + this.fVj.alt() + "," + this.fVj.getUser() + "]");
              this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
              AppMethodBeat.o(50677);
            }
            else if (this.fVm)
            {
              this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
              AppMethodBeat.o(50677);
            }
            else
            {
              this.frk.ae(0L, 0L);
              AppMethodBeat.o(50677);
            }
          }
        }
      }
    }
  }

  public final void a(m.a parama)
  {
    AppMethodBeat.i(50676);
    com.tencent.mm.plugin.report.service.h.pYm.a(111L, 211L, 1L, false);
    u.um(this.fileName);
    AppMethodBeat.o(50676);
  }

  public final boolean acJ()
  {
    AppMethodBeat.i(50675);
    boolean bool = super.acJ();
    if (bool)
      com.tencent.mm.plugin.report.service.h.pYm.a(111L, 210L, 1L, false);
    AppMethodBeat.o(50675);
    return bool;
  }

  public final int acn()
  {
    return 2500;
  }

  final String alb()
  {
    AppMethodBeat.i(50678);
    String str = this.fileName + "_" + hashCode();
    AppMethodBeat.o(50678);
    return str;
  }

  public final m.b b(q paramq)
  {
    AppMethodBeat.i(50674);
    paramq = (xl)((com.tencent.mm.ai.b)paramq).fsG.fsP;
    if ((paramq.ptF <= 0L) || (paramq.ptx < 0) || (paramq.ptw <= 0) || (paramq.ptw <= paramq.ptx))
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneDownloadVideo", "ERR: SECURITY CHECK FAILED [" + this.fileName + "," + this.fVj.cKK + "," + this.fVj.alt() + "," + this.fVj.getUser() + "] ");
      u.um(this.fileName);
      paramq = m.b.ftv;
      AppMethodBeat.o(50674);
    }
    while (true)
    {
      return paramq;
      paramq = m.b.ftu;
      AppMethodBeat.o(50674);
    }
  }

  public final void cancel()
  {
    AppMethodBeat.i(50668);
    EH();
    super.cancel();
    AppMethodBeat.o(50668);
  }

  public final int getType()
  {
    return 150;
  }

  final void mo(int paramInt)
  {
    AppMethodBeat.i(50672);
    Object localObject;
    if (this.fVn)
    {
      localObject = new StringBuilder();
      o.all();
      localObject = new com.tencent.mm.vfs.b(t.uh(this.fileName) + ".tmp");
      o.all();
    }
    for (boolean bool = ((com.tencent.mm.vfs.b)localObject).o(new com.tencent.mm.vfs.b(t.uh(this.fileName))); ; bool = true)
    {
      com.tencent.mm.kernel.g.RS().aa(new d.2(this, bool, paramInt));
      AppMethodBeat.o(50672);
      return;
      localObject = new StringBuilder();
      o.all();
      com.tencent.mm.vfs.e.deleteFile(t.uh(this.fileName) + ".tmp");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.d
 * JD-Core Version:    0.6.2
 */
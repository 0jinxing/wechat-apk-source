package com.tencent.mm.at;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.i.d;
import com.tencent.mm.i.g.a;
import com.tencent.mm.l.a.a;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bh;
import com.tencent.mm.model.t;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.clk;
import com.tencent.mm.protocal.protobuf.cll;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.bi;
import java.util.Map;
import junit.framework.Assert;

public final class l extends m
  implements k
{
  public static boolean DEBUG = true;
  private static long fFD;
  private String TAG;
  private float cEB;
  public String cMr;
  public bi csG;
  private long eFm;
  private int eFn;
  private e eFo;
  private boolean eFu;
  private final com.tencent.mm.ai.b ehh;
  private com.tencent.mm.ai.f ehi;
  private int fDC;
  private long fDH;
  private final com.tencent.mm.ai.g fEW;
  public long fEX;
  private com.tencent.mm.modelstat.h fEZ;
  private String fFA;
  private String fFB;
  public String fFC;
  private String fFa;
  private int fFb;
  private int fFe;
  private g.a fFk;
  private String fFq;
  private String fFr;
  private boolean fFs;
  private e fFt;
  private int fFu;
  l.b fFv;
  private String fFw;
  public String fFx;
  public boolean fFy;
  private float fFz;
  private int scene;
  private int startOffset;
  private long startTime;

  public l(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(78337);
    this.TAG = "MicroMsg.NetSceneUploadMsgImg";
    this.fFq = "";
    this.fFr = "";
    this.fFs = true;
    this.fFu = 16384;
    this.fDC = 0;
    this.csG = null;
    this.fEZ = null;
    this.fFa = "";
    this.startTime = 0L;
    this.startOffset = -1;
    this.fFb = 0;
    this.fFv = new l.b(this, null);
    this.fFk = new l.4(this);
    this.eFu = false;
    com.tencent.mm.sdk.platformtools.ab.i(this.TAG, "dkupimg init id:%d cmptype:%d  [%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), bo.dpG() });
    this.fEX = paramInt1;
    this.eFm = paramInt1;
    this.fDC = paramInt2;
    Object localObject1 = new b.a();
    ((b.a)localObject1).fsJ = new clk();
    ((b.a)localObject1).fsK = new cll();
    ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/uploadmsgimg";
    ((b.a)localObject1).fsI = 110;
    ((b.a)localObject1).fsL = 9;
    ((b.a)localObject1).fsM = 1000000009;
    this.ehh = ((b.a)localObject1).acD();
    this.fEW = null;
    com.tencent.mm.sdk.platformtools.ab.d(this.TAG, "FROM B SERVICE:" + this.fEX);
    if (!i.lA((int)this.fEX))
    {
      this.fEX = -1L;
      AppMethodBeat.o(78337);
      return;
    }
    localObject1 = o.ahl().b(Long.valueOf(this.fEX));
    this.fDH = ((e)localObject1).fDH;
    if (paramInt2 == 1)
    {
      this.eFm = ((e)localObject1).fDJ;
      localObject1 = o.ahl().b(Long.valueOf(this.eFm));
    }
    while (true)
    {
      Object localObject2 = o.ahl().lz((int)((e)localObject1).fDy);
      if (localObject2 != null)
        this.fDH = ((e)localObject2).fDH;
      this.csG = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().jf(this.fDH);
      if ((this.csG != null) && (this.csG.field_msgId != this.fDH))
      {
        com.tencent.mm.sdk.platformtools.ab.w(this.TAG, "init get msg by id failed:%d", new Object[] { Long.valueOf(this.fDH) });
        com.tencent.mm.plugin.report.service.h.pYm.a(111L, 206L, 1L, false);
        this.csG = null;
        AppMethodBeat.o(78337);
        break;
      }
      if (this.csG != null)
      {
        localObject2 = (clk)this.ehh.fsG.fsP;
        ((clk)localObject2).vEB = new bts().alV(com.tencent.mm.model.r.Yz());
        ((clk)localObject2).vEC = new bts().alV(this.csG.field_talker);
        ((clk)localObject2).ptx = ((e)localObject1).offset;
        ((clk)localObject2).ptw = ((e)localObject1).frO;
        ((clk)localObject2).nao = this.csG.getType();
        ((clk)localObject2).wqw = paramInt2;
        if (!com.tencent.mm.network.ab.ch(ah.getContext()))
          break label806;
      }
      label806: for (paramInt1 = 1; ; paramInt1 = 2)
      {
        ((clk)localObject2).vZF = paramInt1;
        ((clk)localObject2).xbN = ((e)localObject1).cvd;
        ((clk)localObject2).vRz = ((e)localObject1).fDD;
        ((clk)localObject2).vRz = ((e)localObject1).fDD;
        ((clk)localObject2).xjh = this.csG.dJx;
        ((clk)localObject2).xji = this.csG.dJw;
        a locala = f.sg(this.csG.field_content);
        if ((locala != null) && (!bo.isNullOrNil(locala.appId)))
        {
          this.eFn = ((e)localObject1).cvd;
          ((clk)localObject2).fKh = locala.appId;
          ((clk)localObject2).vCs = locala.mediaTagName;
          ((clk)localObject2).vCu = locala.messageAction;
          ((clk)localObject2).vCt = locala.messageExt;
          this.fFw = this.csG.field_content;
        }
        com.tencent.mm.sdk.platformtools.ab.i(this.TAG, "LINE425 thumb.width:%d,thumb.height:%d", new Object[] { Integer.valueOf(((clk)localObject2).xjh), Integer.valueOf(((clk)localObject2).xji) });
        com.tencent.mm.sdk.platformtools.ab.d(this.TAG, "dkimgsource: %d, forwardtype:%d", new Object[] { Integer.valueOf(((e)localObject1).cvd), Integer.valueOf(((clk)localObject2).vRz) });
        if (((e)localObject1).offset == 0)
          this.fEZ = new com.tencent.mm.modelstat.h(110, true, ((e)localObject1).frO);
        AppMethodBeat.o(78337);
        break;
      }
    }
  }

  public l(int paramInt1, int paramInt2, byte paramByte)
  {
    AppMethodBeat.i(78338);
    this.TAG = "MicroMsg.NetSceneUploadMsgImg";
    this.fFq = "";
    this.fFr = "";
    this.fFs = true;
    this.fFu = 16384;
    this.fDC = 0;
    this.csG = null;
    this.fEZ = null;
    this.fFa = "";
    this.startTime = 0L;
    this.startOffset = -1;
    this.fFb = 0;
    this.fFv = new l.b(this, null);
    this.fFk = new l.4(this);
    this.eFu = false;
    com.tencent.mm.sdk.platformtools.ab.i(this.TAG, "dkupimg init id:%d cmptype:%d pro:%s  [%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), null, bo.dpG() });
    this.fEX = paramInt1;
    this.eFm = paramInt1;
    this.fDC = paramInt2;
    Object localObject1 = new b.a();
    ((b.a)localObject1).fsJ = new clk();
    ((b.a)localObject1).fsK = new cll();
    ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/uploadmsgimg";
    ((b.a)localObject1).fsI = 110;
    ((b.a)localObject1).fsL = 9;
    ((b.a)localObject1).fsM = 1000000009;
    this.ehh = ((b.a)localObject1).acD();
    this.fEW = null;
    com.tencent.mm.sdk.platformtools.ab.d(this.TAG, "FROM C SERVICE:" + this.fEX);
    if (!i.lA((int)this.fEX))
    {
      this.fEX = -1L;
      AppMethodBeat.o(78338);
      return;
    }
    localObject1 = o.ahl().b(Long.valueOf(this.fEX));
    this.fDH = ((e)localObject1).fDH;
    ((e)localObject1).setStatus(0);
    ((e)localObject1).eI(0L);
    ((e)localObject1).setOffset(0);
    o.ahl().a((int)this.eFm, (e)localObject1);
    if (paramInt2 == 1)
    {
      this.eFm = ((e)localObject1).fDJ;
      localObject1 = o.ahl().b(Long.valueOf(this.eFm));
    }
    while (true)
    {
      this.csG = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().jf(this.fDH);
      Object localObject2;
      if (this.csG != null)
      {
        this.csG.setStatus(1);
        localObject2 = ((e)localObject1).fDB;
        if ((localObject2 == null) || (!((String)localObject2).startsWith("THUMBNAIL_DIRPATH://")))
          break label736;
        this.csG.jv((String)localObject2);
        label447: ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().a(this.fDH, this.csG);
        localObject2 = (clk)this.ehh.fsG.fsP;
        ((clk)localObject2).vEB = new bts().alV(com.tencent.mm.model.r.Yz());
        ((clk)localObject2).vEC = new bts().alV(this.csG.field_talker);
        ((clk)localObject2).ptx = ((e)localObject1).offset;
        ((clk)localObject2).ptw = ((e)localObject1).frO;
        ((clk)localObject2).nao = this.csG.getType();
        ((clk)localObject2).wqw = paramInt2;
        if (!com.tencent.mm.network.ab.ch(ah.getContext()))
          break label767;
      }
      label736: label767: for (paramInt1 = 1; ; paramInt1 = 2)
      {
        ((clk)localObject2).vZF = paramInt1;
        ((clk)localObject2).xbN = ((e)localObject1).cvd;
        ((clk)localObject2).vRz = ((e)localObject1).fDD;
        ((clk)localObject2).xjh = this.csG.dJx;
        ((clk)localObject2).xji = this.csG.dJw;
        com.tencent.mm.sdk.platformtools.ab.i(this.TAG, "LINE492 thumb.width:%d,thumb.height:%d", new Object[] { Integer.valueOf(((clk)localObject2).xjh), Integer.valueOf(((clk)localObject2).xji) });
        com.tencent.mm.sdk.platformtools.ab.d(this.TAG, "dkimgsource: %d, forwardtype:%d", new Object[] { Integer.valueOf(((e)localObject1).cvd), Integer.valueOf(((clk)localObject2).vRz) });
        if (((e)localObject1).offset == 0)
          this.fEZ = new com.tencent.mm.modelstat.h(110, true, ((e)localObject1).frO);
        AppMethodBeat.o(78338);
        break;
        this.csG.jv("THUMBNAIL://" + ((e)localObject1).fDy);
        break label447;
      }
    }
  }

  public l(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2, com.tencent.mm.ai.g paramg, int paramInt3, String paramString4, String paramString5, boolean paramBoolean, int paramInt4)
  {
    this(paramInt1, paramString1, paramString2, paramString3, paramInt2, paramg, paramInt3, paramString4, paramString5, paramBoolean, paramInt4, 0, -1000.0F, -1000.0F, -1L);
  }

  public l(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2, com.tencent.mm.ai.g paramg, int paramInt3, String paramString4, String paramString5, boolean paramBoolean, int paramInt4, int paramInt5, float paramFloat1, float paramFloat2, long paramLong)
  {
    AppMethodBeat.i(78334);
    this.TAG = "MicroMsg.NetSceneUploadMsgImg";
    this.fFq = "";
    this.fFr = "";
    this.fFs = true;
    this.fFu = 16384;
    this.fDC = 0;
    this.csG = null;
    this.fEZ = null;
    this.fFa = "";
    this.startTime = 0L;
    this.startOffset = -1;
    this.fFb = 0;
    this.fFv = new l.b(this, null);
    this.fFk = new l.4(this);
    this.eFu = false;
    com.tencent.mm.sdk.platformtools.ab.i(this.TAG, "dkupimg init uploadsrc:%d from:%s to:%s ori:%s cmptype:%d prog:%s rotate:%d cdn:%s thumb:%s chatt:%b , res:%d run:%b [%s], scene: %d, longtitude: %f, latitude: %f", new Object[] { Integer.valueOf(paramInt1), paramString1, paramString2, paramString3, Integer.valueOf(paramInt2), paramg, Integer.valueOf(paramInt3), paramString4, paramString5, Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt4), Boolean.TRUE, bo.dpG(), Integer.valueOf(paramInt5), Float.valueOf(paramFloat1), Float.valueOf(paramFloat2) });
    this.fFy = paramBoolean;
    this.fFe = paramInt4;
    this.fEW = paramg;
    this.fDC = paramInt2;
    this.scene = paramInt5;
    this.cEB = paramFloat2;
    this.fFz = paramFloat1;
    this.eFn = paramInt1;
    this.fFC = paramString3;
    PString localPString = new PString();
    PInt localPInt1 = new PInt();
    PInt localPInt2 = new PInt();
    this.fFw = paramString4;
    localPString.value = paramString5;
    paramString5 = null;
    if (paramLong > 0L)
    {
      paramString5 = o.ahl().b(Long.valueOf(paramLong));
      paramString5 = o.ahl().q(paramString5.fDE, "", "");
    }
    this.fEX = o.ahl().a(paramString3, paramString5, paramInt2, paramInt1, paramInt3, localPString, localPInt1, localPInt2, "", "", -1L, null, null, null);
    this.eFm = this.fEX;
    com.tencent.mm.sdk.platformtools.ab.i(this.TAG, "FROM A UI :" + paramString2 + " " + this.fEX);
    if ((this.fEX < 0L) || (!i.lA((int)this.fEX)))
    {
      com.tencent.mm.sdk.platformtools.ab.e(this.TAG, "insert to img storage failed id:" + this.fEX);
      this.fDH = -1L;
      this.ehh = null;
      AppMethodBeat.o(78334);
      return;
    }
    if (this.fEX >= 0L)
    {
      paramBoolean = true;
      label525: Assert.assertTrue(paramBoolean);
      paramString3 = new b.a();
      paramString3.fsJ = new clk();
      paramString3.fsK = new cll();
      paramString3.uri = "/cgi-bin/micromsg-bin/uploadmsgimg";
      paramString3.fsI = 110;
      paramString3.fsL = 9;
      paramString3.fsM = 1000000009;
      this.ehh = paramString3.acD();
      this.cMr = paramString2;
      this.csG = new bi();
      this.csG.setType(t.nL(paramString2));
      this.csG.ju(paramString2);
      this.csG.hO(1);
      this.csG.setStatus(1);
      this.csG.jv(localPString.value);
      this.csG.hZ(localPInt1.value);
      this.csG.ia(localPInt2.value);
      this.csG.eJ(bf.oC(this.csG.field_talker));
      this.csG.setContent(paramString4);
      a.a.KG().g(this.csG);
      this.fDH = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().Z(this.csG);
      if (this.fDH < 0L)
        break label1332;
      paramBoolean = true;
      label763: Assert.assertTrue(paramBoolean);
      com.tencent.mm.sdk.platformtools.ab.i(this.TAG, "NetSceneUploadMsgImg: local msgId = " + this.fDH);
      paramString3 = agZ();
      paramString3.fG((int)this.fDH);
      o.ahl().a(Long.valueOf(this.fEX), paramString3);
      if (paramInt2 != 1)
        break label1349;
      this.eFm = paramString3.fDJ;
      paramString3 = agY();
    }
    label1028: label1332: label1344: label1349: 
    while (true)
    {
      paramString3.lt(com.tencent.mm.a.e.cs(o.ahl().q(paramString3.fDz, "", "")));
      o.ahl().a(Long.valueOf(this.eFm), paramString3);
      com.tencent.mm.sdk.platformtools.ab.i(this.TAG, "NetSceneUploadMsgImg: local imgId = " + this.eFm + " img len = " + paramString3.frO);
      paramString5 = (clk)this.ehh.fsG.fsP;
      paramString5.vEB = new bts().alV(paramString1);
      paramString5.vEC = new bts().alV(paramString2);
      paramString5.ptx = paramString3.offset;
      paramString5.ptw = paramString3.frO;
      paramString5.nao = this.csG.getType();
      paramString5.wqw = paramInt2;
      if (com.tencent.mm.network.ab.ch(ah.getContext()))
      {
        paramInt3 = 1;
        paramString5.vZF = paramInt3;
        paramString5.xbN = paramString3.cvd;
        paramString5.vRz = paramString3.fDD;
        paramString5.xjh = localPInt2.value;
        paramString5.xji = localPInt1.value;
        paramString1 = f.sg(paramString4);
        if ((paramString1 != null) && (!bo.isNullOrNil(paramString1.appId)))
        {
          paramString5.fKh = paramString1.appId;
          paramString5.vCs = paramString1.mediaTagName;
          paramString5.vCu = paramString1.messageAction;
          paramString5.vCt = paramString1.messageExt;
        }
        com.tencent.mm.sdk.platformtools.ab.i(this.TAG, "LINE237 thumb.width:%d,thumb.height:%d", new Object[] { Integer.valueOf(paramString5.xjh), Integer.valueOf(paramString5.xji) });
        if (paramString5.vRz == 0)
          if (paramInt1 != 4)
            break label1344;
      }
      for (paramInt1 = 2; ; paramInt1 = 1)
      {
        paramString5.vRz = paramInt1;
        com.tencent.mm.sdk.platformtools.ab.d(this.TAG, "dkimgsource: %d, forwardtype:%d", new Object[] { Integer.valueOf(paramString3.cvd), Integer.valueOf(paramString5.vRz) });
        if (paramString3.offset == 0)
          this.fEZ = new com.tencent.mm.modelstat.h(110, true, paramString3.frO);
        paramLong = System.currentTimeMillis();
        lD(paramInt2);
        com.tencent.mm.sdk.platformtools.ab.d(this.TAG, "hy: create HDThumb using %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - paramLong) });
        if (paramg != null)
          al.d(new l.2(this, paramg, paramString3.offset, paramString3.frO));
        AppMethodBeat.o(78334);
        break;
        paramBoolean = false;
        break label525;
        paramBoolean = false;
        break label763;
        paramInt3 = 2;
        break label1028;
      }
    }
  }

  public l(long paramLong, String paramString1, String paramString2, String paramString3, int paramInt1, com.tencent.mm.ai.g paramg, int paramInt2, String paramString4, String paramString5)
  {
    AppMethodBeat.i(78335);
    this.TAG = "MicroMsg.NetSceneUploadMsgImg";
    this.fFq = "";
    this.fFr = "";
    this.fFs = true;
    this.fFu = 16384;
    this.fDC = 0;
    this.csG = null;
    this.fEZ = null;
    this.fFa = "";
    this.startTime = 0L;
    this.startOffset = -1;
    this.fFb = 0;
    this.fFv = new l.b(this, null);
    this.fFk = new l.4(this);
    this.eFu = false;
    com.tencent.mm.sdk.platformtools.ab.i(this.TAG, "dkupimg init id:%d uploadsrc:%d from:%s to:%s ori:%s cmptype:%d prog:%s rotate:%d cdn:%s thumb:%s chatt:%b , res:%d run:%b [%s]", new Object[] { Long.valueOf(paramLong), Integer.valueOf(3), paramString1, paramString2, paramString3, Integer.valueOf(paramInt1), paramg, Integer.valueOf(paramInt2), paramString4, paramString5, Boolean.TRUE, Integer.valueOf(2130838182), Boolean.TRUE, bo.dpG() });
    this.fFy = true;
    this.fFe = 2130838182;
    this.fEW = paramg;
    this.fDC = paramInt1;
    this.eFn = 3;
    this.fFC = paramString3;
    PInt localPInt = new PInt();
    paramString5 = new PInt();
    this.fFw = paramString4;
    this.fEX = paramLong;
    this.eFm = this.fEX;
    paramString3 = agZ();
    this.csG = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().jf(paramString3.fDH);
    this.fDH = this.csG.field_msgId;
    paramString5.value = this.csG.dJx;
    localPInt.value = this.csG.dJw;
    if (paramInt1 == 1)
    {
      this.eFm = paramString3.fDJ;
      this.eFo = null;
      paramString3 = agY();
    }
    while (true)
    {
      if ((this.csG.field_talker != null) && (!this.csG.field_talker.equals(paramString2)))
      {
        com.tencent.mm.sdk.platformtools.ab.e(this.TAG, "fatal!! Send user mis-match, want:%s, fact:%s", new Object[] { paramString2, this.csG.field_talker });
        com.tencent.mm.plugin.report.service.h.pYm.a(594L, 4L, 1L, true);
      }
      for (paramString4 = this.csG.field_talker; ; paramString4 = paramString2)
      {
        com.tencent.mm.sdk.platformtools.ab.i(this.TAG, "NetSceneUploadMsgImg: local msgId = " + this.csG.field_msgId);
        com.tencent.mm.sdk.platformtools.ab.d(this.TAG, "FROM A UI :" + paramString2 + "   msg:" + paramString4 + this.fEX);
        if ((this.fEX < 0L) || (!i.lA((int)this.fEX)))
        {
          com.tencent.mm.sdk.platformtools.ab.e(this.TAG, "insert to img storage failed id:" + this.fEX);
          this.fDH = -1L;
          this.ehh = null;
          AppMethodBeat.o(78335);
          return;
        }
        boolean bool;
        if (this.fEX >= 0L)
        {
          bool = true;
          label610: Assert.assertTrue(bool);
          paramString2 = new b.a();
          paramString2.fsJ = new clk();
          paramString2.fsK = new cll();
          paramString2.uri = "/cgi-bin/micromsg-bin/uploadmsgimg";
          paramString2.fsI = 110;
          paramString2.fsL = 9;
          paramString2.fsM = 1000000009;
          this.ehh = paramString2.acD();
          com.tencent.mm.sdk.platformtools.ab.i(this.TAG, "NetSceneUploadMsgImg: local imgId = " + this.eFm + " img len = " + paramString3.frO);
          paramString2 = (clk)this.ehh.fsG.fsP;
          paramString2.vEB = new bts().alV(paramString1);
          paramString2.vEC = new bts().alV(paramString4);
          paramString2.ptx = paramString3.offset;
          paramString2.ptw = paramString3.frO;
          paramString2.nao = this.csG.getType();
          paramString2.wqw = paramInt1;
          if (!com.tencent.mm.network.ab.ch(ah.getContext()))
            break label1024;
        }
        label1024: for (paramInt1 = 1; ; paramInt1 = 2)
        {
          paramString2.vZF = paramInt1;
          paramString2.xbN = paramString3.cvd;
          paramString2.vRz = paramString3.fDD;
          paramString2.xjh = paramString5.value;
          paramString2.xji = localPInt.value;
          com.tencent.mm.sdk.platformtools.ab.i(this.TAG, "LINE350 thumb.width:%d,thumb.height:%d", new Object[] { Integer.valueOf(paramString2.xjh), Integer.valueOf(paramString2.xji) });
          if (paramString2.vRz == 0)
            paramString2.vRz = 1;
          com.tencent.mm.sdk.platformtools.ab.d(this.TAG, "dkimgsource: %d, forwardtype:%d", new Object[] { Integer.valueOf(paramString3.cvd), Integer.valueOf(paramString2.vRz) });
          if (paramString3.offset == 0)
            this.fEZ = new com.tencent.mm.modelstat.h(110, true, paramString3.frO);
          al.d(new l.3(this, paramg, paramString3.offset, paramString3.frO));
          AppMethodBeat.o(78335);
          break;
          bool = false;
          break label610;
        }
      }
    }
  }

  public l(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    this(paramString1, paramString2, paramString3, paramInt, "", "");
  }

  public l(String paramString1, String paramString2, String paramString3, int paramInt1, com.tencent.mm.ai.g paramg, int paramInt2, l.a parama)
  {
    this(3, paramString1, paramString2, paramString3, paramInt1, paramg, paramInt2, "", "", true, 2130838182);
    AppMethodBeat.i(78333);
    this.fFv = new l.b(this, parama);
    AppMethodBeat.o(78333);
  }

  private l(String paramString1, String paramString2, String paramString3, int paramInt, String paramString4, String paramString5)
  {
    this(4, paramString1, paramString2, paramString3, paramInt, null, 0, paramString4, paramString5, false, -1);
  }

  private boolean a(e parame, int paramInt)
  {
    AppMethodBeat.i(78339);
    boolean bool1;
    if (t.nJ(this.csG.field_talker))
    {
      com.tencent.mm.sdk.platformtools.ab.w(this.TAG, "cdntra not use cdn user:%s", new Object[] { this.csG.field_talker });
      bool1 = false;
      AppMethodBeat.o(78339);
    }
    while (true)
    {
      return bool1;
      com.tencent.mm.al.f.afx();
      Object localObject;
      if ((!com.tencent.mm.al.b.lg(1)) && (bo.isNullOrNil(parame.fDK)))
      {
        localObject = this.TAG;
        com.tencent.mm.al.f.afx();
        com.tencent.mm.sdk.platformtools.ab.w((String)localObject, "cdntra not use cdn flag:%b getCdnInfo:%s", new Object[] { Boolean.valueOf(com.tencent.mm.al.b.lg(1)), parame.fDK });
        bool1 = false;
        AppMethodBeat.o(78339);
      }
      else if (bo.isNullOrNil(this.fFa))
      {
        com.tencent.mm.sdk.platformtools.ab.w(this.TAG, "cdntra genClientId failed not use cdn imgLocalId:%d", new Object[] { Long.valueOf(this.eFm) });
        bool1 = false;
        AppMethodBeat.o(78339);
      }
      else
      {
        String str1 = o.ahl().q(parame.fDz, "", "");
        String str2 = o.ahl().q(parame.fDA, "", "");
        String str3 = o.ahl().q(parame.fDB, "", "");
        localObject = o.ahl().q(parame.fDE, "", "");
        com.tencent.mm.i.g localg = new com.tencent.mm.i.g();
        localg.egl = this.fFk;
        localg.field_mediaId = this.fFa;
        localg.field_fileType = this.fFb;
        localg.field_talker = this.csG.field_talker;
        int i;
        if (t.kH(this.csG.field_talker))
        {
          i = 1;
          label297: localg.field_chattype = i;
          localg.field_priority = com.tencent.mm.i.a.efC;
          localg.field_needStorage = false;
          localg.field_isStreamMedia = false;
          localg.field_sendmsg_viacdn = true;
          localg.field_enable_hitcheck = this.fFs;
          localg.field_force_aeskeycdn = false;
          localg.field_trysafecdn = true;
          if (paramInt != -5103237)
            break label884;
          this.fFa = com.tencent.mm.al.c.a("upimgjpg", this.csG.field_createTime, this.csG.field_talker, this.csG.field_msgId + "_" + this.eFm + "_" + this.fDC);
          localg.field_fullpath = str1;
          localg.field_thumbpath = str3;
          localg.field_midimgpath = str2;
          localg.lastError = paramInt;
          localg.field_mediaId = this.fFa;
          if ((localg.field_fileType == com.tencent.mm.i.a.MediaType_FULLSIZEIMAGE) && (bo.isNullOrNil(localg.field_midimgpath)))
          {
            com.tencent.mm.al.f.afx();
            if (com.tencent.mm.al.b.lg(256))
            {
              com.tencent.mm.sdk.platformtools.ab.w(this.TAG, "summersafecdn send fullsizeimage but midimgpath is null set field_force_aeskeycdn true");
              localg.field_force_aeskeycdn = true;
              localg.field_trysafecdn = false;
            }
          }
          localObject = br.z(this.fFw, "msg");
          if (localObject == null)
            break label1206;
          if (this.fDC == 1)
            break label1157;
          localg.field_fileId = ((String)((Map)localObject).get(".msg.img.$cdnmidimgurl"));
          localg.field_midFileLength = bo.getInt((String)((Map)localObject).get(".msg.img.$length"), 0);
          localg.field_totalLen = 0;
          label592: localg.field_aesKey = ((String)((Map)localObject).get(".msg.img.$aeskey"));
        }
        while (true)
        {
          if (bo.isNullOrNil(localg.field_aesKey))
          {
            com.tencent.mm.al.f.afy();
            localg.field_aesKey = com.tencent.mm.al.a.afp();
            com.tencent.mm.sdk.platformtools.ab.i(this.TAG, "summersafecdn cdntra oldAeskey is null and gen new[%s]", new Object[] { localg.field_aesKey });
          }
          com.tencent.mm.sdk.platformtools.ab.i(this.TAG, "dkupimg src:%d fileid:%s", new Object[] { Integer.valueOf(parame.cvd), localg.field_fileId });
          this.fFq = localg.field_fileId;
          this.fFr = localg.field_aesKey;
          com.tencent.mm.sdk.platformtools.ab.d(this.TAG, "summersafecdn checkUseCdn field_enable_hitcheck[%b], field_fileType[%d], field_midimgpath[%s], field_fullpath[%s], aeskey[%s], fileid[%s], enable_hitcheck[%b], aeskeycdn[%b], trysafecdn[%b]", new Object[] { Boolean.valueOf(localg.field_enable_hitcheck), Integer.valueOf(localg.field_fileType), localg.field_midimgpath, localg.field_fullpath, localg.field_aesKey, localg.field_fileId, Boolean.valueOf(localg.field_enable_hitcheck), Boolean.valueOf(localg.field_force_aeskeycdn), Boolean.valueOf(localg.field_trysafecdn) });
          this.fFB = null;
          if (com.tencent.mm.al.f.afx().e(localg))
            break label1230;
          com.tencent.mm.plugin.report.service.h.pYm.a(111L, 205L, 1L, false);
          com.tencent.mm.sdk.platformtools.ab.e(this.TAG, "cdntra addSendTask failed. clientid:%s", new Object[] { this.fFa });
          this.fFa = "";
          bool1 = false;
          AppMethodBeat.o(78339);
          break;
          i = 0;
          break label297;
          label884: boolean bool2 = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.emoji.b.c.class)).biZ();
          String str4;
          boolean bool3;
          if ((this.eFn == 4) && (com.tencent.mm.vfs.e.ct((String)localObject)))
          {
            str4 = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.emoji.b.c.class)).IP(str2);
            bool3 = aL(str2, str4);
            if (!bool2)
              break label1138;
            label949: localg.field_fullpath = ((String)localObject);
            localg.field_thumbpath = str3;
            if (!bool3)
              break label1145;
            localObject = str4;
            label972: localg.field_midimgpath = ((String)localObject);
            localObject = this.TAG;
            if (localg.field_fileType != com.tencent.mm.i.a.MediaType_FULLSIZEIMAGE)
              break label1152;
          }
          label1152: for (bool1 = true; ; bool1 = false)
          {
            com.tencent.mm.sdk.platformtools.ab.d((String)localObject, "hevc upload full size %b, use hevc %b, %b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
            break;
            str4 = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.emoji.b.c.class)).IP(str1);
            bool1 = com.tencent.mm.sdk.platformtools.r.amq(str1).equals(".png");
            if ((this.fDC == 0) && (!bool1) && (aL(str1, str4)));
            for (bool1 = true; ; bool1 = false)
            {
              bool2 = bool1;
              localObject = str4;
              if (!bool1)
                break;
              parame.sf(((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.emoji.b.c.class)).IP(parame.fDz));
              bool2 = bool1;
              localObject = str4;
              break;
            }
            label1138: localObject = str1;
            break label949;
            label1145: localObject = str2;
            break label972;
          }
          label1157: localg.field_fileId = ((String)((Map)localObject).get(".msg.img.$cdnbigimgurl"));
          localg.field_midFileLength = bo.getInt((String)((Map)localObject).get(".msg.img.$length"), 0);
          localg.field_totalLen = 0;
          break label592;
          label1206: com.tencent.mm.sdk.platformtools.ab.i(this.TAG, "parse cdnInfo failed. [%s]", new Object[] { parame.fDK });
        }
        label1230: if (bo.nullAsNil(parame.fDK).length() <= 0)
        {
          parame.se("CDNINFO_SEND");
          parame.bJt = 4096;
        }
        bool1 = true;
        AppMethodBeat.o(78339);
      }
    }
  }

  private boolean a(e parame, int paramInt1, long paramLong, int paramInt2, d paramd)
  {
    AppMethodBeat.i(78345);
    com.tencent.mm.sdk.platformtools.ab.d(this.TAG, "cdntra clientid:%s start:%d svrid:%d createtime:%d", new Object[] { this.fFa, Integer.valueOf(paramInt1), Long.valueOf(paramLong), Integer.valueOf(paramInt2) });
    com.tencent.mm.sdk.platformtools.ab.i(this.TAG, "dkmsgid  set svrmsgid %d -> %d  oriImgLocalId %s imgLocalId %s", new Object[] { Long.valueOf(paramLong), Integer.valueOf(ae.giA), Long.valueOf(this.fEX), Long.valueOf(this.eFm) });
    long l = paramLong;
    if (10007 == ae.giz)
    {
      l = paramLong;
      if (ae.giA != 0)
      {
        l = ae.giA;
        ae.giA = 0;
      }
    }
    c(parame.fDy, paramInt1, parame.frO);
    parame.setOffset(paramInt1);
    parame.eI(l);
    if ((f.b(parame)) && (this.fEX != this.eFm))
    {
      e locale = o.ahl().b(Long.valueOf(this.fEX));
      locale.eI(l);
      locale.lt(parame.frO);
      locale.setOffset(parame.frO);
      o.ahl().a(Long.valueOf(this.fEX), locale);
    }
    boolean bool;
    if (f.b(parame))
    {
      if (bo.isNullOrNil(this.fFa))
        com.tencent.mm.plugin.report.service.h.pYm.e(10420, new Object[] { Integer.valueOf(0), Integer.valueOf(1), Long.valueOf(this.startTime), Long.valueOf(bo.anU()), Integer.valueOf(com.tencent.mm.al.c.bW(ah.getContext())), Integer.valueOf(this.fFb), Integer.valueOf(parame.frO - this.startOffset) });
      this.csG.setStatus(2);
      this.csG.eI(l);
      ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().a(this.fDH, this.csG);
      if (com.tencent.mm.modelstat.r.fUq != null)
        com.tencent.mm.modelstat.r.fUq.j(this.csG);
      if (this.fEZ != null)
        this.fEZ.fS(0L);
      if (r.fGF != null)
        r.fGF.a(this.eFm, this.csG, this.ehh, this.eFn, this.eFu, paramd);
      if (this.fFv != null)
        this.fFv.agX();
      this.ehi.onSceneEnd(0, 0, "", this);
      i.lB((int)this.fEX);
      bool = false;
      AppMethodBeat.o(78345);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(78345);
    }
  }

  private boolean aL(String paramString1, String paramString2)
  {
    AppMethodBeat.i(78340);
    boolean bool;
    if (!((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.emoji.b.c.class)).biZ())
    {
      AppMethodBeat.o(78340);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (com.tencent.mm.vfs.e.asZ(paramString1) > 0L)
      {
        if (com.tencent.mm.vfs.e.asZ(paramString2) > 0L)
        {
          com.tencent.mm.plugin.report.service.h.pYm.k(944L, 9L, 1L);
          com.tencent.mm.vfs.e.deleteFile(paramString2);
        }
        if (!com.tencent.mm.vfs.e.ct(paramString2))
          com.tencent.mm.vfs.e.atc(paramString2);
        if (((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.emoji.b.c.class)).dF(paramString1, paramString2) == 0)
        {
          AppMethodBeat.o(78340);
          bool = true;
        }
        else
        {
          com.tencent.mm.sdk.platformtools.ab.w(this.TAG, "file to hevc failed %s", new Object[] { paramString1 });
        }
      }
      else
      {
        AppMethodBeat.o(78340);
        bool = false;
      }
    }
  }

  private e agY()
  {
    AppMethodBeat.i(78331);
    if (this.eFo == null)
      this.eFo = o.ahl().b(Long.valueOf(this.eFm));
    e locale = this.eFo;
    AppMethodBeat.o(78331);
    return locale;
  }

  private e agZ()
  {
    AppMethodBeat.i(78332);
    if (this.fFt == null)
      this.fFt = o.ahl().b(Long.valueOf(this.fEX));
    e locale = this.fFt;
    AppMethodBeat.o(78332);
    return locale;
  }

  private void c(long paramLong, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(78346);
    if (this.fEW != null)
      al.d(new l.6(this, paramLong, paramInt2, paramInt1));
    AppMethodBeat.o(78346);
  }

  public static void fK(long paramLong)
  {
    fFD = paramLong;
  }

  private int lE(int paramInt)
  {
    AppMethodBeat.i(78342);
    com.tencent.mm.sdk.platformtools.ab.e(this.TAG, "do Scene error code : " + paramInt + " hashcode : " + hashCode());
    if (this.fFv != null)
      this.fFv.agX();
    AppMethodBeat.o(78342);
    return -1;
  }

  public static String sp(String paramString)
  {
    AppMethodBeat.i(78347);
    try
    {
      boolean bool = bo.isNullOrNil(paramString);
      if (bool)
        AppMethodBeat.o(78347);
      while (true)
      {
        return paramString;
        String[] arrayOfString = paramString.split(",");
        if ((arrayOfString != null) && (arrayOfString.length > 19))
        {
          Object localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          long l = fFD;
          fFD = -1L;
          arrayOfString[19] = l;
          localObject = bo.c(bo.P(arrayOfString), ",");
          paramString = (String)localObject;
          AppMethodBeat.o(78347);
        }
        else
        {
          AppMethodBeat.o(78347);
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(78347);
    }
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(78341);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RS().m(new l.5(this), 100L);
    int i;
    if (this.eFm < 0L)
    {
      com.tencent.mm.plugin.report.service.h.pYm.a(111L, 204L, 1L, false);
      com.tencent.mm.sdk.platformtools.ab.e(this.TAG, "doScene invalid imgLocalId:" + this.eFm);
      i = lE(-1);
      AppMethodBeat.o(78341);
    }
    while (true)
    {
      return i;
      if (this.csG == null)
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(111L, 203L, 1L, false);
        com.tencent.mm.sdk.platformtools.ab.e(this.TAG, "doScene msg is null imgid:%d", new Object[] { Long.valueOf(this.eFm) });
        i.lC((int)this.fEX);
        i = lE(-2);
        AppMethodBeat.o(78341);
      }
      else
      {
        this.ehi = paramf;
        c(parame);
        paramf = (clk)this.ehh.fsG.fsP;
        e locale = agY();
        Object localObject = o.ahl().lz((int)locale.fDy);
        if (localObject != null)
        {
          if (((e)localObject).status == -1)
          {
            com.tencent.mm.plugin.report.service.h.pYm.a(111L, 202L, 1L, false);
            com.tencent.mm.sdk.platformtools.ab.e(this.TAG, "doScene hd img info is null or error.");
            i = lE(-3);
            AppMethodBeat.o(78341);
          }
        }
        else if ((locale == null) || (locale.status == -1))
        {
          com.tencent.mm.sdk.platformtools.ab.e(this.TAG, "doScene img info is null or error.");
          i = lE(-4);
          AppMethodBeat.o(78341);
        }
        else
        {
          if (a.a.KG().kq(this.csG.field_talker));
          String str;
          for (paramf.vEG = a.a.KG().h(this.csG); ; paramf.vEG = this.csG.dqJ)
          {
            localObject = o.ahl().q(locale.fDz, "", "");
            str = o.ahl().q(locale.fDB, "", "");
            if (!bo.isNullOrNil(locale.fDA))
              o.ahl().q(locale.fDA, "", "");
            if ((com.tencent.mm.a.e.cs((String)localObject) > 0) && (com.tencent.mm.a.e.cs(str) > 0))
              break label577;
            com.tencent.mm.sdk.platformtools.ab.e(this.TAG, "doScene invalid imgLocalId:%d filesize:[%d,%d] %s %s", new Object[] { Long.valueOf(this.eFm), Integer.valueOf(com.tencent.mm.a.e.cs((String)localObject)), Integer.valueOf(com.tencent.mm.a.e.cs(str)), localObject, str });
            i = lE(-5);
            AppMethodBeat.o(78341);
            break;
            localObject = bh.aae();
            if (((localObject != null) && (!((String)localObject).equals(this.csG.dqJ))) || ((localObject == null) && (!bo.isNullOrNil(this.csG.dqJ))))
            {
              this.csG.ix((String)localObject);
              ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().a(this.csG.field_msgId, this.csG);
            }
          }
          label577: if ((paramf.xja == null) || (bo.isNullOrNil(paramf.xja.wVI)))
          {
            if (bo.isNullOrNil(this.fFa))
            {
              com.tencent.mm.sdk.platformtools.ab.i(this.TAG, "createMediaId time:%d talker:%s msg:%d img:%d compressType:%d", new Object[] { Long.valueOf(this.csG.field_createTime), this.csG.field_talker, Long.valueOf(this.csG.field_msgId), Long.valueOf(this.eFm), Integer.valueOf(this.fDC) });
              this.fFa = com.tencent.mm.al.c.a("upimg", this.csG.field_createTime, this.csG.field_talker, this.csG.field_msgId + "_" + this.eFm + "_" + this.fDC);
            }
            paramf.xja = new bts().alV(this.fFa);
            bi localbi = this.csG;
            localbi.dJC = this.fFa;
            localbi.dqp = true;
          }
          if (this.startTime == 0L)
          {
            this.startTime = bo.anU();
            this.startOffset = locale.offset;
            if (this.fDC != 1)
              break label905;
          }
          label905: for (i = com.tencent.mm.i.a.MediaType_FULLSIZEIMAGE; ; i = com.tencent.mm.i.a.MediaType_IMAGE)
          {
            this.fFb = i;
            com.tencent.mm.sdk.platformtools.ab.i(this.TAG, "before checkUseCdn %s, %s, imgBitPath:%s", new Object[] { localObject, str, locale.fDz });
            if (!a(locale, 0))
              break label912;
            com.tencent.mm.sdk.platformtools.ab.d(this.TAG, "cdntra use cdn return -1 for onGYNetEnd clientid:%s", new Object[] { paramf.xja.wVI });
            i = 0;
            AppMethodBeat.o(78341);
            break;
          }
          label912: com.tencent.mm.sdk.platformtools.ab.i(this.TAG, "after checkUseCdn, it use cgi to upload image.");
          i = locale.fDI;
          if (i >= acn())
          {
            com.tencent.mm.plugin.report.service.h.pYm.a(111L, 201L, 1L, false);
            com.tencent.mm.sdk.platformtools.ab.e(this.TAG, "doScene limit net time:".concat(String.valueOf(i)));
            i.lC((int)this.fEX);
            i = lE(-6);
            AppMethodBeat.o(78341);
          }
          else
          {
            locale.lr(i + 1);
            locale.bJt = 512;
            o.ahl().a(Long.valueOf(this.eFm), locale);
            int j = locale.frO - locale.offset;
            i = j;
            if (j > this.fFu)
              i = this.fFu;
            com.tencent.mm.a.e.cs((String)localObject);
            localObject = com.tencent.mm.a.e.e((String)localObject, locale.offset, i);
            if ((localObject == null) || (localObject.length <= 0))
            {
              com.tencent.mm.plugin.report.service.h.pYm.a(111L, 199L, 1L, false);
              com.tencent.mm.sdk.platformtools.ab.e(this.TAG, "doScene, file read buf error.");
              i = lE(-8);
              AppMethodBeat.o(78341);
            }
            else
            {
              paramf.pty = localObject.length;
              paramf.ptx = locale.offset;
              paramf.ptz = new SKBuiltinBuffer_t().setBuffer((byte[])localObject);
              if (this.fEZ != null)
                this.fEZ.akj();
              i = a(parame, this.ehh, this);
              if (i < 0)
              {
                com.tencent.mm.sdk.platformtools.ab.e(this.TAG, "doScene netId error");
                i.lC((int)this.fEX);
                i = lE(-9);
                AppMethodBeat.o(78341);
              }
              else
              {
                AppMethodBeat.o(78341);
              }
            }
          }
        }
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(78343);
    paramq = (cll)((com.tencent.mm.ai.b)paramq).fsH.fsP;
    com.tencent.mm.sdk.platformtools.ab.i(this.TAG, "cdntra onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " useCdnTransClientId:" + this.fFa);
    if ((paramInt2 == 3) && (paramInt3 == -1) && (!bo.isNullOrNil(this.fFa)))
    {
      com.tencent.mm.sdk.platformtools.ab.w(this.TAG, "cdntra using cdn trans,  wait cdn service callback! clientid:%s", new Object[] { this.fFa });
      AppMethodBeat.o(78343);
    }
    while (true)
    {
      return;
      if ((paramInt2 != 0) || (paramInt3 != 0))
      {
        com.tencent.mm.sdk.platformtools.ab.e(this.TAG, "onGYNetEnd failed errtype:" + paramInt2 + " errcode:" + paramInt3);
        com.tencent.mm.plugin.report.service.h.pYm.a(111L, 198L, 1L, false);
        i.lC((int)this.fEX);
        i.lB((int)this.fEX);
        com.tencent.mm.plugin.report.service.h.pYm.e(10420, new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(1), Long.valueOf(this.startTime), Long.valueOf(bo.anU()), Integer.valueOf(com.tencent.mm.al.c.bW(ah.getContext())), Integer.valueOf(this.fFb), Integer.valueOf(0) });
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        if (this.fFv != null)
          this.fFv.agX();
        AppMethodBeat.o(78343);
      }
      else
      {
        this.fFu = paramq.pty;
        if (this.fFu > 16384)
          this.fFu = 16384;
        paramString = agY();
        com.tencent.mm.sdk.platformtools.ab.v(this.TAG, "onGYNetEnd localId:" + this.eFm + "  totalLen:" + paramString.frO + " offSet:" + paramString.offset);
        if ((paramq.ptx < 0) || ((paramq.ptx > paramString.frO) && (paramString.frO > 0)))
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(111L, 197L, 1L, false);
          com.tencent.mm.sdk.platformtools.ab.e(this.TAG, "onGYNetEnd invalid server return value : startPos = " + paramq.ptx + " img totalLen = " + paramString.frO);
          i.lC((int)this.fEX);
          i.lB((int)this.fEX);
          com.tencent.mm.plugin.report.service.h.pYm.e(10420, new Object[] { Integer.valueOf(-2), Integer.valueOf(1), Long.valueOf(this.startTime), Long.valueOf(bo.anU()), Integer.valueOf(com.tencent.mm.al.c.bW(ah.getContext())), Integer.valueOf(this.fFb), Integer.valueOf(0) });
          this.ehi.onSceneEnd(4, -2, "", this);
          if (this.fFv != null)
            this.fFv.agX();
          AppMethodBeat.o(78343);
        }
        else if ((paramq.ptx < paramString.offset) || ((f.b(paramString)) && (this.fFu <= 0)))
        {
          com.tencent.mm.sdk.platformtools.ab.e(this.TAG, "onGYNetEnd invalid data startPos = " + paramq.ptx + " totalLen = " + paramString.frO + " off:" + paramString.offset);
          i.lC((int)this.fEX);
          i.lB((int)this.fEX);
          this.ehi.onSceneEnd(4, -1, "", this);
          if (this.fFv != null)
            this.fFv.agX();
          AppMethodBeat.o(78343);
        }
        else
        {
          com.tencent.mm.sdk.platformtools.ab.d("ImgInfoLogic", "resp.rImpl.getStartPos() " + paramq.ptx);
          if ((a(paramString, paramq.ptx, paramq.ptF, paramq.pcX, null)) && (a(this.ftf, this.ehi) < 0))
          {
            i.lB((int)this.fEX);
            this.ehi.onSceneEnd(3, -1, "", this);
            if (this.fFv != null)
              this.fFv.agX();
          }
          AppMethodBeat.o(78343);
        }
      }
    }
  }

  public final int acn()
  {
    if (this.fDC == 0);
    for (int i = 100; ; i = 1350)
      return i;
  }

  public final void aha()
  {
    AppMethodBeat.i(78344);
    com.tencent.mm.sdk.platformtools.ab.i(this.TAG, "send img from system");
    this.eFu = true;
    AppMethodBeat.o(78344);
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  public final int getType()
  {
    return 110;
  }

  public final void lD(int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(78336);
    if (this.csG == null)
    {
      com.tencent.mm.sdk.platformtools.ab.w(this.TAG, "createHDThumb but msg is null msgLocalId[%d], compressType[%d]", new Object[] { Long.valueOf(this.fDH), Integer.valueOf(paramInt) });
      AppMethodBeat.o(78336);
    }
    while (true)
    {
      return;
      if (this.fFy)
      {
        if (this.csG.dJA == 0)
        {
          boolean bool = o.ahl().a(this.csG, this.fFe, paramInt);
          bi localbi = this.csG;
          if (bool);
          for (paramInt = i; ; paramInt = 0)
          {
            localbi.ic(paramInt);
            ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().a(this.fDH, this.csG);
            AppMethodBeat.o(78336);
            break;
          }
        }
      }
      else
        o.ahl().a(this.csG.field_imgPath, com.tencent.mm.bz.a.getDensity(ah.getContext()), true);
      AppMethodBeat.o(78336);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.l
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.at;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.i.g.a;
import com.tencent.mm.model.t;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.c;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.akx;
import com.tencent.mm.protocal.protobuf.aky;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.sdk.platformtools.MMNativeJpeg;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.sdk.platformtools.r;
import com.tencent.mm.storage.bh;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import java.io.ByteArrayOutputStream;
import java.util.HashSet;
import java.util.Map;
import junit.framework.Assert;

public final class k extends m
  implements com.tencent.mm.network.k
{
  String TAG;
  bi csG;
  private long cvx;
  long eFm;
  private final com.tencent.mm.ai.b ehh;
  com.tencent.mm.ai.f ehi;
  private int fDC;
  final com.tencent.mm.ai.g fEW;
  public final long fEX;
  private int fEY;
  private com.tencent.mm.modelstat.h fEZ;
  String fFa;
  int fFb;
  private String fFc;
  public String fFd;
  int fFe;
  public boolean fFf;
  private int fFg;
  private String fFh;
  private int fFi;
  boolean fFj;
  private g.a fFk;
  int frO;
  private int startOffset;
  long startTime;
  private int token;

  public k(long paramLong1, long paramLong2, int paramInt, com.tencent.mm.ai.g paramg)
  {
    this(paramLong1, paramLong2, paramInt, paramg, -1);
  }

  public k(long paramLong1, long paramLong2, int paramInt1, com.tencent.mm.ai.g paramg, int paramInt2)
  {
    AppMethodBeat.i(78313);
    this.TAG = "MicroMsg.NetSceneGetMsgImg";
    this.fEZ = null;
    this.cvx = -1L;
    this.csG = null;
    this.fFa = "";
    this.startTime = 0L;
    this.startOffset = -1;
    this.fFb = 0;
    this.fFc = "";
    this.fFd = "";
    this.frO = 0;
    this.fFe = -1;
    this.fFf = false;
    this.fFg = -1;
    this.fFh = null;
    this.fFi = 0;
    this.token = -1;
    this.fFj = false;
    this.fFk = new g.a()
    {
      public final int a(String paramAnonymousString, int paramAnonymousInt, com.tencent.mm.i.c paramAnonymousc, com.tencent.mm.i.d paramAnonymousd, boolean paramAnonymousBoolean)
      {
        AppMethodBeat.i(78311);
        if (paramAnonymousInt == -21006)
        {
          ab.i(k.this.TAG, "cdntra  ERR_CNDCOM_MEDIA_IS_DOWNLOADING clientid:%s", new Object[] { k.this.fFa });
          AppMethodBeat.o(78311);
        }
        long l1;
        long l2;
        int i;
        int j;
        int k;
        label120: e locale;
        while (true)
        {
          return 0;
          if (paramAnonymousInt != 0)
          {
            i.lC((int)k.this.fEX);
            i.lB((int)k.this.fEX);
            l1 = k.this.startTime;
            l2 = bo.anU();
            i = com.tencent.mm.al.c.bW(ah.getContext());
            j = k.this.fFb;
            k = k.this.frO;
            if (paramAnonymousd == null)
            {
              paramAnonymousString = "";
              if (paramAnonymousd != null)
                break label305;
            }
            label305: for (paramAnonymousc = ""; ; paramAnonymousc = paramAnonymousd.efY)
            {
              paramAnonymousString = com.tencent.mm.plugin.report.a.r(new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(2), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), paramAnonymousString, "", "", "", "", "", "", "", paramAnonymousc });
              new com.tencent.mm.g.b.a.f(paramAnonymousString).ajK();
              new com.tencent.mm.g.b.a.d(paramAnonymousString).ajK();
              k.this.ehi.onSceneEnd(3, paramAnonymousInt, "", k.this);
              AppMethodBeat.o(78311);
              break;
              paramAnonymousString = paramAnonymousd.field_transInfo;
              break label120;
            }
          }
          locale = o.ahl().b(Long.valueOf(k.this.eFm));
          if (paramAnonymousc == null)
            break;
          if (paramAnonymousc.field_finishedLength == k.this.frO)
          {
            ab.d(k.this.TAG, "cdntra ignore progress 100%");
            AppMethodBeat.o(78311);
          }
          else
          {
            k.this.fFj = true;
            if (!k.this.fFf)
              k.this.fFf = paramAnonymousc.field_mtlnotify;
            ab.i(k.this.TAG, "cdntra progresscallback id:%s finish:%d total:%d,  canshowProgressimg:%b", new Object[] { k.this.fFa, Integer.valueOf(paramAnonymousc.field_finishedLength), Integer.valueOf(paramAnonymousc.field_toltalLength), Boolean.valueOf(k.this.fFf) });
            k.a(k.this, locale, k.this.frO, locale.offset, paramAnonymousc.field_finishedLength - locale.offset);
            AppMethodBeat.o(78311);
          }
        }
        if (paramAnonymousd != null)
        {
          if (paramAnonymousd.field_retCode == 0)
            break label966;
          i.lB((int)k.this.fEX);
          ab.e(k.this.TAG, "cdntra sceneResult.retCode :%d", new Object[] { Integer.valueOf(paramAnonymousd.field_retCode) });
          k.this.ehi.onSceneEnd(3, paramAnonymousd.field_retCode, "", k.this);
          label574: i = paramAnonymousd.field_retCode;
          l2 = k.this.startTime;
          l1 = bo.anU();
          k = com.tencent.mm.al.c.bW(ah.getContext());
          j = k.this.fFb;
          paramAnonymousInt = k.this.frO;
          if (paramAnonymousd != null)
            break label1339;
          paramAnonymousString = "";
          label628: if (paramAnonymousd != null)
            break label1348;
          paramAnonymousc = "";
          label636: new com.tencent.mm.g.b.a.f(com.tencent.mm.plugin.report.a.r(new Object[] { Integer.valueOf(i), Integer.valueOf(2), Long.valueOf(l2), Long.valueOf(l1), Integer.valueOf(k), Integer.valueOf(j), Integer.valueOf(paramAnonymousInt), paramAnonymousString, "", "", "", "", "", "", "", paramAnonymousc })).ajK();
          if (paramAnonymousd.field_retCode != 0)
          {
            i = paramAnonymousd.field_retCode;
            l2 = k.this.startTime;
            l1 = bo.anU();
            k = com.tencent.mm.al.c.bW(ah.getContext());
            j = k.this.fFb;
            paramAnonymousInt = k.this.frO;
            if (paramAnonymousd != null)
              break label1357;
            paramAnonymousString = "";
            label824: if (paramAnonymousd != null)
              break label1366;
          }
        }
        label966: label1357: label1366: for (paramAnonymousc = ""; ; paramAnonymousc = paramAnonymousd.efY)
        {
          new com.tencent.mm.g.b.a.d(com.tencent.mm.plugin.report.a.r(new Object[] { Integer.valueOf(i), Integer.valueOf(2), Long.valueOf(l2), Long.valueOf(l1), Integer.valueOf(k), Integer.valueOf(j), Integer.valueOf(paramAnonymousInt), paramAnonymousString, "", "", "", "", "", "", "", paramAnonymousc })).ajK();
          AppMethodBeat.o(78311);
          break;
          ab.i(k.this.TAG, "cdntra getimg ok. need convert:%b", new Object[] { Boolean.valueOf(paramAnonymousd.field_convert2baseline) });
          if (locale.fDC == 1)
          {
            com.tencent.mm.plugin.report.service.h.pYm.a(198L, 26L, locale.frO, false);
            com.tencent.mm.plugin.report.service.h.pYm.a(198L, 27L, 1L, false);
            paramAnonymousc = com.tencent.mm.plugin.report.service.h.pYm;
            if (k.this.csG != null)
            {
              paramAnonymousString = k.this.csG.field_talker;
              if (!t.kH(paramAnonymousString))
                break label1195;
            }
            for (l2 = 29L; ; l2 = 28L)
            {
              paramAnonymousc.a(198L, l2, 1L, false);
              if (paramAnonymousd.field_convert2baseline)
              {
                ab.i(k.this.TAG, "cdntra need convert2baseline. file:%s", new Object[] { k.this.fFd });
                paramAnonymousBoolean = MMNativeJpeg.Convert2Baseline(k.this.fFd, 60);
                ab.i(k.this.TAG, "convert result:%b", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
              }
              if (!k.this.fFj)
                break label1301;
              k.a(k.this, locale, locale.offset, locale.offset, 0);
              break;
              paramAnonymousString = "";
              break label1060;
            }
          }
          com.tencent.mm.plugin.report.service.h.pYm.a(198L, 21L, locale.frO, false);
          com.tencent.mm.plugin.report.service.h.pYm.a(198L, 22L, 1L, false);
          paramAnonymousc = com.tencent.mm.plugin.report.service.h.pYm;
          if (k.this.csG != null)
          {
            paramAnonymousString = k.this.csG.field_talker;
            label1261: if (!t.kH(paramAnonymousString))
              break label1293;
          }
          for (l2 = 24L; ; l2 = 23L)
          {
            paramAnonymousc.a(198L, l2, 1L, false);
            break;
            paramAnonymousString = "";
            break label1261;
          }
          k.a(k.this, locale, k.this.frO, locale.offset, k.this.frO - locale.offset);
          break label574;
          paramAnonymousString = paramAnonymousd.field_transInfo;
          break label628;
          paramAnonymousc = paramAnonymousd.efY;
          break label636;
          paramAnonymousString = paramAnonymousd.field_transInfo;
          break label824;
        }
      }

      public final void a(String paramAnonymousString, ByteArrayOutputStream paramAnonymousByteArrayOutputStream)
      {
      }

      public final byte[] l(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
      {
        return null;
      }
    };
    boolean bool;
    e locale;
    if ((paramLong1 >= 0L) && (paramLong2 >= 0L) && (paramg != null))
    {
      bool = true;
      Assert.assertTrue(bool);
      this.fEW = paramg;
      this.fDC = paramInt1;
      this.fEX = paramLong1;
      this.eFm = paramLong1;
      this.cvx = paramLong2;
      this.fFg = paramInt2;
      locale = o.ahl().b(Long.valueOf(this.eFm));
      if (paramInt1 != 1)
        break label573;
      this.eFm = locale.fDJ;
      locale = o.ahl().b(Long.valueOf(this.eFm));
    }
    label573: 
    while (true)
    {
      this.TAG = (this.TAG + "[" + this.eFm + "]");
      Object localObject = new b.a();
      ((b.a)localObject).fsJ = new akx();
      ((b.a)localObject).fsK = new aky();
      ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getmsgimg";
      ((b.a)localObject).fsI = 109;
      ((b.a)localObject).fsL = 10;
      ((b.a)localObject).fsM = 1000000010;
      this.ehh = ((b.a)localObject).acD();
      localObject = (akx)this.ehh.fsG.fsP;
      this.csG = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().jf(paramLong2);
      ((akx)localObject).ptx = locale.offset;
      ((akx)localObject).ptw = locale.frO;
      ab.d(this.TAG, "cdntra offset:%d total:%d stack:[%s]", new Object[] { Integer.valueOf(locale.offset), Integer.valueOf(locale.frO), bo.dpG() });
      ((akx)localObject).ptF = this.csG.field_msgSvrId;
      ((akx)localObject).vEB = new bts().alV(this.csG.field_talker);
      ((akx)localObject).vEC = new bts().alV((String)com.tencent.mm.kernel.g.RP().Ry().get(2, null));
      ((akx)localObject).wqw = paramInt1;
      if (locale.offset == 0)
        this.fEZ = new com.tencent.mm.modelstat.h(109, false, locale.frO);
      this.fEY = 8192;
      if (paramg != null)
        al.d(new k.1(this, paramg, locale.offset, locale.frO));
      AppMethodBeat.o(78313);
      return;
      bool = false;
      break;
    }
  }

  private boolean a(e parame, int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(78317);
    parame.lt(paramInt1);
    parame.setOffset(paramInt2 + paramInt3);
    this.fEY = paramInt3;
    if (paramArrayOfByte != null)
      com.tencent.mm.vfs.e.a(this.fFd, paramArrayOfByte, paramArrayOfByte.length);
    ab.d(this.TAG, "onGYNetEnd : offset = " + parame.offset + " totalLen = " + parame.frO + " stack:[%s]", new Object[] { bo.dpG() });
    boolean bool1;
    String str1;
    com.tencent.mm.vfs.b localb;
    boolean bool2;
    if (parame.agP())
    {
      paramArrayOfByte = r.amq(this.fFd);
      bool1 = r.amn(this.fFd);
      str1 = this.fFd + "_hevc";
      localb = new com.tencent.mm.vfs.b(this.fFd);
      bool2 = r.amp(this.fFd);
      if (!bool2)
        break label944;
      localb.o(new com.tencent.mm.vfs.b(str1));
      if (((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.emoji.b.c.class)).nativeWxam2Pic(str1, this.fFd) != 0)
      {
        ab.w(this.TAG, "download hevc decode failed");
        bool1 = false;
        ab.d(this.TAG, "hevc download is hevc %b", new Object[] { Boolean.TRUE });
      }
    }
    label407: label944: 
    while (true)
    {
      String str3;
      String str4;
      if (bool1)
      {
        String str2 = this.fFc + paramArrayOfByte;
        str3 = o.ahl().q(this.fFc, null, paramArrayOfByte);
        ab.i(this.TAG, "sceneEndproc ext:%s tmp:%s tmpfull:%s full:%s ", new Object[] { paramArrayOfByte, this.fFc, this.fFd, str3 });
        paramArrayOfByte = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.emoji.b.c.class)).IP(str2);
        str4 = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.emoji.b.c.class)).IP(str3);
        if (bool2)
        {
          new com.tencent.mm.vfs.b(str1).o(new com.tencent.mm.vfs.b(str4));
          localb.o(new com.tencent.mm.vfs.b(str3));
          parame.sb(str2);
          parame.sf(paramArrayOfByte);
          parame.sa(f.sh(str3));
          parame.lx(this.fDC);
          paramArrayOfByte = str3;
          label440: if (o.ahl().a(Long.valueOf(this.eFm), parame) >= 0)
            break label564;
          ab.e(this.TAG, "onGYNetEnd : update img fail");
          this.ehi.onSceneEnd(3, -1, "", this);
          bool1 = false;
          AppMethodBeat.o(78317);
        }
      }
      while (true)
      {
        return bool1;
        paramArrayOfByte = r.amq(this.fFd);
        break;
        if (com.tencent.mm.vfs.e.asZ(str4) > 0L)
        {
          com.tencent.mm.vfs.e.deleteFile(str4);
          com.tencent.mm.plugin.report.service.h.pYm.k(944L, 10L, 1L);
        }
        localb.o(new com.tencent.mm.vfs.b(str3));
        break label407;
        localb.delete();
        paramArrayOfByte = null;
        break label440;
        label564: if (this.fEW != null)
          al.d(new k.3(this, parame));
        ab.d(this.TAG, "cdntra check iscompleted :%b clientid:%s", new Object[] { Boolean.valueOf(parame.agP()), this.fFa });
        if (parame.agP())
        {
          if (bo.isNullOrNil(this.fFa))
            com.tencent.mm.plugin.report.service.h.pYm.e(10420, new Object[] { Integer.valueOf(0), Integer.valueOf(2), Long.valueOf(this.startTime), Long.valueOf(bo.anU()), Integer.valueOf(com.tencent.mm.al.c.bW(ah.getContext())), Integer.valueOf(this.fFb), Integer.valueOf(paramInt1 - this.startOffset) });
          bool1 = false;
          if (this.fFe > 0)
            bool1 = o.ahl().a(paramArrayOfByte, parame.fDB, this.fFe, 1, this.csG.dJw, this.csG.dJx);
          if (bool1)
          {
            parame.agR();
            ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().a(this.csG.field_msgId, this.csG);
          }
          o.ahl().a(Long.valueOf(this.eFm), parame);
          ab.d(this.TAG, "cdntra ext:%s %s %s  MediaCheckDuplicationStorage md5:%s", new Object[] { this.fFd, paramArrayOfByte, parame.fDz, this.fFh });
          if (this.fEZ != null)
            this.fEZ.fS(parame.frO);
          if ((!bo.isNullOrNil(this.fFh)) && (this.fFi > 0))
          {
            com.tencent.mm.plugin.i.b.bGD();
            com.tencent.mm.plugin.i.b.XT().y(this.fFh, this.fFi, paramArrayOfByte);
          }
          this.ehi.onSceneEnd(0, 0, "", this);
          bool1 = false;
          AppMethodBeat.o(78317);
        }
        else
        {
          bool1 = true;
          AppMethodBeat.o(78317);
        }
      }
    }
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(78315);
    this.ehi = paramf;
    akx localakx = (akx)this.ehh.fsG.fsP;
    e locale = o.ahl().b(Long.valueOf(this.eFm));
    int i;
    if (locale.fDy == 0L)
    {
      com.tencent.mm.plugin.report.service.h.pYm.a(111L, 195L, 1L, false);
      ab.e(this.TAG, "doScene id:%d  img:%s", new Object[] { Long.valueOf(this.eFm), locale });
      i = -1;
      AppMethodBeat.o(78315);
    }
    while (true)
    {
      return i;
      if (locale.status != 0)
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(111L, 194L, 1L, false);
        ab.e(this.TAG, "doSceneError, id:%d, status:%d", new Object[] { Long.valueOf(locale.fDy), Integer.valueOf(locale.status) });
        i = -1;
        AppMethodBeat.o(78315);
      }
      else
      {
        paramf = locale.fDz;
        if (paramf.startsWith("SERVERID://"))
        {
          this.fFc = com.tencent.mm.a.g.x(locale.fDz.getBytes());
          this.fFd = o.ahl().q(this.fFc, null, ".temp");
          locale.sb(this.fFc + ".temp");
          o.ahl().a(Long.valueOf(this.eFm), locale);
          label268: ab.i(this.TAG, "doscene id:%d comp:%d off:%d total:%d name:%s tmp:%s full:%s", new Object[] { Long.valueOf(locale.fDy), Integer.valueOf(this.fDC), Integer.valueOf(locale.offset), Integer.valueOf(locale.frO), paramf, this.fFc, this.fFd });
          if (this.startTime == 0L)
          {
            this.startTime = bo.anU();
            this.startOffset = locale.offset;
            if (this.fDC != 1)
              break label470;
            i = com.tencent.mm.i.a.MediaType_FULLSIZEIMAGE;
            label383: this.fFb = i;
          }
          if (!bo.isNullOrNil(locale.fDK))
            break label478;
          i = 0;
        }
        while (true)
        {
          if (i == 0)
            break label1802;
          ab.d(this.TAG, "cdntra this img use cdn : %s", new Object[] { this.fFa });
          i = 0;
          AppMethodBeat.o(78315);
          break;
          this.fFc = locale.fDz;
          this.fFd = o.ahl().q(this.fFc, null, "");
          break label268;
          label470: i = com.tencent.mm.i.a.MediaType_IMAGE;
          break label383;
          label478: Map localMap = br.z(locale.fDK, "msg");
          if (localMap == null)
          {
            ab.e(this.TAG, "parse cdnInfo failed. [%s]", new Object[] { locale.fDK });
            i = 0;
          }
          else
          {
            this.frO = 0;
            String str1;
            if (this.fDC != 1)
            {
              str1 = (String)localMap.get(".msg.img.$cdnmidimgurl");
              this.frO = bo.getInt((String)localMap.get(".msg.img.$length"), 0);
              label573: if (this.fDC == 1)
                break label744;
              str2 = (String)localMap.get(".msg.img.$tpurl");
              paramf = str2;
              if (bo.isNullOrNil(str2))
                break label794;
              this.frO = bo.getInt((String)localMap.get(".msg.img.$tplength"), 0);
              paramf = str2;
            }
            label794: 
            while (true)
            {
              ab.d(this.TAG, "cdntra read xml  comptype:%d totallen:%d url:[%s] [%s]", new Object[] { Integer.valueOf(this.fDC), Integer.valueOf(this.frO), str1, paramf });
              if ((!bo.isNullOrNil(str1)) || (!bo.isNullOrNil(paramf)))
                break label797;
              ab.e(this.TAG, "cdntra get cdnUrlfailed.");
              i = 0;
              break;
              str1 = (String)localMap.get(".msg.img.$cdnbigimgurl");
              this.frO = bo.getInt((String)localMap.get(".msg.img.$hdlength"), 0);
              break label573;
              label744: str2 = (String)localMap.get(".msg.img.$tphdurl");
              paramf = str2;
              if (!bo.isNullOrNil(str2))
              {
                this.frO = bo.getInt((String)localMap.get(".msg.img.$tphdlength"), 0);
                paramf = str2;
              }
            }
            label797: String str2 = (String)localMap.get(".msg.img.$aeskey");
            if (bo.isNullOrNil(str2))
            {
              ab.e(this.TAG, "cdntra get aes key failed.");
              i = 0;
            }
            else
            {
              this.fFa = com.tencent.mm.al.c.a("downimg", locale.fDG, this.csG.field_talker, this.csG.field_msgId);
              if (bo.isNullOrNil(this.fFa))
              {
                ab.w(this.TAG, "cdntra genClientId failed not use cdn imgLocalId:%d", new Object[] { Long.valueOf(this.eFm) });
                i = 0;
              }
              else
              {
                String str3 = (String)localMap.get(".msg.img.$md5");
                if ((bo.isNullOrNil(paramf)) && (!bo.isNullOrNil(str3)) && ((bo.isNullOrNil((String)localMap.get(".msg.img.$cdnbigimgurl"))) || (this.fDC == 1)))
                {
                  com.tencent.mm.plugin.i.b.bGD();
                  String str4 = com.tencent.mm.plugin.i.b.XT().es(str3, this.frO);
                  int j = (int)com.tencent.mm.vfs.e.asZ(str4);
                  i = this.frO - j;
                  String str5 = this.TAG;
                  int k = this.frO;
                  localObject = localMap.get(".msg.img.$cdnbigimgurl");
                  if (this.fDC == 1)
                  {
                    bool = true;
                    label1046: ab.i(str5, "MediaCheckDuplicationStorage: totallen:%s md5:%s big:%s NOcompress:%s  dup(len:%d path:%s) diffLen:%d to:%s", new Object[] { Integer.valueOf(k), str3, localObject, Boolean.valueOf(bool), Integer.valueOf(j), str4, Integer.valueOf(i), this.fFd });
                    if (bo.isNullOrNil(str4))
                      break label1362;
                    if ((i < 0) || (i > 16))
                      break label1376;
                    bool = false;
                    if (!bo.isEqual(str4, this.fFd))
                      if (com.tencent.mm.vfs.e.y(str4, this.fFd) < 0L)
                        break label1356;
                  }
                  label1356: for (boolean bool = true; ; bool = false)
                  {
                    ab.i(this.TAG, "MediaCheckDuplicationStorage copy dup file now :%s -> %s [%b]", new Object[] { str4, this.fFd, Boolean.valueOf(bool) });
                    a(locale, this.frO, this.frO, 0, null);
                    if (this.csG != null)
                      ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().a(new h.c(this.csG.field_talker, "update", this.csG));
                    com.tencent.mm.plugin.report.service.h.pYm.e(13267, new Object[] { str1, Long.valueOf(this.csG.field_msgSvrId), str3, Long.valueOf(this.csG.field_createTime / 1000L), this.csG.field_talker, Integer.valueOf(3), Integer.valueOf(j) });
                    i = 1;
                    break;
                    bool = false;
                    break label1046;
                  }
                  label1362: this.fFh = str3;
                  this.fFi = this.frO;
                }
                label1376: Object localObject = new com.tencent.mm.i.g();
                ((com.tencent.mm.i.g)localObject).field_mediaId = this.fFa;
                ((com.tencent.mm.i.g)localObject).field_fullpath = this.fFd;
                ((com.tencent.mm.i.g)localObject).field_fileType = this.fFb;
                ((com.tencent.mm.i.g)localObject).field_totalLen = this.frO;
                ((com.tencent.mm.i.g)localObject).field_aesKey = str2;
                ((com.tencent.mm.i.g)localObject).field_fileId = str1;
                ((com.tencent.mm.i.g)localObject).field_priority = com.tencent.mm.i.a.efC;
                ((com.tencent.mm.i.g)localObject).egl = this.fFk;
                if (t.kH(this.csG.field_talker))
                {
                  i = 1;
                  label1468: ((com.tencent.mm.i.g)localObject).field_chattype = i;
                  if (!((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.emoji.b.c.class)).bja())
                    break label1771;
                  i = 2;
                  label1495: ((com.tencent.mm.i.g)localObject).expectImageFormat = i;
                  if (!bo.isNullOrNil(paramf))
                  {
                    str1 = (String)localMap.get(".msg.img.$tpauthkey");
                    ((com.tencent.mm.i.g)localObject).field_fileType = 19;
                    ((com.tencent.mm.i.g)localObject).field_authKey = str1;
                    ((com.tencent.mm.i.g)localObject).egm = paramf;
                    ((com.tencent.mm.i.g)localObject).field_fileId = "";
                  }
                  ab.i(this.TAG, "cdnautostart %s %b", new Object[] { "image_" + this.csG.field_msgId, Boolean.valueOf(com.tencent.mm.al.f.afx().fyQ.contains("image_" + this.csG.field_msgId)) });
                  if (!com.tencent.mm.al.f.afx().fyQ.contains("image_" + this.csG.field_msgId))
                    break label1777;
                  com.tencent.mm.al.f.afx().fyQ.remove("image_" + this.csG.field_msgId);
                }
                label1771: label1777: for (((com.tencent.mm.i.g)localObject).field_autostart = true; ; ((com.tencent.mm.i.g)localObject).field_autostart = false)
                {
                  if (com.tencent.mm.al.f.afx().b((com.tencent.mm.i.g)localObject, this.fFg))
                    break label1786;
                  com.tencent.mm.plugin.report.service.h.pYm.a(111L, 196L, 1L, false);
                  ab.e(this.TAG, "addRecvTask failed :%s", new Object[] { this.fFa });
                  this.fFa = "";
                  i = 0;
                  break;
                  i = 0;
                  break label1468;
                  i = 1;
                  break label1495;
                }
                label1786: ab.i(this.TAG, "add recv task");
                i = 1;
              }
            }
          }
        }
        label1802: ab.d(this.TAG, "cdntra this img NOT USE CDN: %s", new Object[] { this.fFa });
        locale.se("");
        locale.bJt = 4096;
        o.ahl().a(Long.valueOf(this.eFm), locale);
        localakx.ptx = locale.offset;
        localakx.pty = this.fEY;
        localakx.ptw = locale.frO;
        if (this.fEZ != null)
          this.fEZ.akj();
        i = a(parame, this.ehh, this);
        AppMethodBeat.o(78315);
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(78316);
    if ((paramInt2 == 3) && (paramInt3 == -1) && (!bo.isNullOrNil(this.fFa)))
    {
      ab.w(this.TAG, "cdntra using cdn trans,  wait cdn service callback! clientid:%s", new Object[] { this.fFa });
      AppMethodBeat.o(78316);
    }
    while (true)
    {
      return;
      if ((paramInt2 != 0) || (paramInt3 != 0))
      {
        if (paramInt2 == 4)
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(111L, 193L, 1L, false);
          com.tencent.mm.plugin.report.service.h.pYm.e(10420, new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(2), Long.valueOf(this.startTime), Long.valueOf(bo.anU()), Integer.valueOf(com.tencent.mm.al.c.bW(ah.getContext())), Integer.valueOf(this.fFb), Integer.valueOf(this.frO - this.startOffset) });
        }
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(78316);
      }
      else
      {
        paramString = (aky)((com.tencent.mm.ai.b)paramq).fsH.fsP;
        paramq = o.ahl().b(Long.valueOf(this.eFm));
        paramInt1 = 0;
        if (paramString.pty <= 0)
        {
          ab.e(this.TAG, "flood control, malformed data_len");
          paramInt1 = -1;
        }
        while (true)
        {
          if (paramInt1 == 0)
            break label500;
          com.tencent.mm.plugin.report.service.h.pYm.a(111L, 192L, 1L, false);
          com.tencent.mm.plugin.report.service.h.pYm.e(10420, new Object[] { Integer.valueOf(-1), Integer.valueOf(2), Long.valueOf(this.startTime), Long.valueOf(bo.anU()), Integer.valueOf(com.tencent.mm.al.c.bW(ah.getContext())), Integer.valueOf(this.fFb), Integer.valueOf(this.frO - this.startOffset) });
          this.ehi.onSceneEnd(4, -1, "", this);
          AppMethodBeat.o(78316);
          break;
          if ((paramString.ptz == null) || (paramString.pty != paramString.ptz.getILen()))
          {
            ab.e(this.TAG, "flood control, malformed data is null or dataLen not match with data buf length");
            paramInt1 = -1;
          }
          else if ((paramString.ptx < 0) || (paramString.ptx + paramString.pty > paramString.ptw))
          {
            ab.e(this.TAG, "flood control, malformed start pos");
            paramInt1 = -1;
          }
          else if (paramString.ptx != paramq.offset)
          {
            ab.e(this.TAG, "flood control, malformed start_pos");
            paramInt1 = -1;
          }
          else if (paramString.ptw <= 0)
          {
            ab.e(this.TAG, "flood control, malformed total_len");
            paramInt1 = -1;
          }
        }
        label500: if ((a(paramq, paramString.ptw, paramString.ptx, paramString.pty, paramString.ptz.getBuffer().wR)) && (a(this.ftf, this.ehi) < 0))
          this.ehi.onSceneEnd(3, -1, "", this);
        AppMethodBeat.o(78316);
      }
    }
  }

  public final int acn()
  {
    if (this.fDC == 0);
    for (int i = 100; ; i = 1280)
      return i;
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  public final void cancel()
  {
    AppMethodBeat.i(78314);
    if ((!bo.isNullOrNil(this.fFa)) && (com.tencent.mm.al.f.afx() != null))
    {
      ab.d(this.TAG, "cancel recv task");
      com.tencent.mm.al.f.afx().rO(this.fFa);
    }
    super.cancel();
    AppMethodBeat.o(78314);
  }

  public final int getType()
  {
    return 109;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.k
 * JD-Core Version:    0.6.2
 */
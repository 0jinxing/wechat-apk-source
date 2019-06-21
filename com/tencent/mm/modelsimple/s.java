package com.tencent.mm.modelsimple;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.a;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.az.h.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.av;
import com.tencent.mm.model.ax;
import com.tencent.mm.model.az;
import com.tencent.mm.model.bk;
import com.tencent.mm.network.k;
import com.tencent.mm.plugin.auth.PluginAuth;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.protobuf.beg;
import com.tencent.mm.protocal.protobuf.beh;
import com.tencent.mm.protocal.protobuf.bzr;
import com.tencent.mm.protocal.protobuf.cfi;
import com.tencent.mm.protocal.v.a;
import com.tencent.mm.protocal.v.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.y;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class s extends m
  implements k
{
  com.tencent.mm.ai.f ehi;
  private final int fPA;
  private boolean fPB;
  public boolean fPC;
  private final String fPt;
  private final String fPu;
  private final String fPv;
  private final String fPw;
  private final String fPx;
  private final String fPy;
  private final int fPz;
  public com.tencent.mm.network.q ftU;
  private int ftx;

  public s(String paramString1, String paramString2, String paramString3, int paramInt1, String paramString4, String paramString5, String paramString6, int paramInt2)
  {
    AppMethodBeat.i(123463);
    this.fPB = true;
    this.fPC = false;
    this.ftx = 2;
    ab.d("MicroMsg.NetSceneReg", "NetSceneReg: username = " + paramString1 + " nickname = " + paramString3);
    ab.d("MicroMsg.NetSceneReg", "NetSceneReg: bindUin = " + paramInt1 + "bindEmail = " + paramString4 + " bindMobile = " + paramString5);
    ab.d("MicroMsg.NetSceneReg", "NetSceneReg: regMode = " + paramInt2 + " ticket: " + paramString6);
    this.fPA = paramInt2;
    this.ftU = new az();
    v.a locala = (v.a)this.ftU.acF();
    locala.hB(0);
    locala.vyI.jBB = paramString1;
    locala.vyI.vLJ = bo.and(paramString2);
    if (paramInt2 == 4)
    {
      locala.vyI.vLJ = paramString6;
      ab.w("MicroMsg.NetSceneReg", "dkreg rand:" + paramString6 + " reqMd5:" + locala.vyI.vLJ);
    }
    locala.vyI.jCH = paramString3;
    locala.vyI.vCf = paramInt1;
    locala.vyI.vCg = paramString4;
    locala.vyI.vCh = paramString5;
    locala.vyI.wdB = paramString6;
    locala.vyI.wsN = paramInt2;
    locala.vyI.luP = bo.dpA();
    locala.vyI.wdz = com.tencent.mm.compatible.e.q.getSimCountryIso();
    locala.vyI.luQ = com.tencent.mm.sdk.platformtools.aa.dor();
    locala.vyI.vIi = 0;
    locala.vyI.wHX = 0;
    locala.vyI.wHY = com.tencent.mm.compatible.e.q.getAndroidId();
    locala.vyI.wfH = com.tencent.mm.compatible.e.q.LP();
    locala.vyI.wHZ = ah.getContext().getSharedPreferences(ah.doA(), 0).getString("installreferer", "");
    locala.vyI.wIa = com.tencent.mm.plugin.normsg.a.b.oTO.An(2);
    locala.vyI.wIb = ah.getContext().getSharedPreferences(ah.doA() + "_google_aid", com.tencent.mm.compatible.util.h.Mu()).getString("getgoogleaid", "");
    this.fPt = paramString1;
    this.fPu = paramString2;
    this.fPv = paramString3;
    this.fPw = paramString4;
    this.fPx = paramString5;
    this.fPz = paramInt1;
    this.fPy = "";
    if (((paramString6 == null) || (paramString6.length() <= 0)) && (paramString4.length() <= 0));
    for (boolean bool = true; ; bool = false)
    {
      this.fPB = bool;
      locala.vyI.vIj = com.tencent.mm.kernel.a.Rb();
      AppMethodBeat.o(123463);
      return;
    }
  }

  public s(String paramString1, String paramString2, String paramString3, int paramInt1, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, int paramInt2, String paramString9, String paramString10, String paramString11, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(123464);
    this.fPB = true;
    this.fPC = false;
    this.ftx = 2;
    ab.i("MicroMsg.NetSceneReg", "init: use:%s pwd:%s nick:%s bindqq:%d email:%s mobile:%s [%s,%s,%s] regmode:%d alias:%s [%s,%s] force:%b avatar:%b", new Object[] { paramString1, bo.anv(paramString2), paramString3, Integer.valueOf(paramInt1), paramString4, paramString5, paramString6, paramString7, paramString8, Integer.valueOf(paramInt2), paramString9, paramString11, paramString10, Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
    this.fPA = paramInt2;
    this.ftU = new az();
    paramString6 = (v.a)this.ftU.acF();
    paramString6.hB(0);
    paramString6.vyI.jBB = paramString1;
    paramString6.vyI.vLJ = bo.and(paramString2);
    if (paramInt2 == 4)
    {
      paramString6.vyI.vLJ = paramString8;
      ab.w("MicroMsg.NetSceneReg", "dkreg rand:" + paramString8 + " reqMd5:" + paramString6.vyI.vLJ);
    }
    paramString6.vyI.jCH = paramString3;
    paramString6.vyI.vCf = paramInt1;
    paramString6.vyI.vCg = paramString4;
    paramString6.vyI.vCh = paramString5;
    paramString6.vyI.wdB = paramString8;
    paramString6.vyI.wsN = paramInt2;
    paramString6.vyI.luP = bo.dpA();
    paramString6.vyI.wdz = com.tencent.mm.compatible.e.q.getSimCountryIso();
    paramString6.vyI.luQ = com.tencent.mm.sdk.platformtools.aa.dor();
    paramString6.vyI.vIi = 0;
    paramString6.vyI.guS = paramString9;
    paramString6.vyI.wsM = paramString11;
    paramString6.vyI.wsL = paramString10;
    paramString7 = paramString6.vyI;
    if (paramBoolean1)
    {
      paramInt2 = 1;
      paramString7.vLw = paramInt2;
      paramString7 = paramString6.vyI;
      if (!paramBoolean2)
        break label643;
      paramInt2 = 1;
      label427: paramString7.wHW = paramInt2;
      paramString6.vyI.vIj = com.tencent.mm.kernel.a.Rb();
      paramString6.vyI.wHY = com.tencent.mm.compatible.e.q.getAndroidId();
      paramString6.vyI.wfH = com.tencent.mm.compatible.e.q.LP();
      paramString6.vyI.wHZ = ah.getContext().getSharedPreferences(ah.doA(), 0).getString("installreferer", "");
      paramString6.vyI.wIa = com.tencent.mm.plugin.normsg.a.b.oTO.An(2);
      paramString6.vyI.wIb = ah.getContext().getSharedPreferences(ah.doA() + "_google_aid", com.tencent.mm.compatible.util.h.Mu()).getString("getgoogleaid", "");
      this.fPt = paramString1;
      this.fPu = paramString2;
      this.fPv = paramString3;
      this.fPw = paramString4;
      this.fPx = paramString5;
      this.fPz = paramInt1;
      this.fPy = paramString9;
      if (((paramString8 != null) && (paramString8.length() > 0)) || ((paramString4 != null) && (paramString4.length() > 0)))
        break label649;
    }
    label643: label649: for (paramBoolean1 = true; ; paramBoolean1 = false)
    {
      this.fPB = paramBoolean1;
      AppMethodBeat.o(123464);
      return;
      paramInt2 = 0;
      break;
      paramInt2 = 0;
      break label427;
    }
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(123466);
    this.ehi = paramf;
    int i = a(parame, this.ftU, this);
    AppMethodBeat.o(123466);
    return i;
  }

  public final void a(final int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(123469);
    paramArrayOfByte = (v.b)paramq.ZS();
    Object localObject1;
    if (paramArrayOfByte.vyJ != null)
    {
      paramInt1 = paramArrayOfByte.vyJ.vHW;
      ab.i("MicroMsg.NetSceneReg", "summerauth mmtls reg:%s", new Object[] { Integer.valueOf(paramInt1) });
      g.RQ();
      g.RP().eJH.set(47, Integer.valueOf(paramInt1));
      localObject1 = g.RO().eJo.ftA;
      if (localObject1 != null)
      {
        if ((paramInt1 & 0x1) == 0)
        {
          bool = true;
          ((com.tencent.mm.network.e)localObject1).cI(bool);
        }
      }
      else
      {
        label107: if ((paramInt2 != 4) || (paramInt3 != -301))
          break label239;
        ax.a(true, paramArrayOfByte.vyJ.vLL, paramArrayOfByte.vyJ.vLM, paramArrayOfByte.vyJ.vLK);
        this.ftx -= 1;
        if (this.ftx > 0)
          break label217;
        this.ehi.onSceneEnd(3, -1, "", this);
        AppMethodBeat.o(123469);
      }
    }
    while (true)
    {
      return;
      bool = false;
      break;
      ab.i("MicroMsg.NetSceneReg", "summerauth mmtls reg not set as ret:%s", new Object[] { Integer.valueOf(paramArrayOfByte.vyl) });
      break label107;
      label217: a(this.ftf, this.ehi);
      AppMethodBeat.o(123469);
      continue;
      label239: if ((paramInt2 == 4) && (paramInt3 == -240))
      {
        ab.i("MicroMsg.NetSceneReg", "summerauth auth MM_ERR_AUTO_RETRY_REQUEST redirectCount:%s", new Object[] { Integer.valueOf(this.ftx) });
        this.ftx -= 1;
        if (this.ftx <= 0)
        {
          this.ehi.onSceneEnd(3, -1, "", this);
          AppMethodBeat.o(123469);
        }
        else
        {
          a(this.ftf, this.ehi);
          AppMethodBeat.o(123469);
        }
      }
      else if ((paramInt2 == 4) && (paramInt3 == -102))
      {
        paramInt1 = paramq.acF().vyj.ver;
        ab.i("MicroMsg.NetSceneReg", "summerauth auth MM_ERR_CERT_EXPIRED  getcert now  old ver:%d", new Object[] { Integer.valueOf(paramInt1) });
        g.RS().aa(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(123461);
            new i().a(s.this.ftf, new s.1.1(this));
            AppMethodBeat.o(123461);
          }
        });
        AppMethodBeat.o(123469);
      }
      else if ((paramInt2 == 4) && ((paramInt3 == -305) || (paramInt3 == -306)))
      {
        ab.i("MicroMsg.NetSceneReg", "summerauth newreg MM_ERR_CERT_SWITCH or MM_ERR_ECDHFAIL_ROLLBACK errCode:%d ver:%d", new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(com.tencent.mm.protocal.f.vxC) });
        a(this.ftf, this.ehi);
        AppMethodBeat.o(123469);
      }
      else
      {
        if ((paramInt2 == 0) && (paramInt3 == 0))
          break label504;
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(123469);
      }
    }
    label504: paramq = (v.a)paramq.acF();
    ab.d("MicroMsg.NetSceneReg", "dkreg: pass:" + paramArrayOfByte.vyJ.luH + " regtype:" + paramArrayOfByte.vyJ.vCj + " mode:" + paramq.vyI.wsN);
    if ((paramArrayOfByte.vyJ.luF != 0) && (!this.fPB))
    {
      g.RQ();
      g.jR(paramArrayOfByte.vyJ.luF);
      g.RP().Ry().set(2, paramq.vyI.jBB);
      g.RP().Ry().set(16, Integer.valueOf(1));
      g.RP().Ry().set(52, Integer.valueOf(paramArrayOfByte.vyJ.vCj));
      g.RP().Ry().set(340240, Long.valueOf(System.currentTimeMillis()));
      g.RP().Ry().set(340241, Boolean.TRUE);
      if ((this.fPt != null) && (this.fPt.length() > 0) && (this.fPA != 1))
        paramArrayOfByte.vyJ.jBB = this.fPt;
      paramArrayOfByte.vyJ.vCg = this.fPw;
      paramArrayOfByte.vyJ.jBT = 0;
      if ((!g.RK()) || (g.RP().Ry() == null))
        break label1576;
      String str1 = this.fPy;
      int i = this.fPz;
      String str2 = this.fPv;
      paramq = this.fPx;
      String str3 = paramArrayOfByte.vyJ.jBB;
      localObject1 = paramArrayOfByte.vyJ.vCg;
      paramInt1 = paramArrayOfByte.vyJ.jBT;
      String str4 = paramArrayOfByte.vyJ.vCm;
      String str5 = paramArrayOfByte.vyJ.vCn;
      int j = paramArrayOfByte.vyJ.vCo;
      int k = paramArrayOfByte.vyJ.wIi;
      String str6 = paramArrayOfByte.vyJ.vAN;
      String str7 = paramArrayOfByte.vyJ.vCp;
      String str8 = paramArrayOfByte.vyJ.vHO;
      Object localObject2 = paramArrayOfByte.vyJ.wIh;
      ab.i("MicroMsg.HandleAuthResponse", "dkwt updateProfile user:%s alias:%s qq:%s nick:%s email:%s mobile:%s status:%d offuser:%s offnick:%s pushmail:%d sendCard:%d session:%s fsurl:%s pluginFlag:%d atuhkey:%s a2:%s newa2:%s kisd:%s safedev:%d MicroBlog:%s emailpwd:%d", new Object[] { str3, str1, com.tencent.mm.a.p.getString(i), str2, localObject1, paramq, Integer.valueOf(paramInt1), str4, str5, Integer.valueOf(j), Integer.valueOf(k), bo.anv(str6), str7, Integer.valueOf(0), bo.anv(str8), bo.anv(null), bo.anv(null), bo.anv(null), Integer.valueOf(-1), localObject2, Integer.valueOf(0) });
      localObject2 = g.RP().Ry();
      av.fly.ak("login_weixin_username", str3);
      av.fly.ak("last_login_nick_name", str2);
      av.fly.c(paramq, i, (String)localObject1);
      ((com.tencent.mm.storage.z)localObject2).set(2, str3);
      ((com.tencent.mm.storage.z)localObject2).set(42, str1);
      ((com.tencent.mm.storage.z)localObject2).set(9, Integer.valueOf(i));
      ((com.tencent.mm.storage.z)localObject2).set(4, str2);
      ((com.tencent.mm.storage.z)localObject2).set(5, localObject1);
      ((com.tencent.mm.storage.z)localObject2).set(6, paramq);
      ((com.tencent.mm.storage.z)localObject2).set(7, Integer.valueOf(paramInt1));
      ((com.tencent.mm.storage.z)localObject2).set(21, str4);
      ((com.tencent.mm.storage.z)localObject2).set(22, str5);
      ((com.tencent.mm.storage.z)localObject2).set(57, Integer.valueOf(0));
      ((com.tencent.mm.storage.z)localObject2).set(17, Integer.valueOf(j));
      ((com.tencent.mm.storage.z)localObject2).set(25, Integer.valueOf(k));
      ((com.tencent.mm.storage.z)localObject2).set(1, str6);
      ((com.tencent.mm.storage.z)localObject2).set(29, str7);
      ((com.tencent.mm.storage.z)localObject2).set(34, Integer.valueOf(0));
      ((com.tencent.mm.storage.z)localObject2).set(256, Boolean.FALSE);
      ab.i("MicroMsg.HandleAuthResponse", "summerstatus USERINFO_FORCE_UPDATE_AUTH set false");
      ((com.tencent.mm.storage.z)localObject2).set(-1535680990, str8);
      ((com.tencent.mm.storage.z)localObject2).set(46, null);
      ((com.tencent.mm.storage.z)localObject2).set(72, null);
      ((com.tencent.mm.storage.z)localObject2).set(64, Integer.valueOf(-1));
      ((com.tencent.mm.storage.z)localObject2).dsb();
      ((PluginAuth)g.M(PluginAuth.class)).getHandleAuthResponseCallbacks().a(paramArrayOfByte, this.fPy, this.fPz, this.fPv, this.fPx, 0);
      label1355: ax.a(false, paramArrayOfByte.vyJ.vLL, paramArrayOfByte.vyJ.vLM, paramArrayOfByte.vyJ.vLK);
      g.RP().Ry().dsb();
      g.Rg().a(new bk(new s.2(this, paramArrayOfByte)), 0);
      ab.d("MicroMsg.NetSceneReg", "resp return flag" + paramArrayOfByte.vyJ.wIk);
      if ((paramArrayOfByte.vyJ.wIk & 0x1) == 0)
        break label1626;
    }
    label1576: label1626: for (boolean bool = true; ; bool = false)
    {
      this.fPC = bool;
      paramq = new LinkedList();
      paramq.add(new h.a(21, "android-" + Build.VERSION.SDK_INT + "-" + Build.MODEL));
      ((j)g.K(j.class)).XL().c(new com.tencent.mm.az.h(paramq));
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(123469);
      break;
      bool = g.RK();
      g.RN();
      ab.e("MicroMsg.NetSceneReg", "dkwt ERR: updateProfile acc:%b uin:%s userConfigStg:%s", new Object[] { Boolean.valueOf(bool), com.tencent.mm.a.p.getString(com.tencent.mm.kernel.a.QF()), g.RP().Ry() });
      break label1355;
    }
  }

  public final void a(m.a parama)
  {
  }

  public final int acn()
  {
    return 3;
  }

  public final String ajA()
  {
    AppMethodBeat.i(123476);
    Object localObject = ((v.b)this.ftU.ZS()).vyJ.vHR;
    if ((localObject != null) && (((bzr)localObject).wYM != null) && (((bzr)localObject).wYM.size() > 0))
    {
      Iterator localIterator = ((bzr)localObject).wYM.iterator();
      do
      {
        if (!localIterator.hasNext())
          break;
        localObject = (cfi)localIterator.next();
      }
      while (((cfi)localObject).pXC != 17);
    }
    for (localObject = ((cfi)localObject).xeN; ; localObject = null)
    {
      AppMethodBeat.o(123476);
      return localObject;
    }
  }

  public final String ajn()
  {
    AppMethodBeat.i(123471);
    String str = ((v.b)this.ftU.ZS()).vyJ.wsL;
    AppMethodBeat.o(123471);
    return str;
  }

  public final byte[] ajo()
  {
    AppMethodBeat.i(123470);
    byte[] arrayOfByte = com.tencent.mm.platformtools.aa.a(((v.b)this.ftU.ZS()).vyJ.wsO, new byte[0]);
    AppMethodBeat.o(123470);
    return arrayOfByte;
  }

  public final String ajw()
  {
    AppMethodBeat.i(123472);
    String str = ((v.b)this.ftU.ZS()).vyJ.wIo;
    AppMethodBeat.o(123472);
    return str;
  }

  public final int ajx()
  {
    AppMethodBeat.i(123473);
    Object localObject = ((v.b)this.ftU.ZS()).vyJ.vHR;
    cfi localcfi;
    if ((localObject != null) && (((bzr)localObject).wYM != null) && (((bzr)localObject).wYM.size() > 0))
    {
      localObject = ((bzr)localObject).wYM.iterator();
      do
      {
        if (!((Iterator)localObject).hasNext())
          break;
        localcfi = (cfi)((Iterator)localObject).next();
      }
      while (localcfi.pXC != 1);
    }
    for (int i = bo.getInt(localcfi.xeN, 0); ; i = 0)
    {
      AppMethodBeat.o(123473);
      return i;
    }
  }

  public final String ajy()
  {
    AppMethodBeat.i(123474);
    Object localObject = ((v.b)this.ftU.ZS()).vyJ.vHR;
    if ((localObject != null) && (((bzr)localObject).wYM != null) && (((bzr)localObject).wYM.size() > 0))
    {
      Iterator localIterator = ((bzr)localObject).wYM.iterator();
      do
      {
        if (!localIterator.hasNext())
          break;
        localObject = (cfi)localIterator.next();
      }
      while (((cfi)localObject).pXC != 2);
    }
    for (localObject = ((cfi)localObject).xeN; ; localObject = "")
    {
      AppMethodBeat.o(123474);
      return localObject;
    }
  }

  public final int ajz()
  {
    AppMethodBeat.i(123475);
    Object localObject = ((v.b)this.ftU.ZS()).vyJ.vHR;
    cfi localcfi;
    if ((localObject != null) && (((bzr)localObject).wYM != null) && (((bzr)localObject).wYM.size() > 0))
    {
      localObject = ((bzr)localObject).wYM.iterator();
      do
      {
        if (!((Iterator)localObject).hasNext())
          break;
        localcfi = (cfi)((Iterator)localObject).next();
      }
      while (localcfi.pXC != 3);
    }
    for (int i = bo.getInt(localcfi.xeN, 2); ; i = 2)
    {
      AppMethodBeat.o(123475);
      return i;
    }
  }

  public final m.b b(com.tencent.mm.network.q paramq)
  {
    return m.b.ftu;
  }

  public final int getType()
  {
    return 126;
  }

  public final void lX(int paramInt)
  {
    AppMethodBeat.i(123465);
    ((v.a)this.ftU.acF()).vyI.vLC = paramInt;
    AppMethodBeat.o(123465);
  }

  public final void ts(String paramString)
  {
    AppMethodBeat.i(123467);
    if (!bo.isNullOrNil(paramString))
    {
      ((v.a)this.ftU.acF()).vyI.vLD = paramString;
      ab.i("MicroMsg.NetSceneReg", "setRegSessionId %s", new Object[] { paramString });
    }
    AppMethodBeat.o(123467);
  }

  public final void tt(String paramString)
  {
    AppMethodBeat.i(123468);
    if (!bo.isNullOrNil(paramString))
    {
      ((v.a)this.ftU.acF()).vyI.wIg = paramString;
      ab.i("MicroMsg.NetSceneReg", "thirdAppTicket %s", new Object[] { paramString });
    }
    AppMethodBeat.o(123468);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.s
 * JD-Core Version:    0.6.2
 */
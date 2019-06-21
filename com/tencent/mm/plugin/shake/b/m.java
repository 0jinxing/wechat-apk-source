package com.tencent.mm.plugin.shake.b;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.g.a.oh;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bw;
import com.tencent.mm.model.bz;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.shake.c.a.f;
import com.tencent.mm.plugin.shake.d.a.o;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bd.a;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.be.a;
import com.tencent.mm.storage.bu;
import java.util.HashMap;

public final class m
  implements at
{
  private static HashMap<Integer, h.d> eaA;
  private com.tencent.mm.sdk.b.c egQ;
  private be.a flN;
  private ak mHandler;
  private com.tencent.mm.sdk.b.c oMA;
  private bd.a oPE;
  private e qrY;
  private g qrZ;
  private f qsa;
  private com.tencent.mm.plugin.shake.c.a.d qsb;
  private o qsc;
  private n qsd;
  com.tencent.mm.pluginsdk.c.d qse;
  private bz.a qsf;
  private com.tencent.mm.sdk.b.c qsg;
  private bz.a qsh;
  private bz.a qsi;

  static
  {
    AppMethodBeat.i(24505);
    HashMap localHashMap = new HashMap();
    eaA = localHashMap;
    localHashMap.put(Integer.valueOf("SHAKEITEM_TABLE".hashCode()), new m.8());
    eaA.put(Integer.valueOf("SHAKEMSG_TABLE".hashCode()), new m.9());
    eaA.put(Integer.valueOf("SHAKETVHISTORY_TABLE".hashCode()), new m.10());
    eaA.put(Integer.valueOf("SHAKENEWYEARFRIENDINFO_TABLE".hashCode()), new m.11());
    AppMethodBeat.o(24505);
  }

  public m()
  {
    AppMethodBeat.i(24491);
    this.mHandler = new ak(Looper.getMainLooper());
    this.qsd = new n();
    this.qse = new m.1(this);
    this.egQ = new m.7(this);
    this.qsf = new m.13(this);
    this.oPE = new bd.a()
    {
      public final void a(bd paramAnonymousbd, ad paramAnonymousad)
      {
        AppMethodBeat.i(24490);
        if ((paramAnonymousbd != null) && (paramAnonymousad != null) && (paramAnonymousad.Oa()))
          m.cjS().WC(paramAnonymousad.field_username);
        AppMethodBeat.o(24490);
      }
    };
    this.flN = new m.2(this);
    this.qsg = new com.tencent.mm.sdk.b.c()
    {
    };
    this.qsh = new m.4(this);
    this.qsi = new bz.a()
    {
      public final void a(e.a paramAnonymousa)
      {
        AppMethodBeat.i(24482);
        String str = aa.a(paramAnonymousa.eAB.vED);
        if ((str == null) || (str.length() == 0))
        {
          ab.e("MicroMsg.SubCoreShake", "onReceiveMsg, ShakeCardRedDotMsg msgContent is null");
          AppMethodBeat.o(24482);
        }
        while (true)
        {
          return;
          m.a(m.this).post(new m.5.1(this, str, paramAnonymousa));
          AppMethodBeat.o(24482);
        }
      }
    };
    this.oMA = new m.6(this);
    AppMethodBeat.o(24491);
  }

  private static m cjR()
  {
    AppMethodBeat.i(24492);
    aw.ZE();
    m localm1 = (m)bw.oJ("plugin.shake");
    m localm2 = localm1;
    if (localm1 == null)
    {
      localm2 = new m();
      aw.ZE().a("plugin.shake", localm2);
    }
    AppMethodBeat.o(24492);
    return localm2;
  }

  public static e cjS()
  {
    AppMethodBeat.i(24493);
    com.tencent.mm.kernel.g.RN().QU();
    if (cjR().qrY == null)
    {
      localObject = cjR();
      aw.ZK();
      ((m)localObject).qrY = new e(com.tencent.mm.model.c.Ru());
    }
    Object localObject = cjR().qrY;
    AppMethodBeat.o(24493);
    return localObject;
  }

  public static g cjT()
  {
    AppMethodBeat.i(24494);
    com.tencent.mm.kernel.g.RN().QU();
    if (cjR().qrZ == null)
    {
      localObject = cjR();
      aw.ZK();
      ((m)localObject).qrZ = new g(com.tencent.mm.model.c.Ru());
    }
    Object localObject = cjR().qrZ;
    AppMethodBeat.o(24494);
    return localObject;
  }

  public static o cjU()
  {
    AppMethodBeat.i(24495);
    com.tencent.mm.kernel.g.RN().QU();
    if (cjR().qsc == null)
    {
      localObject = cjR();
      aw.ZK();
      ((m)localObject).qsc = new o(com.tencent.mm.model.c.Ru());
    }
    Object localObject = cjR().qsc;
    AppMethodBeat.o(24495);
    return localObject;
  }

  public static void cjV()
  {
    AppMethodBeat.i(24497);
    cjS().cjH();
    com.tencent.mm.bi.d.akR().axQ();
    AppMethodBeat.o(24497);
  }

  public static i cjW()
  {
    AppMethodBeat.i(24499);
    com.tencent.mm.kernel.g.RN().QU();
    i locali = i.qrN;
    AppMethodBeat.o(24499);
    return locali;
  }

  public static f cjX()
  {
    AppMethodBeat.i(24502);
    com.tencent.mm.kernel.g.RN().QU();
    if (cjR().qsa == null)
      cjR().qsa = new f();
    f localf = cjR().qsa;
    AppMethodBeat.o(24502);
    return localf;
  }

  public static com.tencent.mm.plugin.shake.c.a.d cjY()
  {
    AppMethodBeat.i(24503);
    com.tencent.mm.kernel.g.RN().QU();
    if (cjR().qsb == null)
      cjR().qsb = new com.tencent.mm.plugin.shake.c.a.d();
    com.tencent.mm.plugin.shake.c.a.d locald = cjR().qsb;
    AppMethodBeat.o(24503);
    return locald;
  }

  public static String fQ(String paramString1, String paramString2)
  {
    AppMethodBeat.i(24501);
    if ((aw.RK()) && (!bo.isNullOrNil(paramString1)))
    {
      aw.ZK();
      paramString1 = String.format("%s/Sk%s_%s", new Object[] { com.tencent.mm.model.c.Yc(), paramString2, com.tencent.mm.a.g.x(paramString1.getBytes()) });
      AppMethodBeat.o(24501);
    }
    while (true)
    {
      return paramString1;
      paramString1 = "";
      AppMethodBeat.o(24501);
    }
  }

  public static String sw(String paramString)
  {
    AppMethodBeat.i(24500);
    if (aw.RK())
    {
      aw.ZK();
      paramString = String.format("%s/Sk_%s", new Object[] { com.tencent.mm.model.c.Yc(), com.tencent.mm.a.g.x(paramString.getBytes()) });
      AppMethodBeat.o(24500);
    }
    while (true)
    {
      return paramString;
      paramString = "";
      AppMethodBeat.o(24500);
    }
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return eaA;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(24498);
    com.tencent.mm.pluginsdk.p.a.vav = new h();
    aw.ZK();
    com.tencent.mm.model.c.XR().c(this.flN);
    com.tencent.mm.sdk.b.a.xxA.c(this.egQ);
    com.tencent.mm.sdk.b.a.xxA.c(this.qsg);
    com.tencent.mm.sdk.b.a.xxA.c(this.qsd);
    com.tencent.mm.sdk.b.a.xxA.c(this.oMA);
    aw.ZK();
    com.tencent.mm.model.c.XM().a(this.oPE);
    aw.RS().aa(new m.12(this));
    aw.getSysCmdMsgExtension().a("shake", this.qsf, true);
    aw.getSysCmdMsgExtension().a("ShakeCardEntrance", this.qsh, true);
    aw.getSysCmdMsgExtension().a("ShakeCardRedDot", this.qsi, true);
    this.qsa = null;
    this.qsb = null;
    AppMethodBeat.o(24498);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(24496);
    aw.ZK();
    com.tencent.mm.model.c.XR().d(this.flN);
    com.tencent.mm.sdk.b.a.xxA.d(this.egQ);
    com.tencent.mm.sdk.b.a.xxA.d(this.qsg);
    com.tencent.mm.sdk.b.a.xxA.d(this.qsd);
    com.tencent.mm.sdk.b.a.xxA.d(this.oMA);
    aw.ZK();
    com.tencent.mm.model.c.XM().b(this.oPE);
    aw.getSysCmdMsgExtension().b("shake", this.qsf, true);
    aw.getSysCmdMsgExtension().b("ShakeCardEntrance", this.qsh, true);
    aw.getSysCmdMsgExtension().b("ShakeCardRedDot", this.qsi, true);
    com.tencent.mm.pluginsdk.p.a.vav = null;
    AppMethodBeat.o(24496);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.b.m
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p.a;
import com.tencent.mm.g.a.aa;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.b.a;
import com.tencent.mm.modelstat.o;
import com.tencent.mm.network.n;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bd.a;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.be.a;
import com.tencent.mm.storage.y;
import junit.framework.Assert;

public final class aw
{
  private static aw flB;
  private static final bw flD;
  private final am flA;
  private com.tencent.mm.compatible.b.g flC;
  private final int flE;
  final c.a flF;
  private ca flG;
  private bs flH;
  private e flI;
  private cd flJ;
  private w flK;
  private bd.a flL;
  private be.a flM;
  private be.a flN;
  private f flO;
  private final c flr;

  static
  {
    AppMethodBeat.i(16314);
    flB = null;
    flD = new bw();
    AppMethodBeat.o(16314);
  }

  private aw(am paramam, p.a parama)
  {
    AppMethodBeat.i(16295);
    this.flC = null;
    this.flE = 1;
    this.flG = new ca();
    this.flH = new bs();
    this.flI = new e();
    this.flJ = new cd();
    this.flK = new w();
    this.flL = new bd.a()
    {
      public final void a(bd paramAnonymousbd, ad paramAnonymousad)
      {
        AppMethodBeat.i(16279);
        String str = paramAnonymousad.field_username;
        if (ad.mR(paramAnonymousad.field_username))
          paramAnonymousad.setUsername(ad.aoC(paramAnonymousad.field_username));
        if (bo.isNullOrNil(paramAnonymousad.Ht()))
          paramAnonymousad.iC(com.tencent.mm.platformtools.g.vp(paramAnonymousad.field_nickname));
        if (bo.isNullOrNil(paramAnonymousad.Hu()))
          paramAnonymousad.iD(com.tencent.mm.platformtools.g.vo(paramAnonymousad.field_nickname));
        if (bo.isNullOrNil(paramAnonymousad.field_conRemarkPYShort))
          paramAnonymousad.iG(com.tencent.mm.platformtools.g.vp(paramAnonymousad.field_conRemark));
        if (bo.isNullOrNil(paramAnonymousad.field_conRemarkPYFull))
          paramAnonymousad.iF(com.tencent.mm.platformtools.g.vo(paramAnonymousad.field_conRemark));
        if (t.e(paramAnonymousad))
        {
          paramAnonymousad.hu(43);
          paramAnonymousad.iC(com.tencent.mm.platformtools.g.vp(paramAnonymousad.Oi()));
          paramAnonymousad.iD(com.tencent.mm.platformtools.g.vo(paramAnonymousad.Oi()));
          paramAnonymousad.iF(com.tencent.mm.platformtools.g.vo(paramAnonymousad.Oj()));
          paramAnonymousad.iG(paramAnonymousad.Oj());
          AppMethodBeat.o(16279);
          return;
        }
        if (t.nI(str))
        {
          paramAnonymousad.NB();
          paramAnonymousad.hz(4);
          paramAnonymousad.hu(33);
          if (paramAnonymousad != null)
            break label338;
        }
        label338: for (paramAnonymousbd = new ad(); ; paramAnonymousbd = paramAnonymousad)
        {
          paramAnonymousbd.setUsername(str);
          paramAnonymousbd.NB();
          ab.y(paramAnonymousbd);
          paramAnonymousbd.NK();
          if (paramAnonymousad.Oc())
            paramAnonymousad.hu(paramAnonymousad.Ny());
          if (t.ny(str))
          {
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MMCore", "update official account helper showhead %d", new Object[] { Integer.valueOf(31) });
            paramAnonymousad.hu(31);
          }
          if (paramAnonymousad.Oa())
          {
            aw.ZK();
            c.XR().c(new String[] { str }, "@blacklist");
          }
          com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.MMCore", "onPreInsertContact2: %s, %s", new Object[] { paramAnonymousad.field_username, paramAnonymousad.Ht() });
          AppMethodBeat.o(16279);
          break;
        }
      }
    };
    this.flM = new aw.5(this);
    this.flN = new aw.6(this);
    this.flO = new f();
    this.flA = paramam;
    this.flF = new aw.1(this);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.a(aw.a.class, new aw.a(this));
    com.tencent.mm.kernel.g.RQ().eKp.aD(parama);
    this.flr = new c();
    h.pYm.a(99L, 142L, 1L, false);
    com.tencent.mm.ai.t.a(new aw.2(this));
    com.tencent.mm.kernel.g.RQ();
    paramam = com.tencent.mm.kernel.g.RO();
    parama = new aw.3(this);
    paramam.eJn.aD(parama);
    AppMethodBeat.o(16295);
  }

  public static ae Cc()
  {
    AppMethodBeat.i(16294);
    ae localae = ZH().flA.Cc();
    AppMethodBeat.o(16294);
    return localae;
  }

  public static String QH()
  {
    AppMethodBeat.i(16310);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RN();
    String str = com.tencent.mm.kernel.a.QH();
    AppMethodBeat.o(16310);
    return str;
  }

  public static boolean QT()
  {
    AppMethodBeat.i(16307);
    boolean bool = com.tencent.mm.kernel.a.QT();
    AppMethodBeat.o(16307);
    return bool;
  }

  public static boolean RK()
  {
    AppMethodBeat.i(16306);
    boolean bool;
    if (!ah.bqo())
    {
      bool = false;
      AppMethodBeat.o(16306);
    }
    while (true)
    {
      return bool;
      bool = com.tencent.mm.kernel.g.RK();
      AppMethodBeat.o(16306);
    }
  }

  @Deprecated
  public static com.tencent.mm.sdk.platformtools.al RS()
  {
    AppMethodBeat.i(16298);
    com.tencent.mm.sdk.platformtools.al localal = com.tencent.mm.kernel.g.RS();
    AppMethodBeat.o(16298);
    return localal;
  }

  public static String Rb()
  {
    AppMethodBeat.i(16300);
    String str = com.tencent.mm.kernel.a.Rb();
    AppMethodBeat.o(16300);
    return str;
  }

  public static com.tencent.mm.ai.p Rg()
  {
    AppMethodBeat.i(16303);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.ai.p localp = com.tencent.mm.kernel.g.RO().eJo;
    AppMethodBeat.o(16303);
    return localp;
  }

  public static boolean ZD()
  {
    if (flB == null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static bw ZE()
  {
    AppMethodBeat.i(16289);
    ZH();
    bw localbw = flD;
    AppMethodBeat.o(16289);
    return localbw;
  }

  public static boolean ZF()
  {
    AppMethodBeat.i(16290);
    boolean bool = com.tencent.mm.kernel.a.QS();
    AppMethodBeat.o(16290);
    return bool;
  }

  public static void ZG()
  {
    AppMethodBeat.i(16291);
    com.tencent.mm.kernel.a.cm(false);
    AppMethodBeat.o(16291);
  }

  private static aw ZH()
  {
    AppMethodBeat.i(16296);
    Assert.assertNotNull("MMCore not initialized by MMApplication", flB);
    aw localaw = flB;
    AppMethodBeat.o(16296);
    return localaw;
  }

  public static y ZI()
  {
    AppMethodBeat.i(16297);
    com.tencent.mm.kernel.g.RQ();
    y localy = com.tencent.mm.kernel.g.RP().eJH;
    AppMethodBeat.o(16297);
    return localy;
  }

  public static void ZJ()
  {
    AppMethodBeat.i(16301);
    aa localaa = new aa();
    com.tencent.mm.sdk.b.a.xxA.m(localaa);
    AppMethodBeat.o(16301);
  }

  public static c ZK()
  {
    AppMethodBeat.i(16302);
    c localc = ZH().flr;
    if (localc != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue("MMCore has not been initialize ?", bool);
      AppMethodBeat.o(16302);
      return localc;
    }
  }

  public static com.tencent.mm.compatible.b.g ZL()
  {
    AppMethodBeat.i(16304);
    com.tencent.mm.compatible.b.g localg = com.tencent.mm.compatible.b.g.KK();
    AppMethodBeat.o(16304);
    return localg;
  }

  public static boolean ZM()
  {
    AppMethodBeat.i(16305);
    com.tencent.mm.kernel.g.RN();
    boolean bool = com.tencent.mm.kernel.a.QX();
    AppMethodBeat.o(16305);
    return bool;
  }

  public static f ZN()
  {
    AppMethodBeat.i(16311);
    f localf = ZH().flO;
    AppMethodBeat.o(16311);
    return localf;
  }

  public static void a(al paramal)
  {
    AppMethodBeat.i(16287);
    b.a(paramal);
    AppMethodBeat.o(16287);
  }

  public static void a(am paramam, p.a parama)
  {
    AppMethodBeat.i(16292);
    flB = new aw(paramam, parama);
    o.ce(ah.getContext());
    AppMethodBeat.o(16292);
  }

  public static void a(n paramn)
  {
    AppMethodBeat.i(16285);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().a(paramn);
    AppMethodBeat.o(16285);
  }

  public static void b(n paramn)
  {
    AppMethodBeat.i(16286);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().b(paramn);
    AppMethodBeat.o(16286);
  }

  public static an getNotification()
  {
    AppMethodBeat.i(16293);
    an localan = ZH().flA.getNotification();
    AppMethodBeat.o(16293);
    return localan;
  }

  public static bz getSysCmdMsgExtension()
  {
    AppMethodBeat.i(16299);
    bz localbz = ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension();
    AppMethodBeat.o(16299);
    return localbz;
  }

  public static void hold()
  {
    AppMethodBeat.i(16308);
    com.tencent.mm.kernel.a.hold();
    AppMethodBeat.o(16308);
  }

  public static void lE(String paramString)
  {
    AppMethodBeat.i(16288);
    com.tencent.mm.kernel.a.lE(paramString);
    AppMethodBeat.o(16288);
  }

  public static void unhold()
  {
    AppMethodBeat.i(16309);
    com.tencent.mm.kernel.a.unhold();
    AppMethodBeat.o(16309);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.aw
 * JD-Core Version:    0.6.2
 */
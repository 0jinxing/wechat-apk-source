package com.tencent.mm.plugin.wallet_core.model;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.g.a.tu;
import com.tencent.mm.g.a.va;
import com.tencent.mm.model.at;
import com.tencent.mm.model.bz;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.wallet_core.d.f;
import com.tencent.mm.plugin.wallet_core.d.i;
import com.tencent.mm.plugin.wallet_core.d.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.HashMap;

public class r
  implements at
{
  private static HashMap<Integer, h.d> eaA;
  private bz.a old;
  private volatile t tBM;
  private com.tencent.mm.ci.h<ak> tBN;
  private volatile ae tBO;
  private com.tencent.mm.ci.h<ah> tBP;
  private com.tencent.mm.ci.h<j> tBQ;
  private com.tencent.mm.ci.h<com.tencent.mm.plugin.wallet_core.d.c> tBR;
  private com.tencent.mm.ci.h<com.tencent.mm.plugin.wallet_core.d.a> tBS;
  private com.tencent.mm.ci.h<f> tBT;
  private com.tencent.mm.ci.h<com.tencent.mm.plugin.wallet_core.d.d> tBU;
  private x tBV;
  private com.tencent.mm.ci.h<com.tencent.mm.plugin.wallet_core.d.e> tBW;
  private com.tencent.mm.ci.h<i> tBX;
  private com.tencent.mm.ci.h<com.tencent.mm.plugin.wallet_core.d.h> tBY;
  private com.tencent.mm.ci.h<com.tencent.mm.plugin.wallet_core.d.g> tBZ;
  private com.tencent.mm.plugin.wallet_core.id_verify.util.a tCa;
  private com.tencent.mm.sdk.b.c tCb;
  private String tCc;
  private com.tencent.mm.sdk.b.c<tu> tCd;
  private com.tencent.mm.sdk.b.c<va> tCe;

  static
  {
    AppMethodBeat.i(46886);
    com.tencent.mm.compatible.util.k.a("tenpay_utils", r.class.getClassLoader());
    HashMap localHashMap = new HashMap();
    eaA = localHashMap;
    localHashMap.put(Integer.valueOf("WALLET_USER_INFO_TABLE".hashCode()), new r.8());
    eaA.put(Integer.valueOf("WALLET_BANKCARD_TABLE".hashCode()), new r.9());
    eaA.put(Integer.valueOf("LOAN_ENTRY_INFO_TABLE".hashCode()), new r.10());
    eaA.put(Integer.valueOf("WALLET_KIND_INFO_TABLE".hashCode()), new h.d()
    {
      public final String[] Af()
      {
        return f.fnj;
      }
    });
    eaA.put(Integer.valueOf("WALLET_BULLETIN_TABLE".hashCode()), new r.13());
    eaA.put(Integer.valueOf("WALLET_PREF_INFO_TABLE".hashCode()), new r.14());
    eaA.put(Integer.valueOf("WALLET_FUNCTIOIN_INFO_TABLE".hashCode()), new r.15());
    eaA.put(Integer.valueOf("WALLET_GREY_ITEM_TABLE".hashCode()), new r.16());
    eaA.put(Integer.valueOf("WALLET_LUKCY_MONEY".hashCode()), new r.17());
    AppMethodBeat.o(46886);
  }

  public r()
  {
    AppMethodBeat.i(46866);
    this.tBM = new t();
    this.tBN = new com.tencent.mm.ci.h(new r.1(this));
    this.tBO = null;
    this.tBP = new com.tencent.mm.ci.h(new r.12(this));
    this.tBQ = new com.tencent.mm.ci.h(new r.18(this));
    this.tBR = new com.tencent.mm.ci.h(new r.19(this));
    this.tBS = new com.tencent.mm.ci.h(new r.20(this));
    this.tBT = new com.tencent.mm.ci.h(new r.21(this));
    this.tBU = new com.tencent.mm.ci.h(new r.22(this));
    this.tBV = new x();
    this.tBW = new com.tencent.mm.ci.h(new r.23(this));
    this.tBX = new com.tencent.mm.ci.h(new r.24(this));
    this.tBY = new com.tencent.mm.ci.h(new r.2(this));
    this.tBZ = new com.tencent.mm.ci.h(new r.3(this));
    this.tCa = new com.tencent.mm.plugin.wallet_core.id_verify.util.a();
    this.tCb = new r.4(this);
    this.tCc = "";
    this.tCd = new r.5(this);
    this.tCe = new r.6(this);
    this.old = new r.7(this);
    AppMethodBeat.o(46866);
  }

  public static void B(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(46882);
    Intent localIntent = paramIntent;
    if (paramIntent == null)
      localIntent = new Intent();
    if (com.tencent.mm.model.r.YN())
    {
      localIntent.setFlags(536870912);
      ab.i("MicroMsg.SubCoreWalletCore", "entryWalletIndexPage wallet type is h5,jump to ibg");
      com.tencent.mm.bp.d.b(paramContext, "wallet_core", ".ui.ibg.WalletIbgAdapterUI", localIntent);
      AppMethodBeat.o(46882);
    }
    while (true)
    {
      return;
      if (com.tencent.mm.model.r.YO())
      {
        localIntent.setFlags(536870912);
        com.tencent.mm.bp.d.b(paramContext, "mall", ".ui.MallIndexOSUI", localIntent);
        AppMethodBeat.o(46882);
      }
      else
      {
        ab.i("MicroMsg.SubCoreWalletCore", "entryWalletIndexPage wallet type is native");
        localIntent.setFlags(536870912);
        com.tencent.mm.bp.d.b(paramContext, "mall", ".ui.MallIndexUI", localIntent);
        com.tencent.mm.kernel.g.RQ();
        if (com.tencent.mm.kernel.g.RP().isSDCardAvailable())
        {
          paramContext = new com.tencent.mm.ba.k(11);
          com.tencent.mm.kernel.g.RQ();
          com.tencent.mm.kernel.g.RO().eJo.a(paramContext, 0);
        }
        AppMethodBeat.o(46882);
      }
    }
  }

  public static boolean a(MMActivity paramMMActivity, com.tencent.mm.wallet_core.d.e parame)
  {
    AppMethodBeat.i(46884);
    boolean bool = cPD().tCa.a(paramMMActivity, parame, 1008);
    AppMethodBeat.o(46884);
    return bool;
  }

  public static boolean b(MMActivity paramMMActivity, com.tencent.mm.wallet_core.d.e parame)
  {
    AppMethodBeat.i(46885);
    boolean bool = cPD().tCa.a(paramMMActivity, parame, 1006);
    AppMethodBeat.o(46885);
    return bool;
  }

  public static r cPD()
  {
    AppMethodBeat.i(46867);
    r localr = (r)q.Y(r.class);
    AppMethodBeat.o(46867);
    return localr;
  }

  public static j cPE()
  {
    AppMethodBeat.i(46868);
    if (!com.tencent.mm.kernel.g.RK())
    {
      localObject = new com.tencent.mm.model.b();
      AppMethodBeat.o(46868);
      throw ((Throwable)localObject);
    }
    Object localObject = (j)cPD().tBQ.get();
    AppMethodBeat.o(46868);
    return localObject;
  }

  public static com.tencent.mm.plugin.wallet_core.d.g cPF()
  {
    AppMethodBeat.i(46869);
    if (!com.tencent.mm.kernel.g.RK())
    {
      localObject = new com.tencent.mm.model.b();
      AppMethodBeat.o(46869);
      throw ((Throwable)localObject);
    }
    Object localObject = (com.tencent.mm.plugin.wallet_core.d.g)cPD().tBZ.get();
    AppMethodBeat.o(46869);
    return localObject;
  }

  public static com.tencent.mm.plugin.wallet_core.d.c cPG()
  {
    AppMethodBeat.i(46870);
    if (!com.tencent.mm.kernel.g.RK())
    {
      localObject = new com.tencent.mm.model.b();
      AppMethodBeat.o(46870);
      throw ((Throwable)localObject);
    }
    Object localObject = (com.tencent.mm.plugin.wallet_core.d.c)cPD().tBR.get();
    AppMethodBeat.o(46870);
    return localObject;
  }

  public static com.tencent.mm.plugin.wallet_core.d.h cPH()
  {
    AppMethodBeat.i(46871);
    if (!com.tencent.mm.kernel.g.RK())
    {
      localObject = new com.tencent.mm.model.b();
      AppMethodBeat.o(46871);
      throw ((Throwable)localObject);
    }
    Object localObject = (com.tencent.mm.plugin.wallet_core.d.h)cPD().tBY.get();
    AppMethodBeat.o(46871);
    return localObject;
  }

  public static ak cPI()
  {
    AppMethodBeat.i(46872);
    if (!com.tencent.mm.kernel.g.RK())
    {
      localObject = new com.tencent.mm.model.b();
      AppMethodBeat.o(46872);
      throw ((Throwable)localObject);
    }
    Object localObject = (ak)cPD().tBN.get();
    AppMethodBeat.o(46872);
    return localObject;
  }

  public static ah cPJ()
  {
    AppMethodBeat.i(46873);
    if (!com.tencent.mm.kernel.g.RK())
    {
      localObject = new com.tencent.mm.model.b();
      AppMethodBeat.o(46873);
      throw ((Throwable)localObject);
    }
    Object localObject = (ah)cPD().tBP.get();
    AppMethodBeat.o(46873);
    return localObject;
  }

  public static com.tencent.mm.plugin.wallet_core.d.a cPK()
  {
    AppMethodBeat.i(46874);
    if (!com.tencent.mm.kernel.g.RK())
    {
      localObject = new com.tencent.mm.model.b();
      AppMethodBeat.o(46874);
      throw ((Throwable)localObject);
    }
    Object localObject = (com.tencent.mm.plugin.wallet_core.d.a)cPD().tBS.get();
    AppMethodBeat.o(46874);
    return localObject;
  }

  public static f cPL()
  {
    AppMethodBeat.i(46875);
    if (!com.tencent.mm.kernel.g.RK())
    {
      localObject = new com.tencent.mm.model.b();
      AppMethodBeat.o(46875);
      throw ((Throwable)localObject);
    }
    Object localObject = (f)cPD().tBT.get();
    AppMethodBeat.o(46875);
    return localObject;
  }

  public static com.tencent.mm.plugin.wallet_core.d.d cPM()
  {
    AppMethodBeat.i(46876);
    if (!com.tencent.mm.kernel.g.RK())
    {
      localObject = new com.tencent.mm.model.b();
      AppMethodBeat.o(46876);
      throw ((Throwable)localObject);
    }
    Object localObject = (com.tencent.mm.plugin.wallet_core.d.d)cPD().tBU.get();
    AppMethodBeat.o(46876);
    return localObject;
  }

  public static com.tencent.mm.plugin.wallet_core.d.e cPN()
  {
    AppMethodBeat.i(46877);
    if (!com.tencent.mm.kernel.g.RK())
    {
      localObject = new com.tencent.mm.model.b();
      AppMethodBeat.o(46877);
      throw ((Throwable)localObject);
    }
    Object localObject = (com.tencent.mm.plugin.wallet_core.d.e)cPD().tBW.get();
    AppMethodBeat.o(46877);
    return localObject;
  }

  public static i cPO()
  {
    AppMethodBeat.i(46878);
    if (!com.tencent.mm.kernel.g.RK())
    {
      localObject = new com.tencent.mm.model.b();
      AppMethodBeat.o(46878);
      throw ((Throwable)localObject);
    }
    Object localObject = (i)cPD().tBX.get();
    AppMethodBeat.o(46878);
    return localObject;
  }

  public static ae cPP()
  {
    AppMethodBeat.i(46879);
    ae localae = cPD().tBO;
    AppMethodBeat.o(46879);
    return localae;
  }

  public static t cPQ()
  {
    AppMethodBeat.i(46883);
    t localt = cPD().tBM;
    AppMethodBeat.o(46883);
    return localt;
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
    AppMethodBeat.i(46880);
    ab.i("MicroMsg.SubCoreWalletCore", "onAccountPostReset subcore walletCore");
    com.tencent.mm.wallet_core.c.b.dNJ();
    com.tencent.mm.wallet_core.c.b.init(com.tencent.mm.sdk.platformtools.ah.getContext());
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().a("paymsg", this.old, true);
    cPI().cQv();
    this.tBO = ae.cPT();
    ae localae = this.tBO;
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().a("paymsg", localae.kBx, true);
    com.tencent.mm.sdk.b.a.xxA.b(this.tCb);
    com.tencent.mm.sdk.b.a.xxA.b(this.tBV);
    com.tencent.mm.sdk.b.a.xxA.b(this.tCe);
    com.tencent.mm.sdk.b.a.xxA.b(this.tCd);
    com.tencent.mm.pluginsdk.cmd.b.a(new r.a(), new String[] { "//cleanpaycn" });
    AppMethodBeat.o(46880);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(46881);
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().b("paymsg", this.old, true);
    cPI().Km();
    Object localObject = cPJ();
    ((ah)localObject).tCO = null;
    ((ah)localObject).tCN.clear();
    ((ah)localObject).tCN = new ArrayList();
    localObject = this.tBO;
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().b("paymsg", ((ae)localObject).kBx, true);
    if (ae.lUV != null)
      ae.lUV.clear();
    this.tBO = null;
    com.tencent.mm.sdk.b.a.xxA.d(this.tCb);
    com.tencent.mm.sdk.b.a.xxA.d(this.tBV);
    com.tencent.mm.sdk.b.a.xxA.d(this.tCe);
    com.tencent.mm.sdk.b.a.xxA.d(this.tCd);
    AppMethodBeat.o(46881);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.r
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.card.model;

import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.g.a.hi;
import com.tencent.mm.g.a.ik;
import com.tencent.mm.model.at;
import com.tencent.mm.model.bz;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.plugin.card.PluginCard;
import com.tencent.mm.plugin.card.b.n;
import com.tencent.mm.plugin.card.model.a.f.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class am
  implements at
{
  private static HashMap<Integer, h.d> eaA;
  private com.tencent.mm.plugin.card.b.m keA;
  private com.tencent.mm.plugin.card.sharecard.a.a keB;
  private com.tencent.mm.plugin.card.sharecard.model.k keC;
  private com.tencent.mm.plugin.card.sharecard.model.o keD;
  private com.tencent.mm.plugin.card.sharecard.a.c keE;
  private com.tencent.mm.plugin.card.b.k keF;
  private com.tencent.mm.plugin.card.b.e keG;
  private com.tencent.mm.plugin.card.b.l keH;
  private com.tencent.mm.plugin.card.b.d keI;
  private com.tencent.mm.plugin.card.b.j keJ;
  private com.tencent.mm.plugin.card.b.c keK;
  private com.tencent.mm.plugin.card.b.g keL;
  private l keM;
  private j keN;
  private com.tencent.mm.sdk.b.c keO;
  private com.tencent.mm.sdk.b.c keP;
  private com.tencent.mm.sdk.b.c keQ;
  private com.tencent.mm.plugin.card.ui.b keR;
  private com.tencent.mm.sdk.b.c keS;
  private com.tencent.mm.sdk.b.c keT;
  private bz.a keU;
  private bz.a keV;
  private com.tencent.mm.sdk.b.c<ik> keW;
  private com.tencent.mm.plugin.card.b.b kev;
  private c kew;
  private al kex;
  private h kez;
  private ak mHandler;

  static
  {
    AppMethodBeat.i(87964);
    HashMap localHashMap = new HashMap();
    eaA = localHashMap;
    localHashMap.put(Integer.valueOf("USERCARDINFO_TABLE".hashCode()), new h.d()
    {
      public final String[] Af()
      {
        return c.fnj;
      }
    });
    eaA.put(Integer.valueOf("PENDINGCARDIDINFO_TABLE".hashCode()), new h.d()
    {
      public final String[] Af()
      {
        return al.fnj;
      }
    });
    eaA.put(Integer.valueOf("CARDMSGINFO_TABLE".hashCode()), new am.10());
    eaA.put(Integer.valueOf("SHARECARDINFO_TABLE".hashCode()), new am.11());
    eaA.put(Integer.valueOf("SHARECARDSYNCITEMINFO_TABLE".hashCode()), new am.12());
    eaA.put(Integer.valueOf("CARDQRCODECONFI_TABLE".hashCode()), new h.d()
    {
      public final String[] Af()
      {
        return j.fnj;
      }
    });
    eaA.put(Integer.valueOf("CARDQRCODEDATAINFO_TABLE".hashCode()), new am.3());
    AppMethodBeat.o(87964);
  }

  public am()
  {
    AppMethodBeat.i(87942);
    this.keF = null;
    this.keG = null;
    this.keH = null;
    this.keI = null;
    this.keJ = null;
    this.mHandler = new ak(Looper.getMainLooper());
    this.keO = new n();
    this.keP = new com.tencent.mm.plugin.card.b.o();
    this.keQ = new com.tencent.mm.plugin.card.b.a();
    this.keR = new com.tencent.mm.plugin.card.ui.b();
    this.keS = new com.tencent.mm.sdk.b.c()
    {
    };
    this.keT = new am.5(this);
    this.keU = new am.6(this);
    this.keV = new am.7(this);
    this.keW = new am.4(this);
    File localFile = new File(m.kdH);
    if (!localFile.exists())
      localFile.mkdir();
    localFile = new File(m.kdI);
    if (!localFile.exists())
      localFile.mkdir();
    AppMethodBeat.o(87942);
  }

  public static com.tencent.mm.plugin.card.b.b baV()
  {
    AppMethodBeat.i(87946);
    com.tencent.mm.kernel.g.RN().QU();
    if (getCore().kev == null)
      getCore().kev = new com.tencent.mm.plugin.card.b.b();
    com.tencent.mm.plugin.card.b.b localb = getCore().kev;
    AppMethodBeat.o(87946);
    return localb;
  }

  public static c baW()
  {
    AppMethodBeat.i(87947);
    com.tencent.mm.kernel.g.RN().QU();
    if (getCore().kew == null)
      getCore().kew = new c(com.tencent.mm.kernel.g.RP().eJN);
    c localc = getCore().kew;
    AppMethodBeat.o(87947);
    return localc;
  }

  public static al baX()
  {
    AppMethodBeat.i(87948);
    com.tencent.mm.kernel.g.RN().QU();
    if (getCore().kex == null)
      getCore().kex = new al(com.tencent.mm.kernel.g.RP().eJN);
    al localal = getCore().kex;
    AppMethodBeat.o(87948);
    return localal;
  }

  public static h baY()
  {
    AppMethodBeat.i(87949);
    com.tencent.mm.kernel.g.RN().QU();
    if (getCore().kez == null)
      getCore().kez = new h(com.tencent.mm.kernel.g.RP().eJN);
    h localh = getCore().kez;
    AppMethodBeat.o(87949);
    return localh;
  }

  public static com.tencent.mm.plugin.card.b.m baZ()
  {
    AppMethodBeat.i(87950);
    com.tencent.mm.kernel.g.RN().QU();
    if (getCore().keA == null)
      getCore().keA = new com.tencent.mm.plugin.card.b.m();
    com.tencent.mm.plugin.card.b.m localm = getCore().keA;
    AppMethodBeat.o(87950);
    return localm;
  }

  public static com.tencent.mm.plugin.card.b.k bba()
  {
    AppMethodBeat.i(87951);
    com.tencent.mm.kernel.g.RN().QU();
    if (getCore().keF == null)
      getCore().keF = new com.tencent.mm.plugin.card.b.k();
    com.tencent.mm.plugin.card.b.k localk = getCore().keF;
    AppMethodBeat.o(87951);
    return localk;
  }

  public static com.tencent.mm.plugin.card.b.e bbb()
  {
    AppMethodBeat.i(87952);
    com.tencent.mm.kernel.g.RN().QU();
    if (getCore().keG == null)
      getCore().keG = new com.tencent.mm.plugin.card.b.e();
    com.tencent.mm.plugin.card.b.e locale = getCore().keG;
    AppMethodBeat.o(87952);
    return locale;
  }

  public static com.tencent.mm.plugin.card.b.l bbc()
  {
    AppMethodBeat.i(87953);
    com.tencent.mm.kernel.g.RN().QU();
    if (getCore().keH == null)
      getCore().keH = new com.tencent.mm.plugin.card.b.l();
    com.tencent.mm.plugin.card.b.l locall = getCore().keH;
    AppMethodBeat.o(87953);
    return locall;
  }

  public static com.tencent.mm.plugin.card.sharecard.a.a bbd()
  {
    AppMethodBeat.i(87954);
    com.tencent.mm.kernel.g.RN().QU();
    if (getCore().keB == null)
      getCore().keB = new com.tencent.mm.plugin.card.sharecard.a.a();
    com.tencent.mm.plugin.card.sharecard.a.a locala = getCore().keB;
    AppMethodBeat.o(87954);
    return locala;
  }

  public static com.tencent.mm.plugin.card.sharecard.model.k bbe()
  {
    AppMethodBeat.i(87955);
    com.tencent.mm.kernel.g.RN().QU();
    if (getCore().keC == null)
      getCore().keC = new com.tencent.mm.plugin.card.sharecard.model.k(com.tencent.mm.kernel.g.RP().eJN);
    com.tencent.mm.plugin.card.sharecard.model.k localk = getCore().keC;
    AppMethodBeat.o(87955);
    return localk;
  }

  public static com.tencent.mm.plugin.card.sharecard.model.o bbf()
  {
    AppMethodBeat.i(87956);
    com.tencent.mm.kernel.g.RN().QU();
    if (getCore().keD == null)
      getCore().keD = new com.tencent.mm.plugin.card.sharecard.model.o(com.tencent.mm.kernel.g.RP().eJN);
    com.tencent.mm.plugin.card.sharecard.model.o localo = getCore().keD;
    AppMethodBeat.o(87956);
    return localo;
  }

  public static com.tencent.mm.plugin.card.sharecard.a.c bbg()
  {
    AppMethodBeat.i(87957);
    com.tencent.mm.kernel.g.RN().QU();
    if (getCore().keE == null)
      getCore().keE = new com.tencent.mm.plugin.card.sharecard.a.c();
    com.tencent.mm.plugin.card.sharecard.a.c localc = getCore().keE;
    AppMethodBeat.o(87957);
    return localc;
  }

  public static com.tencent.mm.plugin.card.b.d bbh()
  {
    AppMethodBeat.i(87958);
    com.tencent.mm.kernel.g.RN().QU();
    if (getCore().keI == null)
      getCore().keI = new com.tencent.mm.plugin.card.b.d();
    com.tencent.mm.plugin.card.b.d locald = getCore().keI;
    AppMethodBeat.o(87958);
    return locald;
  }

  public static com.tencent.mm.plugin.card.b.j bbi()
  {
    AppMethodBeat.i(87959);
    com.tencent.mm.kernel.g.RN().QU();
    if (getCore().keJ == null)
      getCore().keJ = new com.tencent.mm.plugin.card.b.j();
    com.tencent.mm.plugin.card.b.j localj = getCore().keJ;
    AppMethodBeat.o(87959);
    return localj;
  }

  public static com.tencent.mm.plugin.card.b.c bbj()
  {
    AppMethodBeat.i(87960);
    com.tencent.mm.kernel.g.RN().QU();
    if (getCore().keK == null)
      getCore().keK = new com.tencent.mm.plugin.card.b.c();
    com.tencent.mm.plugin.card.b.c localc = getCore().keK;
    AppMethodBeat.o(87960);
    return localc;
  }

  public static l bbk()
  {
    AppMethodBeat.i(87961);
    com.tencent.mm.kernel.g.RN().QU();
    if (getCore().keM == null)
      getCore().keM = new l(com.tencent.mm.kernel.g.RP().eJN);
    l locall = getCore().keM;
    AppMethodBeat.o(87961);
    return locall;
  }

  public static j bbl()
  {
    AppMethodBeat.i(87962);
    com.tencent.mm.kernel.g.RN().QU();
    if (getCore().keN == null)
      getCore().keN = new j(com.tencent.mm.kernel.g.RP().eJN);
    j localj = getCore().keN;
    AppMethodBeat.o(87962);
    return localj;
  }

  public static com.tencent.mm.plugin.card.b.g bbm()
  {
    AppMethodBeat.i(87963);
    com.tencent.mm.kernel.g.RN().QU();
    if (getCore().keL == null)
      getCore().keL = new com.tencent.mm.plugin.card.b.g();
    com.tencent.mm.plugin.card.b.g localg = getCore().keL;
    AppMethodBeat.o(87963);
    return localg;
  }

  private static am getCore()
  {
    AppMethodBeat.i(87943);
    Object localObject = (com.tencent.mm.plugin.card.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.card.a.a.class);
    if (localObject != null);
    for (localObject = ((PluginCard)localObject).getCore(); ; localObject = null)
    {
      AppMethodBeat.o(87943);
      return localObject;
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
    AppMethodBeat.i(87944);
    ab.i("MicroMsg.SubCoreCard", "onAccountPostReset, updated = %b", new Object[] { Boolean.valueOf(paramBoolean) });
    com.tencent.mm.sdk.b.a.xxA.c(this.keS);
    com.tencent.mm.sdk.b.a.xxA.c(this.keT);
    com.tencent.mm.sdk.b.a.xxA.c(this.keO);
    com.tencent.mm.sdk.b.a.xxA.c(this.keP);
    com.tencent.mm.sdk.b.a.xxA.c(this.keQ);
    com.tencent.mm.sdk.b.a.xxA.c(this.keW);
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().a("carditemmsg", this.keU, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().a("notifysharecard", this.keV, true);
    this.keF = null;
    if (this.keG != null)
    {
      this.keG.kaV.clear();
      this.keG = null;
    }
    if (this.keA != null)
      ??? = this.keA;
    synchronized (((com.tencent.mm.plugin.card.b.m)???).kbO)
    {
      ((com.tencent.mm.plugin.card.b.m)???).kbO.clear();
      synchronized (((com.tencent.mm.plugin.card.b.m)???).kbP)
      {
        ((com.tencent.mm.plugin.card.b.m)???).kbP.clear();
        com.tencent.mm.kernel.g.RO().eJo.b(563, (com.tencent.mm.ai.f)???);
        ??? = com.tencent.mm.modelgeo.d.agz();
        if (??? != null)
          ((com.tencent.mm.modelgeo.b)???).c((b.a)???);
        if (((com.tencent.mm.plugin.card.b.m)???).kbR != null)
          com.tencent.mm.kernel.g.RO().eJo.c(((com.tencent.mm.plugin.card.b.m)???).kbR);
        this.keA = null;
        if (this.kev != null)
        {
          this.kev.detach();
          this.kev = null;
        }
        if (this.keB != null)
          ??? = this.keB;
      }
    }
    com.tencent.mm.plugin.card.b.j localj;
    synchronized (((com.tencent.mm.plugin.card.sharecard.a.a)???).eMl)
    {
      ((com.tencent.mm.plugin.card.sharecard.a.a)???).kaA.clear();
      ((com.tencent.mm.plugin.card.sharecard.a.a)???).kaB.clear();
      if (((com.tencent.mm.plugin.card.sharecard.a.a)???).kfo != null)
        com.tencent.mm.kernel.g.RO().eJo.c(((com.tencent.mm.plugin.card.sharecard.a.a)???).kfo);
      com.tencent.mm.kernel.g.RO().eJo.b(903, (com.tencent.mm.ai.f)???);
      this.keB = null;
      if (this.keI != null)
      {
        this.keI.release();
        ??? = this.keI;
        ((com.tencent.mm.plugin.card.b.d)???).kaD.clear();
        ((com.tencent.mm.plugin.card.b.d)???).kaP.clear();
        ((com.tencent.mm.plugin.card.b.d)???).kaQ.clear();
        ((com.tencent.mm.plugin.card.b.d)???).kaR.clear();
        ((com.tencent.mm.plugin.card.b.d)???).kaT = false;
        this.keI = null;
      }
      if (this.keJ == null)
        break label579;
      localj = this.keJ;
      com.tencent.mm.kernel.g.RO().eJo.b(907, localj);
      ??? = localj.kbA.iterator();
      while (((Iterator)???).hasNext())
      {
        ??? = (String)((Iterator)???).next();
        Runnable localRunnable = (Runnable)localj.kbC.get(???);
        localj.kbC.remove(???);
        localj.kbB.removeCallbacks(localRunnable);
        continue;
        localObject2 = finally;
        AppMethodBeat.o(87944);
        throw localObject2;
        localObject3 = finally;
        AppMethodBeat.o(87944);
        throw localObject3;
      }
    }
    localj.kbz.clear();
    localj.kbA.clear();
    localj.kbC.clear();
    this.keJ = null;
    label579: if (this.keK != null)
    {
      this.keK.release();
      this.keK = null;
    }
    if (this.keL != null)
    {
      this.keL.release();
      this.keL = null;
    }
    this.keH = null;
    Object localObject4 = this.keR;
    com.tencent.mm.plugin.card.ui.b.aMe().registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)localObject4);
    if (paramBoolean)
    {
      localObject4 = com.tencent.mm.plugin.card.model.a.f.kfh;
      f.a.fF(true);
    }
    AppMethodBeat.o(87944);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(87945);
    if (getCore().kev != null)
      getCore().kev.detach();
    com.tencent.mm.sdk.b.a.xxA.d(this.keS);
    com.tencent.mm.sdk.b.a.xxA.d(this.keT);
    com.tencent.mm.sdk.b.a.xxA.d(this.keO);
    com.tencent.mm.sdk.b.a.xxA.d(this.keP);
    com.tencent.mm.sdk.b.a.xxA.d(this.keQ);
    com.tencent.mm.sdk.b.a.xxA.d(this.keW);
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().b("carditemmsg", this.keU, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().b("notifysharecard", this.keV, true);
    com.tencent.mm.plugin.card.ui.b localb = this.keR;
    com.tencent.mm.plugin.card.ui.b.aMe().unregisterActivityLifecycleCallbacks(localb);
    AppMethodBeat.o(87945);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.am
 * JD-Core Version:    0.6.2
 */
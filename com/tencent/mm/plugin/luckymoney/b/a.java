package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.g.a.ve;
import com.tencent.mm.kernel.b;
import com.tencent.mm.model.at;
import com.tencent.mm.model.bz;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.luckymoney.model.av;
import com.tencent.mm.plugin.luckymoney.model.j;
import com.tencent.mm.plugin.luckymoney.model.m;
import com.tencent.mm.plugin.luckymoney.model.o;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.d;
import com.tencent.mm.pluginsdk.model.app.t;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.z;
import java.io.File;
import java.util.HashMap;

public class a
  implements at
{
  private static HashMap<Integer, h.d> eaA;
  private bz.a kBx;
  private j nRB;
  private com.tencent.mm.plugin.luckymoney.model.p nRC;
  private com.tencent.mm.plugin.luckymoney.model.h nRD;
  private av nRE;
  private com.tencent.mm.ci.h<o> nRF;
  private m nRG;
  private com.tencent.mm.sdk.b.c<ve> nRH;

  static
  {
    AppMethodBeat.i(41979);
    HashMap localHashMap = new HashMap();
    eaA = localHashMap;
    localHashMap.put(Integer.valueOf("LuckyMoneyEnvelopeResource".hashCode()), new a.2());
    AppMethodBeat.o(41979);
  }

  public a()
  {
    AppMethodBeat.i(41973);
    this.nRD = new com.tencent.mm.plugin.luckymoney.model.h();
    this.nRF = new com.tencent.mm.ci.h(new a.1(this));
    this.nRG = new m();
    this.kBx = new a.3(this);
    this.nRH = new a.4(this);
    File localFile = new File(bKP());
    if (!localFile.exists())
      localFile.mkdir();
    localFile = new File(com.tencent.mm.compatible.util.e.eva);
    if (!localFile.exists())
      localFile.mkdir();
    AppMethodBeat.o(41973);
  }

  public static a bKN()
  {
    AppMethodBeat.i(41972);
    a locala = (a)q.Y(a.class);
    AppMethodBeat.o(41972);
    return locala;
  }

  public static j bKO()
  {
    AppMethodBeat.i(41976);
    com.tencent.mm.kernel.g.RN().QU();
    if (bKN().nRB == null)
      bKN().nRB = new j();
    j localj = bKN().nRB;
    AppMethodBeat.o(41976);
    return localj;
  }

  public static String bKP()
  {
    AppMethodBeat.i(41977);
    String str;
    if (com.tencent.mm.kernel.g.RK())
    {
      str = com.tencent.mm.plugin.i.c.XW() + "luckymoney";
      AppMethodBeat.o(41977);
    }
    while (true)
    {
      return str;
      str = "";
      AppMethodBeat.o(41977);
    }
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return eaA;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final o bKM()
  {
    AppMethodBeat.i(41971);
    o localo = (o)this.nRF.get();
    AppMethodBeat.o(41971);
    return localo;
  }

  public final com.tencent.mm.plugin.luckymoney.model.p bKQ()
  {
    try
    {
      AppMethodBeat.i(41978);
      if (this.nRC == null)
      {
        localp = new com/tencent/mm/plugin/luckymoney/model/p;
        localp.<init>();
        this.nRC = localp;
      }
      com.tencent.mm.plugin.luckymoney.model.p localp = this.nRC;
      AppMethodBeat.o(41978);
      return localp;
    }
    finally
    {
    }
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(41974);
    an localan = an.dhQ();
    if (com.tencent.mm.kernel.g.RK())
    {
      com.tencent.mm.plugin.s.a.bYM().a(4, localan);
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().eJo.a(1060, localan);
    }
    this.nRG.dnU();
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().a("paymsg", this.kBx, true);
    boolean bool = false;
    com.tencent.mm.kernel.g.RQ();
    long l = com.tencent.mm.kernel.g.RP().Ry().Mm(352276);
    if (System.currentTimeMillis() - l >= 43200000L)
      bool = true;
    ab.i("MicroMsg.SubCoreLuckyMoney", "isTime=" + bool + ", isUpdate=" + paramBoolean);
    if ((paramBoolean) || (bool))
    {
      ab.i("MicroMsg.SubCoreLuckyMoney", "get service applist");
      an.dhQ().fM(ah.getContext());
    }
    com.tencent.mm.sdk.b.a.xxA.c(this.nRD);
    com.tencent.mm.sdk.b.a.xxA.c(this.nRH);
    this.nRE = new av();
    com.tencent.mm.plugin.luckymoney.model.g.bLs();
    AppMethodBeat.o(41974);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(41975);
    Object localObject1 = an.dhQ();
    if (com.tencent.mm.kernel.g.RK())
    {
      com.tencent.mm.plugin.s.a.bYM().b(4, (t)localObject1);
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().eJo.b(1060, (f)localObject1);
      ((an)localObject1).vcW = false;
      ((an)localObject1).vcX = false;
    }
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().b("paymsg", this.kBx, true);
    try
    {
      this.nRC = null;
      com.tencent.mm.sdk.b.a.xxA.d(this.nRD);
      com.tencent.mm.sdk.b.a.xxA.d(this.nRH);
      if (this.nRE != null)
      {
        localObject1 = this.nRE;
        com.tencent.mm.sdk.b.a.xxA.d(((av)localObject1).nZv);
        if (((av)localObject1).nZs != null)
        {
          com.tencent.mm.kernel.g.RQ();
          com.tencent.mm.kernel.g.RO().eJo.c(((av)localObject1).nZs);
          ((av)localObject1).nZs = null;
        }
        if (((av)localObject1).nZt != null)
        {
          com.tencent.mm.kernel.g.RQ();
          com.tencent.mm.kernel.g.RO().eJo.c(((av)localObject1).nZt);
          ((av)localObject1).nZt = null;
        }
      }
      com.tencent.mm.plugin.luckymoney.model.g.aon();
      this.nRG.dead();
      AppMethodBeat.o(41975);
      return;
    }
    finally
    {
      AppMethodBeat.o(41975);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.b.a
 * JD-Core Version:    0.6.2
 */
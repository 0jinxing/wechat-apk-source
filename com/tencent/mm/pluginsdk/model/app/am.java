package com.tencent.mm.pluginsdk.model.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.d;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bw;
import com.tencent.mm.pluginsdk.model.b;
import java.util.HashMap;

public class am
  implements at
{
  private static HashMap<Integer, h.d> eaA;
  private o vcO;
  private al.a vcP;
  private j vcQ;
  private b vcR;
  private com.tencent.mm.sdk.b.c vcS;
  private com.tencent.mm.sdk.b.c vcT;

  static
  {
    AppMethodBeat.i(27432);
    HashMap localHashMap = new HashMap();
    eaA = localHashMap;
    localHashMap.put(Integer.valueOf("APPMESSAGE_TABLE".hashCode()), new am.1());
    eaA.put(Integer.valueOf("APPSORT_TABLE".hashCode()), new am.2());
    AppMethodBeat.o(27432);
  }

  public am()
  {
    AppMethodBeat.i(27419);
    this.vcP = null;
    this.vcQ = new j();
    this.vcR = new b();
    this.vcS = new am.4(this);
    this.vcT = new am.5(this);
    AppMethodBeat.o(27419);
  }

  public static c aUq()
  {
    AppMethodBeat.i(27422);
    c localc = com.tencent.mm.plugin.s.a.aUq();
    AppMethodBeat.o(27422);
    return localc;
  }

  public static h bYI()
  {
    AppMethodBeat.i(27423);
    h localh = com.tencent.mm.plugin.s.a.bYI();
    AppMethodBeat.o(27423);
    return localh;
  }

  public static i bYJ()
  {
    AppMethodBeat.i(27424);
    i locali = com.tencent.mm.plugin.s.a.bYJ();
    AppMethodBeat.o(27424);
    return locali;
  }

  public static m bYL()
  {
    AppMethodBeat.i(27428);
    m localm = com.tencent.mm.plugin.s.a.bYL();
    AppMethodBeat.o(27428);
    return localm;
  }

  public static d bYM()
  {
    AppMethodBeat.i(27429);
    d locald = com.tencent.mm.plugin.s.a.bYM();
    AppMethodBeat.o(27429);
    return locald;
  }

  private static am dhL()
  {
    AppMethodBeat.i(27420);
    aw.ZE();
    am localam1 = (am)bw.oJ(am.class.getName());
    am localam2 = localam1;
    if (localam1 == null)
      localam2 = new am();
    AppMethodBeat.o(27420);
    return localam2;
  }

  public static j dhM()
  {
    AppMethodBeat.i(27421);
    j localj = dhL().vcQ;
    AppMethodBeat.o(27421);
    return localj;
  }

  public static k dhN()
  {
    AppMethodBeat.i(27425);
    k localk = com.tencent.mm.plugin.s.a.bYK();
    AppMethodBeat.o(27425);
    return localk;
  }

  public static o dhO()
  {
    AppMethodBeat.i(27426);
    g.RN().QU();
    if (dhL().vcO == null)
    {
      localObject = dhL();
      aw.ZK();
      ((am)localObject).vcO = new o(com.tencent.mm.model.c.Ru());
    }
    Object localObject = dhL().vcO;
    AppMethodBeat.o(27426);
    return localObject;
  }

  public static al.a dhP()
  {
    AppMethodBeat.i(27427);
    g.RN().QU();
    if (dhL().vcP == null)
      dhL().vcP = new al.a();
    al.a locala = dhL().vcP;
    AppMethodBeat.o(27427);
    return locala;
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
    AppMethodBeat.i(27431);
    com.tencent.mm.model.ad.a.fls = com.tencent.mm.plugin.s.a.bYI();
    e.d.a(Integer.valueOf(47), this.vcR);
    e.d.a(Integer.valueOf(49), this.vcQ);
    com.tencent.mm.sdk.b.a.xxA.c(this.vcS);
    com.tencent.mm.sdk.b.a.xxA.c(this.vcT);
    am.3 local3 = new am.3(this);
    try
    {
      local3.run();
      AppMethodBeat.o(27431);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (com.tencent.mm.compatible.util.d.fP(20))
      {
        local3.run();
        AppMethodBeat.o(27431);
      }
      AppMethodBeat.o(27431);
      throw localThrowable;
    }
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(27430);
    al.a locala = dhL().vcP;
    if (locala != null)
      locala.cqV = 0;
    e.d.b(Integer.valueOf(47), this.vcR);
    e.d.b(Integer.valueOf(49), this.vcQ);
    com.tencent.mm.sdk.b.a.xxA.d(this.vcS);
    com.tencent.mm.sdk.b.a.xxA.d(this.vcT);
    com.tencent.mm.pluginsdk.model.j.dhc();
    AppMethodBeat.o(27430);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.am
 * JD-Core Version:    0.6.2
 */
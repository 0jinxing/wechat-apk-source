package com.tencent.mm.plugin.aa;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.g.a.br;
import com.tencent.mm.g.a.bs;
import com.tencent.mm.g.a.nh;
import com.tencent.mm.g.a.ni;
import com.tencent.mm.g.a.uz;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.model.bz;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.aa.a.b.d;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.plugin.messenger.foundation.a.p;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import java.util.HashMap;

public class b
  implements at
{
  private static HashMap<Integer, h.d> eaA;
  private c<ni> gkG;
  private c<nh> gkH;
  private c<br> gkI;
  private c<bs> gkJ;
  private o gkK;
  c<uz> gkL;
  private d gkM;
  private com.tencent.mm.plugin.aa.a.b.b gkN;

  static
  {
    AppMethodBeat.i(40593);
    HashMap localHashMap = new HashMap();
    eaA = localHashMap;
    localHashMap.put(Integer.valueOf("AARecord".hashCode()), new b.7());
    eaA.put(Integer.valueOf("AAPayRecord".hashCode()), new b.8());
    AppMethodBeat.o(40593);
  }

  public b()
  {
    AppMethodBeat.i(40587);
    this.gkG = new b.1(this);
    this.gkH = new b.2(this);
    this.gkI = new c()
    {
    };
    this.gkJ = new b.4(this);
    this.gkK = new b.5(this);
    this.gkL = new b.6(this);
    AppMethodBeat.o(40587);
  }

  private static b aoc()
  {
    AppMethodBeat.i(40588);
    b localb = (b)q.Y(b.class);
    AppMethodBeat.o(40588);
    return localb;
  }

  public static d aod()
  {
    AppMethodBeat.i(40589);
    if (aoc().gkM == null)
    {
      localObject = aoc();
      g.RQ();
      ((b)localObject).gkM = new d(g.RP().eJN);
    }
    Object localObject = aoc().gkM;
    AppMethodBeat.o(40589);
    return localObject;
  }

  public static com.tencent.mm.plugin.aa.a.b.b aoe()
  {
    AppMethodBeat.i(40590);
    if (aoc().gkN == null)
    {
      localObject = aoc();
      g.RQ();
      ((b)localObject).gkN = new com.tencent.mm.plugin.aa.a.b.b(g.RP().eJN);
    }
    Object localObject = aoc().gkN;
    AppMethodBeat.o(40590);
    return localObject;
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
    AppMethodBeat.i(40591);
    a.xxA.c(this.gkG);
    a.xxA.c(this.gkH);
    a.xxA.c(this.gkI);
    a.xxA.c(this.gkJ);
    a.xxA.c(this.gkL);
    ((p)g.M(p.class)).getSysCmdMsgExtension().a("paymsg", this.gkK);
    AppMethodBeat.o(40591);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(40592);
    a.xxA.d(this.gkG);
    a.xxA.d(this.gkH);
    a.xxA.d(this.gkI);
    a.xxA.d(this.gkJ);
    a.xxA.d(this.gkL);
    ((p)g.M(p.class)).getSysCmdMsgExtension().b("paymsg", this.gkK);
    AppMethodBeat.o(40592);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.b
 * JD-Core Version:    0.6.2
 */
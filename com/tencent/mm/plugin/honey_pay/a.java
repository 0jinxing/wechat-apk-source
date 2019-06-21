package com.tencent.mm.plugin.honey_pay;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.ci.h;
import com.tencent.mm.g.a.nj;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.model.bz;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.honey_pay.model.b;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.plugin.messenger.foundation.a.p;
import com.tencent.mm.sdk.b.c;
import java.util.HashMap;

public class a
  implements at
{
  private static HashMap<Integer, h.d> eaA;
  private h<b> nqt;
  private c<nj> nqu;
  private o nqv;

  static
  {
    AppMethodBeat.i(41716);
    HashMap localHashMap = new HashMap();
    eaA = localHashMap;
    localHashMap.put(Integer.valueOf("HoneyPayMsgRecord".hashCode()), new a.1());
    AppMethodBeat.o(41716);
  }

  public a()
  {
    AppMethodBeat.i(41712);
    this.nqt = new h(new a.2(this));
    this.nqu = new a.3(this);
    this.nqv = new a.4(this);
    AppMethodBeat.o(41712);
  }

  public static a bFV()
  {
    AppMethodBeat.i(41711);
    a locala = (a)q.Y(a.class);
    AppMethodBeat.o(41711);
    return locala;
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return eaA;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final b bFW()
  {
    AppMethodBeat.i(41715);
    b localb = (b)this.nqt.get();
    AppMethodBeat.o(41715);
    return localb;
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(41713);
    this.nqu.dnU();
    ((p)g.M(p.class)).getSysCmdMsgExtension().a("paymsg", this.nqv);
    AppMethodBeat.o(41713);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(41714);
    this.nqu.dead();
    ((p)g.M(p.class)).getSysCmdMsgExtension().b("paymsg", this.nqv);
    AppMethodBeat.o(41714);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.a
 * JD-Core Version:    0.6.2
 */
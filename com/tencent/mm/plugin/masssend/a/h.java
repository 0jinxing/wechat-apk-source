package com.tencent.mm.plugin.masssend.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.model.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bw;
import com.tencent.mm.model.bz;
import com.tencent.mm.model.bz.a;
import java.util.HashMap;

public final class h
  implements at
{
  private static HashMap<Integer, h.d> eaA;
  private bz.a olc;
  private b ooi;
  private c ooj;
  private i ook;
  private g ool;

  static
  {
    AppMethodBeat.i(22751);
    HashMap localHashMap = new HashMap();
    eaA = localHashMap;
    localHashMap.put(Integer.valueOf("MASSENDINFO_TABLE".hashCode()), new h.1());
    AppMethodBeat.o(22751);
  }

  public h()
  {
    AppMethodBeat.i(22745);
    this.ook = new i();
    this.ool = new g();
    this.olc = new h.2(this);
    AppMethodBeat.o(22745);
  }

  private static h bND()
  {
    AppMethodBeat.i(22746);
    aw.ZE();
    h localh1 = (h)bw.oJ("plugin.masssend");
    h localh2 = localh1;
    if (localh1 == null)
    {
      localh2 = new h();
      aw.ZE().a("plugin.favorite", localh2);
    }
    AppMethodBeat.o(22746);
    return localh2;
  }

  public static b bNE()
  {
    AppMethodBeat.i(22747);
    com.tencent.mm.kernel.g.RN().QU();
    if (bND().ooi == null)
    {
      localObject = bND();
      aw.ZK();
      ((h)localObject).ooi = new b(com.tencent.mm.model.c.Ru());
    }
    Object localObject = bND().ooi;
    AppMethodBeat.o(22747);
    return localObject;
  }

  public static c bNF()
  {
    AppMethodBeat.i(22748);
    if (bND().ooj == null)
      bND().ooj = new c();
    c localc = bND().ooj;
    AppMethodBeat.o(22748);
    return localc;
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
    AppMethodBeat.i(22750);
    aw.getSysCmdMsgExtension().a("masssendapp", this.olc, false);
    com.tencent.mm.sdk.b.a.xxA.c(this.ook);
    com.tencent.mm.sdk.b.a.xxA.c(this.ool);
    AppMethodBeat.o(22750);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(22749);
    aw.getSysCmdMsgExtension().b("masssendapp", this.olc, false);
    com.tencent.mm.sdk.b.a.xxA.d(this.ook);
    com.tencent.mm.sdk.b.a.xxA.d(this.ool);
    AppMethodBeat.o(22749);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.a.h
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.account.security.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.model.at;
import com.tencent.mm.model.q;
import com.tencent.mm.sdk.b.c;
import java.util.HashMap;

public class g
  implements at
{
  private static HashMap<Integer, h.d> gzk;
  private e gzj;
  private c gzl;
  private c gzm;
  private c gzn;

  static
  {
    AppMethodBeat.i(69857);
    HashMap localHashMap = new HashMap();
    gzk = localHashMap;
    localHashMap.put(Integer.valueOf("SAFE_DEVICE_INFO_TABLE".hashCode()), new g.1());
    AppMethodBeat.o(69857);
  }

  public g()
  {
    AppMethodBeat.i(69852);
    this.gzl = new g.2(this);
    this.gzm = new g.3(this);
    this.gzn = new g.4(this);
    AppMethodBeat.o(69852);
  }

  private static g aqF()
  {
    try
    {
      AppMethodBeat.i(69853);
      g localg = (g)q.Y(g.class);
      AppMethodBeat.o(69853);
      return localg;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static e aqG()
  {
    AppMethodBeat.i(69854);
    com.tencent.mm.kernel.g.RN().QU();
    if (aqF().gzj == null)
      aqF().gzj = new e(com.tencent.mm.kernel.g.RP().eJN);
    e locale = aqF().gzj;
    AppMethodBeat.o(69854);
    return locale;
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return gzk;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(69855);
    com.tencent.mm.sdk.b.a.xxA.c(this.gzl);
    com.tencent.mm.sdk.b.a.xxA.c(this.gzm);
    com.tencent.mm.sdk.b.a.xxA.c(this.gzn);
    AppMethodBeat.o(69855);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(69856);
    com.tencent.mm.sdk.b.a.xxA.d(this.gzl);
    com.tencent.mm.sdk.b.a.xxA.d(this.gzm);
    com.tencent.mm.sdk.b.a.xxA.d(this.gzn);
    AppMethodBeat.o(69856);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.security.a.g
 * JD-Core Version:    0.6.2
 */
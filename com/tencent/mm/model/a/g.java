package com.tencent.mm.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.at;
import com.tencent.mm.model.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;
import java.util.HashMap;

public class g
  implements at
{
  private c foc = null;

  private static g aaJ()
  {
    AppMethodBeat.i(118151);
    g localg = (g)q.Y(g.class);
    AppMethodBeat.o(118151);
    return localg;
  }

  public static c aaK()
  {
    AppMethodBeat.i(118154);
    com.tencent.mm.kernel.g.RN().QU();
    if (aaJ().foc == null)
      aaJ().foc = new c();
    c localc = aaJ().foc;
    AppMethodBeat.o(118154);
    return localc;
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return null;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(118152);
    c localc = aaK();
    long l = System.currentTimeMillis();
    try
    {
      localc.oQ((String)com.tencent.mm.kernel.g.RP().Ry().get(328193, null));
      if (localc.aaI())
        f.oS(localc.fnW.fnS);
      ab.i("MicroMsg.abtest.AbTestManager", "[Abtest] init use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      AppMethodBeat.o(118152);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.abtest.AbTestManager", "[Abtest] updateAbTestCase exception:%s", new Object[] { localException.toString() });
    }
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(118153);
    c localc = aaK();
    localc.fnX = null;
    localc.fnW = null;
    AppMethodBeat.o(118153);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.a.g
 * JD-Core Version:    0.6.2
 */
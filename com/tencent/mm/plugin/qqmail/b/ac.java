package com.tencent.mm.plugin.qqmail.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.be;
import java.util.HashMap;

public class ac
  implements at
{
  private ab puY;
  private v pvA;
  private b pvB;

  public ac()
  {
    AppMethodBeat.i(68060);
    this.pvB = new b();
    AppMethodBeat.o(68060);
  }

  private static ac ccB()
  {
    AppMethodBeat.i(68061);
    ac localac = (ac)q.Y(ac.class);
    AppMethodBeat.o(68061);
    return localac;
  }

  public static v ccC()
  {
    AppMethodBeat.i(68062);
    g.RN().QU();
    if (ccB().pvA == null)
      ccB().pvA = new v(d.vxo, d.eSg);
    v localv = ccB().pvA;
    AppMethodBeat.o(68062);
    return localv;
  }

  public static ab ccD()
  {
    AppMethodBeat.i(68063);
    g.RN().QU();
    if (ccB().puY == null)
      ccB().puY = new ab();
    ab localab = ccB().puY;
    AppMethodBeat.o(68063);
    return localab;
  }

  public static void ccE()
  {
    AppMethodBeat.i(68066);
    bf.oD("qqmail");
    ((j)g.K(j.class)).XR().aoX("qqmail");
    ccC().clearData();
    AppMethodBeat.o(68066);
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
    AppMethodBeat.i(68067);
    com.tencent.mm.sdk.b.a.xxA.c(this.pvB);
    g.RS().aa(new ac.1(this));
    AppMethodBeat.o(68067);
  }

  public final void iy(int paramInt)
  {
    AppMethodBeat.i(68065);
    if ((paramInt & 0x1) != 0)
      ccE();
    AppMethodBeat.o(68065);
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(68064);
    v localv = ccB().pvA;
    if (localv != null)
      localv.reset();
    com.tencent.mm.sdk.b.a.xxA.d(this.pvB);
    AppMethodBeat.o(68064);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.ac
 * JD-Core Version:    0.6.2
 */
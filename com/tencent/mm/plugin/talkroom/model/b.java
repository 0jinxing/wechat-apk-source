package com.tencent.mm.plugin.talkroom.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.d;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.model.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bw;
import com.tencent.mm.network.n;
import java.util.HashMap;

public final class b
  implements at
{
  private n qbK;
  g sxI;
  private d sxJ;
  public c sxK;
  private e sxL;
  f sxM;

  public b()
  {
    AppMethodBeat.i(25757);
    this.sxJ = new d();
    this.sxK = new c();
    this.qbK = new b.1(this);
    AppMethodBeat.o(25757);
  }

  public static b cEg()
  {
    AppMethodBeat.i(25758);
    aw.ZE();
    b localb1 = (b)bw.oJ("plugin.talkroom");
    b localb2 = localb1;
    if (localb1 == null)
    {
      localb2 = new b();
      aw.ZE().a("plugin.talkroom", localb2);
    }
    AppMethodBeat.o(25758);
    return localb2;
  }

  public static g cEh()
  {
    AppMethodBeat.i(25759);
    if (cEg().sxI == null)
      cEg().sxI = new g();
    g localg = cEg().sxI;
    AppMethodBeat.o(25759);
    return localg;
  }

  public static e cEi()
  {
    AppMethodBeat.i(25760);
    if (cEg().sxL == null)
      cEg().sxL = new e();
    e locale = cEg().sxL;
    AppMethodBeat.o(25760);
    return locale;
  }

  public static String cEj()
  {
    AppMethodBeat.i(25761);
    Object localObject = new StringBuilder();
    aw.ZK();
    localObject = com.tencent.mm.model.c.Rt() + "talkroom/";
    AppMethodBeat.o(25761);
    return localObject;
  }

  public static f cEk()
  {
    AppMethodBeat.i(25762);
    if (cEg().sxM == null)
      cEg().sxM = new f();
    f localf = cEg().sxM;
    AppMethodBeat.o(25762);
    return localf;
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
    AppMethodBeat.i(25763);
    e.d.a(Integer.valueOf(56), this.sxJ);
    aw.a(this.qbK);
    com.tencent.mm.bg.g.fUs = cEi();
    com.tencent.mm.bg.g.fUt = cEh();
    AppMethodBeat.o(25763);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(25764);
    e.d.b(Integer.valueOf(56), this.sxJ);
    aw.b(this.qbK);
    com.tencent.mm.bg.g.fUs = null;
    com.tencent.mm.bg.g.fUt = null;
    if (this.sxI != null)
    {
      this.sxI.cEw();
      this.sxI = null;
    }
    AppMethodBeat.o(25764);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.model.b
 * JD-Core Version:    0.6.2
 */
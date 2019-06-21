package com.tencent.mm.plugin.nearby.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.g.a.kf;
import com.tencent.mm.g.a.kn;
import com.tencent.mm.g.a.ko;
import com.tencent.mm.g.a.mp;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pluginsdk.c.d;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bd.a;
import java.util.HashMap;

public final class f
  implements at
{
  private com.tencent.mm.sdk.b.c egQ;
  private com.tencent.mm.sdk.b.c oPA;
  com.tencent.mm.pluginsdk.c.c<kn> oPB;
  com.tencent.mm.pluginsdk.c.c<ko> oPC;
  d oPD;
  private bd.a oPE;
  private com.tencent.mm.sdk.b.c<mp> oPF;
  private com.tencent.mm.sdk.b.c<kf> oPG;
  private com.tencent.mm.sdk.b.c oPz;

  public f()
  {
    AppMethodBeat.i(55396);
    this.oPz = new f.1(this);
    this.oPA = new f.2(this);
    this.oPB = new f.3(this);
    this.oPC = new f.4(this);
    this.egQ = new f.5(this);
    this.oPD = new f.6(this);
    this.oPE = new f.7(this);
    this.oPF = new f.8(this);
    this.oPG = new f.9(this);
    AppMethodBeat.o(55396);
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
    AppMethodBeat.i(55398);
    ((j)g.K(j.class)).XM().a(this.oPE);
    this.oPG.dnU();
    this.oPF.dnU();
    a.xxA.c(this.egQ);
    a.xxA.c(this.oPA);
    a.xxA.c(this.oPB);
    a.xxA.c(this.oPC);
    this.oPz.dnU();
    AppMethodBeat.o(55398);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(55397);
    ((j)g.K(j.class)).XM().b(this.oPE);
    this.oPG.dnU();
    this.oPF.dead();
    a.xxA.d(this.oPA);
    a.xxA.d(this.egQ);
    a.xxA.d(this.oPB);
    a.xxA.d(this.oPC);
    this.oPz.dead();
    AppMethodBeat.o(55397);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.a.f
 * JD-Core Version:    0.6.2
 */
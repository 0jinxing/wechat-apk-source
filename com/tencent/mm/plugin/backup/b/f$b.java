package com.tencent.mm.plugin.backup.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class f$b
  implements Cloneable, Comparable<b>
{
  public String jrf;
  public long jrg = 0L;
  public long jrh = 0L;
  public long jri = -1L;
  public long jrj = -1L;

  public final b aSE()
  {
    AppMethodBeat.i(17114);
    b localb = new b();
    localb.jrf = this.jrf;
    localb.jrg = this.jrg;
    localb.jrh = this.jrh;
    localb.jri = this.jri;
    localb.jrj = this.jrj;
    AppMethodBeat.o(17114);
    return localb;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.b.f.b
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.exdevice.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import junit.framework.Assert;

final class k$e
{
  f lqO = null;
  private k.d lqP = null;
  int lqQ = 0;

  public final void a(f paramf)
  {
    AppMethodBeat.i(19057);
    Assert.assertNotNull(paramf);
    this.lqO = paramf;
    AppMethodBeat.o(19057);
  }

  public final void a(k.d paramd)
  {
    AppMethodBeat.i(19058);
    Assert.assertNotNull(paramd);
    this.lqP = paramd;
    AppMethodBeat.o(19058);
  }

  public final f box()
  {
    AppMethodBeat.i(19059);
    Assert.assertNotNull(this.lqO);
    f localf = this.lqO;
    AppMethodBeat.o(19059);
    return localf;
  }

  public final k.d boy()
  {
    AppMethodBeat.i(19060);
    Assert.assertNotNull(this.lqP);
    k.d locald = this.lqP;
    AppMethodBeat.o(19060);
    return locald;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.b.k.e
 * JD-Core Version:    0.6.2
 */
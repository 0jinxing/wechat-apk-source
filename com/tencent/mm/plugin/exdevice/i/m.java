package com.tencent.mm.plugin.exdevice.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.service.o;
import com.tencent.mm.plugin.exdevice.service.p.a;
import junit.framework.Assert;

public final class m extends p.a
{
  private n lxQ;
  l lxR;

  public m(com.tencent.mm.plugin.exdevice.b.c paramc, c paramc1)
  {
    AppMethodBeat.i(19751);
    this.lxQ = null;
    this.lxR = null;
    Assert.assertNotNull(paramc);
    Assert.assertNotNull(paramc1);
    this.lxQ = new n(paramc);
    this.lxR = new l(paramc1);
    AppMethodBeat.o(19751);
  }

  public final o bpu()
  {
    AppMethodBeat.i(19752);
    Assert.assertNotNull(this.lxQ);
    n localn = this.lxQ;
    AppMethodBeat.o(19752);
    return localn;
  }

  public final com.tencent.mm.plugin.exdevice.service.l bpv()
  {
    AppMethodBeat.i(19753);
    Assert.assertNotNull(this.lxR);
    l locall = this.lxR;
    AppMethodBeat.o(19753);
    return locall;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.i.m
 * JD-Core Version:    0.6.2
 */
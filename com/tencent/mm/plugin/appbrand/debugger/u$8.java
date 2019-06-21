package com.tencent.mm.plugin.appbrand.debugger;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.cqm;

final class u$8
  implements Runnable
{
  u$8(u paramu, int paramInt, cqm paramcqm)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(101923);
    u.a(this.hkS, "cmdId " + this.hkT + ", errCode " + this.hkU.cyE);
    AppMethodBeat.o(101923);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.debugger.u.8
 * JD-Core Version:    0.6.2
 */
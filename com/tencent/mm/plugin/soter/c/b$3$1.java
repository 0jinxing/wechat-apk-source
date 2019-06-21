package com.tencent.mm.plugin.soter.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.soter.a.b.a;
import com.tencent.soter.a.b.e;
import com.tencent.soter.core.c.j;

final class b$3$1
  implements Runnable
{
  b$3$1(b.3 param3, a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(73866);
    j localj = (j)this.rNX.AvM;
    this.rNY.rNW.rOb.errCode = 0;
    this.rNY.rNW.rOb.aIm = "OK";
    this.rNY.rNW.rOb.rOj = ((byte)1);
    this.rNY.rNW.rOb.cLO = localj.Avx;
    this.rNY.rNW.rOb.rOk = localj.signature;
    this.rNY.rNW.cvK();
    AppMethodBeat.o(73866);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.soter.c.b.3.1
 * JD-Core Version:    0.6.2
 */
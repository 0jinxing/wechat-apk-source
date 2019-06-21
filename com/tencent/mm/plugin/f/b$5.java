package com.tencent.mm.plugin.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.bp;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class b$5 extends c<bp>
{
  b$5(b paramb)
  {
    AppMethodBeat.i(18582);
    this.xxI = bp.class.getName().hashCode();
    AppMethodBeat.o(18582);
  }

  private boolean aZl()
  {
    AppMethodBeat.i(18583);
    ab.i("MicroMsg.CalcWxService", "%s clean wx file index event ", new Object[] { this.jZY.aZk() });
    b.d(this.jZY, true);
    try
    {
      al localal = g.RS();
      b.5.1 local1 = new com/tencent/mm/plugin/f/b$5$1;
      local1.<init>(this);
      localal.aa(local1);
      AppMethodBeat.o(18583);
      return false;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.CalcWxService", localException, "%s clean wx file error", new Object[] { this.jZY.aZk() });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.b.5
 * JD-Core Version:    0.6.2
 */
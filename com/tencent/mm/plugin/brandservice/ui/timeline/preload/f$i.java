package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

import a.f.a.b;
import a.f.b.k;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"verify", "", "", "invoke"})
final class f$i extends k
  implements b<Long, String>
{
  f$i(f paramf)
  {
    super(1);
  }

  public final String gN(long paramLong)
  {
    AppMethodBeat.i(14817);
    String str;
    if (f.a(this.jSy, paramLong))
    {
      str = String.valueOf(paramLong);
      AppMethodBeat.o(14817);
    }
    while (true)
    {
      return str;
      str = "NaN";
      AppMethodBeat.o(14817);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.f.i
 * JD-Core Version:    0.6.2
 */
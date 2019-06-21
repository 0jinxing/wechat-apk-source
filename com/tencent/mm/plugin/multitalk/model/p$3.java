package com.tencent.mm.plugin.multitalk.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.cc.a;
import com.tencent.mm.sdk.platformtools.ab;

final class p$3
  implements cc.a
{
  p$3(p paramp)
  {
  }

  public final boolean aaG()
  {
    AppMethodBeat.i(54088);
    ab.w("MicroMsg.SubCoreMultiTalk", "HERE UninitForUEH is called! multitalk");
    if (p.a(this.oHF) != null)
    {
      p.a(this.oHF).bGT();
      if (p.a(this.oHF).oGh != null)
        ab.i("MicroMsg.SubCoreMultiTalk", "dump multiTalkGroup: %s", new Object[] { j.h(p.a(this.oHF).oGh) });
    }
    AppMethodBeat.o(54088);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.model.p.3
 * JD-Core Version:    0.6.2
 */
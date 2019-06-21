package com.tencent.mm.plugin.voip_cs.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.voip_cs.b.c.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class e$2
  implements ap.a
{
  e$2(e parame)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(135305);
    ab.v("MicroMsg.voipcs.VoipCSService", "voipcs heart beat");
    Object localObject = this.tdS;
    g.Rg().a(795, (f)localObject);
    localObject = new b(c.cMe().tew.sTZ, c.cMe().tew.nwv);
    g.Rg().a((m)localObject, 0);
    AppMethodBeat.o(135305);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.b.e.2
 * JD-Core Version:    0.6.2
 */
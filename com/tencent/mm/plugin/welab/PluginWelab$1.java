package com.tencent.mm.plugin.welab;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.j.f;
import com.tencent.mm.protocal.j.g;
import com.tencent.mm.protocal.v.b;

final class PluginWelab$1
  implements com.tencent.mm.plugin.auth.a.a
{
  PluginWelab$1(PluginWelab paramPluginWelab)
  {
  }

  public final void a(j.f paramf, j.g paramg, boolean paramBoolean)
  {
    AppMethodBeat.i(80516);
    a.ddj();
    boolean bool = PluginWelab.access$000(this.uLO);
    if (!paramBoolean);
    for (paramBoolean = true; ; paramBoolean = false)
    {
      a.Z(bool, paramBoolean);
      AppMethodBeat.o(80516);
      return;
    }
  }

  public final void a(v.b paramb, String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.welab.PluginWelab.1
 * JD-Core Version:    0.6.2
 */
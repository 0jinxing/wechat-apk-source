package com.tencent.mm.plugin.auth;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aa;
import com.tencent.mm.model.ax.a;
import com.tencent.mm.plugin.auth.a.a;
import com.tencent.mm.protocal.j.f;
import com.tencent.mm.protocal.j.g;

final class PluginAuth$1
  implements ax.a
{
  PluginAuth$1(PluginAuth paramPluginAuth)
  {
  }

  public final void a(j.f paramf, j.g paramg)
  {
    AppMethodBeat.i(123486);
    aa.a(paramg.vxV, true);
    this.jqr.getHandleAuthResponseCallbacks().a(paramf, paramg, true);
    AppMethodBeat.o(123486);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.auth.PluginAuth.1
 * JD-Core Version:    0.6.2
 */
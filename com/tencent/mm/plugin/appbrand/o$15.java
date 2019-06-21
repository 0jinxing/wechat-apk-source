package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.c;
import com.tencent.mm.plugin.appbrand.permission.d;
import com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.AuthStateChangedByUserEvent;

final class o$15
  implements MMToClientEvent.c
{
  o$15(o paramo)
  {
  }

  public final void bk(Object paramObject)
  {
    AppMethodBeat.i(129001);
    if ((paramObject instanceof AppBrandAuthorizeUI.AuthStateChangedByUserEvent))
      d.Dp(this.gPy.mAppId);
    AppMethodBeat.o(129001);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.o.15
 * JD-Core Version:    0.6.2
 */
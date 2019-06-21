package com.tencent.mm.plugin.appbrand.launching.precondition;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.mm.sdk.platformtools.ah;

final class a$1
  implements Runnable
{
  a$1(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(132046);
    ((AppBrandLaunchProxyUI)this.ijF.getBaseContext()).finish();
    this.ijF.setBaseContext(ah.getContext());
    AppMethodBeat.o(132046);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.precondition.a.1
 * JD-Core Version:    0.6.2
 */
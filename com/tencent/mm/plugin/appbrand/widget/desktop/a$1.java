package com.tencent.mm.plugin.appbrand.widget.desktop;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.ak;

final class a$1
  implements Runnable
{
  a$1(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(133664);
    a.a(this.iWi, ak.de(a.a(this.iWi)) + ak.J(a.a(this.iWi), 0));
    ab.i("MicroMsg.AppBrandDesktopAnimController", "[run] mScrollOffset:" + a.b(this.iWi));
    AppMethodBeat.o(133664);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.a.1
 * JD-Core Version:    0.6.2
 */
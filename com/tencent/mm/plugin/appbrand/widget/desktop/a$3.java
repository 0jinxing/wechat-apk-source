package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.header.HeaderContainer;
import com.tencent.mm.sdk.platformtools.ab;

final class a$3
  implements Runnable
{
  a$3(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(133667);
    ab.i("MicroMsg.AppBrandDesktopAnimController", "alvinluo doOpenHeader");
    int i = a.c(this.iWi).getTop();
    a.d(this.iWi).smoothScrollBy(i, 600);
    a.e(this.iWi);
    AppMethodBeat.o(133667);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.a.3
 * JD-Core Version:    0.6.2
 */
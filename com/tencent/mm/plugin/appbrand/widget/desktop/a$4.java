package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.header.HeaderContainer;
import com.tencent.mm.sdk.platformtools.ab;

final class a$4
  implements Runnable
{
  a$4(a parama, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(133668);
    int i = a.c(this.iWi).getBottom();
    ab.i("MicroMsg.AppBrandDesktopAnimController", "alvinluo closeHeader distance: %d, bottom: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(a.c(this.iWi).getBottom()) });
    ListView localListView = a.d(this.iWi);
    int j;
    if (a.f(this.iWi))
    {
      j = 10;
      localListView.smoothScrollBy(i, j);
      a.g(this.iWi);
      a.a(this.iWi, false);
      if (a.h(this.iWi) == 0)
        break label140;
      j = a.h(this.iWi);
      a.i(this.iWi);
    }
    while (true)
    {
      a.b(this.iWi, j);
      AppMethodBeat.o(133668);
      return;
      j = 600;
      break;
      label140: j = this.GX;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.a.4
 * JD-Core Version:    0.6.2
 */
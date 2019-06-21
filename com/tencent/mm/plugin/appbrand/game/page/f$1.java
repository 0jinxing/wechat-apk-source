package com.tencent.mm.plugin.appbrand.game.page;

import android.view.ViewGroup.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageFullScreenView;
import com.tencent.mm.plugin.appbrand.page.ak;

final class f$1
  implements ak
{
  f$1(f paramf)
  {
  }

  public final void a(AppBrandPageFullScreenView paramAppBrandPageFullScreenView)
  {
    AppMethodBeat.i(138124);
    if ((paramAppBrandPageFullScreenView != null) && (paramAppBrandPageFullScreenView.getParent() == null))
      f.a(this.hsW).addView(paramAppBrandPageFullScreenView, new ViewGroup.LayoutParams(-1, -1));
    AppMethodBeat.o(138124);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.page.f.1
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.page;

import a.l;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class f$1$a
  implements Runnable
{
  f$1$a(f.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(134761);
    ViewParent localViewParent = this.irf.ire.getParent();
    Object localObject = localViewParent;
    if (!(localViewParent instanceof ViewGroup))
      localObject = null;
    localObject = (ViewGroup)localObject;
    if (localObject != null)
    {
      ((ViewGroup)localObject).removeView((View)this.irf.ire);
      AppMethodBeat.o(134761);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(134761);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.f.1.a
 * JD-Core Version:    0.6.2
 */
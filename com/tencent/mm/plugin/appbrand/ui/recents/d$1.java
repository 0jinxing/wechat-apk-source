package com.tencent.mm.plugin.appbrand.ui.recents;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$1
  implements ViewTreeObserver.OnPreDrawListener
{
  d$1(d paramd)
  {
  }

  public final boolean onPreDraw()
  {
    AppMethodBeat.i(133325);
    d.a(this.iMi).getViewTreeObserver().removeOnPreDrawListener(this);
    d.b(this.iMi);
    AppMethodBeat.o(133325);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.d.1
 * JD-Core Version:    0.6.2
 */
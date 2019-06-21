package com.tencent.mm.plugin.topstory.ui.widget;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$1
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  e$1(e parame)
  {
  }

  public final void onGlobalLayout()
  {
    AppMethodBeat.i(2235);
    if (e.a(this.sIj) != null)
      e.b(this.sIj);
    AppMethodBeat.o(2235);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.widget.e.1
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.al;

final class l$1
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  l$1(l paraml)
  {
  }

  public final void onGlobalLayout()
  {
    AppMethodBeat.i(27175);
    aw.RS().aa(new l.1.1(this));
    AppMethodBeat.o(27175);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.b.l.1
 * JD-Core Version:    0.6.2
 */
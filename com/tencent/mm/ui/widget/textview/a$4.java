package com.tencent.mm.ui.widget.textview;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ai;

final class a$4
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  a$4(a parama)
  {
  }

  public final void onGlobalLayout()
  {
    AppMethodBeat.i(138209);
    this.zWL.zWm.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    if (this.zWL.zWn != null)
    {
      this.zWL.zWm.getLocationInWindow(this.zWL.rGg);
      ai.d("SelectableTextHelper", "init: loc-x: %d, loc-y: %d.", new Object[] { Integer.valueOf(this.zWL.rGg[0]), Integer.valueOf(this.zWL.rGg[1]) });
    }
    AppMethodBeat.o(138209);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.textview.a.4
 * JD-Core Version:    0.6.2
 */
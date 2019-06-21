package com.tencent.mm.plugin.game.ui;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class r$1
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  r$1(r paramr, TextView paramTextView1, TextView paramTextView2)
  {
  }

  public final void onGlobalLayout()
  {
    AppMethodBeat.i(112171);
    if (this.nmf.getLineCount() > 1)
    {
      this.nmf.setMaxLines(2);
      this.nmg.setMaxLines(1);
      AppMethodBeat.o(112171);
    }
    while (true)
    {
      return;
      this.nmg.setMaxLines(2);
      AppMethodBeat.o(112171);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.r.1
 * JD-Core Version:    0.6.2
 */
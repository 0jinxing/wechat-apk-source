package com.tencent.mm.plugin.sight.decode.ui;

import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$1$2
  implements Runnable
{
  c$1$2(c.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(70278);
    c.d(this.qyU.qyT).setVisibility(0);
    c.d(this.qyU.qyT).startAnimation(AnimationUtils.loadAnimation(this.qyU.qyT.getContext(), 2131034180));
    AppMethodBeat.o(70278);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.decode.ui.c.1.2
 * JD-Core Version:    0.6.2
 */
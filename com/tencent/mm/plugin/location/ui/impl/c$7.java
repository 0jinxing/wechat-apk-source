package com.tencent.mm.plugin.location.ui.impl;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$7
  implements View.OnFocusChangeListener
{
  c$7(c paramc)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(113601);
    if (paramBoolean)
      this.nQa.showVKB();
    AppMethodBeat.o(113601);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.c.7
 * JD-Core Version:    0.6.2
 */
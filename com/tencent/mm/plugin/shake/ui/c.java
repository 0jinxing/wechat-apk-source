package com.tencent.mm.plugin.shake.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ap;

final class c
{
  ap che;
  View view;

  public c(View paramView)
  {
    AppMethodBeat.i(24708);
    this.che = new ap(new c.1(this), false);
    this.view = paramView;
    AppMethodBeat.o(24708);
  }

  public final void ckz()
  {
    AppMethodBeat.i(24709);
    if (this.view != null)
      this.view.setKeepScreenOn(false);
    AppMethodBeat.o(24709);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.c
 * JD-Core Version:    0.6.2
 */
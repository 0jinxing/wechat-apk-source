package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMEditText.a;

final class i$5
  implements MMEditText.a
{
  i$5(i parami)
  {
  }

  public final void bMu()
  {
    AppMethodBeat.i(38182);
    if (this.rhF.rhq.getVisibility() == 0)
    {
      this.rhF.rhq.setVisibility(8);
      AppMethodBeat.o(38182);
    }
    while (true)
    {
      return;
      ((Activity)i.c(this.rhF)).finish();
      AppMethodBeat.o(38182);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.i.5
 * JD-Core Version:    0.6.2
 */
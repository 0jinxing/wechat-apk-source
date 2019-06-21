package com.tencent.mm.plugin.appbrand.ui;

import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class f$3
  implements Runnable
{
  f$3(f paramf)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(102313);
    this.iHb.setVisibility(8);
    if (this.iHb.getParent() != null)
      ((ViewGroup)this.iHb.getParent()).removeView(this.iHb);
    AppMethodBeat.o(102313);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.f.3
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class j$3
  implements Runnable
{
  j$3(j paramj, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(102325);
    ab.i("MicroMsg.AppBrandUILoadingSplash", "onDataTransferState  state=" + this.nx);
    if (this.nx == 3)
    {
      j.f(this.iJj).setVisibility(0);
      j.f(this.iJj).setText(2131297094);
    }
    AppMethodBeat.o(102325);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.j.3
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.ui;

import android.view.View;
import android.view.View.OnSystemUiVisibilityChangeListener;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class n$1
  implements View.OnSystemUiVisibilityChangeListener
{
  n$1(Window paramWindow)
  {
  }

  public final void onSystemUiVisibilityChange(int paramInt)
  {
    AppMethodBeat.i(87379);
    ab.d("MicroMsg.AppBrandUIUtil", "visibility = ".concat(String.valueOf(paramInt)));
    if ((paramInt & 0x4) == 0)
      this.hXR.getDecorView().setSystemUiVisibility(n.c(this.hXR));
    AppMethodBeat.o(87379);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.n.1
 * JD-Core Version:    0.6.2
 */
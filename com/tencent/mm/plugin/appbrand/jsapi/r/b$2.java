package com.tencent.mm.plugin.appbrand.jsapi.r;

import android.view.View;
import android.view.View.OnSystemUiVisibilityChangeListener;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$2
  implements View.OnSystemUiVisibilityChangeListener
{
  b$2(b paramb, Window paramWindow, int paramInt)
  {
  }

  public final void onSystemUiVisibilityChange(int paramInt)
  {
    AppMethodBeat.i(74807);
    if ((paramInt & 0x4) == 0)
      this.hXR.getDecorView().setSystemUiVisibility(this.hXS);
    AppMethodBeat.o(74807);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.r.b.2
 * JD-Core Version:    0.6.2
 */
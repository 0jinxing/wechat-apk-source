package com.tencent.mm.plugin.appbrand.widget.input.autofill;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AutoFillListPopupWindowBase$1
  implements Runnable
{
  AutoFillListPopupWindowBase$1(AutoFillListPopupWindowBase paramAutoFillListPopupWindowBase)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(123907);
    View localView = this.jib.amx;
    if ((localView != null) && (localView.getWindowToken() != null))
      this.jib.show();
    AppMethodBeat.o(123907);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.autofill.AutoFillListPopupWindowBase.1
 * JD-Core Version:    0.6.2
 */
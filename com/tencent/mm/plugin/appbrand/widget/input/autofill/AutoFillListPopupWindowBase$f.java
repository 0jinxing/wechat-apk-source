package com.tencent.mm.plugin.appbrand.widget.input.autofill;

import android.widget.PopupWindow;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AutoFillListPopupWindowBase$f
  implements Runnable
{
  private AutoFillListPopupWindowBase$f(AutoFillListPopupWindowBase paramAutoFillListPopupWindowBase)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(123921);
    if ((AutoFillListPopupWindowBase.a(this.jib) != null) && (AutoFillListPopupWindowBase.a(this.jib).getCount() > AutoFillListPopupWindowBase.a(this.jib).getChildCount()) && (AutoFillListPopupWindowBase.a(this.jib).getChildCount() <= this.jib.amu))
    {
      AutoFillListPopupWindowBase.b(this.jib).setInputMethodMode(2);
      this.jib.show();
    }
    AppMethodBeat.o(123921);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.autofill.AutoFillListPopupWindowBase.f
 * JD-Core Version:    0.6.2
 */
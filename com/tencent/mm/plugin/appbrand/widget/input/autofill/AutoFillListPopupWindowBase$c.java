package com.tencent.mm.plugin.appbrand.widget.input.autofill;

import android.database.DataSetObserver;
import android.widget.PopupWindow;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AutoFillListPopupWindowBase$c extends DataSetObserver
{
  private AutoFillListPopupWindowBase$c(AutoFillListPopupWindowBase paramAutoFillListPopupWindowBase)
  {
  }

  public final void onChanged()
  {
    AppMethodBeat.i(123916);
    if (this.jib.amH.isShowing())
      this.jib.show();
    AppMethodBeat.o(123916);
  }

  public final void onInvalidated()
  {
    AppMethodBeat.i(123917);
    this.jib.dismiss();
    AppMethodBeat.o(123917);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.autofill.AutoFillListPopupWindowBase.c
 * JD-Core Version:    0.6.2
 */
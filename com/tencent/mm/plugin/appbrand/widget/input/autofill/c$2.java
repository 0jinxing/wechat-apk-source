package com.tencent.mm.plugin.appbrand.widget.input.autofill;

import android.database.DataSetObserver;
import android.widget.PopupWindow;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$2 extends DataSetObserver
{
  c$2(c paramc)
  {
  }

  public final void onChanged()
  {
    AppMethodBeat.i(123899);
    if (!this.jhS.jhC.amH.isShowing())
      AppMethodBeat.o(123899);
    while (true)
    {
      return;
      this.jhS.qM(1);
      AppMethodBeat.o(123899);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.autofill.c.2
 * JD-Core Version:    0.6.2
 */
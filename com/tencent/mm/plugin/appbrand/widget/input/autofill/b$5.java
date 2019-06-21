package com.tencent.mm.plugin.appbrand.widget.input.autofill;

import android.widget.Filter.FilterListener;
import android.widget.PopupWindow;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$5
  implements Filter.FilterListener
{
  b$5(b paramb)
  {
  }

  public final void onFilterComplete(int paramInt)
  {
    AppMethodBeat.i(123886);
    if (paramInt <= 0)
    {
      this.jhK.jhC.dismiss();
      AppMethodBeat.o(123886);
    }
    while (true)
    {
      return;
      if (this.jhK.jhC.amH.isShowing())
        this.jhK.jhC.show();
      AppMethodBeat.o(123886);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.autofill.b.5
 * JD-Core Version:    0.6.2
 */
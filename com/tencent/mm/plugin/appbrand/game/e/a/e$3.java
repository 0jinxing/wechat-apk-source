package com.tencent.mm.plugin.appbrand.game.e.a;

import android.text.Editable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.s;
import com.tencent.mm.plugin.appbrand.widget.input.aj;
import com.tencent.mm.ui.widget.g;

final class e$3 extends g
{
  e$3(e parame, s params)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(130207);
    if (aj.D(paramEditable))
      AppMethodBeat.o(130207);
    while (true)
    {
      return;
      this.hsz.hsr.a(paramEditable.toString(), this.hsj);
      AppMethodBeat.o(130207);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.e.a.e.3
 * JD-Core Version:    0.6.2
 */
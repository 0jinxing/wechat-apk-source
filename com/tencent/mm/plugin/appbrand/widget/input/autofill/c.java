package com.tencent.mm.plugin.appbrand.widget.input.autofill;

import android.view.ViewTreeObserver;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.widget.input.ab;
import com.tencent.mm.plugin.appbrand.widget.input.k.a;

public final class c
{
  final ab jhB;
  final e jhC;
  public final k.a jhO;
  public u jhP;
  int jhQ;
  boolean jhR;

  c(ab paramab, e parame)
  {
    AppMethodBeat.i(123901);
    this.jhO = new k.a()
    {
      public final void aQL()
      {
        AppMethodBeat.i(123897);
        c.this.jhQ = -2147483648;
        c.this.qM(3);
        AppMethodBeat.o(123897);
      }

      public final void aQM()
      {
        AppMethodBeat.i(123898);
        c.this.jhQ = -2147483648;
        c.this.qM(3);
        AppMethodBeat.o(123898);
      }
    };
    this.jhQ = -2147483648;
    this.jhR = false;
    this.jhB = paramab;
    this.jhC = parame;
    AppMethodBeat.o(123901);
  }

  final void qM(int paramInt)
  {
    AppMethodBeat.i(123902);
    AutoFillListPopupWindowBase.a locala = this.jhC.jhV;
    if (locala == null)
      AppMethodBeat.o(123902);
    while (true)
    {
      return;
      if (!this.jhC.amH.isShowing())
      {
        AppMethodBeat.o(123902);
      }
      else
      {
        if ((1 == paramInt) && (this.jhR))
        {
          this.jhQ = -2147483648;
          this.jhR = false;
        }
        locala.getViewTreeObserver().addOnPreDrawListener(new c.3(this, locala, paramInt));
        AppMethodBeat.o(123902);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.autofill.c
 * JD-Core Version:    0.6.2
 */
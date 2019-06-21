package com.tencent.mm.plugin.appbrand.widget.input.autofill;

import android.widget.PopupWindow.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$1
  implements PopupWindow.OnDismissListener
{
  a$1(a parama)
  {
  }

  public final void onDismiss()
  {
    AppMethodBeat.i(123872);
    if ((a.a(this.jhw) != null) && (!a.b(this.jhw)))
      a.a(this.jhw).a("", h.a.jif);
    AppMethodBeat.o(123872);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.autofill.a.1
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.a.l;

final class c$1
  implements View.OnClickListener
{
  c$1(c paramc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(27151);
    if ((c.a(this.uUq) != null) && (c.a(this.uUq).uOh.booleanValue()))
      c.a(this.uUq).uOi = Boolean.TRUE;
    AppMethodBeat.o(27151);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.b.c.1
 * JD-Core Version:    0.6.2
 */
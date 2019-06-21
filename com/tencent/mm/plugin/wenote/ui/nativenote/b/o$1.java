package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.a.l;

final class o$1
  implements View.OnClickListener
{
  o$1(o paramo)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(27184);
    if ((o.a(this.uVf) != null) && (o.a(this.uVf).uOh.booleanValue()))
      o.a(this.uVf).uOi = Boolean.TRUE;
    AppMethodBeat.o(27184);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.b.o.1
 * JD-Core Version:    0.6.2
 */
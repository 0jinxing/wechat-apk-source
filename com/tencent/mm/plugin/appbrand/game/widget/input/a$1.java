package com.tencent.mm.plugin.appbrand.game.widget.input;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$1
  implements View.OnClickListener
{
  a$1(a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(130341);
    if (a.a(this.huu) != null)
      a.a(this.huu).onClick(paramView);
    AppMethodBeat.o(130341);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.widget.input.a.1
 * JD-Core Version:    0.6.2
 */
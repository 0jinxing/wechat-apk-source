package com.tencent.mm.plugin.appbrand.widget.i;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$7
  implements View.OnClickListener
{
  a$7(a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(87536);
    int i = this.jpi.joV.indexOfChild(paramView);
    this.jpi.re(i);
    this.jpi.aSe();
    AppMethodBeat.o(87536);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.i.a.7
 * JD-Core Version:    0.6.2
 */
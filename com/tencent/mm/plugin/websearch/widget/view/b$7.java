package com.tencent.mm.plugin.websearch.widget.view;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.plugin.appbrand.r.g;
import com.tencent.mm.plugin.websearch.api.f;

final class b$7
  implements View.OnClickListener
{
  b$7(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(91532);
    this.uef.udP = ("tap_" + System.currentTimeMillis());
    int i = (int)this.uef.udV[0];
    int j = (int)this.uef.udV[1];
    int k = i;
    if (i < 2)
      k = 2;
    i = j;
    if (j < 2)
      i = 2;
    j = i;
    if (i > this.uef.udM.getHeight() - 2)
      j = this.uef.udM.getHeight() - 2;
    this.uef.udN.f(g.qa(k), g.qa(j), this.uef.udO, this.uef.udP);
    this.uef.iv(false);
    u.i("WidgetView", "tap event id %s, location x %f, y %f", new Object[] { this.uef.udP, Float.valueOf(this.uef.udV[0]), Float.valueOf(this.uef.udV[1]) });
    AppMethodBeat.o(91532);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.view.b.7
 * JD-Core Version:    0.6.2
 */
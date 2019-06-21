package com.tencent.mm.plugin.wenote.ui.nativenote;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.nativenote.b.a;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;

final class c$2
  implements View.OnClickListener
{
  c$2(c paramc, a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(27117);
    com.tencent.mm.plugin.report.service.h.pYm.e(14547, new Object[] { Integer.valueOf(10) });
    paramView = new com.tencent.mm.plugin.wenote.model.a.h();
    k localk = k.deT();
    if (localk != null)
      com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().a(paramView, localk.deW(), false, false, true);
    while (true)
    {
      c.b(this.uUb);
      AppMethodBeat.o(27117);
      return;
      com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().a(paramView, null, false, false, true);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.c.2
 * JD-Core Version:    0.6.2
 */
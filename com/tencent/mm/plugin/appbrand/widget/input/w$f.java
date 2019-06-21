package com.tencent.mm.plugin.appbrand.widget.input;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ui.n;
import com.tencent.mm.plugin.appbrand.widget.input.panel.e;
import com.tencent.mm.sdk.platformtools.x;

final class w$f
  implements w.b
{
  public final void c(w paramw, int paramInt)
  {
    AppMethodBeat.i(123775);
    if (n.ct(paramw))
    {
      paramw.qG(8);
      AppMethodBeat.o(123775);
    }
    while (true)
    {
      return;
      if ((w.a(paramw) == null) || (paramInt <= 0))
      {
        AppMethodBeat.o(123775);
      }
      else
      {
        w.b(paramw, paramInt);
        AppMethodBeat.o(123775);
      }
    }
  }

  public final void m(w paramw)
  {
    AppMethodBeat.i(123773);
    if (paramw.isShown())
      w.a(paramw).setVisibility(0);
    w.b(paramw).aRE();
    AppMethodBeat.o(123773);
  }

  public final void n(w paramw)
  {
    AppMethodBeat.i(123774);
    if (n.ct(paramw))
    {
      paramw.qG(8);
      w.g(paramw);
      AppMethodBeat.o(123774);
    }
    while (true)
    {
      return;
      if (paramw.isShown())
        w.a(paramw).setVisibility(0);
      if (!w.h(paramw))
      {
        w.b(paramw).aRE();
        AppMethodBeat.o(123774);
      }
      else
      {
        w.b(paramw).aRD();
        AppMethodBeat.o(123774);
      }
    }
  }

  public final void o(w paramw)
  {
    AppMethodBeat.i(123776);
    w.i(paramw).showVKB();
    w.j(paramw);
    AppMethodBeat.o(123776);
  }

  public final void p(w paramw)
  {
    AppMethodBeat.i(123777);
    w.i(paramw).aqX();
    w.k(paramw);
    paramw.oD(x.gs(w.l(paramw)));
    AppMethodBeat.o(123777);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.w.f
 * JD-Core Version:    0.6.2
 */
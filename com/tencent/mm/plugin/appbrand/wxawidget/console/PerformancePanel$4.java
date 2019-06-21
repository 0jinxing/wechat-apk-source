package com.tencent.mm.plugin.appbrand.wxawidget.console;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.ipcinvoker.type.IPCBoolean;
import com.tencent.mm.plugin.appbrand.collector.c;
import com.tencent.mm.ui.widget.MMSwitchBtn.a;

final class PerformancePanel$4
  implements MMSwitchBtn.a
{
  PerformancePanel$4(PerformancePanel paramPerformancePanel)
  {
  }

  public final void di(boolean paramBoolean)
  {
    AppMethodBeat.i(11176);
    f.a("com.tencent.mm:support", new IPCBoolean(paramBoolean), PerformancePanel.b.class, null);
    if (paramBoolean)
    {
      c.yK("jsapi_draw_canvas");
      AppMethodBeat.o(11176);
    }
    while (true)
    {
      return;
      c.yL("jsapi_draw_canvas");
      AppMethodBeat.o(11176);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.wxawidget.console.PerformancePanel.4
 * JD-Core Version:    0.6.2
 */
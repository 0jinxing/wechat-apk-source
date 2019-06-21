package com.tencent.mm.plugin.appbrand.wxawidget.console;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.ipcinvoker.type.IPCBoolean;
import com.tencent.mm.plugin.appbrand.collector.c;
import com.tencent.mm.ui.widget.MMSwitchBtn.a;

final class PerformancePanel$5
  implements MMSwitchBtn.a
{
  PerformancePanel$5(PerformancePanel paramPerformancePanel)
  {
  }

  public final void di(boolean paramBoolean)
  {
    AppMethodBeat.i(11177);
    f.a("com.tencent.mm:support", new IPCBoolean(paramBoolean), PerformancePanel.c.class, null);
    if (paramBoolean)
    {
      c.yK("widget_launch");
      AppMethodBeat.o(11177);
    }
    while (true)
    {
      return;
      c.yL("widget_launch");
      AppMethodBeat.o(11177);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.wxawidget.console.PerformancePanel.5
 * JD-Core Version:    0.6.2
 */
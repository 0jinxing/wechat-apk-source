package com.tencent.mm.plugin.appbrand.dynamic.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.ipcinvoker.type.IPCBoolean;
import com.tencent.mm.plugin.appbrand.collector.c;
import com.tencent.mm.ui.widget.MMSwitchBtn.a;

final class WxaWidgetPerformanceUI$5
  implements MMSwitchBtn.a
{
  WxaWidgetPerformanceUI$5(WxaWidgetPerformanceUI paramWxaWidgetPerformanceUI)
  {
  }

  public final void di(boolean paramBoolean)
  {
    AppMethodBeat.i(11020);
    f.a("com.tencent.mm:support", new IPCBoolean(paramBoolean), WxaWidgetPerformanceUI.b.class, null);
    if (paramBoolean)
    {
      c.yK("jsapi_draw_canvas");
      AppMethodBeat.o(11020);
    }
    while (true)
    {
      return;
      c.yL("jsapi_draw_canvas");
      AppMethodBeat.o(11020);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.ui.WxaWidgetPerformanceUI.5
 * JD-Core Version:    0.6.2
 */
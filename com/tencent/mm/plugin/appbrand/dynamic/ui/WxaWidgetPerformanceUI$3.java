package com.tencent.mm.plugin.appbrand.dynamic.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.collector.c;

final class WxaWidgetPerformanceUI$3
  implements View.OnClickListener
{
  WxaWidgetPerformanceUI$3(WxaWidgetPerformanceUI paramWxaWidgetPerformanceUI, TextView paramTextView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(11018);
    com.tencent.mm.ipcinvoker.f.a("com.tencent.mm:support", null, WxaWidgetPerformanceUI.a.class, null);
    c.clear();
    com.tencent.mm.plugin.appbrand.collector.f.reset();
    this.hpk.setText(c.yJ("jsapi_draw_canvas").toString());
    AppMethodBeat.o(11018);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.ui.WxaWidgetPerformanceUI.3
 * JD-Core Version:    0.6.2
 */
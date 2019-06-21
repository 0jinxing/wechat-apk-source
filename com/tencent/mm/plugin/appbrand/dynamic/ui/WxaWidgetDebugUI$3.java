package com.tencent.mm.plugin.appbrand.dynamic.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ce.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelappbrand.d;
import com.tencent.mm.modelappbrand.e;

final class WxaWidgetDebugUI$3
  implements View.OnClickListener
{
  WxaWidgetDebugUI$3(WxaWidgetDebugUI paramWxaWidgetDebugUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(11013);
    ((e)g.K(e.class)).aby().restart();
    a.r(new WxaWidgetDebugUI.3.1(this), 1000L);
    AppMethodBeat.o(11013);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.ui.WxaWidgetDebugUI.3
 * JD-Core Version:    0.6.2
 */
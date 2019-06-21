package com.tencent.mm.plugin.appbrand.dynamic.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class WxaWidgetDebugUI$4
  implements View.OnClickListener
{
  WxaWidgetDebugUI$4(WxaWidgetDebugUI paramWxaWidgetDebugUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(11014);
    paramView = new Intent(this.hpe.mController.ylL, WxaWidgetSettingsUI.class);
    paramView.putExtra("app_id", this.hpe.appId);
    paramView.putExtra("pkg_type", this.hpe.cBc);
    paramView.putExtra("pkg_version", this.hpe.gVu);
    this.hpe.startActivity(paramView);
    AppMethodBeat.o(11014);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.ui.WxaWidgetDebugUI.4
 * JD-Core Version:    0.6.2
 */
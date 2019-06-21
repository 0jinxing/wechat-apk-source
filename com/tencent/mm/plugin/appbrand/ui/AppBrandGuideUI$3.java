package com.tencent.mm.plugin.appbrand.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.report.model.o;
import com.tencent.mm.plugin.appbrand.report.model.o.a;

final class AppBrandGuideUI$3
  implements DialogInterface.OnClickListener
{
  AppBrandGuideUI$3(AppBrandGuideUI paramAppBrandGuideUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(132957);
    this.iGC.startActivity(new Intent(this.iGC, AppBrandLauncherUI.class).putExtra("extra_enter_scene", 11));
    o.a(o.a.iCt, "");
    this.iGC.finish();
    AppMethodBeat.o(132957);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandGuideUI.3
 * JD-Core Version:    0.6.2
 */
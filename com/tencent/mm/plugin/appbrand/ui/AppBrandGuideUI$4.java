package com.tencent.mm.plugin.appbrand.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.report.model.o;
import com.tencent.mm.plugin.appbrand.report.model.o.a;

final class AppBrandGuideUI$4
  implements DialogInterface.OnKeyListener
{
  AppBrandGuideUI$4(AppBrandGuideUI paramAppBrandGuideUI)
  {
  }

  public final boolean onKey(DialogInterface paramDialogInterface, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(132958);
    if (4 == paramInt)
    {
      if (1 == paramKeyEvent.getAction())
      {
        o.a(o.a.iCu, "");
        this.iGC.finish();
      }
      AppMethodBeat.o(132958);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(132958);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandGuideUI.4
 * JD-Core Version:    0.6.2
 */
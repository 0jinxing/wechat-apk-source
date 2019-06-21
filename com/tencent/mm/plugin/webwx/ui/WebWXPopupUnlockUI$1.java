package com.tencent.mm.plugin.webwx.ui;

import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.webwx.a;
import com.tencent.mm.plugin.webwx.a.b;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.ab;

final class WebWXPopupUnlockUI$1
  implements View.OnClickListener
{
  WebWXPopupUnlockUI$1(WebWXPopupUnlockUI paramWebWXPopupUnlockUI, Dialog paramDialog)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(26568);
    paramView = new b(2);
    aw.Rg().a(paramView, 0);
    ab.d("MicroMsg.WebWxPopUnlockUI", "doScene netSceneExtDeviceControl : UNLOCK");
    a.gkF.gk(1);
    ab.d("MicroMsg.WebWxPopUnlockUI", "trigger netSceneSync notify");
    this.nny.dismiss();
    AppMethodBeat.o(26568);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webwx.ui.WebWXPopupUnlockUI.1
 * JD-Core Version:    0.6.2
 */
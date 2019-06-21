package com.tencent.mm.plugin.webwx.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelsimple.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class WebWXLogoutUI$8
  implements DialogInterface.OnClickListener
{
  WebWXLogoutUI$8(WebWXLogoutUI paramWebWXLogoutUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(26546);
    paramDialogInterface = new ab(1);
    aw.Rg().a(paramDialogInterface, 0);
    WebWXLogoutUI localWebWXLogoutUI = this.uLG;
    AppCompatActivity localAppCompatActivity = this.uLG.mController.ylL;
    this.uLG.getString(2131297061);
    WebWXLogoutUI.a(localWebWXLogoutUI, h.b(localAppCompatActivity, null, true, new WebWXLogoutUI.8.1(this, paramDialogInterface)));
    AppMethodBeat.o(26546);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webwx.ui.WebWXLogoutUI.8
 * JD-Core Version:    0.6.2
 */
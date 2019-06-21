package com.tencent.mm.plugin.webwx.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class WebWXLogoutUI$6
  implements View.OnClickListener
{
  WebWXLogoutUI$6(WebWXLogoutUI paramWebWXLogoutUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(26543);
    ab.d("MicroMsg.WebWXLogoutUI", "logout webwx");
    WebWXLogoutUI.f(this.uLG);
    AppMethodBeat.o(26543);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webwx.ui.WebWXLogoutUI.6
 * JD-Core Version:    0.6.2
 */
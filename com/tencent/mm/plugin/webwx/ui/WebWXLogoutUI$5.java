package com.tencent.mm.plugin.webwx.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webwx.a;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;

final class WebWXLogoutUI$5
  implements View.OnClickListener
{
  WebWXLogoutUI$5(WebWXLogoutUI paramWebWXLogoutUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(26542);
    paramView = new Intent();
    paramView.putExtra("Chat_User", "filehelper");
    paramView.putExtra("key_show_bottom_app_panel", true);
    a.gkE.d(paramView, this.uLG);
    ab.d("MicroMsg.WebWXLogoutUI", "clicked file transfer bt, start filehelper");
    this.uLG.finish();
    AppMethodBeat.o(26542);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webwx.ui.WebWXLogoutUI.5
 * JD-Core Version:    0.6.2
 */
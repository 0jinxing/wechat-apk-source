package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.v;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class ShareToQQWeiboUI$2
  implements MenuItem.OnMenuItemClickListener
{
  ShareToQQWeiboUI$2(ShareToQQWeiboUI paramShareToQQWeiboUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(9842);
    v localv = new v(this.uIX.getIntent().getIntExtra("type", 0), this.uIX.getIntent().getStringExtra("shortUrl"), ShareToQQWeiboUI.a(this.uIX).getText().toString());
    g.Rg().a(localv, 0);
    ShareToQQWeiboUI localShareToQQWeiboUI = this.uIX;
    paramMenuItem = this.uIX.mController.ylL;
    this.uIX.getString(2131297061);
    ShareToQQWeiboUI.a(localShareToQQWeiboUI, h.b(paramMenuItem, this.uIX.getString(2131305725), true, new ShareToQQWeiboUI.2.1(this, localv)));
    AppMethodBeat.o(9842);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.ShareToQQWeiboUI.2
 * JD-Core Version:    0.6.2
 */
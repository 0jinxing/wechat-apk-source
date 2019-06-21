package com.tencent.mm.plugin.webwx.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WebWeiXinIntroductionUI$2
  implements MenuItem.OnMenuItemClickListener
{
  WebWeiXinIntroductionUI$2(WebWeiXinIntroductionUI paramWebWeiXinIntroductionUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(26572);
    this.uLL.finish();
    AppMethodBeat.o(26572);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webwx.ui.WebWeiXinIntroductionUI.2
 * JD-Core Version:    0.6.2
 */
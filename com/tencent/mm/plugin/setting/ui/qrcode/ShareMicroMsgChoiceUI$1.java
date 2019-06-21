package com.tencent.mm.plugin.setting.ui.qrcode;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShareMicroMsgChoiceUI$1
  implements MenuItem.OnMenuItemClickListener
{
  ShareMicroMsgChoiceUI$1(ShareMicroMsgChoiceUI paramShareMicroMsgChoiceUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(126912);
    this.qkw.aqX();
    this.qkw.finish();
    AppMethodBeat.o(126912);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.qrcode.ShareMicroMsgChoiceUI.1
 * JD-Core Version:    0.6.2
 */
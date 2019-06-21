package com.tencent.mm.plugin.webview.ui.tools;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.sdk.platformtools.ab;

final class i$5
  implements MenuItem.OnMenuItemClickListener
{
  i$5(i parami, String paramString1, String paramString2)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(7632);
    try
    {
      paramMenuItem = new android/os/Bundle;
      paramMenuItem.<init>();
      paramMenuItem.putString("preUsername", this.utx.cZv().getIntent().getStringExtra("preUsername"));
      paramMenuItem.putString("preChatName", this.utx.cZv().getIntent().getStringExtra("preChatName"));
      paramMenuItem.putString("rawUrl", this.utx.cZv().cOG);
      this.utx.cZv().icy.a(this.icT, this.utx.cZv().dae(), i.afD(this.icU), this.utx.icC, this.utx.icD, paramMenuItem);
      ab.i("MicroMsg.WebViewLongClickHelper", "onMenuItemClick recognize qbcode");
      AppMethodBeat.o(7632);
      return false;
    }
    catch (RemoteException paramMenuItem)
    {
      while (true)
        ab.e("MicroMsg.WebViewLongClickHelper", "recognize qbar result failed");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.i.5
 * JD-Core Version:    0.6.2
 */
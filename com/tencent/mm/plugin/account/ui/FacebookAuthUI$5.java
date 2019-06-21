package com.tencent.mm.plugin.account.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FacebookAuthUI$5
  implements MenuItem.OnMenuItemClickListener
{
  FacebookAuthUI$5(FacebookAuthUI paramFacebookAuthUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(124778);
    paramMenuItem = this.gAZ.getIntent();
    paramMenuItem.putExtra("bind_facebook_succ", FacebookAuthUI.b(this.gAZ));
    this.gAZ.setResult(-1, paramMenuItem);
    this.gAZ.finish();
    AppMethodBeat.o(124778);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.FacebookAuthUI.5
 * JD-Core Version:    0.6.2
 */
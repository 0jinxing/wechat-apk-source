package com.tencent.mm.plugin.profile.ui;

import android.content.ClipboardManager;
import android.content.Context;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.n.d;

final class NormalProfileHeaderPreference$2
  implements n.d
{
  NormalProfileHeaderPreference$2(NormalProfileHeaderPreference paramNormalProfileHeaderPreference, ClipboardManager paramClipboardManager, String paramString)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(23653);
    if (paramInt == 0)
    {
      this.gKu.setText(this.eiH);
      h.bP(NormalProfileHeaderPreference.a(this.pnT), NormalProfileHeaderPreference.a(this.pnT).getString(2131296876));
    }
    AppMethodBeat.o(23653);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference.2
 * JD-Core Version:    0.6.2
 */
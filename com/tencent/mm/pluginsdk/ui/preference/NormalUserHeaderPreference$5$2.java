package com.tencent.mm.pluginsdk.ui.preference;

import android.content.ClipboardManager;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.n.d;

final class NormalUserHeaderPreference$5$2
  implements n.d
{
  NormalUserHeaderPreference$5$2(NormalUserHeaderPreference.5 param5, String paramString)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(28076);
    if (paramInt == 0)
    {
      NormalUserHeaderPreference.e(this.vrl.vrk).setText(this.eiH);
      h.bP(NormalUserHeaderPreference.b(this.vrl.vrk), NormalUserHeaderPreference.b(this.vrl.vrk).getString(2131296876));
    }
    AppMethodBeat.o(28076);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.NormalUserHeaderPreference.5.2
 * JD-Core Version:    0.6.2
 */
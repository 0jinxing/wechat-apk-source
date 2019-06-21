package com.tencent.mm.ui.conversation;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.storage.ak;
import com.tencent.mm.ui.base.n.d;
import java.util.List;

final class SettingCheckUnProcessWalletConvUI$4$2
  implements n.d
{
  SettingCheckUnProcessWalletConvUI$4$2(SettingCheckUnProcessWalletConvUI.4 param4, String paramString, ak paramak)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(34615);
    if (paramMenuItem.getItemId() == 1)
      c.a(this.ewn, this.zvK.zvJ, this.xXy, new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(34614);
          SettingCheckUnProcessWalletConvUI.d(SettingCheckUnProcessWalletConvUI.4.2.this.zvK.zvJ).remove(SettingCheckUnProcessWalletConvUI.4.2.this.ewn);
          SettingCheckUnProcessWalletConvUI.b(SettingCheckUnProcessWalletConvUI.4.2.this.zvK.zvJ).notifyDataSetChanged();
          AppMethodBeat.o(34614);
        }
      }
      , false, true);
    AppMethodBeat.o(34615);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI.4.2
 * JD-Core Version:    0.6.2
 */
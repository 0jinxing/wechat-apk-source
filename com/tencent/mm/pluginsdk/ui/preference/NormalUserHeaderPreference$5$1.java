package com.tencent.mm.pluginsdk.ui.preference;

import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;

final class NormalUserHeaderPreference$5$1
  implements View.OnCreateContextMenuListener
{
  NormalUserHeaderPreference$5$1(NormalUserHeaderPreference.5 param5)
  {
  }

  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(28075);
    paramContextMenu.add(NormalUserHeaderPreference.b(this.vrl.vrk).getString(2131296875));
    AppMethodBeat.o(28075);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.NormalUserHeaderPreference.5.1
 * JD-Core Version:    0.6.2
 */
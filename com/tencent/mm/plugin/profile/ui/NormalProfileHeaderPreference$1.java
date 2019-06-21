package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class NormalProfileHeaderPreference$1
  implements View.OnCreateContextMenuListener
{
  NormalProfileHeaderPreference$1(NormalProfileHeaderPreference paramNormalProfileHeaderPreference)
  {
  }

  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(23652);
    paramContextMenu.add(NormalProfileHeaderPreference.a(this.pnT).getString(2131296875));
    AppMethodBeat.o(23652);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference.1
 * JD-Core Version:    0.6.2
 */
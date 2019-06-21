package com.tencent.mm.plugin.setting.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.setting.model.i;

final class SettingsSearchAuthUI$9
  implements DialogInterface.OnCancelListener
{
  SettingsSearchAuthUI$9(SettingsSearchAuthUI paramSettingsSearchAuthUI, i parami)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(127449);
    g.Rg().c(this.qoN);
    AppMethodBeat.o(127449);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI.9
 * JD-Core Version:    0.6.2
 */
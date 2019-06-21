package com.tencent.mm.plugin.setting.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.setting.model.i;

final class SettingsSearchAuthUI$8
  implements DialogInterface.OnCancelListener
{
  SettingsSearchAuthUI$8(SettingsSearchAuthUI paramSettingsSearchAuthUI, i parami)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(127448);
    g.Rg().c(this.qoN);
    AppMethodBeat.o(127448);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI.8
 * JD-Core Version:    0.6.2
 */
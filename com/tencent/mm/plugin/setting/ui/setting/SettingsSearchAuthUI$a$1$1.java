package com.tencent.mm.plugin.setting.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.setting.model.c;

final class SettingsSearchAuthUI$a$1$1
  implements DialogInterface.OnCancelListener
{
  SettingsSearchAuthUI$a$1$1(SettingsSearchAuthUI.a.1 param1, c paramc)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(127450);
    g.Rg().c(this.qny);
    AppMethodBeat.o(127450);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI.a.1.1
 * JD-Core Version:    0.6.2
 */
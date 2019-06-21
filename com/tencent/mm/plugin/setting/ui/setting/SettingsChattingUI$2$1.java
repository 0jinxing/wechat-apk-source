package com.tencent.mm.plugin.setting.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingsChattingUI$2$1
  implements DialogInterface.OnCancelListener
{
  SettingsChattingUI$2$1(SettingsChattingUI.2 param2)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(127210);
    SettingsChattingUI.a(this.qnc.qnb, true);
    AppMethodBeat.o(127210);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsChattingUI.2.1
 * JD-Core Version:    0.6.2
 */
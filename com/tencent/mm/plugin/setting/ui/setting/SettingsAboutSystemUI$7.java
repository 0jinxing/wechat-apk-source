package com.tencent.mm.plugin.setting.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class SettingsAboutSystemUI$7
  implements DialogInterface.OnClickListener
{
  SettingsAboutSystemUI$7(SettingsAboutSystemUI paramSettingsAboutSystemUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(127118);
    ab.i("MicroMsg.SettingsAboutSystemUI", "lo-nfc-goTosetNfcSwitch user cancel go set system nfc switch");
    AppMethodBeat.o(127118);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI.7
 * JD-Core Version:    0.6.2
 */
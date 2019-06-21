package com.tencent.mm.plugin.account.security.ui;

import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMEditText.b;

final class ModSafeDeviceNameUI$3
  implements MMEditText.b
{
  ModSafeDeviceNameUI$3(ModSafeDeviceNameUI paramModSafeDeviceNameUI)
  {
  }

  public final void aqH()
  {
    AppMethodBeat.i(69865);
    if (ModSafeDeviceNameUI.a(this.gzu).getText().toString().trim().length() > 0)
    {
      this.gzu.enableOptionMenu(true);
      AppMethodBeat.o(69865);
    }
    while (true)
    {
      return;
      this.gzu.enableOptionMenu(false);
      AppMethodBeat.o(69865);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.security.ui.ModSafeDeviceNameUI.3
 * JD-Core Version:    0.6.2
 */